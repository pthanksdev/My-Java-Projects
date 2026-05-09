package com.example.upay;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class BettingController {

    @FXML
    private ComboBox<String> platformBox;
    @FXML private TextField accountField;
    @FXML private TextField amountField;
    @FXML private Label messageLabel;
    @FXML private Button closeButton;

    private final HttpClient httpClient = HttpClient.newHttpClient();

    private static final String SUPABASE_URL = "https://wymihnusscoxyhydexay.supabase.co/rest/v1/transactions";
    private static final String API_KEY = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9..."; // your full key here

    // User ID should be fetched from logged-in user session - placeholder here
    private String loggedInUserId = "user-id-placeholder";

    @FXML
    private void goBackToHomepage() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("homepage.fxml"));
            Scene scene = new Scene(loader.load());
            scene.getStylesheets().add(getClass().getResource("homepage.css").toExternalForm());
            Stage stage = (Stage) closeButton.getScene().getWindow();
            stage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void initialize() {
        platformBox.getItems().addAll("Bet9ja", "SportyBet", "1xBet", "BetKing", "NairaBet");
    }

    @FXML
    public void handleBettingPayment() {
        String platform = platformBox.getValue();
        String account = accountField.getText().trim();
        String amountText = amountField.getText().trim();

        if (platform == null || account.isEmpty() || amountText.isEmpty()) {
            messageLabel.setText("Please fill all fields.");
            messageLabel.setStyle("-fx-text-fill: red;");
            return;
        }

        double amount;
        try {
            amount = Double.parseDouble(amountText);
            if (amount <= 0) throw new NumberFormatException();
        } catch (NumberFormatException e) {
            messageLabel.setText("Enter a valid amount.");
            messageLabel.setStyle("-fx-text-fill: red;");
            return;
        }

        // Create JSON body for transaction
        String json = String.format("""
            {
                "user_id": "%s",
                "type": "betting",
                "platform": "%s",
                "account": "%s",
                "amount": %f
            }
            """, loggedInUserId, platform, account, amount);

        // Run HTTP POST task async to insert transaction in Supabase
        new Thread(() -> {
            try {
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(SUPABASE_URL))
                        .header("apikey", API_KEY)
                        .header("Authorization", "Bearer " + API_KEY)
                        .header("Content-Type", "application/json")
                        .header("Prefer", "return=representation")
                        .POST(HttpRequest.BodyPublishers.ofString(json))
                        .build();

                HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

                if (response.statusCode() == 201) {
                    // Save to transaction_history
                    TransactionHistoryController historyController = new TransactionHistoryController();
                    String todayDate = java.time.LocalDate.now().toString();
                    historyController.logTransaction(loggedInUserId, "betting", platform, account, amount, todayDate);

                    Platform.runLater(() -> {
                        messageLabel.setText("Betting payment successful!");
                        messageLabel.setStyle("-fx-text-fill: green;");

                        // Show receipt page and pass data
                        try {
                            FXMLLoader loader = new FXMLLoader(getClass().getResource("BettingReceipt.fxml"));
                            Scene scene = new Scene(loader.load());
                            BettingReceiptController controller = loader.getController();
                            controller.setReceipt(platform, account, amountText);
                            Stage stage = (Stage) platformBox.getScene().getWindow();
                            stage.setScene(scene);
                        } catch (IOException e) {
                            messageLabel.setText("Failed to load receipt page.");
                            messageLabel.setStyle("-fx-text-fill: red;");
                            e.printStackTrace();
                        }
                    });
                } else {
                    Platform.runLater(() -> {
                        messageLabel.setText("Failed to save transaction. Try again.");
                        messageLabel.setStyle("-fx-text-fill: red;");
                    });
                }
            } catch (Exception e) {
                Platform.runLater(() -> {
                    messageLabel.setText("Error: " + e.getMessage());
                    messageLabel.setStyle("-fx-text-fill: red;");
                });
            }
        }).start();
    }
}

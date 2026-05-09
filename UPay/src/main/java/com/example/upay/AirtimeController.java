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

public class AirtimeController {

    @FXML
    private ComboBox<String> networkBox;

    @FXML
    private TextField phoneField;

    @FXML
    private TextField amountField;

    @FXML
    private Label messageLabel;

    @FXML
    private Button submitButton;

    @FXML
    private Button closeButton;

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

    private final HttpClient httpClient = HttpClient.newHttpClient();

    private static final String SUPABASE_URL = "https://wymihnusscoxyhydexay.supabase.co/rest/v1/transactions";

    private static final String API_KEY = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9..."; // your API key

    // Use logged-in user id here dynamically
    private String loggedInUserId = "user-id-placeholder";

    @FXML
    public void initialize() {
        networkBox.getItems().addAll("MTN", "Airtel", "Glo", "9mobile");
    }

    @FXML
    public void handleBuyAirtime() {
        String network = networkBox.getValue();
        String phone = phoneField.getText().trim();
        String amountText = amountField.getText().trim();

        if (network == null || phone.isEmpty() || amountText.isEmpty()) {
            messageLabel.setText("Please fill all fields.");
            messageLabel.setStyle("-fx-text-fill: red;");
            return;
        }

        if (!phone.matches("\\d{10,15}")) {
            messageLabel.setText("Enter a valid phone number.");
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

        String json = String.format("""
            {
                "user_id": "%s",
                "type": "airtime",
                "network": "%s",
                "phone": "%s",
                "amount": %f
            }
            """, loggedInUserId, network, phone, amount);

        submitButton.setDisable(true);
        messageLabel.setText("Processing...");
        messageLabel.setStyle("-fx-text-fill: black;");

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
                    Platform.runLater(() -> {
                        messageLabel.setText("Airtime purchase successful!");
                        messageLabel.setStyle("-fx-text-fill: green;");
                        submitButton.setDisable(false);

                        // clear fields
                        networkBox.getSelectionModel().clearSelection();
                        phoneField.clear();
                        amountField.clear();
                    });
                } else {
                    String errMsg = "Failed to save transaction. Try again.";
                    System.out.println("Error response: " + response.body());
                    Platform.runLater(() -> {
                        messageLabel.setText(errMsg);
                        messageLabel.setStyle("-fx-text-fill: red;");
                        submitButton.setDisable(false);
                    });
                }
            } catch (Exception e) {
                Platform.runLater(() -> {
                    messageLabel.setText("Error: " + e.getMessage());
                    messageLabel.setStyle("-fx-text-fill: red;");
                    submitButton.setDisable(false);
                });
            }
        }).start();
    }
}

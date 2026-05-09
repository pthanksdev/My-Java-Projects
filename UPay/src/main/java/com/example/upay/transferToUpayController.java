package com.example.upay;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class transferToUpayController {

    @FXML
    private ComboBox<String> fromAccountCombo;

    @FXML
    private ComboBox<String> toAccountCombo;

    @FXML
    private TextField amountField;

    @FXML
    private TextField noteField;

    @FXML
    private Button transferButton;

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

    @FXML
    private void initialize() {
        fromAccountCombo.getItems().addAll(
                "Savings •• 3021 (#102,340)",
                "Checking •• 1012 (#5,000)"
        );

        toAccountCombo.getItems().addAll(
                "John Doe (UPay)",
                "Jane Smith (UPay)"
        );
        amountField.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("\\d*(\\.\\d{0,2})?")) {
                amountField.setText(oldValue);
            }
        });
    }

    @FXML
    private void transferMoney() {
        String from = fromAccountCombo.getValue();
        String to = toAccountCombo.getValue();
        String amount = amountField.getText();
        String note = noteField.getText();

        if (from == null || to == null || amount.isEmpty()) {
            showAlert("Please complete all required fields.");
            return;
        }

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ReceiptPage.fxml"));
            Scene scene = new Scene(loader.load());

            ReceiptPageController controller = loader.getController();
            controller.setReceiptDetails(from, to, amount, note);

            Stage stage = (Stage) transferButton.getScene().getWindow();
            stage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION, message);
        alert.show();
    }
}

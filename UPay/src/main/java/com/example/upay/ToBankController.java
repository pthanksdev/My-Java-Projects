package com.example.upay;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ToBankController {
    @FXML
    private ComboBox<String> fromAccountComboBox;

    @FXML
    private ComboBox<String> toAccountComboBox;

    @FXML
    private ComboBox<String> bankComboBox;

    @FXML
    private TextField amountTextField;

    @FXML
    private TextField noteTextField;

    @FXML
    private Button transferButton;

    @FXML
    private Button closeButton;

    @FXML
    private void initialize() {
        transferButton.setDisable(true);

        // Allow only 11-digit numbers in the toAccountComboBox
        toAccountComboBox.setEditable(true);
        toAccountComboBox.getEditor().textProperty().addListener((obs, oldVal, newVal) -> {
            // Remove non-digit characters
            if (!newVal.matches("\\d*")) {
                toAccountComboBox.getEditor().setText(newVal.replaceAll("[^\\d]", ""));
            }

            // Limit to 11 digits
            if (toAccountComboBox.getEditor().getText().length() > 11) {
                toAccountComboBox.getEditor().setText(toAccountComboBox.getEditor().getText().substring(0, 11));
            }

            validateForm();
        });

        fromAccountComboBox.valueProperty().addListener((obs, oldVal, newVal) -> validateForm());
        bankComboBox.valueProperty().addListener((obs, oldVal, newVal) -> validateForm());
        amountTextField.textProperty().addListener((obs, oldVal, newVal) -> {
            // Allow only digits
            if (!newVal.matches("\\d*")) {
                amountTextField.setText(newVal.replaceAll("[^\\d]", ""));
            }

            validateForm();
        });

    }


    private void validateForm() {
        String toAccount = toAccountComboBox.getEditor().getText();

        boolean valid = fromAccountComboBox.getValue() != null &&
                bankComboBox.getValue() != null &&
                toAccount.matches("\\d{11}") &&
                !amountTextField.getText().trim().isEmpty();

        transferButton.setDisable(!valid);
    }


    @FXML
    private void handleTransfer(ActionEvent event) {
        String from = fromAccountComboBox.getValue();
        String to = toAccountComboBox.getEditor().getText(); // fixed here
        String bank = bankComboBox.getValue();
        String amount = amountTextField.getText();
        String note = noteTextField.getText();

        // Save to transaction history
        Transaction transaction = new Transaction(from, to, bank, amount, note, "Bank Transfer");
        TransactionStore.addTransaction(transaction);

        // Load receipt
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ReceiptPage.fxml"));
            Parent root = loader.load();

            // Set data
            ReceiptPageController controller = loader.getController();
            controller.setReceiptDetails(from, to + " (" + bank + ")", amount, note);

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void goToHomepage(ActionEvent event) {
        // Example: go back to homepage
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Homepage.fxml"));
            Parent root = loader.load();

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

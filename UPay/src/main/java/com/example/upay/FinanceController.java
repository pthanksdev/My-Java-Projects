package com.example.upay;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class FinanceController {

    @FXML
    private Label balanceLabel;
    @FXML
    private TextField safeboxAmountField;
    @FXML
    private ComboBox<String> frequencyBox;
    @FXML
    private Label statusLabel;
    @FXML
    private TextField withdrawField;
    @FXML
    private TextField targetAmountField;
    @FXML
    private DatePicker targetDatePicker;
    @FXML
    private ProgressBar progressBar;
    @FXML
    private Label targetProgressLabel;
    @FXML
    private ListView<String> historyListView;

    private double balance = 0.0;
    private double targetAmount = 0.0;

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
    public void initialize() {
        frequencyBox.getItems().addAll("Daily", "Weekly", "Monthly");
        updateBalanceDisplay();
        updateHistory();

        addNumericValidation(safeboxAmountField);
        addNumericValidation(withdrawField);
        addNumericValidation(targetAmountField);
    }

    private void addNumericValidation(TextField textField) {
        textField.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("\\d*(\\.\\d{0,2})?")) {
                textField.setText(oldValue);
            }
        });
    }

    private void updateBalanceDisplay() {
        balanceLabel.setText("Total Balance: ₦" + balance);
    }

    private void updateProgress() {
        if (targetAmount > 0) {
            double progress = Math.min(balance / targetAmount, 1.0);
            progressBar.setProgress(progress);
            targetProgressLabel.setText("Progress: " + (int) (progress * 100) + "%");
        } else {
            progressBar.setProgress(0);
            targetProgressLabel.setText("");
        }
    }

    private void updateHistory() {
        historyListView.getItems().clear();
        historyListView.getItems().add("₦1000 saved as fixed savings");
        // Add more dummy items as example
        historyListView.getItems().add("₦500 withdrawn");
        historyListView.getItems().add("₦2000 saved to safebox (weekly)");
    }

//    @FXML
//    public void handleFixedSave() {
//        balance += 1000;
//        statusLabel.setText("₦1000 saved successfully.");
//        statusLabel.setStyle("-fx-text-fill: green;");
//        updateBalanceDisplay();
//        updateProgress();
//        updateHistory();
//    }

    @FXML
    public void handleSetSafebox() {
        String amountText = safeboxAmountField.getText();
        String frequency = frequencyBox.getValue();

        if (amountText.isEmpty() || frequency == null) {
            statusLabel.setText("Enter amount and frequency.");
            statusLabel.setStyle("-fx-text-fill: red;");
            return;
        }

        try {
            double amount = Double.parseDouble(amountText);
            balance += amount;
            statusLabel.setText("Safebox plan set: ₦" + amount + " " + frequency.toLowerCase());
            statusLabel.setStyle("-fx-text-fill: green;");
            updateBalanceDisplay();
            updateProgress();
            updateHistory();
        } catch (NumberFormatException e) {
            statusLabel.setText("Invalid amount.");
            statusLabel.setStyle("-fx-text-fill: red;");
        }
    }

    @FXML
    public void handleWithdraw() {
        String amountText = withdrawField.getText();
        try {
            double amount = Double.parseDouble(amountText);
            if (amount > balance) {
                statusLabel.setText("Insufficient funds.");
                statusLabel.setStyle("-fx-text-fill: red;");
                return;
            }
            balance -= amount;
            statusLabel.setText("₦" + amount + " withdrawn successfully.");
            statusLabel.setStyle("-fx-text-fill: green;");
            updateBalanceDisplay();
            updateProgress();
            updateHistory();
        } catch (NumberFormatException e) {
            statusLabel.setText("Invalid amount.");
            statusLabel.setStyle("-fx-text-fill: red;");
        }
    }

    @FXML
    public void handleSetTarget() {
        String amountText = targetAmountField.getText();
        if (amountText.isEmpty() || targetDatePicker.getValue() == null) {
            statusLabel.setText("Set both target amount and date.");
            statusLabel.setStyle("-fx-text-fill: red;");
            return;
        }

        try {
            targetAmount = Double.parseDouble(amountText);
            statusLabel.setText("Savings target set: ₦" + targetAmount);
            statusLabel.setStyle("-fx-text-fill: green;");
            updateProgress();
        } catch (NumberFormatException e) {
            statusLabel.setText("Invalid target amount.");
            statusLabel.setStyle("-fx-text-fill: red;");
        }
    }
}

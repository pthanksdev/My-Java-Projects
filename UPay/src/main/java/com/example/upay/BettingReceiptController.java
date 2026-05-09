package com.example.upay;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class BettingReceiptController {

    @FXML
    private Label platformLabel;

    @FXML
    private Label accountLabel;

    @FXML
    private Label amountLabel;

    @FXML
    private Label statusLabel;

    public void setReceipt(String platform, String account, String amount) {
        platformLabel.setText("Platform: " + platform);
        accountLabel.setText("Account: " + account);
        amountLabel.setText("Amount: ₦" + amount);
        statusLabel.setText("Payment Successful");
    }

    @FXML
    private void goBackHome() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("homepage.fxml"));
            Scene scene = new Scene(loader.load());
            scene.getStylesheets().add(getClass().getResource("homepage.css").toExternalForm());
            Stage stage = (Stage) platformLabel.getScene().getWindow();
            stage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package com.example.upay;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;

import java.io.IOException;

public class HomepageController {

    @FXML
    private Label nameLabel;

    public void setName(String name) {
        nameLabel.setText("Welcome, " + name + "!");
    }


    // Helper method to load and switch page
    private void switchScene(ActionEvent event, String fxmlFile) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
            Parent newRoot = loader.load();

            // Get current scene and set new root
            Scene currentScene = ((Node) event.getSource()).getScene();
            currentScene.setRoot(newRoot);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void openTransferPage(ActionEvent event) {
        switchScene(event, "TransferToUPay.fxml");
    }

    @FXML
    private void openToBankPage(ActionEvent event) {
        switchScene(event, "ToBank.fxml");
    }

    @FXML
    private void openAirtimePage(ActionEvent event) {
        switchScene(event, "airtime.fxml");
    }

    @FXML
    private void openBettingPage(ActionEvent event) {
        switchScene(event, "betting.fxml");
    }

    @FXML
    private void openFinancePage(ActionEvent event) {
        switchScene(event, "finance.fxml");
    }

    @FXML
    private void openLoanPage(ActionEvent event) {
        switchScene(event, "loan.fxml");
    }

    @FXML
    private void openSettingsPage(ActionEvent event) {
        switchScene(event, "settings.fxml");
    }
    @FXML
    private void goToTransactionHistory(ActionEvent event) {
        // Load transaction history page
        switchScene(event, "transaction_history.fxml"); // Or whatever the correct FXML file is
    }

}

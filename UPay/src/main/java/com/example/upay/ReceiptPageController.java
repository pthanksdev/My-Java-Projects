package com.example.upay;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Node;
import java.io.IOException;

public class ReceiptPageController {

    @FXML private Label amountLabel;
    @FXML private Label recipientLabel;
    @FXML private Label fromLabel;
    @FXML private Label noteLabel;
    @FXML private Button homeButton;
    @FXML private Button historyButton;

    // This method can be called after loading the receipt page
    public void setReceiptDetails(String from, String to, String amount, String note) {
        amountLabel.setText("₦" + amount);
        fromLabel.setText("From: " + from);
        recipientLabel.setText("To: " + to);
        noteLabel.setText("Note: " + (note.isEmpty() ? "-" : note));
    }

    @FXML
    private void initialize() {
        homeButton.setOnAction(this::goToHome);
        historyButton.setOnAction(this::goToHistory);
    }

    private void goToHome(ActionEvent event) {
        navigate(event, "HomePage.fxml");
    }

    private void goToHistory(ActionEvent event) {
        navigate(event, "TransactionHistory.fxml");
    }

    private void navigate(ActionEvent event, String fxmlFile) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
            Scene scene = new Scene(loader.load());
            scene.getStylesheets().add(getClass().getResource("homepage.css").toExternalForm());
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


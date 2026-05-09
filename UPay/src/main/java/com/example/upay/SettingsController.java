package com.example.upay;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class SettingsController {

    @FXML
    private Label statusLabel;

    @FXML
    private Button signout;

    @FXML
    private void handleSignOut(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("login.fxml"));
            Parent loginRoot = fxmlLoader.load();
            Scene loginScene = new Scene(loginRoot);

            // Get the stage from the event source
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(loginScene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void goToTransactionHistory(MouseEvent event) {
        System.out.println("Navigate to Transaction History page.");
        // You go later use scene change code here
    }

    public void goToLoginSettings(MouseEvent event) {
        System.out.println("Navigate to Login Settings page.");
    }

    public void goToChangeName(MouseEvent event) {
        System.out.println("Navigate to Change Name page.");
    }

    public void goToChangeProfilePic(MouseEvent event) {
        System.out.println("Navigate to Change Profile Picture page.");
    }
    public void goToLinkedDevices(MouseEvent event) {
        System.out.println("Navigate to Change Linked page.");
    }
    public void goToLanguageRegion(MouseEvent event) {
        System.out.println("Navigate to Change Language & Region page.");
    }

    public void goToChangePassword(MouseEvent event) {
        System.out.println("Navigate to Change Password page.");
    }

    public void goToNotifications(MouseEvent event) {
        System.out.println("Navigate to Notifications Settings page.");
    }

    public void goToPrivacy(MouseEvent event) {
        System.out.println("Navigate to Privacy & Security page.");
    }

//    public void handleSignOut(MouseEvent event) {
//        // Logic for sign out
//        System.out.println("User signed out.");
//        statusLabel.setText("You don sign out.");
//    }
}

package com.example.upay;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class SignUpController {

    @FXML private TextField nameField;
    @FXML private TextField phoneField;
    @FXML private PasswordField passwordField;
    @FXML private Label statusLabel;

    private boolean isValidPhone(String phone) {
        if (phone.length() != 10) return false;
        String prefix = phone.substring(0, 2);
        return (prefix.equals("90") || prefix.equals("80") || prefix.equals("70") ||
                prefix.equals("91") || prefix.equals("81") || prefix.equals("71")) && phone.matches("\\d+");
    }

    @FXML
    private void handleSignUp(ActionEvent event) {
        String name = nameField.getText().trim();
        String phone = phoneField.getText().trim();
        String password = passwordField.getText().trim();

        if (name.isEmpty() || phone.isEmpty() || password.isEmpty()) {
            statusLabel.setText("All fields are required.");
            return;
        }

        if (!isValidPhone(phone)) {
            statusLabel.setText("Invalid phone number.");
            return;
        }

        // Generate OTP
        int otp = (int) (Math.random() * 900000) + 100000;
        System.out.println("Generated OTP: " + otp); // You fit remove this for production

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("OTPVerification.fxml"));
            Parent root = loader.load();

            OTPVerificationController otpController = loader.getController();
            otpController.initData(name, phone, password, String.valueOf(otp));

            Stage stage = (Stage) nameField.getScene().getWindow();
            stage.setScene(new Scene(root));
        } catch (Exception ex) {
            ex.printStackTrace();
            statusLabel.setText("Failed to load OTP screen.");
        }
    }

    @FXML
    private void goToLogin(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Login.fxml"));
            Parent root = loader.load();

            Stage stage = (Stage) ((Hyperlink) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

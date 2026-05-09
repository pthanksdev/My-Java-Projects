package com.example.upay;

import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import javafx.application.Platform;

public class OTPVerificationController {

    @FXML private TextField otpField;
    @FXML private Label messageLabel;
    @FXML private Button verifyButton;
    @FXML private Button resend;

    private String actualOtp;
    private String name;
    private String phone;
    private String password;

    private SupabaseService supabaseService = new SupabaseService();

    public void initData(String name, String phone, String password, String otp) {
        this.name = name;
        this.phone = phone;
        this.password = password;
        this.actualOtp = otp;
    }

    @FXML
    private void initialize() {
        verifyButton.setOnAction(this::handleVerifyOtpAndRegister);
        resend.setOnAction(this::handleResendOtp);
    }

    private void handleVerifyOtpAndRegister(ActionEvent event) {
        String enteredOtp = otpField.getText().trim();

        if (enteredOtp.isEmpty()) {
            setMessage("Please enter the OTP.", "red");
            return;
        }

        if (!enteredOtp.equals(actualOtp)) {
            setMessage("Incorrect OTP.", "red");
            return;
        }

        String jsonData = String.format(
                "{\"name\":\"%s\", \"phone\":\"%s\", \"password\":\"%s\"}",
                name, phone, password
        );

        Task<String> task = supabaseService.insertUserTask(jsonData);

        task.setOnSucceeded(e -> Platform.runLater(() -> {
            setMessage("Registration successful!", "green");
            navigateToLogin();
        }));

        task.setOnFailed(e -> Platform.runLater(() -> {
            Throwable error = task.getException();
            setMessage("Signup failed: " + error.getMessage(), "red");
            error.printStackTrace(); // You fit forward this to log system if needed
        }));

        new Thread(task).start();
    }

    private void handleResendOtp(ActionEvent event) {
        int newOtp = (int)(Math.random() * 900000) + 100000;
        this.actualOtp = String.valueOf(newOtp);
        System.out.println("Resent OTP: " + newOtp); // For testing
        setMessage("A new OTP has been sent.", "green");
    }

    private void setMessage(String message, String color) {
        messageLabel.setText(message);
        messageLabel.setStyle("-fx-text-fill: " + color + ";");
    }

    private void navigateToLogin() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Login.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) verifyButton.getScene().getWindow();
            stage.setScene(new Scene(root));
        } catch (Exception e) {
            setMessage("Failed to load login page.", "red");
            e.printStackTrace();
        }
    }
}

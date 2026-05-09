package com.example.upay;

import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.json.JSONArray;
import org.json.JSONObject;

public class LoginController {

    @FXML
    private TextField phoneField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Label errorLabel;

    private static final String API_URL = "https://wymihnusscoxyhydexay.supabase.co/rest/v1/users";
    private static final String API_KEY = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6Ind5bWlobnVzc2NveHloeWRleGF5Iiwicm9sZSI6ImFub24iLCJpYXQiOjE3NDc5NjU3MTUsImV4cCI6MjA2MzU0MTcxNX0.0_kHrEfrnoANdenTr1g9BNIjl3-mWMJzX9NShdBY77Q";

    private final HttpClient httpClient = HttpClient.newHttpClient();

    private boolean isValidPhone(String phone) {
        if (phone.length() != 10) return false;
        String prefix = phone.substring(0, 2);
        return (prefix.equals("90") || prefix.equals("80") || prefix.equals("70")
                || prefix.equals("91") || prefix.equals("81") || prefix.equals("71"))
                && phone.matches("\\d+");
    }

    @FXML
    private void goToSignup(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("SignUp.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) ((Hyperlink) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleLogin(ActionEvent event) {
        String phone = phoneField.getText().trim();
        String password = passwordField.getText().trim();

        if (phone.isEmpty() || password.isEmpty()) {
            errorLabel.setText("Please fill all fields");
            return;
        }

        errorLabel.setText("");

        if (!isValidPhone(phone)) {
            errorLabel.setText("Phone must be 10 digits and valid.");
            return;
        }

        String queryUrl = String.format("%s?phone=eq.%s&password=eq.%s", API_URL, phone, password);

        Task<String> task = new Task<>() {
            @Override
            protected String call() throws Exception {
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(queryUrl))
                        .header("apikey", API_KEY)
                        .header("Authorization", "Bearer " + API_KEY)
                        .header("Accept", "application/json")
                        .GET()
                        .build();

                HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

                if (response.statusCode() == 200) {
                    return response.body();
                } else {
                    throw new IOException("Failed to login. Status code: " + response.statusCode());
                }
            }
        };

        task.setOnSucceeded(e -> {
            String response = task.getValue();

            if (response != null && !response.equals("[]")) {
                // Parse JSON to get user's name
                JSONArray jsonArray = new JSONArray(response);
                JSONObject userObj = jsonArray.getJSONObject(0);
                String name = userObj.optString("name", "User");

                Platform.runLater(() -> {
                    errorLabel.setText("Login successful!");

                    try {
                        FXMLLoader loader = new FXMLLoader(getClass().getResource("Homepage.fxml"));
                        Parent root = loader.load();

                        HomepageController homepageController = loader.getController();
                        homepageController.setName(name); // Pass the name to homepage

                        Stage stage = (Stage) phoneField.getScene().getWindow();
                        stage.setScene(new Scene(root));
                    } catch (IOException ex) {
                        errorLabel.setText("Failed to load homepage.");
                        ex.printStackTrace();
                    }
                });
            } else {
                Platform.runLater(() -> errorLabel.setText("Invalid phone or password."));
            }
        });

        task.setOnFailed(e -> {
            Throwable ex = task.getException();
            Platform.runLater(() -> errorLabel.setText("Login failed: " + ex.getMessage()));
        });

        new Thread(task).start();
    }
}

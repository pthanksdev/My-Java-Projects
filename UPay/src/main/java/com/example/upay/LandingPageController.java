package com.example.upay;

import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LandingPageController implements Initializable {

    private PauseTransition delay;

    @FXML
    private Button loginButton;
    @FXML
    private Button signup;

    @FXML
    private void goToLogin(ActionEvent event) throws IOException {
        if (delay != null) delay.stop();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Login.fxml"));
        Parent loginRoot = fxmlLoader.load();
        Scene scene = new Scene(loginRoot);
        scene.getStylesheets().add(getClass().getResource("login.css").toExternalForm());
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void goToSignup(ActionEvent event) throws IOException {
        if (delay != null) delay.stop();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SignUp.fxml"));
        Parent signupRoot = fxmlLoader.load();
        Scene scene = new Scene(signupRoot);
        scene.getStylesheets().add(getClass().getResource("signup.css").toExternalForm());
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        delay = new PauseTransition(Duration.seconds(3));
        delay.setOnFinished(event -> {
            try {
                Parent root = FXMLLoader.load(getClass().getResource("LandingReg.fxml"));
                Scene scene = new Scene(root);
                scene.getStylesheets().add(getClass().getResource("landingReg.css").toExternalForm());
                Stage stage = (Stage) Stage.getWindows().stream().filter(Window::isShowing).findFirst().orElse(null);
                if (stage != null) {
                    stage.setScene(scene);
                    stage.show();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        delay.play();
    }
}
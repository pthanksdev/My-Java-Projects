package com.example.loandemo;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Label myLabel;
    @FXML
    private Button myButton;
    @FXML
    private ProgressBar myProgressbar;
    @FXML
    double progress;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        myProgressbar.setStyle("-fx-accent: #00FF00");
    }

    public void increaseProgress() {
        if (progress < 1) {
            progress += 0.1;
            System.out.println(progress);
            myLabel.setText(Integer.toString((int) Math.round(progress * 100)) + "%");
        }
    }
}
//    @FXML
//    private Label welcomeText;
//
//    @FXML
//    protected void onHelloButtonClick() {
//        welcomeText.setText("Welcome to JavaFX Application!");
//    }
//}
package com.example.bankdemo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private ImageView mfb;
    @FXML
    private Label label1, label2, username, password;
    @FXML
    private TextField username2;
    @FXML
    private PasswordField password2;
    @FXML
    private Button login;
    @FXML
    private ChoiceBox<String> choiceBox;
    private String[]type = {"Admin", "User"};
    private int pass = 12345;
    private String user = "Vianna";
    private int pass2 = 1234567;
    private String user2 = "Vi";

    public void initialize(URL arg0, ResourceBundle arg1) {
        choiceBox.getItems().addAll(type);
        choiceBox.setOnAction(this::getType);
    }

    public void getType(ActionEvent event) {
        String myType = choiceBox.getValue();
//        label2.setText(myType);
    }

    public void success(ActionEvent event) {
        if (choiceBox.getValue().matches("Admin")) {
            if (username2.getText().equals(user) && login.isPickOnBounds()) {
                if (password2.getText().matches(String.valueOf(pass))) {
                    label2.setText("Login Successful");
                    label2.getText();
                    System.out.println("Login successful.");
                } else {
                    label2.setText("Login failed.");
                    label2.getText();
                    System.out.println("Login failed.");
                }
            }
        } else if (choiceBox.getValue().matches("User")) {
            if (username2.getText().equals(user2) && login.isPickOnBounds()) {
                if (password2.getText().matches(String.valueOf(pass2))) {
                    label2.setText("Login Successful");
                    label2.getText();
                    System.out.println("Login successful.");
                } else {
                    label2.setText("Login failed.");
                    label2.getText();
                    System.out.println("Login failed.");
                }
            }
        }
    }
}


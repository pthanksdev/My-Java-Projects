package com.example.myguiapp3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    private Stage stage;
    private Scene scene;
    private Parent root;
//    @FXML
//    private Label welcomeText;
    @FXML
    private TextField input;

//    protected void onHelloButtonClick() {
//
//        welcomeText.setText("Welcome to JavaFX Application!");
//    }


//    public void textInput(ActionEvent event) throws IOException {
//        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
//        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//        scene = new Scene(root);
//        String text = input.getText();
//        stage.setScene(scene);
//        stage.show();
//    }

    public void Submit(ActionEvent event) throws IOException {
        String text = input.getText();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("Text.fxml"));
        root = loader.load();

        textController scene2Controller = loader.getController();
        scene2Controller.textDisplay(text);

        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
package com.example.myguiapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("MyGUIApp1!");
        stage.setScene(scene);

//        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fmxl"));
//        Scene scene1 = new Scene(root);
//        String css = this.getClass().getResource("Application.css").toExternalForm();
//        scene1.getStylesheets().add(css);
//        stage.setScene(scene1);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
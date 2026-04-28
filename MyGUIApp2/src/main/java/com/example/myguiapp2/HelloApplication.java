package com.example.myguiapp2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {
        try{
            Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
            Scene scene = new Scene(root);
            stage.setTitle("hexcore");
           // Image icon = new Image("chainsaw-man-wallpaper-3.jpg");
       //     stage.getIcons().addAll(icon);
//            scene.getStylesheets().add(getClass().getResource("Application.css").toExternalForm());
//            String css = this.getClass().getResource("Application.css").toExternalForm();
//            scene.getStylesheets().add(css);
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}
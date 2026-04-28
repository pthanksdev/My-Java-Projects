package com.example.myguiapp;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;

import java.awt.event.ActionEvent;

public class HelloController {
    public void up(ActionEvent e){
//        System.out.println("UP");
        myCircle.setCenterY(y -= 5);
    }
    public void down(ActionEvent e){
//        System.out.println("DOWN");
        myCircle.setCenterY(y += 5);
    }
    public void left(ActionEvent e){
//        System.out.println("LEFT");
        myCircle.setCenterX(x -= 5);
    }
    public void right(ActionEvent e){
//        System.out.println("RIGHT");
        myCircle.setCenterX(x += 5);
    }
    @FXML
    private Circle myCircle;
    private double x;
    private double y;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
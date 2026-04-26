package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;

public class HelloController {
    @FXML
    private Circle myCircle;
    private double x;
    private double y;
    public void up(){
        System.out.println("up");
        myCircle.setCenterY(y -= 10);
    }
    public void down(){
        System.out.println("down");
        myCircle.setCenterY(y += 10);
    }
    public void left(){
        System.out.println("left");
        myCircle.setCenterX(x -= 10);
    }
    public void right(){
        System.out.println("right");
        myCircle.setCenterX(x += 10);
    }
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {

        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
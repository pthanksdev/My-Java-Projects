package com.example.audioplayer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Label myLabel;

    @FXML
    private Button myPlay,myPause,myReset,myPrevious,myNext;

    @FXML
    private ChoiceBox<String> myChoicebox;
    private String[]speed = {"0.5x","0.75","1x","1.25x","2x"};

    @FXML
    private Slider mySlider;

    @FXML
    private ProgressBar myProgressbar;

    public void initialize(URL arg0, ResourceBundle arg1){
        myChoicebox.getItems().addAll(speed);
//        myChoicebox.setOnAction(this::getSpeed);
    }
//    public void getSpeed(ActionEvent event){
//        String myFood = myChoicebox.getValue();
//        myLabel2.setText(myFood);
//    }

//    public void ChangeSpeed(ActionEvent event){}








//    @FXML
//    private Label welcomeText;
//
//    @FXML
//    protected void onHelloButtonClick() {
//        welcomeText.setText("Welcome to JavaFX Application!");
//    }
}
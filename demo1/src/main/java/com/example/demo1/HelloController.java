package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;

import java.awt.*;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

public class HelloController  implements Initializable {
    @FXML
    private Label welcomeText;
    @FXML
    private Label myLabel2;
    @FXML
    private Label myLabel;
    @FXML
    private DatePicker myDatePicker;
    @FXML
    private ColorPicker colorPicker;
    @FXML
    private AnchorPane myPane;
    @FXML
    private ChoiceBox<String> myChoiceBox;
    private String[]food = {"pizza","Mac & cheese","Pasta","Amala","Burger"};
public void getDate(ActionEvent event){
    LocalDate myDate = myDatePicker.getValue();
    String myFormattedDate = myDate.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
    myLabel.setText(myFormattedDate);
}
public void changeColor(ActionEvent event){
    Color myColor = colorPicker.getValue();
    myPane.setBackground(new Background(new BackgroundFill(myColor,null,null)));
}
public void initialize(URL arg0, ResourceBundle arg1){
    myChoiceBox.getItems().addAll(food);
    myChoiceBox.setOnAction(this::getFood);
}
public void getFood(ActionEvent event){
    String myFood = myChoiceBox.getValue();
    myLabel2.setText(myFood);
}
    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
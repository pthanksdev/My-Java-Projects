package com.example.demo2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class HelloController { //implements Initializable {
    @FXML
    private Label welcomeText;
    @FXML
    private Label mylabel;
    @FXML
    private RadioButton radio1;
    @FXML
    private RadioButton radio2;
    @FXML
    private RadioButton radio3;
    @FXML
    private RadioButton radio4;
    @FXML
    private RadioButton radio5;
    @FXML
    private RadioButton radio6;

//    public void select(ActionEvent event){

    /// /        LocalDate myDate = myDatePicker.getValue();
//        RadioButton radioButton = (RadioButton) radio1.getOnAction();
//        RadioButton radioButton1 = (RadioButton) radio2.getOnAction();
//        RadioButton radioButton2 = (RadioButton) radio3.getOnAction();
//        RadioButton radioButton3 = (RadioButton) radio4.getOnAction();
//        RadioButton radioButton4 = (RadioButton) radio5.getOnAction();
//        RadioButton radioButton5 = (RadioButton) radio6.getOnAction();
//    }
//    public void initialize(URL arg0, ResourceBundle arg1){
//        //getItems().addAll(food);
//        radio1.setOnAction(this::getFood);
//        radio1.getOnAction();
//    }
//    public void getFood(ActionEvent event){
//      RadioButton radioButton
//    }
//
    public void select(ActionEvent event) {
        if (radio1.isSelected()) {
            mylabel.setText("Pizza");
            mylabel.getText();
            System.out.println("Pizza");
        }
        if (radio2.isSelected()) {
            mylabel.setText("Burger");
            mylabel.getText();
            System.out.println("Burger");
        }
        if (radio3.isSelected()) {
            mylabel.setText("Mac and cheese");
            mylabel.getText();
            System.out.println("Mac and cheese");
        }
        if (radio4.isSelected()) {
            mylabel.setText("Biscuits and gravy");
            System.out.println("Biscuits and gravy");
        }
        if (radio5.isSelected()) {
            mylabel.setText("Sharwama");
            System.out.println("Sharwama ");
        }
        if (radio6.isSelected()) {
            mylabel.setText("Risotto");
            System.out.println("Risotto");
        }
    }
}



//    @FXML
//    protected void onHelloButtonClick() {
//        welcomeText.setText("Welcome to JavaFX Application!");
//    }
//}
package com.example.myguiapp3;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.IOException;

public class textController {
    @FXML
    private Label textdisplay;

    public void textDisplay(String text) {
        textdisplay.setText("Name : " + text);
    }
//    public void textDisplay2(String text2){
//        textdisplay.setText("Company : " + text2);
//    }
//    public void textDisplay3(String text3){
//        textdisplay.setText("Email : " + text3);
//    }
//    public void textDisplay4(String text4){
//        textdisplay.setText("Message : " + text4);
//    }
}

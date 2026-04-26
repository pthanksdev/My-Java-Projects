package com.example.checkbox;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private Label mylabel;
    @FXML
    private CheckBox mycheckbox;
    @FXML
    private ImageView myimageview;
    Image myImage1 = new Image("C:\\Users\\USER\\IdeaProjects\\checkbox\\src\\main\\java\\com\\example\\checkbox\\OFF.jpg");
    Image myImage2 = new Image("C:\\Users\\USER\\IdeaProjects\\checkbox\\src\\main\\java\\com\\example\\checkbox\\ON.jpg");
    public void change(ActionEvent event){
        if (mycheckbox.isSelected()){
            mylabel.setText("ON");
            myimageview.setImage(myImage2);
            System.out.println("ON");
        }else {
            mylabel.setText("OFF");
            myimageview.setImage(myImage1);
            System.out.println("OFF");
        }
    }

//    @FXML
//    protected void onHelloButtonClick() {
//        welcomeText.setText("Welcome to JavaFX Application!");
//    }
}
package com.example.slider;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable{
    @FXML
    private Label myLabel;
    @FXML
    private Slider mySlider;
    int myTemperature;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        Text t1 = new Text(0,-12,"*");
        t1.setFont(Font.font(7));

        Text t2 = new Text("C");
        t2.setFont(Font.font(14));

        HBox hbox = new HBox();
        hbox.getChildren().addAll(t1,t2);

        myTemperature = (int) mySlider.getValue();
        myLabel.setText(Integer.toString(myTemperature) + "*C");

        mySlider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                myTemperature = (int) mySlider.getValue();
                myLabel.setText(Integer.toString(myTemperature) + "*C");
            }
        });
    }
}
//    @FXML
//    private Label welcomeText;
//
//    @FXML
//    protected void onHelloButtonClick() {
//        welcomeText.setText("Welcome to JavaFX Application!");
//    }
//}
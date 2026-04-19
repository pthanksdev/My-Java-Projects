module com.example.calculatordemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.calculatordemo to javafx.fxml;
    exports com.example.calculatordemo;
}
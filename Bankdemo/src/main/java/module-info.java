module com.example.bankdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bankdemo to javafx.fxml;
    exports com.example.bankdemo;
}
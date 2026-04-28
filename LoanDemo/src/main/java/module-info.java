module com.example.loandemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.loandemo to javafx.fxml;
    exports com.example.loandemo;
}
module com.example.audioplayer {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.audioplayer to javafx.fxml;
    exports com.example.audioplayer;
}
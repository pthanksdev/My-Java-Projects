module com.example.upay {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires java.sql;
    requires java.net.http;
    requires org.json;


    opens com.example.upay to javafx.fxml;
    exports com.example.upay;
}
module com.example.myguiapp3 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.myguiapp3 to javafx.fxml;
    exports com.example.myguiapp3;
}
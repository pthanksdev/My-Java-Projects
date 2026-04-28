module com.example.myguiapp2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.myguiapp2 to javafx.fxml;
    exports com.example.myguiapp2;
}
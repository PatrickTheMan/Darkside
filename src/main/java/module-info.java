module com.example.darkside {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.darkside to javafx.fxml;
    exports com.example.darkside;
}
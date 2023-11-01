module com.example.initialpro {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.initialpro to javafx.fxml;
    exports com.example.initialpro;
}
module com.example.fxcalc {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fxcalc to javafx.fxml;
    exports com.example.fxcalc;
}
module com.example.fx77 {
    requires javafx.controls;
    requires javafx.fxml;
    requires commons.math3;


    opens com.example.fx77 to javafx.fxml;
    exports com.example.fx77;
}
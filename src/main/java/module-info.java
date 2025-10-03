module com.richard.calculadora {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.richard.calculadora to javafx.fxml;
    exports com.richard.calculadora;
}
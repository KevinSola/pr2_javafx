module co.edu.uniquindio.programacion2.parcial1fx.javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.programacion2.parcial1fx.javafx to javafx.fxml;
    exports co.edu.uniquindio.programacion2.parcial1fx.javafx;
}
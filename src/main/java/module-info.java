module Veterinaria.Pancho.Pelaez {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.controlsfx.controls;

    exports co.edu.uniquindio;
    exports co.edu.uniquindio.Clases;
    exports co.edu.uniquindio.Controllers;
    exports co.edu.uniquindio.Viewcontroller;
    exports co.edu.uniquindio.Enums;

    opens co.edu.uniquindio to javafx.fxml;
    opens co.edu.uniquindio.Viewcontroller to javafx.fxml;
    opens co.edu.uniquindio.Clases to javafx.base;

}
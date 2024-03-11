module co.edu.uniquindio.parcial1fx.appempresa {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.parcial1fx.appempresa to javafx.fxml;
    exports co.edu.uniquindio.parcial1fx.appempresa;

    opens co.edu.uniquindio.parcial1fx.appempresa.controller;
    exports co.edu.uniquindio.parcial1fx.appempresa.controller;
}
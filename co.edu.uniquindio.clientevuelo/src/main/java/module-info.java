module co.edu.uniquindio.clientevuelo.clientevueloapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.clientevuelo.clientevueloapp to javafx.fxml;
    exports co.edu.uniquindio.clientevuelo.clientevueloapp;
}
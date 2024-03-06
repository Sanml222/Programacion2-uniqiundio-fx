package co.edu.uniquindio.clientevuelo.clientevueloapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class clienteVueloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(clienteVueloApplication.class.getResource("ventana-cliente-vuelo.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Cliente Vuelo");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
package co.edu.uniquindio.clientevuelo.clientevueloapp;

import java.net.URL;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

import co.edu.uniquindio.clientevuelo.clientevueloapp.model.Vuelo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ClienteVueloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private DatePicker dateFrom;

    @FXML
    private DatePicker dateTo;

    @FXML
    private TextArea informacion;

    @FXML
    private RadioButton rbComercial;

    @FXML
    private RadioButton rbPremium;

    @FXML
    private RadioButton rbPrimeraClase;

    @FXML
    private ToggleGroup tipovuelo;

    @FXML
    private TextField txtApellido;

    @FXML
    private TextField txtCedula;

    @FXML
    private TextField txtDestino;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtOrigen;

    @FXML
    private TextField txtTelefono;

    private String getTipoVuelo(){

        if (rbPrimeraClase.isSelected()){

            return "primer Clase";
        } else if (rbPremium.isSelected()) {
            return "premium";
        } else {
            return "Comercial";

        }
    }

    private Vuelo guardarVuelo(){

        Vuelo mivuelo = new Vuelo();

        mivuelo.setNombre(txtNombre.getText());
        mivuelo.setApellido(txtApellido.getText());
        mivuelo.setCedula(txtCedula.getText());
        mivuelo.setTelefono(txtTelefono.getText());
        mivuelo.setOrigen(txtOrigen.getText());
        mivuelo.setDestino(txtDestino.getText());
        mivuelo.setFechaIda(dateFrom.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        mivuelo.setFechaVuelta(dateTo.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        mivuelo.setTipoVuelo(getTipoVuelo());

        return mivuelo;
    }

    @FXML
    void onCancelar(ActionEvent event) {

        txtNombre.setText("");
        txtApellido.setText("");
        txtCedula.setText("");
        txtTelefono.setText("");
        txtOrigen.setText("");
        txtDestino.setText("");
        dateFrom.cancelEdit();
        dateTo.cancelEdit();
        informacion.setText("");


    }

    @FXML
    void onGuardar(ActionEvent event) {

        Vuelo vuelo = guardarVuelo();

        informacion.setText(vuelo.toString());
    }

    @FXML
    void initialize() {
        assert dateFrom != null : "fx:id=\"dateFrom\" was not injected: check your FXML file 'ventana-cliente-vuelo.fxml'.";
        assert dateTo != null : "fx:id=\"dateTo\" was not injected: check your FXML file 'ventana-cliente-vuelo.fxml'.";
        assert rbComercial != null : "fx:id=\"rbComercial\" was not injected: check your FXML file 'ventana-cliente-vuelo.fxml'.";
        assert rbPremium != null : "fx:id=\"rbPremium\" was not injected: check your FXML file 'ventana-cliente-vuelo.fxml'.";
        assert rbPrimeraClase != null : "fx:id=\"rbPrimeraClase\" was not injected: check your FXML file 'ventana-cliente-vuelo.fxml'.";
        assert tipovuelo != null : "fx:id=\"tipovuelo\" was not injected: check your FXML file 'ventana-cliente-vuelo.fxml'.";
        assert txtApellido != null : "fx:id=\"txtApellido\" was not injected: check your FXML file 'ventana-cliente-vuelo.fxml'.";
        assert txtCedula != null : "fx:id=\"txtCedula\" was not injected: check your FXML file 'ventana-cliente-vuelo.fxml'.";
        assert txtDestino != null : "fx:id=\"txtDestino\" was not injected: check your FXML file 'ventana-cliente-vuelo.fxml'.";
        assert txtNombre != null : "fx:id=\"txtNombre\" was not injected: check your FXML file 'ventana-cliente-vuelo.fxml'.";
        assert txtOrigen != null : "fx:id=\"txtOrigen\" was not injected: check your FXML file 'ventana-cliente-vuelo.fxml'.";
        assert txtTelefono != null : "fx:id=\"txtTelefono\" was not injected: check your FXML file 'ventana-cliente-vuelo.fxml'.";

    }

}

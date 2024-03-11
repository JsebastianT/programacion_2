package co.edu.uniquindio.parcial1fx.appempresa.controller;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.parcial1fx.appempresa.factory.EmpresaTransporteSingleton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AsociadoController {

    EmpresaTransporteSingleton empresaTransporteSingleton;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnComprarTiquete;

    @FXML
    private RadioButton rbtnVehiculoCarga;

    @FXML
    private RadioButton rbtnVehiculoPasajeros;

    @FXML
    private TextField txtCedula;

    @FXML
    private TextField txtCelular;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextArea txtResultado;

    @FXML
    void onAsociar(ActionEvent event) {

    }

    @FXML
    void initialize() {
        empresaTransporteSingleton = EmpresaTransporteSingleton.getInstance();

    }

}



package org.example.tiendaapp;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.net.URL;
import java.net.http.WebSocket;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    @FXML
    private Button btnSaludar, btnLimpiar;
    @FXML
    private Text textSaludo;
    @FXML
    private TextField editNombre;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        actions();
    }

    public void actions(){
        btnSaludar.setOnAction(event ->{
            if (editNombre.getText().isEmpty()){
                textSaludo.setText("No hay a quien saludar");
            }else{
                textSaludo.setText(String.format("Enhorabuena %s has completado el reto",editNombre.getText()));

            }


        });

        btnLimpiar.setOnAction(event ->{
            editNombre.clear();
            textSaludo.setText("");
           

        });
    }
}

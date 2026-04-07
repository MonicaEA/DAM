package controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class TrabajadorController implements Initializable {

    @FXML
    private Button btnFichar;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        actions();
    }

    private void actions() {
        btnFichar.setOnAction(event->
                        System.out.println("Fichaje realizado correctamente")
                );


    }
}

package controllerView;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import java.net.URL;
import java.util.ResourceBundle;
import controller.APIController;
import view.AppGrafica;

public class InicioViewController implements Initializable {

    @FXML
    private Button btnCargar;

    private APIController api = new APIController();

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        btnCargar.setOnAction(event -> {
            System.out.println("--- CONECTANDO CON LA BIBLIOTECA ---");
            api.obtenerTodosLosLibros();
            System.out.println("¡Libros cargados correctamente en memoria!");
            // Cambio a pantalla 2.
            AppGrafica.cambiarPantalla("/biblioteca.fxml", "Catálogo Completo");
        });
    }
}
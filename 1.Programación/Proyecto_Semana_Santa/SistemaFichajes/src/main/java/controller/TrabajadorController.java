package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import model.GestionDatos;
import model.Usuario;
import org.example.sistemafichajes.HelloApplication;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

public class TrabajadorController implements Initializable {

    @FXML
    private Button btnFichar,btnVolver;
    private Usuario usuario;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        actions();
    }

    public void setUsuario(Usuario usuario) {
        this.usuario= usuario;
        System.out.println("TrabajadorController recibió a: " + usuario.getNombre());
    }

    private void actions() {
        btnFichar.setOnAction(event -> {
            // Hora y fecha actual
            LocalDateTime ahora = LocalDateTime.now();
            // dia y hora con formato
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            String fechaFormateada = ahora.format(formato);
            // mostrar mensaje
            String mensajeFichaje = "Fichaje: "+usuario.getNombre()+" " + usuario.getApellido() + " a las "+fechaFormateada;
            GestionDatos.registrarFichaje(mensajeFichaje);
            // mostrar alerta de que se ha hecho bien
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Fichaje registrado");
            alert.setHeaderText(null);
            alert.setContentText(usuario.getNombre() + " has fichado a las " + fechaFormateada);
            alert.show();


        });

        btnVolver.setOnAction(event->{
            try {
                FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("/org/example/sistemafichajes/login-view.fxml"));
                Parent root = loader.load();

                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.setTitle("Acceso al Sistema");
                stage.show();

                ((Stage) btnVolver.getScene().getWindow()).close();

            } catch (IOException e) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setContentText("No se pudo cerrar volver: " + e.getMessage());
                alert.show();
            }
        });



    }

    }


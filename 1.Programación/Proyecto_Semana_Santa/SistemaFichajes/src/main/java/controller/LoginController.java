package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Administrador;
import model.GestionDatos;
import model.Trabajador;
import model.Usuario;
import org.example.sistemafichajes.HelloApplication;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    @FXML
    private TextField usuarioMail;
    @FXML
    private PasswordField usuarioPass;
    @FXML
    private Button btnEntrar;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        GestionDatos.inicializar();
        actions();
    }

    private void actions() {
        btnEntrar.setOnAction(event -> {
            System.out.println("Entrando en el sistema");
            String correoIngresado = usuarioMail.getText();
            String passIngresada = usuarioPass.getText();

            boolean encontrado = false;

            for (Usuario usuario : GestionDatos.getListaUsuarios()) {
                if (usuario.getCorreo().equals(correoIngresado) && usuario.getPassword().equals(passIngresada)) {
                    encontrado = true;

                    String fxmlFile = "";
                    if (usuario instanceof Administrador) {
                        System.out.println("Login como Admin");
                        try {
                            Stage stage = new Stage();
                            FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("/org/example/sistemafichajes/admin-view.fxml"));
                            Parent root = loader.load();
                            AdminController controller = loader.getController();
                            controller.setUsuario(usuario);

                            Scene scene = new Scene(root);
                            stage.setScene(scene);
                            stage.setTitle("Gestion de Sistema - Administrador " + usuario.getNombre());
                            stage.show();
                            ((Stage) btnEntrar.getScene().getWindow()).close();
                        } catch (IOException e) {
                            Alert alert = new Alert(Alert.AlertType.ERROR);
                            alert.setTitle("Error");
                            alert.setContentText("No se puede cargar la pantalla de admin: " + e.getMessage());
                            alert.show();
                        }

                    } else if (usuario instanceof Trabajador) {
                        fxmlFile = "trabajador-view.fxml";
                    }


                    if (!fxmlFile.isEmpty()) {
                        try {
                            Stage stage = new Stage();
                            FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource(fxmlFile));
                            Scene scene = new Scene(loader.load());

                            if (usuario instanceof Trabajador) {
                                TrabajadorController controller = loader.getController();
                                controller.setUsuario(usuario);
                            }

                            stage.setScene(scene);
                            stage.setTitle("Panel de " + usuario.getNombre());
                            stage.show();

                            ((Stage) btnEntrar.getScene().getWindow()).close();

                        } catch (IOException e) {
                            Alert alert = new Alert(Alert.AlertType.ERROR);
                            alert.setTitle("Error de carga");
                            alert.setContentText("La pantalla que se intenta cargar no está disponible: " + e.getMessage());
                            alert.show();
                        }
                    }
                    break;
                }
            }

            if (!encontrado) {
                System.out.println("Credenciales incorrectas");
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error, credenciales incorrectos");
                alert.setContentText("Intentalo de nuevo con los datos correctos.");
                alert.show();
            }
        });
    }
}
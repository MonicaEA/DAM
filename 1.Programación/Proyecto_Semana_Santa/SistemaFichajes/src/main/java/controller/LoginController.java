package controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import model.GestionDatos;
import model.Trabajador;
import model.Usuario;

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
        actions();

    }

    private void actions() {
        btnEntrar.setOnAction(event -> {
            String correoIngresado = usuarioMail.getText();
            String passIngresada = usuarioPass.getText();

            // Supongamos que 'lista' es nuestra List<Usuario> con datos
            boolean encontrado = false;

            for (Usuario usuario : GestionDatos.getListaUsuarios()) {
                // Aquí va la magia de la comparación
                if (usuario.getCorreo().equals(correoIngresado) && usuario.getPassword().equals(passIngresada)) {
                    encontrado = true;
                    System.out.println("¡Bienvenido, " + usuario.getNombre() + "!");
                    break;
                }
            }

            if (!encontrado) {
                System.out.println("Credenciales incorrectas ");
            }
        });
    }
}

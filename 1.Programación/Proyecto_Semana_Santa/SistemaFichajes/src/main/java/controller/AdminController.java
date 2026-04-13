package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import model.GestionDatos;
import model.Trabajador;
import model.Usuario;
import org.example.sistemafichajes.HelloApplication;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;

public class AdminController implements Initializable {
    private Usuario usuario;
    @FXML
    private TextField txtNombre, txtApellido, txtDni, txtCorreo, txtPass;
    @FXML
    private Button btnAlta, btnBaja, btnVerFichajes, btnVerEmpleados, btnDeslogarse,btnVerDatos, btnCambiarPass;

    @FXML
    private ListView<String> listaGeneral;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        actions();
    }

    private void actions() {
        System.out.println("Cargando datos perfil admin");
        List<String> todosLosFichajes = GestionDatos.leerFichajes();
        if (todosLosFichajes.isEmpty()) {
            System.out.println("No hay registros aún");
        } else {
            for (String fichajes : todosLosFichajes) {
                System.out.println(fichajes);
            }
        }

        //botoncitos
        btnAlta.setOnAction(event -> {
            System.out.println("Proceso alta trabajador");
            String nombre = txtNombre.getText();
            String apellido = txtApellido.getText();
            String dni = txtDni.getText();
            String correo = txtCorreo.getText();
            String pass = txtPass.getText();

            if (!nombre.isEmpty() && !apellido.isEmpty() && !pass.isEmpty() && !dni.isEmpty() && !correo.isEmpty()) {
                Trabajador nuevo = new Trabajador(nombre, apellido, dni, correo, pass);
                GestionDatos.getListaUsuarios().add(nuevo);

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Alta confirmada");
                alert.setHeaderText(null);
                alert.setContentText("Trabajador " + nombre + " " + apellido + " registrado correctamente");
                alert.show();
                limpiarCampos();
            } else {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setContentText("Por favor rellena todos los campos.");
                alert.show();
            }
        });

        btnBaja.setOnAction(event -> {

            TextInputDialog dialogo = new TextInputDialog();
            dialogo.setTitle("Baja de Trabajador");
            dialogo.setHeaderText("Eliminar empleado");
            dialogo.setContentText("Introduce el DNI del trabajador a borrar:");

            Optional<String> resultado = dialogo.showAndWait();

            resultado.ifPresent(dniABuscar -> {

                boolean eliminado = GestionDatos.getListaUsuarios().removeIf(usuario ->
                        usuario instanceof Trabajador && usuario.getDni().equals(dniABuscar)
                );

                if (eliminado) {
                    System.out.println("Empleado con DNI " + dniABuscar + " eliminado.");
                    btnVerEmpleados.fire();

                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Gestión realizada");
                    alert.setContentText("Trabajador eliminado correctamente.");
                    alert.show();
                } else {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Error");
                    alert.setContentText("No hay ningún trabajador con el DNI: " + dniABuscar);
                    alert.show();
                }
            });
        });

        btnDeslogarse.setOnAction(event -> {
            try {

                FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("/org/example/sistemafichajes/login-view.fxml"));
                Parent root = loader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.setTitle("Acceso al Sistema");
                stage.show();
                ((Stage) btnDeslogarse.getScene().getWindow()).close();

            } catch (IOException e) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setContentText("No se pudo cerrar sesión: " + e.getMessage());
                alert.show();
            }
        });

        btnVerEmpleados.setOnAction(event -> {
            listaGeneral.getItems().clear();
            for (Usuario usuario : GestionDatos.getListaUsuarios()) {
                if (usuario instanceof Trabajador) {
                    listaGeneral.getItems().add(usuario.toString());
                }

            }
            if (listaGeneral.getItems().isEmpty()) {
                listaGeneral.getItems().add("No hay trabajadores en el sistema");
            }

        });

        btnVerFichajes.setOnAction(event -> {
            listaGeneral.getItems().clear();
            List<String> registros = GestionDatos.leerFichajes();
            if (registros.isEmpty()) {
                listaGeneral.getItems().add("No hay registros todavía");
            } else {
                listaGeneral.getItems().addAll(registros);
            }
            System.out.println("Mostrando todos los registros");
        });

        btnVerDatos.setOnAction(event -> {
            TextInputDialog dialogo = new TextInputDialog();
            dialogo.setTitle("Consulta de datos de empleado");
            dialogo.setHeaderText("Buscar ficha de trabajador");
            dialogo.setContentText("Introduce el DNI del trabajador que quieres buscar:");

            Optional<String> resultado = dialogo.showAndWait();
            resultado.ifPresent(dniABuscar -> {
                Usuario encontrado = null;

                for (Usuario usuario : GestionDatos.getListaUsuarios()) {
                    if (usuario.getDni().equals(dniABuscar) && usuario instanceof Trabajador) {
                        encontrado = usuario;
                        break;
                    }
                }
                if (encontrado != null) {
                    Alert info = new Alert(Alert.AlertType.INFORMATION);
                    info.setTitle("Ficha del trabajador");
                    info.setHeaderText("Datos de " + encontrado.getNombre() + " " + encontrado.getApellido());

                    String detalle = "Nombre: " + encontrado.getNombre() + "\n" +
                            "Apellido: " + encontrado.getApellido() + "\n" +
                            "DNI: " + encontrado.getDni() + "\n" +
                            "Correo: " + encontrado.getCorreo();
                    info.setContentText(detalle);
                    info.show();
                } else {
                    Alert error = new Alert(Alert.AlertType.ERROR);
                    error.setTitle("Error de busqueda");
                    error.setContentText("No hay ningún trabajador con este DNI");
                    error.show();
                }

            });

        });
        btnCambiarPass.setOnAction(event -> {
            TextInputDialog dialogoDni = new TextInputDialog();
            dialogoDni.setTitle("Cambiar contraseña");
            dialogoDni.setHeaderText("Actualización credenciales");
            dialogoDni.setContentText("Introduzca el DNI del trabajador:");

            dialogoDni.showAndWait().ifPresent(dni -> {

                Optional<Usuario> encontrado = GestionDatos.getListaUsuarios().stream()
                        .filter(usuario -> usuario instanceof Trabajador && usuario.getDni().equals(dni))
                        .findFirst();


                if (encontrado.isPresent()) {
                    Usuario trabajador = encontrado.get();

                    TextInputDialog dialogoPass = new TextInputDialog();
                    dialogoPass.setTitle("Nueva Contraseña");
                    dialogoPass.setHeaderText("Cambiando clave a: " + trabajador.getNombre());
                    dialogoPass.setContentText("Introduce la nueva contraseña:");

                    dialogoPass.showAndWait().ifPresent(nuevaPass -> {
                        trabajador.setPassword(nuevaPass);

                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                        alert.setTitle("Éxito");
                        alert.setContentText("Contraseña actualizada para " + trabajador.getNombre());
                        alert.show();
                    });
                } else {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Error");
                    alert.setContentText("No se encontró el DNI: " + dni);
                    alert.show();
                }
            });
        });
    }

                private void limpiarCampos () {
                    txtNombre.clear();
                    txtApellido.clear();
                    txtDni.clear();
                    txtCorreo.clear();
                    txtPass.clear();
                }

                public Usuario getUsuario () {
                    return usuario;
                }

                public void setUsuario (Usuario usuario){
                    this.usuario = usuario;
                }


            }

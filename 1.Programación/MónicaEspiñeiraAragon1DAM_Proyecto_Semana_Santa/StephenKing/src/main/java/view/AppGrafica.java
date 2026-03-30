package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;

public class AppGrafica extends Application {

    private static Stage primaryStage;

    @Override
    public void start(Stage stage) throws Exception {
        primaryStage = stage;

        cambiarPantalla("/inicio.fxml", "Biblioteca Stephen King - Inicio");
    }

    public static void cambiarPantalla(String fxml, String titulo) {
        try {

            URL resource = AppGrafica.class.getResource(fxml);

            if (resource == null) {
                System.out.println("No se encuentra el archivo " + fxml + " en la carpeta resources.");
                return;
            }

            FXMLLoader loader = new FXMLLoader(resource);
            Parent root = loader.load();
            Scene scene = new Scene(root, 800, 600);

            primaryStage.setTitle(titulo);
            primaryStage.setScene(scene);
            primaryStage.show();

        } catch (IOException e) {
            System.out.println("Error al cargar la pantalla: " + fxml);
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
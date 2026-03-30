package controllerView;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.collections.FXCollections;
import model.Libro;
import controller.APIController;
import controller.BibliotecaController;
import view.AppGrafica;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class BibliotecaViewController implements Initializable {

    @FXML private TableView<Libro> tablaLibros;
    @FXML private TableColumn<Libro, Integer> colId;
    @FXML private TableColumn<Libro, String> colTitulo;
    @FXML private TableColumn<Libro,Integer> colAnio;
    @FXML private TableColumn<Libro,Integer> colPaginas;
    @FXML private Button btnFavorito, btnExportar, btnImportar, btnVolver,btnVerTodo;

    private APIController api = new APIController();
    private BibliotecaController bibliotecaController = new BibliotecaController();

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colTitulo.setCellValueFactory(new PropertyValueFactory<>("title"));
        colAnio.setCellValueFactory(new PropertyValueFactory<>("year"));
        colPaginas.setCellValueFactory(new PropertyValueFactory<>("pages"));
        tablaLibros.setItems(FXCollections.observableArrayList(api.obtenerTodosLosLibros()));

        // AÑADIR A FAVORITOS
        btnFavorito.setOnAction(event -> {
            Libro seleccionado = tablaLibros.getSelectionModel().getSelectedItem();
            if (seleccionado != null) {
                bibliotecaController.agregarFavorito(seleccionado);
                System.out.println("Añadido a favoritos: " + seleccionado.getTitle());
            } else {
                System.out.println("Por favor, selecciona un libro de la tabla.");
            }
        });

        // EXPORTAR A .OBJ
        btnExportar.setOnAction(event -> {
            bibliotecaController.exportarFavoritos();
            System.out.println("Archivo favoritos generado con éxito.");
        });

        // IMPORTAR DE .OBJ
        btnImportar.setOnAction(event -> {
            bibliotecaController.importarFavoritos();
            tablaLibros.setItems(FXCollections.observableArrayList(bibliotecaController.getFavoritos()));
            System.out.println("Favoritos cargados desde el archivo.");
        });


        btnVerTodo.setOnAction(event->{
            System.out.println("Volviendo a catálogo completo");

            List<Libro> todosLosLibros = api.obtenerTodosLosLibros();
            tablaLibros.setItems(FXCollections.observableArrayList(todosLosLibros));
            System.out.println("Mostrando catálogo");
        });

        btnVolver.setOnAction(event ->
                AppGrafica.cambiarPantalla("/inicio.fxml", "Inicio"));
    }
}
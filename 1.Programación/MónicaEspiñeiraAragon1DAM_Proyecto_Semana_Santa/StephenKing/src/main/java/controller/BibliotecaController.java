package controller;

import model.Biblioteca;
import model.Libro;
import java.util.ArrayList;
import java.util.List;

public class BibliotecaController {

    private Biblioteca biblioteca;
    private List<Libro> listaFavoritos;
    private FileController fileController; // añado aqui el FileController para tener el código más limpio

    public BibliotecaController() {
        this.biblioteca = new Biblioteca();
        this.listaFavoritos = new ArrayList<>();
        this.fileController = new FileController();
    }



    public void agregarFavorito(Libro libro) {
        if (libro != null) {
            this.listaFavoritos.add(libro);
        }
    }


    public void mostrarCatalogo() {
        // Compruebo si la lista tiene libros
        if (biblioteca.getListaLibros() == null || biblioteca.getListaLibros().isEmpty()) {
            System.out.println("El catálogo está vacío. Importa primero los libros de la API.");
        } else {
            System.out.println("--- CATÁLOGO ---");
            for (Libro libro : biblioteca.getListaLibros()) {
                System.out.println(libro);
            }
        }
    }

    public void exportarFavoritos() {
        fileController.exportarFavoritos(this.listaFavoritos);
    }

    public void importarFavoritos() {
        this.listaFavoritos = fileController.importarFavoritos();
    }


    public void cargarCatalogo(List<Libro> librosApi) {
        this.biblioteca.setListaLibros(librosApi);
    }

    public List<Libro> getFavoritos() {
        return listaFavoritos;
    }
}
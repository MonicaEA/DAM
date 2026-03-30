package view;

import controller.*;
import model.Libro;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        APIController api = new APIController();
        BibliotecaController bibliotecaController = new BibliotecaController();

        int opcion = -1;

        do {
            System.out.println("\n--- BIBLIOTECA DE STEPHEN KING ---");
            System.out.println("1. Importar libros de la API");
            System.out.println("2. Buscar información");
            System.out.println("3. Añadir a favoritos (por ID)");
            System.out.println("4. Guardar favoritos");
            System.out.println("5. Mostrar favoritos.");
            System.out.println("6. Ver catálogo completo");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            try {
                // he visto que es mejor hacer el parseo para evitar errores con el teclado
                opcion = Integer.parseInt(scanner.nextLine());

                switch (opcion) {
                    case 1 -> {
                        System.out.println("Conectando con la API...");
                        List<Libro> listaLibros = api.obtenerTodosLosLibros();
                        bibliotecaController.cargarCatalogo(listaLibros);
                        System.out.println("Catálogo cargado con éxito");
                    }
                    case 2 -> {
                        System.out.print("Introduce el ID del libro: ");
                        int idABuscar = Integer.parseInt(scanner.nextLine());
                        Libro encontrado = api.obtenerLibroPorId(idABuscar);
                        if (encontrado != null) {
                            System.out.println("Encontrado: " + encontrado);
                        } else {
                            System.out.println("No existe ese ID.");
                        }
                    }
                    case 3 -> {
                        System.out.print("¿Qué ID quieres guardar?: ");
                        int idFavorito = Integer.parseInt(scanner.nextLine());
                        Libro libroFavorito = api.obtenerLibroPorId(idFavorito);
                        if (libroFavorito != null) {
                            bibliotecaController.agregarFavorito(libroFavorito);
                        } else {
                            System.out.println("ID no encontrado.");
                        }
                    }
                    case 4 -> {
                        System.out.println("Guardando el libro en favoritos...");
                        bibliotecaController.exportarFavoritos();
                    }
                    case 5 -> {
                        System.out.println("Cargando favoritos ...");
                        bibliotecaController.importarFavoritos();
                        List<Libro> recuperados = bibliotecaController.getFavoritos();
                        if (recuperados.isEmpty()) {
                            System.out.println("El archivo está vacío o no existe.");
                        } else {
                            System.out.println("Se han recuperado estos favoritos:");
                            recuperados.forEach(System.out::println);
                        }
                    }
                    case 6 -> bibliotecaController.mostrarCatalogo();
                    case 0 -> System.out.println("Saliendo...");
                    default -> System.out.println("Opción no válida.");
                }

            } catch (Exception e) {
                System.out.println("Error: Por favor, introduce un número válido.");
            }

        } while (opcion != 0);

        scanner.close();
    }
}
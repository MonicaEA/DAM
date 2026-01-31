import controller.Gestor;
import model.Audio;
import model.Libro;
import model.Multimedia;
import model.Video;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Gestor gestor = new Gestor();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        System.out.println("***** BIENVENIDO AL GESTOR DE INVENTARIO MULTIMEDIA ******");

        do {
            System.out.println("\n1.Añadir elemento");
            System.out.println("2.Eliminar elemento");
            System.out.println("3.Listar colección");
            System.out.println("4.Buscar por autor");
            System.out.println("5.Buscar por actor");
            System.out.println("6.Buscar por director");
            System.out.println("7.Salir");
            System.out.println("Introduce la opción:");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1 -> {
                    System.out.println("¿Que objeto quieres añadir? (1.Libro, 2.Video, 3.Audio)");
                    int opcionArticulo = scanner.nextInt();
                    scanner.nextLine();

                    switch (opcionArticulo) {
                        case 1 -> {
                            System.out.println("ID:");
                            int id = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Título:");
                            String titulo = scanner.nextLine();
                            System.out.println("Autor:");
                            String autor = scanner.nextLine();
                            System.out.println("Tamaño:");
                            int tamano = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Formato:");
                            String formato = scanner.nextLine();
                            System.out.println("ISBN:");
                            String isbn = scanner.nextLine();
                            System.out.println("Páginas:");
                            int nPaginas = scanner.nextInt();
                            gestor.anadirAlaColeccion(new Libro(id, titulo, autor, tamano, formato, isbn, nPaginas));
                        }
                        case 2 -> {
                            System.out.println("ID:");
                            int idV = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Título:");
                            String tituloV = scanner.nextLine();
                            System.out.println("Autor:");
                            String autorV = scanner.nextLine();
                            System.out.println("Tamaño:");
                            int tamanoV = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Formato:");
                            String formatoV = scanner.nextLine();
                            System.out.println("Director:");
                            String director = scanner.nextLine();
                            System.out.println("Actores:");
                            String actores = scanner.nextLine();
                            gestor.anadirAlaColeccion(new Video(idV, tituloV, autorV, tamanoV, formatoV, director, actores));
                        }
                        case 3 -> {
                            System.out.println("ID:");
                            int idA = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Título:");
                            String tituloA = scanner.nextLine();
                            System.out.println("Autor:");
                            String autorA = scanner.nextLine();
                            System.out.println("Tamaño:");
                            int tamanoA = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Formato:");
                            String formatoA = scanner.nextLine();
                            System.out.println("Duración:");
                            int duracion = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Soporte:");
                            String soporte = scanner.nextLine();
                            gestor.anadirAlaColeccion(new Audio(idA, tituloA, autorA, tamanoA, formatoA, duracion, soporte));
                        }
                    }
                }
                case 2 -> {
                    System.out.println("ID a eliminar:");
                    int idEliminar = scanner.nextInt();
                    gestor.eliminarDeLaColeccion(idEliminar);
                }
                case 3 -> gestor.listarColeccion();
                case 4 -> {
                    System.out.println("Autor a buscar:");
                    String autorB = scanner.nextLine();
                    gestor.buscarAutor(autorB);
                }
                case 5 -> {
                    System.out.println("Actor a buscar:");
                    String actorB = scanner.nextLine();
                    gestor.buscarActor(actorB);
                }
                case 6 -> {
                    System.out.println("Director a buscar:");
                    String directorB = scanner.nextLine();
                    gestor.buscarDirector(directorB);
                }
                case 7 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 7);
    }
}
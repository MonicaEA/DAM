import controller.Gestor;
import model.Audio;
import model.Libro;
import model.Multimedia;
import model.Video;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    /*2. Desarrollar una aplicación para la gestión de una colección multimedia. Todo
elemento multimedia tiene 5 características; identificador, titulo, autor, tamaño,
formato. Adicionalmente cada uno de los elementos tendrán:
a. Libro (ISBN, número de páginas)
b. Video (director, actores)
c. Audio (duración, soporte)
La aplicación deberá poder manejar cualquier tipo de objeto, dando la posibilidad de:
1. Añadir a la colección (preguntara que tipo de objeto y los elementos
correspondientes) a. Los datos serán pedidos por consola b. Una vez añadido el
programa mostrará una confirmación de que el elemento está bien añadido
2. Eliminar de la colección a. Se pedirá el identificador del elemento a eliminar b.
Una vez eliminado el programa mostrará una confirmación de que el elemento
está bien eliminado
3. Listar elementos a. Video b. Audio c. Todos
4. Salir
Los listados mostrarán información completa de los elementos en cuestión. La
restricción que se pone a la colección es que no se pueden añadir elementos con el
mismo id.
Dentro del menú, poner tres opciones nuevas:
1. Buscar por autor: introduciré el nombre de un autor y me dirá el título de todos
los libros de tenga
2. Buscar por actor: se introducirá el nombre de un actor y se mostrará el título de
todas las películas donde aparezca
3. Buscar por director: se introducirá el nombre de un director y s emostarán todas
las películas que tenga*/

    public static void main(String[] args) {


        Gestor gestor = new Gestor();
        Scanner scanner = new Scanner(System.in);
        System.out.println("***** BIENVENIDO AL GESTOR DE INVENTARIO MULTIMEDIA ******");

        System.out.println();
        int opcion = 0;
        do {
            System.out.println("1.Añadir elemento");
            System.out.println("2.Eliminar elemento");
            System.out.println("3.Listar colección");
            System.out.println("4.Salir");
            System.out.println();
            System.out.println("Introduce la opción");
            opcion= scanner.nextInt();

            switch (opcion){

                case 1 -> {
                    System.out.println("¿Que objeto quieres añadir");
                    System.out.println("1.Libro");
                    System.out.println("2.Video");
                    System.out.println("3.Audio");
                    int opcionArticulo=0;
                    do {
                        opcionArticulo = scanner.nextInt();
                        switch (opcionArticulo){

                            case 1 -> {
                                System.out.println("Introduce el ID:");
                                int id = scanner.nextInt();
                                scanner.nextLine();

                                System.out.println("Introduce el Título:");
                                String titulo = scanner.nextLine();

                                System.out.println("Introduce el autor:");
                                String autor = scanner.nextLine();

                                System.out.println("Introduce el tamaño del artículo");
                                int tamaño = scanner.nextInt();
                                scanner.nextLine();

                                System.out.println("Introduce el formato:");
                                String formato = scanner.nextLine();


                                System.out.println("Introduce el ISBN");
                                String isbn = scanner.nextLine();

                                System.out.println("Introduce el número de páginas");
                                int nPaginas = scanner.nextInt();

                                gestor.anadirAlaColeccion(new Libro(id, titulo, autor, tamaño, formato, isbn, nPaginas));
                            }
                                case 2 -> {
                                    System.out.println("Introduce el ID:");

                                int idVideo = scanner.nextInt();
                                scanner.nextLine();

                                System.out.println("Introduce el Título:");
                                String tituloVideo = scanner.nextLine();

                                System.out.println("Introduce el autor:");
                                String autorVideo = scanner.nextLine();

                                System.out.println("Introduce el tamaño del artículo");
                                int tamañoVideo = scanner.nextInt();
                                scanner.nextLine();

                                System.out.println("Introduce el formato:");
                                String formatoVideo = scanner.nextLine();


                                System.out.println("Introduce el director");
                                String director = scanner.nextLine();

                                System.out.println("Introduce los actores");
                                String actores = scanner.nextLine();

                                    gestor.anadirAlaColeccion(new Video(idVideo, tituloVideo, autorVideo, tamañoVideo, formatoVideo, director, actores));

                            }
                            case 3 -> {
                                System.out.println("Introduce el ID:");

                                int idAudio = scanner.nextInt();
                                scanner.nextLine();

                                System.out.println("Introduce el Título:");
                                String tituloAudio = scanner.nextLine();

                                System.out.println("Introduce el autor:");
                                String autorAudio = scanner.nextLine();

                                System.out.println("Introduce el tamaño del artículo");
                                int tamañoAudio = scanner.nextInt();
                                scanner.nextLine();

                                System.out.println("Introduce el formato:");
                                String formatoAudio = scanner.nextLine();

                                System.out.println("Introduce la duración");
                                int duracion = scanner.nextInt();

                                System.out.println("Introduce el soporte");
                                String soporte = scanner.nextLine();

                                gestor.anadirAlaColeccion(new Audio(idAudio, tituloAudio, autorAudio, tamañoAudio, formatoAudio, duracion, soporte));

                                }
                            }

                    }while (opcionArticulo < 1 || opcionArticulo > 3);

                }

                case 2-> {
                    System.out.println("Que ID quieres eliminar de la lista:");
                    int idEliminar = scanner.nextInt();
                    gestor.eliminarDeLaColeccion(idEliminar);
                }

                case 3-> gestor.listarColeccion();

                case 4-> System.out.println("Salir");



            }

        }while(opcion!=4);



    }







}

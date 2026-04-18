import com.sun.source.doctree.EscapeTree;
import controller.AlumnosController;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AlumnosController alumnosController = new AlumnosController();
        int opcion; // La declaramos aquí

        System.out.println("Bienvenido al sistema de notas de alumnos .... ");

        do {
            // Ponemos el menú DENTRO para que se repita
            System.out.println("\n--- Elige la opción deseada ---");
            System.out.println("1.- Introducir datos de estudiantes");
            System.out.println("2.- Notas finales de los estudiantes");
            System.out.println("3.- Número de estudiantes aprobados");
            System.out.println("4.- Nota máxima de la clase.");
            System.out.println("5.- Nota mínima de la clase.");
            System.out.println("6.- Lista de alumnos con notable.");
            System.out.println("7.- Salir");
            System.out.print("Introduce tu selección: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> alumnosController.cargarNotas();
                case 2 -> alumnosController.mostrarNotaMedia();
                case 3 -> alumnosController.mostrarAprobados();
                case 4 -> alumnosController.notaMáxima();
                case 5 -> alumnosController.notaMinima();
                case 6 -> alumnosController.estudiantesNotables();
                case 7 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Elige una opción correcta");
            }
        } while (opcion != 7); // Salimos cuando sea 7
    }
}

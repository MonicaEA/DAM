import java.util.Scanner;


import java.util.Scanner;

public class Ejercicio9While {
    public void Ejercicio9While(){
        // Creamos el objeto Scanner para leer datos del usuario
        Scanner scanner = new Scanner(System.in);
        // Pedimos al usuario cuántos alumnos hay y guardamos ese número
        System.out.print("Introduce el número de alumnos: ");
        int numeroAlumnos = scanner.nextInt();

        // Creamos un array de enteros para guardar las calificaciones
        // de todos los alumnos. Cada posición del array es para un alumno.
        int[] calificaciones = new int[numeroAlumnos];
        int contador = 0; // Este contador nos dice cuántos alumnos llevamos introducidos

        // Pedimos las calificaciones usando un bucle while
        // El bucle se repite tantas veces como alumnos hay
        while (contador < numeroAlumnos) {
            int nota; // Variable temporal para guardar la nota de cada alumno
            // Este do-while asegura que solo se aceptan notas entre 0 y 10
            do {
                System.out.print("Introduce la calificación (0 a 10) del alumno " + (contador+1) + ": ");
                nota = scanner.nextInt();
                if (nota < 0 || nota > 10) {
                    System.out.println("Calificación inválida. Debe estar entre 0 y 10.");
                }
            } while (nota < 0 || nota > 10); // Si la nota está fuera de rango se repite el do-while
            calificaciones[contador] = nota; // Guardamos la nota válida en el array
            contador++; // Avanzamos al siguiente alumno
        }

        // Usamos un bucle for para procesar y mostrar todas las calificaciones
        System.out.println("\nListado de calificaciones y equivalencia en letras:");
        for (int i = 0; i < numeroAlumnos; i++) {
            int nota = calificaciones[i];
            String letra; // Aquí guardaremos la equivalencia en letras
            // El switch nos ayuda a convertir la nota numérica en una letra
            switch (nota) {
                case 10:
                case 9:
                    letra = "A";
                    break;
                case 8:
                case 7:
                    letra = "B";
                    break;
                case 6:
                case 5:
                    letra = "C";
                    break;
                case 4:
                case 3:
                    letra = "D";
                    break;
                default:
                    letra = "F";
                    break;
            }
            // Mostramos el resultado de cada alumno
            System.out.println("Alumno " + (i + 1) + ": Nota numérica = " + nota + ", letra = " + letra);
        }
    }
}

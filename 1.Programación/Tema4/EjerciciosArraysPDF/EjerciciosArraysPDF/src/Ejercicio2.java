import java.util.Scanner;


public class Ejercicio2 {
/*Crea un array de 10 posiciones y rellénalo con números aleatorios entre el 1
y el 20, pudiendo repetirse. Una vez rellenado, crear un menú para que el usuario
seleccione la acción que quiere realizar:
a. Imprimir array
b. Mover a izquierda
c. Mover a derecha
d. Invertir*/


    public void menuSeleccion() {

        Scanner scanner = new Scanner(System.in);
        int[] numerosAleatorios = new int[10];

        // Rellenar array con números aleatorios 1-10
        for (int i = 0; i < numerosAleatorios.length; i++) {
            numerosAleatorios[i] = (int) (Math.random() * 10) + 1;
        }

        int opcion;

        do {
            System.out.println("1. IMPRIMIR ARRAY");
            System.out.println("2. MOVER IZQUIERDA");
            System.out.println("3. MOVER DERECHA");
            System.out.println("4. INVERTIR");
            System.out.println("5. SALIR");
            System.out.print("¿QUÉ OPCIÓN QUIERES HACER?: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> {
                    // Imprimir array
                    for (int item : numerosAleatorios) {
                        System.out.print(item + "\t");
                    }
                    System.out.println();
                }
                case 2 -> {
                    // Mover izquierda
                    int temporal = numerosAleatorios[0];
                    for (int i = 0; i < numerosAleatorios.length - 1; i++) {
                        numerosAleatorios[i] = numerosAleatorios[i + 1];
                    }
                    numerosAleatorios[numerosAleatorios.length - 1] = temporal;

                    for (int item : numerosAleatorios) {
                        System.out.print(item + "\t");
                    }
                    System.out.println();
                }
                case 3 -> {
                    // Mover derecha
                    int temporal2 = numerosAleatorios[numerosAleatorios.length - 1];
                    for (int i = numerosAleatorios.length - 1; i > 0; i--) {
                        numerosAleatorios[i] = numerosAleatorios[i - 1];
                    }
                    numerosAleatorios[0] = temporal2;

                    for (int item : numerosAleatorios) {
                        System.out.print(item + "\t");
                    }
                    System.out.println();
                }
                case 4 -> {
                    for (int i = 0; i < numerosAleatorios.length / 2; i++) {
                        int j = numerosAleatorios.length - 1 - i; // índice simétrico
                        int temporal = numerosAleatorios[i];
                        numerosAleatorios[i] = numerosAleatorios[j];
                        numerosAleatorios[j] = temporal;
                    }

                    for (int item : numerosAleatorios) {
                        System.out.print(item + "\t");
                    }
                    System.out.println();
                }
                case 5 -> System.out.println("Saliendo...");
                default -> {
                    if (opcion < 1 || opcion > 5) {
                        System.out.println("Opción no válida");
                    }
                }
            }
        } while (opcion != 5);
    }
}
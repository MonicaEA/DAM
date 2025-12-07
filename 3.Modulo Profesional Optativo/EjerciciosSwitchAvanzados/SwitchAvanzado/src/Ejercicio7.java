import java.util.Scanner;

public class Ejercicio7 {
    /*Objetivo:** Crear un sistema que determine el nivel del jugador según su puntuación.

     **Requisitos:**

     1. Declara una variable `int puntuacion`.
     2. Usa `switch(true)` para clasificar en niveles: Principiante (0-100), Intermedio (101-500), Avanzado (501-1000)
     , Experto (1001-5000), Maestro (>5000).
     3. Muestra el nivel alcanzado y un mensaje motivacional.
     4. Otorga una recompensa virtual diferente para cada nivel.*/

    public void clasificacionNivel() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una puntuación: ");
        int puntuacion = scanner.nextInt();

        if (puntuacion < 0) {
            System.out.println("Puntuación no válida");
        } else if (puntuacion <= 100) {
            System.out.println("Nivel principiante");
        } else if (puntuacion <= 500) {
            System.out.println("Nivel intermedio");
        } else if (puntuacion <= 1000) {
            System.out.println("Nivel avanzado");
        } else if (puntuacion <= 5000) {
            System.out.println("Nivel experto");
        } else {
            System.out.println("Maestro");
        }

    }
}
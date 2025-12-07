import java.util.Random;
import java.util.Scanner;


public class Ejercicio4While {
    /*Crea un juego donde el programa elige un número secreto entre 1 y 10 (por ejemplo, 7). Usa un bucle do-while para
     pedir al usuario que adivine el número. El programa debe indicar si el número es mayor o menor,
      y continuar hasta que el usuario acierte.
     */

    public void ejercicio4While() {
        Scanner scanner = new Scanner(System.in);

        int numeroSecreto = (int) (Math.random() * 10) + 1;
        int numeroElegido;


        do {
            System.out.println("Introduce un número:");
            numeroElegido = scanner.nextInt();


            if (numeroElegido > 10) {
                System.out.println("Introduce un número entre 1-10");

            } else if (numeroSecreto < numeroElegido) {
                System.out.println("El número elegido es mayor que el correcto");

            }
            if (numeroSecreto > numeroElegido) {
                System.out.println("El número elegido es menor que el correcto");


            }
        } while (numeroSecreto != numeroElegido) ;


            System.out.println("Has acertado!!!!");



    }
}


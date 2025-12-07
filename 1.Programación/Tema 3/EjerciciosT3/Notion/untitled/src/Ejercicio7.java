import java.util.Scanner;



public class Ejercicio7 {

    /*Crea un programa que pida una nota numérica (0-10) y determine la calificación: Suspenso (0-4), Aprobado (5-6)
    , Notable (7-8) o Sobresaliente (9-10).
     */

    static void main() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una nota (0-10) ");

        double nota = scanner.nextDouble();

        if (nota >=0 && nota <=10 ){
            if (nota<5){
                System.out.println("Suspenso.");
            } else if (nota<7) {
                System.out.println("Aprobado.");

            } else if (nota<9) {
                System.out.println("Notable.");

            } else if (nota<=10) {
                System.out.println("Sobresaliente");

            }

        } else System.out.println("Nota no válida.");

        }

    }



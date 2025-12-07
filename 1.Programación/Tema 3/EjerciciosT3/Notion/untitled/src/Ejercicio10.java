import java.util.Scanner;


public class Ejercicio10 {
    Scanner scanner = new Scanner(System.in);
    /*Crea un programa que pida la altura del usuario (en cm) y determine si puede subir a una atracción.
     La altura mínima es 120 cm y la máxima es 200 cm. Si está dentro del rango, muestra "Puedes subir", si no,
     indica el motivo (demasiado bajo o demasiado alto).
     */

    public void ejercicio10(){

        System.out.println("Introduce tu altura en cm: ");
        int altura = scanner.nextInt();
        int alturaMinima =120;
        int alturaMaxima =200;

        if (altura>=alturaMinima && altura<=alturaMaxima){
            System.out.println("Puedes subir");
        } else{
            System.out.println("No puedes subir.");
            if (altura<alturaMinima){
                System.out.printf("La altura mínima es: %d cm",alturaMinima);
            } else {
                System.out.printf("La altura máxima es: %d cm",alturaMaxima);
            }
        }
        }


    }




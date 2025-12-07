import java.util.Scanner;

public class AdivinacionEj1 {

 /*Crea un programa de adivinación de números El programa genera de manera
aleatoria un número entre 1 y 50. El usuario debe adivinar el número en un
máximo de 7 intentos. Después de cada intento, indica si el número es mayor
o menor que el elegido. Si el usuario acierta, mostrar un aviso con el número
de intentos utilizado; si no, mostrar un aviso de que debe introducir
nuevamente un número.
*/

    Scanner scanner = new Scanner(System.in);

    public void adivinacion (){
    int numeroAleatorio = (int) (Math.random()*50)+1;
    int intentosMax = 7;
    int intentosUsuario=0;
    int numeroElegido;

        do {
            System.out.println("Adivina el número, llevas " +intentosUsuario + " intentos");
            numeroElegido = scanner.nextInt();
            intentosUsuario++;
            if (numeroElegido == numeroAleatorio) {
                System.out.println("Has acertado");
            } else if (numeroElegido > numeroAleatorio) {
                System.out.println("El numero elegido es mayor que el correcto");
            } else if (numeroElegido < numeroAleatorio) {
                System.out.println("El numero elegido es menor que el correcto");

            }
        }while (numeroElegido!=numeroAleatorio && intentosMax>intentosUsuario) ;
            System.out.println("Juego finalizado.");


        System.out.println("---------------------------------------------------");

        // Comprobamos la razón por la que se salió del bucle
        if (numeroElegido == numeroAleatorio) {
            System.out.println("¡Has acertado el número **" + numeroAleatorio + "**!");
            System.out.println("Lo conseguiste en **" + intentosUsuario + "** intentos");
        } else {
            System.out.println("¡Juego finalizado! Se acabaron los " + intentosMax + " intentos.");
            System.out.println("El número secreto era el **" + numeroAleatorio + "**.");
        }
    }


    }












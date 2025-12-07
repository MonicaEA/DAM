import java.util.Scanner;

public class Ejercicio1 {
/*Crea un programa que pida la edad del usuario y determine si es mayor de edad (18 años o más). Muestra un mensaje indicando si puede votar o no.
Ejemplo de salida por consola:
Introduce tu edad: 20
Eres mayor de edad. Puedes votar. */

    public void ejercicio1 (){
    Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce tu edad: ");
        int edad = scanner.nextInt();

        if (edad >=18){
            System.out.println("Eres mayor de edad.Puedes votar");

        } else System.out.println("No puedes votar");





    }
}

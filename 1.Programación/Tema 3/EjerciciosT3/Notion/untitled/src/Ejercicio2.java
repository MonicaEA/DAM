import java.util.Scanner;


public class Ejercicio2 {

/*Desarrolla un programa que pida un número al usuario y determine si es positivo, negativo o cero. Muestra el resultado por consola.
Ejemplo de salida por consola:
Introduce un número: -5
El número es negativo. +/

 */

    public void ejercicio2 (){
    Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        int numero = scanner.nextInt();

        if (numero>0){
            System.out.println("El número es positivo.");
        }else if (numero<0){
            System.out.println("El número es negativo");
        } else
            System.out.println("El número es cero");
        }


    }





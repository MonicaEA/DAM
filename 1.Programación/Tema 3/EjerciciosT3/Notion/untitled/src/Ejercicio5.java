import java.util.Scanner;

public class Ejercicio5 {

    /*Desarrolla un programa que pida un número entero y determine si es par o impar usando el operador módulo.
     Muestra un mensaje personalizado para cada caso.
     */
    public void ejercicio5 (){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número entero: ");
        int numero = scanner.nextInt();

        if (numero %2 ==0){
            System.out.println("El número es par");

        }else System.out.println("El número es impar");




    }





}

import java.util.Scanner;


public class Ejercicio6 {
    Scanner scanner = new Scanner(System.in);
    /*Escribe un programa que pida la edad del usuario y determine si puede acceder a contenido para mayores de 16 años.
     Si tiene 16 o más años, muestra "Acceso permitido", si no, muestra "Acceso denegado".
     */

public void ejercicio6(){

    Scanner scanner = new Scanner(System.in);
    System.out.println("Introduce la edad del usuario: ");
    int edad = scanner.nextInt();
    System.out.println("Edad: "+edad);
    if (edad>=16){
        System.out.println("Acceso permitido.");

    } else System.out.println("Acceso denegado.");




}


}

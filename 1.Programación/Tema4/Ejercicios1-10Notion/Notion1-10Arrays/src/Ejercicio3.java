import java.util.Scanner;

public class Ejercicio3 {

    /*Desarrolla un programa que cree un array vacío de tamaño 5. Usa un bucle for para pedir al usuario
     que introduzca 5 nombres, guardándolos en el array. Al final, muestra todos los nombres almacenados.
     */
public void nombreArray(){
  Scanner scanner = new Scanner(System.in);
  String[] nombres = new String[5];
    System.out.println("Introduce 5 nombres.");
    for (int i = 0; i < nombres.length; i++) {
        System.out.println("Introduce el nombre "+ (i+1) + (":") );
        nombres[i] = scanner.next();

    }
    System.out.println("Nombres introducidos: ");
    for (int i = 0; i < nombres.length; i++) {
        System.out.println(nombres[i]);

    }





}



}

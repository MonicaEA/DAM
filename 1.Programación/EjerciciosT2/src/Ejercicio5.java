import java.util.Scanner;


public class Ejercicio5 {
Scanner scanner = new Scanner(System.in);
    /*Crea un programa que pida la edad del usuario y si tiene carnet de conducir (true/false).
    Usa operadores lógicos para determinar si puede alquilar un coche (debe tener 21 años o más Y tener carnet).
Ejemplo de salida por consola:
Introduce tu edad: 23
¿Tienes carnet de conducir? (true/false): true
¿Eres mayor de 21 años?: true
¿Tienes carnet?: true
¿Puedes alquilar un coche? (AND): true*/

public void ejercicio5(){
    System.out.println("Introduce tu edad: ");
    int edad = scanner.nextInt();
    System.out.println("¿Tienes carnet de conducir: (true/false)");
    boolean carnet = scanner.nextBoolean();
    boolean mayor = edad >= 21;
    boolean puedeAlquilar = carnet && mayor;
    System.out.println("¿Eres mayor de 21 años? " + mayor);
    System.out.println("¿Tienes carnet? "+carnet);
    System.out.println("¿Puede alquilar un coche? "+ puedeAlquilar);



}


}

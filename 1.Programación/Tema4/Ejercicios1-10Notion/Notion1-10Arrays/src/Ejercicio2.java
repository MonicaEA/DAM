import java.util.Scanner;


public class Ejercicio2 {
/*Escribe un programa que cree un array de 6 números enteros. Usa un bucle for para recorrer el array y
mostrar cada número junto con su posición (índice).
 */

public void recorriendoArray(){
Scanner scanner = new Scanner(System.in);


    int[] numeros = new int[6];

    for (int i = 0; i < numeros.length; i++) {
        System.out.print("Introduce el número " + (i+1) + ": ");
        numeros[i] = scanner.nextInt();

    }


    for (int i = 0; i < numeros.length; i++) {
        System.out.println("Posición "+i+" : " + numeros[i]);

    }


}

}

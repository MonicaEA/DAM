import java.util.Scanner;

public class Ejercicio9 {
/*Escribe un programa que cree un array de 7 números.
Usa un bucle for para crear un nuevo array con los elementos en orden inverso.
 Muestra ambos arrays: el original y el invertido.
 */
 Scanner scanner = new Scanner(System.in);

 public void arrayInvertido(){
     int[] arrayDerecho = new int[7];
     int[] arrayInverso = new int[7];
     System.out.println("Introduce 7 números: ");
     int numerosRestantes=7;
     System.out.println("Array original:");
     for (int i = 0; i < arrayDerecho.length; i++) {
         arrayDerecho[i]= scanner.nextInt();
         numerosRestantes--;
         System.out.println("Te quedan "+numerosRestantes);
     }
     System.out.println();

     System.out.println("Array invertido:");

     int valorPosicion = arrayDerecho.length-1;
     for (int i = 0; i < arrayDerecho.length; i++) {
         int posicionInversa = valorPosicion-i;
         arrayInverso[posicionInversa] = arrayDerecho[i];
     }

     // Mostrar array original
     System.out.print("Array original: ");
     for (int i = 0; i < arrayDerecho.length; i++) {
         System.out.print(arrayDerecho[i] + " ");
     }
     System.out.println();

     // Mostrar array invertido
     System.out.print("Array invertido: ");
     for (int i = 0; i < arrayInverso.length; i++) {
         System.out.print(arrayInverso[i] + " ");
     }
     System.out.println();
 }






 }






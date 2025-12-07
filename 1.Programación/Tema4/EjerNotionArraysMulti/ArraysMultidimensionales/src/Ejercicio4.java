import java.util.Scanner;


public class Ejercicio4 {
    /*Crea un programa con una matriz de 3x5 con números. Pide al usuario un número a buscar
     y usa bucles for anidados para encontrarlo. Si existe, muestra su posición (fila y columna).
      Si no existe, indica que no se encontró.
     */


Scanner scanner = new Scanner(System.in);
 public void buscarNumero(){

     int[][]numeros = new int[][]{{2,4,6,8,10},{1,3,5,7,9},{2,1,3,5,4}};
     System.out.println("¿Qué número quieres buscar? ");
     int numeroBuscar = scanner.nextInt();
     boolean numeroExiste= false;
     for (int i = 0; i < numeros.length; i++)
         for (int j = 0; j < numeros[i].length; j++) {
             if (numeroBuscar == numeros[i][j]) {
                 System.out.println("El número esta en la fila " + i + " y en la columna " + j);
                 numeroExiste = true;

             }
         }
     if (!numeroExiste){
         System.out.println("El número no existe");

     }
         System.out.println();

     }


 }


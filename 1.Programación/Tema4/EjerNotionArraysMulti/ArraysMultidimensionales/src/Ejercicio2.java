import java.util.Scanner;

public class Ejercicio2 {
    /*Desarrolla un programa que cree una matriz de 2x4.
     Usa bucles for anidados para pedir al usuario que introduzca 8 números y los almacene en la matriz.
      Al final, muestra la matriz completa.
     */

    Scanner scanner = new Scanner(System.in);

    public void matriz2x4() {

        int[][] matriz = new int[2][4];
        System.out.println("Introduzca los números de la matriz : ");
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Siguiente : ");
                matriz[i][j]=scanner.nextInt();


            }

        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+"\t");

            }
            System.out.println();
        }




        }
    }

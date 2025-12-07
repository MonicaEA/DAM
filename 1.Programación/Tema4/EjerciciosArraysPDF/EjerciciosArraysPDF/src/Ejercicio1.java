import java.util.Scanner;

public class Ejercicio1 {
    /*Crea un programa que permita sumar arrays multidimensionales. Para ello
siguiente estos pasos:
a. Pide al usuario el tamaño de las matrices
b. Se crearán automáticamente dos matrices con números aleatorios entre 0 y
50
c. Se crea una tercera matriz llamada sumaMatrices donde se guarda la suma
de las celdas de las generadas en el punto anterior
d. Mostrar cada una de las matrices donde cada una tiene un título diferente
para poder identificarlas*/
Scanner scanner = new Scanner(System.in);


public void sumaMatrices(){

    System.out.println("Tamaño filas : ");
    int tamaniooFilas = scanner.nextInt();
    System.out.println("Tamaño columnas: ");
    int tamaniooColumnas = scanner.nextInt();

    int[][]matriz1 = new int[tamaniooFilas][tamaniooColumnas];
    int[][]matriz2 = new int[tamaniooFilas][tamaniooColumnas];
    int[][]sumaMatrices = new int[tamaniooFilas][tamaniooColumnas];


    System.out.println("Primera matriz;");
    for (int i = 0; i < matriz1.length; i++) {
        for (int j = 0; j < matriz1[i].length; j++) {
            matriz1[i][j]=(int)(Math.random()*51);
            System.out.print(matriz1[i][j]+ "\t");

        }
        System.out.println();
    }

    System.out.println("Segunda matriz: ");
    for (int i = 0; i < matriz2.length; i++) {
        for (int j = 0; j < matriz2[i].length; j++) {
            matriz2[i][j]=(int)(Math.random()*51);
            System.out.print(matriz2[i][j]+ "\t");

        }
        System.out.println();
    }

    for (int i = 0; i < sumaMatrices.length; i++) {
        for (int j = 0; j < sumaMatrices[i].length; j++) {
            sumaMatrices[i][j] = matriz1[i][j] + matriz2[i][j];


        }

        }
    System.out.println("El resultado de la última matriz es : ");
    for (int i = 0; i < sumaMatrices.length; i++) {
        for (int j = 0; j < sumaMatrices[i].length; j++) {
            System.out.print(sumaMatrices[i][j]+"\t");

        }
        System.out.println();
    }

    }

}

    


import java.util.Arrays;

public class Ejercicio1 {
    /*Crea un programa que defina una matriz de 3x3 con números del 1 al 9.
     Usa bucles for anidados para mostrar la matriz en formato de tabla.
     */

    public void matriz3x3(){

        int[][]numeros=new int[][]{{4,6,1},{5,2,4},{20,1,6}};
        // 4 6 1
        // 5 2 4  Esto sería asi 3 filas y 3 columnas
        //20 1 6

        for (int i = 0; i < numeros.length; i++) {

            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j]+ "\t");

            }
            System.out.println();
        }






    }




}

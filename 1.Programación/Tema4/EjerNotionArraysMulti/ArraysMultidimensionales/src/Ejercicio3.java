public class Ejercicio3 {
    /*Escribe un programa que defina una matriz de 4x4 con números.
     Usa bucles for anidados para recorrer la matriz y calcular la suma de todos sus elementos. Muestra el resultado.
     */

public void sumarTodosLosNumeros(){

    int[][] matriz4x4 = new int[][]{{2,4,6,8},{2,4,6,8},{1,3,5,7},{7,8,9,4}};

    int sumaTotal=0;

    for (int i = 0; i < matriz4x4.length; i++) {
        for (int j = 0; j < matriz4x4[i].length; j++) {
            System.out.print(matriz4x4[i][j]+ "\t");

        }
        System.out.println();

    }System.out.println("----------------------------------");
    System.out.println("La suma total es : ");
    for (int i = 0; i < matriz4x4.length; i++) {
        for (int j = 0; j < matriz4x4[i].length; j++) {

            sumaTotal= sumaTotal + matriz4x4[i][j];

        }

    }

    System.out.println(sumaTotal);




}

}

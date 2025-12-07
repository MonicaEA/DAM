public class Ejercicio5 {
    /*Escribe un programa que defina un array de 10 números enteros.
     Usa un bucle for para contar cuántos números son mayores que 50 y muestra el resultado.
     */


    public void mayores50(){

        int[] numerosMaquina = {1,24,89,45,77,36,12,54,9,75};
        int mayoresDe50 =0;


        for (int i = 0; i < numerosMaquina.length; i++) {

            if (numerosMaquina[i]>50){
               mayoresDe50++;

            }

        }
        System.out.printf("Hay %d números mayores de 50.",mayoresDe50);

    }



}

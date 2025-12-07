import java.util.Scanner;

public class EjercicioFor7 {
    /*Crea un programa que pida un número N y use un bucle for para calcular la suma de
     todos los números desde 1 hasta N. Muestra el resultado final.
     */
Scanner scanner = new Scanner(System.in);

    public void ejerciciofor7(){

        System.out.println("Introduce un número");
        int numero = scanner.nextInt();
        int sumaTotal = 0;

        for (int i = 1; i <= numero ; i++) {
            sumaTotal += i;


        }

        System.out.println("La suma de los números del 1 al " + numero + " es :"+ sumaTotal);







    }






}

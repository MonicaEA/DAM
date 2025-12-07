import java.util.Scanner;

public class EjercicioFor8 {
    /*Desarrolla un programa que pida un número N y use un bucle for para contar cuántos números pares e impares
     hay desde 1 hasta N. Muestra ambos contadores.
     */

    public void ejercicioFor8(){
Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        int numero = scanner.nextInt();
        int pares = 0;
        int impares = 0;

        for (int i = 1; i <= numero ; i++) {
            impares += i%2;
            pares += 1 - (i %2);



        }

        System.out.println("Numeros pares encontrados: "+pares);
        System.out.println("Numeros impares encontrados: "+impares);


    }




}

import java.util.Scanner;

public class Ejercicio7 {
/*Desarrolla un programa que cree un array de 6 números.
 Usa bucles for para encontrar el número mayor y el número menor del array, y muestra ambos resultados.
 */


    public void mayorMenorArray(){
       Scanner scanner = new Scanner(System.in);

        int[] numerosUsuario = new int[6];

        System.out.println("Introduce 6 números.");

        for (int i = 0; i < numerosUsuario.length ; i++) {
            System.out.println("Introduce el número en la posición "+(i+1));
            numerosUsuario[i]= scanner.nextInt();


        }

        int mayor = numerosUsuario[0];
        int menor = numerosUsuario[0];

        for (int i = 1; i < numerosUsuario.length; i++) {
            if (numerosUsuario[i] > mayor) {
                mayor = numerosUsuario[i];
            }
            if (numerosUsuario[i] < menor) {
                menor = numerosUsuario[i];
            }
        }

        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);



    }

}

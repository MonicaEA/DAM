import java.util.Scanner;


public class Ejercicio3 {
 Scanner scanner = new Scanner(System.in);

    /*Se introducen los 5 dígitos de un número (decenas de mil, unidades de mil, centenas, decenas y unidades),
    y se obtiene el número correspondiente. (Numero)

Decenas de mil: 7Unidades de mil: 9Centenas: 0Decenas: 5Unidades: 0Numero introducido: 79050

     */
    public void ejercicio3 (){

        int num1, num2, num3, num4, num5;
        int numeroCompleto;

        System.out.println("Introduce 5 números (pulsa enter en cada uno):");
                num1 = scanner.nextInt();
                num2 = scanner.nextInt();
                num3 = scanner.nextInt();
                num4 = scanner.nextInt();
                num5 = scanner.nextInt();

        // Calculo número completo
        numeroCompleto = (num1 * 10000) + (num2 * 1000) + (num3 * 100) + (num4 * 10) + num5;

        System.out.println("Decenas de mil: " + num1);
        System.out.println("Unidades de mil: " + num2);
        System.out.println("Centenas: " + num3);
        System.out.println("Decenas: " + num4);
        System.out.println("Unidades: " + num5);

        System.out.println("\nNúmero introducido: " + numeroCompleto);
    }







}

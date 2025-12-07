import java.util.Scanner;


public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos a hacer el calculo de las siguientes operaciones");
        System.out.println("Para ello vamos a usar una calculadora básica");
        System.out.println("Recuerda usar la coma para los decimales");
        System.out.println();
        System.out.println("Introducimos el primer numero: ");
        double num1 = scanner.nextDouble();
        System.out.println("Ahora el segundo número: ");
        double num2 = scanner.nextDouble();
        double suma = num1 + num2;
        System.out.println("Suma: " + suma);
        double resta = num1 - num2;
        System.out.println("Resta: " + resta);
        double multiplicacion = num1 * num2;
        System.out.println("Multiplicación: " + multiplicacion);
        double division = num1 - num2;
        System.out.println("División: " + division);

        System.out.println("¡Disfruta las matemáticas!");


    }
}

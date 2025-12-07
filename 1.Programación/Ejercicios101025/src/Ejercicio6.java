import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el primer número ");
        double numero1 = scanner.nextInt();
        System.out.println("Introduce el segundo número ");
        double numero2 = scanner.nextInt();


        double suma= numero1 + numero2;
        System.out.println("El primer número es: "+numero1);
        System.out.println("El segundo número es: "+numero2);
        System.out.println("Suma: "+suma);
        double resta= numero1 - numero2;
        System.out.println("Resta: "+resta);
        double multiplicacion= numero1 * numero2;
        System.out.println("Multiplicación: " + multiplicacion);
        double division = numero1 / numero2;
        System.out.println("División: "+ division);
        }

    }


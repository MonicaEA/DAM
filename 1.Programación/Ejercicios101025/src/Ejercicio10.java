import java.util.Scanner;


public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca los grados celsius: ");
        int celsius = scanner.nextInt();


        double fahrenheid = (celsius * 9/5) + 32;
        System.out.println("La conversion a Fahrenheid es: " + fahrenheid);

    }
}

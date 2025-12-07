import java.util.Scanner;


public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la base: ");
        int base = scanner.nextInt();
        System.out.println("Introduce la altura: ");
        int altura = scanner.nextInt();

        int area = base * altura;

        System.out.println("El resultado del area es: "+area);

    }


}

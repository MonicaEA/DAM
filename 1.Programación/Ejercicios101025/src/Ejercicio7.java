import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String nombre = scanner.next();
        System.out.println("Introduce tu apellido: ");
        String apellido = scanner.next();
        System.out.println("Introduce tu edad: ");
        int edad = scanner.nextInt();
        System.out.println("Introduce tu ciudad: ");
        String ciudad = scanner.next();

        System.out.println("¡Hola! Me llamo "+nombre+" "+apellido+".");
        System.out.println("Tengo "+edad+" años y vivo en "+ciudad+".");


    }




}

import java.util.Scanner;


public class Ejercicio9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el producto: ");
        String producto = scanner.nextLine();
        System.out.println("Introduzca el precio: ");
        double precio = scanner.nextDouble();
        System.out.println("Introduzca el código: ");
        String codigo = scanner.next();
                boolean stock = true;


        System.out.println("INFORMACION DEL PRODUCTO");
        System.out.println("---------------------------------------------");
        System.out.println("Nombre: " + producto);
        System.out.println("Precio: " + precio);
        System.out.println("Código: " + codigo);
        System.out.println("Stock: " + stock);
    }


}

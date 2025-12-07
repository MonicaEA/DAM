import java.util.Scanner;

public class Ejercicio4 {
    /*Crea un programa que pida el importe de una compra. Si el importe es mayor o igual a 100€, aplica
     un descuento del 10%. Muestra el importe original y el importe final a pagar.
     */

    public void ejercicio4(){
    Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el importe de tu compra: ");
        double importeCompra = scanner.nextDouble();

        if (importeCompra>=100) {
            System.out.println((importeCompra) - (importeCompra/100*10));
            System.out.println("Precio sin descuento "+importeCompra);


        } else System.out.println("Precio sin descuentos: "+importeCompra);



    }
}

import java.util.Scanner;


public class Ejercicio6 {
    Scanner scanner = new Scanner(System.in);
    /*Escribe un programa que pida el precio de un producto y el porcentaje de descuento. Calcula el precio final
    después del descuento usando operadores aritméticos y muestra todos los pasos del cálculo.
Ejemplo de salida por consola:
Introduce el precio del producto: 100
Introduce el porcentaje de descuento: 20
Precio original: 100.0€
Descuento (20%): 20.0€
Precio final: 80.0€*/
    public void ejercicio6(){
        System.out.println("Introduce el precio del producto: ");
        double precio = scanner.nextDouble();
        System.out.println("Introduce el porcentaje de descuento: ");
        double porcentaje = scanner.nextDouble();


        //Calculos
       double fraccion = porcentaje/100;
       double descuento = precio * fraccion;
       double precioFinal = precio - descuento;

       //Consola
        System.out.println("Precio original: "+precio+"€");
        System.out.println("Descuento ("+porcentaje+"%"+")"+":"+ descuento+"€");
        System.out.println("Precio final: "+precioFinal);


    }

}

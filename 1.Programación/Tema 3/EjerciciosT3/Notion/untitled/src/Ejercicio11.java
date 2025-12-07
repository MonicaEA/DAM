import java.util.Scanner;

public class Ejercicio11 {
/*Desarrolla un programa que pida el importe de una compra y si el cliente es socio (true/false).
 Aplica descuentos según estas reglas: Si es socio Y la compra es mayor o igual a 200€, descuento del 20%.
  Si es socio Y la compra es menor de 200€, descuento del 10%. Si NO es socio pero la compra es mayor o igual a 300€,
   descuento del 5%. En cualquier otro caso, no hay descuento. Muestra el importe original, el descuento aplicado
   y el importe final.
 */
   Scanner scanner = new Scanner(System.in);

   public void ejercicio11(){
       System.out.println("Introduce el importe de compra: ");
       double importeCompra = scanner.nextDouble();
       System.out.println("Indica si eres socio (true/false): ");
       boolean esSocio = scanner.nextBoolean();

       //Calculos

       if (importeCompra>=200 && esSocio){
           double importeDescuento20 = (importeCompra/100)*20;
           double importeFinal = importeCompra-importeDescuento20;
           System.out.printf("Descuento aplicado : %.2f€",importeDescuento20);
           System.out.printf("%nImporte final: %.2f€",importeFinal);

       } else if (importeCompra<200 && esSocio){
           double importeDescuento10 = (importeCompra/100)*10;
           double importeFinal = importeCompra-importeDescuento10;
           System.out.printf("Descuento aplicado : %.2f€",importeDescuento10);
           System.out.printf("%nImporte final: %.2f€",importeFinal);


       } else if (importeCompra>=300 && esSocio==false){
           double importeDescuento5 = (importeCompra/100)*5;
           double importeFinal = importeCompra-importeDescuento5;
           System.out.printf("Descuento aplicado : %.2f€",importeDescuento5);
           System.out.printf("%nImporte final: %.2f€",importeFinal);



       } else System.out.printf("Importe final: %.2f€. No hay descuentos",importeCompra);





   }









}

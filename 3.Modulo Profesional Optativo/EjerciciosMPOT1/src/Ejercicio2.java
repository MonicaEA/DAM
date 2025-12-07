import java.util.Scanner;

public class Ejercicio2 {
    Scanner scanner = new Scanner(System.in);
/*Permítase introducir el valor con IVA de una compra con dos decimales (la compra no puede ser superior a 500€ ni
 inferior a 0€) y el valor del IVA de dicha compra (valor entero entre 0 y 25%).¿Cuánto costó la compra sin IVA?¿Cuánto
  fue el IVA? Muéstrese los resultados redondeados a dos decimales. (Compra)

Valor de la compra (entre 0.00 y 500.00): 298,45IVA (entre 0 y 25%): 12
  Compra: 266,47 €IVA: 31,98 €
 */

    public void ejercicio2() {

            //Pido datos
            System.out.println("Introduce el valor de la compra con IVA (entre 0 y 500€): ");
            double valorCompra = scanner.nextDouble();

            // Hago while para pedir valor correcto
            while (valorCompra <= 0 || valorCompra > 500) {
                System.out.println("Introduce un precio válido (entre 0 y 500€): ");
                valorCompra = scanner.nextDouble();
            }

            // Pido IVA
            System.out.println("Introduce el porcentaje de IVA (entre 0 y 25%): ");
            int iva = scanner.nextInt();

            // Hago while para valor
            while (iva < 0 || iva > 25) {
                System.out.println("Introduce un porcentaje válido (entre 0 y 25%): ");
                iva = scanner.nextInt();
            }

            //Cálculos

            // Calculo IVA
            double precioSinIva = valorCompra / (1 + (iva / 100.0));
            double cantidadIva = valorCompra - precioSinIva; // El total menos la base

            // --- Resultados ---
            System.out.println("\n--- TICKET ---");
            System.out.printf("Valor total de la compra (con IVA): %.2f€%n", valorCompra);
            System.out.printf("Porcentaje de IVA aplicado: %d%%%n", iva);
            System.out.printf("Valor de la compra (sin IVA): %.2f€%n", precioSinIva);
            System.out.printf("Cantidad de IVA pagada: %.2f€%n", cantidadIva);
        }
    }










import java.util.Scanner;

public class Ejercicio15 {

    /*Crea un programa que calcule el coste de envío de un paquete. Pide: peso del paquete (kg),
     distancia de envío (km), y si es envío urgente (true/false). Las reglas son: Precio base: 5€.
      Si el peso es mayor de 5kg, añadir 2€ por cada kg adicional. Si la distancia es mayor de 100km, añadir 10€.
       Si es envío urgente, multiplicar el precio total por 1.5. Muestra todos los cálculos paso a paso.
     */


        public void ejercicio15() {
            Scanner scanner = new Scanner(System.in);
            double costeTotal = 5.0; // 5€: Precio base

            System.out.println("--- CALCULADOR DE COSTE DE ENVÍO ---");
            System.out.print("Introduce el peso del paquete (kg): ");
            double peso = scanner.nextDouble();
            System.out.print("Introduce la distancia de envío (km): ");
            double distancia = scanner.nextDouble();
            System.out.print("¿Es envío urgente? (true/false): ");
            boolean urgente = scanner.nextBoolean();

            System.out.println("\n------------------------------------");
            System.out.printf("Precio base: %.2f€\n", costeTotal);

            if (peso > 5.0) {
                // Calculamos los kilos adicionales
                double kilosAdicionales = peso - 5.0;
                double costeAdicionalPeso = kilosAdicionales * 2.0;

                costeTotal += costeAdicionalPeso; // Sumamos el coste

                System.out.printf("Coste por peso (%.2f kg extra): +%.2f€\n",
                        kilosAdicionales, costeAdicionalPeso);
            } else {
                System.out.println("Peso menor o igual a 5kg. Sin coste adicional por peso.");
            }

            if (distancia > 100.0) {
                double costeAdicionalDistancia = 10.0;

                costeTotal += costeAdicionalDistancia;

                System.out.printf("Coste por distancia (>100 km): +%.2f€\n",
                        costeAdicionalDistancia);
            } else {
                System.out.println("Distancia menor o igual a 100km. Sin coste adicional por distancia.");
            }


            if (urgente) {
                double multiplicador = 1.5;
                double costePreUrgencia = costeTotal;

                costeTotal *= multiplicador; // Multiplicamos el coste total acumulado

                System.out.printf("Envío URGENTE. Multiplicador x%.1f. (%.2f€ x 1.5)\n",
                        multiplicador, costePreUrgencia);
            } else {
                System.out.println("Envío estándar. Sin coste adicional.\n");
            }

            // --- 5. Resultado Final ---
            System.out.println("------------------------------------");
            System.out.printf("EL COSTE TOTAL FINAL ES: %.2f€", costeTotal);

            scanner.close();
        }
    }

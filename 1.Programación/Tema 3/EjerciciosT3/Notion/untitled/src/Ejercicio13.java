import java.util.Scanner;


    public class Ejercicio13 {
        /*
         * Escribe un programa para calcular el precio de entrada a un museo. Pide la edad del usuario y el día de la semana
         * (1=Lunes, 2=Martes... 7=Domingo). Las reglas son: Menores de 12 años: entrada gratis. Entre 12 y 17 años: 5€
         * (pero gratis los martes). Entre 18 y 64 años: 10€ (pero 7€ los jueves). 65 años o más: 6€. Usa operadores lógicos
         * para determinar el precio correcto y muestra el cálculo.
         */

        public void ejercicio13() {
            Scanner scanner = new Scanner(System.in);
            int precioEntrada = 0;

            System.out.println("¿Qué edad tienes?");
            int edad = scanner.nextInt();

            System.out.println("\n¿Qué día de la semana es?");
            System.out.println("1.Lunes | 2.Martes | 3.Miércoles | 4.Jueves | 5.Viernes | 6.Sábado | 7.Domingo");
            int diaSemana = scanner.nextInt();


            if (edad < 12) {
                precioEntrada = 0;
                System.out.println("\nCálculo: Menor de 12 años.");

            } else if (edad <= 17) {

                if (diaSemana == 2) {
                    precioEntrada = 0;
                    System.out.println("\nCálculo: 12-17 años, pero es Martes (entrada gratuita).");
                } else {
                    precioEntrada = 5;
                    System.out.println("\nCálculo: 12-17 años.");
                }

            } else if (edad <= 64) {
                if (diaSemana == 4) {
                    precioEntrada = 7;
                    System.out.println("\nCálculo: 18-64 años, pero es Jueves (entrada con descuento a 7€).");
                } else {
                    precioEntrada = 10;
                    System.out.println("\nCálculo: 18-64 años.");
                }

            } else {
                precioEntrada = 6;
                System.out.println("\nCálculo: 65 años o más.");
            }

            System.out.println("=========================================");
            System.out.printf("La edad introducida es: %d y el día es: %d\n", edad, diaSemana);
            System.out.printf("El **PRECIO FINAL** de la entrada es de: %d€\n", precioEntrada);


            scanner.close();
        }
    }

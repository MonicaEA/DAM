import java.util.Scanner;
public class Ejercicio10While {

    public void ejercicio10While(){

        Scanner scanner = new Scanner(System.in);
        double saldo = 1000.0; // Saldo inicial
        int seleccion;

        // Arrays para guardar hasta 100 depósitos y retiradas
        double[] depositos = new double[100];
        double[] retiradas = new double[100];
        int numDepositos = 0;
        int numRetiradas = 0;

        do {
            System.out.println("----- MENÚ CAJERO AUTOMÁTICO -----");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Depositar dinero");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");
            seleccion = scanner.nextInt();

            switch (seleccion) {
                case 1:
                    // Mostrar saldo actual
                    System.out.println("SALDO ACTUAL: " + saldo + " €");
                    break;
                case 2:
                    // Retirar dinero validando que no sea superior al saldo ni negativo/cero
                    double cantidadRetirar;
                    do {
                        System.out.print("¿Cuánto quieres retirar? ");
                        cantidadRetirar = scanner.nextDouble();
                        if (cantidadRetirar > saldo) {
                            System.out.println("No puedes retirar más de tu saldo actual. Intenta de nuevo.");
                        } else if (cantidadRetirar <= 0) {
                            System.out.println("Introduce una cantidad positiva.");
                        }
                    } while (cantidadRetirar > saldo || cantidadRetirar <= 0);
                    saldo -= cantidadRetirar;
                    // Guardar la retirada en el array (sin mostrar nunca el historial)
                    retiradas[numRetiradas] = cantidadRetirar;
                    numRetiradas++;
                    System.out.println("Has retirado: " + cantidadRetirar + " €. Nuevo saldo: " + saldo + " €");
                    break;
                case 3:
                    // Depositar dinero, sólo si es positivo
                    double cantidadDepositar;
                    do {
                        System.out.print("¿Cuánto quieres depositar? ");
                        cantidadDepositar = scanner.nextDouble();
                        if (cantidadDepositar <= 0) {
                            System.out.println("Introduce una cantidad positiva.");
                        }
                    } while (cantidadDepositar <= 0);
                    saldo += cantidadDepositar;
                    // Guardar el depósito en el array (sin mostrar nunca el historial)
                    depositos[numDepositos] = cantidadDepositar;
                    numDepositos++;
                    System.out.println("Has depositado: " + cantidadDepositar + " €. Nuevo saldo: " + saldo + " €");
                    break;
                case 4:
                    System.out.println("Gracias por usar el cajero. ¡Hasta la próxima!");
                    break;
                default:
                    System.out.println("Opción no válida, prueba otra vez.");
            }
        } while (seleccion != 4);
    }

}

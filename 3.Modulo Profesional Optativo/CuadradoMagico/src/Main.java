import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            // Mostrar el menú
            System.out.println("\n*===== MENÚ GENERADOR CUADRADO MÁGICO =====*");
            System.out.println("1. Crear cuadrado mágico");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opción: ");


            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("\nIntroduce el tamaño de los lados (ej. 3 para 3x3): ");
                    int n = scanner.nextInt();

                    // nota para cuadrados diferentes a 3x3
                    if (n > 3 || n ==2) {
                        System.out.println("Nota: Para cuadrados diferentes a 3x3 el tiempo de búsqueda puede ser largo.");
                    }

                    CuadradoMagico cuadrado = new CuadradoMagico(n);
                    boolean encontrado = false;
                    long intentos = 0;

                    System.out.println("Buscando cuadrado mágico (intentos sucesivos)...");


                    while (!encontrado) {
                        intentos++;
                        cuadrado.generarMatrizAleatoria();

                        if (cuadrado.esCuadradoMagico()) {
                            encontrado = true;
                        }
                    }

                    System.out.println("\n*=== CUADRADO MÁGICO ENCONTRADO ===*");
                    cuadrado.imprimirMatriz();
                    System.out.println();
                    System.out.println("Constante mágica: " + cuadrado.obtenerConstanteMagica());
                    System.out.println("Intentos realizados: " + intentos);
                    break;

                case 2:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }

        } while (opcion != 2);

        scanner.close();
    }
}
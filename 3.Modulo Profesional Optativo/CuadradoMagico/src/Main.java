import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el tamaño de la matriz");
        int numeroIntroducido = scanner.nextInt();

        int[][] matriz = new int[numeroIntroducido][numeroIntroducido];
        int total = numeroIntroducido * numeroIntroducido;
        ArrayList<Integer> lista = new ArrayList<>();

        boolean esMagico = false;
        int intentos = 0;
        int sumaMagica = 0;

        // OPCIONAL: límite de intentos para no quedarse en bucle infinito
        int intentosMax = 1000000000;

        while (!esMagico && intentos < intentosMax) {
            intentos++;

            // 1) Vaciar lista y llenarla con 1..total
            lista.clear();
            for (int x = 1; x <= total; x++) {
                lista.add(x);
            }

            // 2) Barajar lista
            Collections.shuffle(lista);

            // 3) Volcar lista en la matriz (sin imprimir aquí)
            int k = 0;
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    matriz[i][j] = lista.get(k);
                    k++;
                }
            }

            // 4) Calcular sumaMagica con la fila 0
            sumaMagica = 0;
            for (int j = 0; j < matriz.length; j++) {
                sumaMagica += matriz[0][j];
            }

            // 5) Comprobar filas
            boolean filasOk = true;
            for (int i = 1; i < matriz.length && filasOk; i++) {
                int sumaFila = 0;
                for (int j = 0; j < matriz.length; j++) {
                    sumaFila += matriz[i][j];
                }
                if (sumaFila != sumaMagica) {
                    filasOk = false;
                }
            }

            // 6) Comprobar columnas
            boolean columnasOk = true;
            for (int j = 0; j < matriz.length && columnasOk; j++) {
                int sumaColumna = 0;
                for (int i = 0; i < matriz.length; i++) {
                    sumaColumna += matriz[i][j];
                }
                if (sumaColumna != sumaMagica) {
                    columnasOk = false;
                }
            }

            // 7) Comprobar diagonales
            int diagonal1 = 0;
            for (int i = 0; i < matriz.length; i++) {
                diagonal1 += matriz[i][i];
            }
            boolean diagonal1EsOk = (diagonal1 == sumaMagica);

            int diagonal2 = 0;
            for (int i = 0; i < matriz.length; i++) {
                int col = matriz.length - 1 - i;
                diagonal2 += matriz[i][col];
            }
            boolean diagonal2EsOk = (diagonal2 == sumaMagica);

            // 8) Decidir si es cuadrado mágico
            esMagico = filasOk && columnasOk && diagonal1EsOk && diagonal2EsOk;
        }

        // 9) Salida de resultados
        if (esMagico) {
            System.out.println("=== CUADRADO MÁGICO ENCONTRADO ===");
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
            System.out.println("Constante mágica: " + sumaMagica);
            System.out.println("Intentos realizados: " + intentos);
        } else {
            System.out.println("No se encontró cuadrado mágico tras " + intentos + " intentos.");
        }

        scanner.close();
    }
}

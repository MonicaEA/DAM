import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CuadradoMagico {
    private int[][] matriz;
    private int n;

    public CuadradoMagico(int n) {
        this.n = n;
        this.matriz = new int[n][n];
    }

    public void generarMatrizAleatoria() {
        List<Integer> numeros = new ArrayList<>();
        for (int i = 1; i <= n * n; i++) {
            numeros.add(i);
        }
        // Mezcla de numeros para que salgan desordenados.
        Collections.shuffle(numeros);


        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = numeros.get(k++);
            }
        }
    }

    // Calcular sumas de las filas , columnas y diagonales.

    public boolean esCuadradoMagico() {
        int sumaObjetivo = obtenerConstanteMagica();


        for (int i = 0; i < n; i++) {
            int sumaFila = 0;
            for (int j = 0; j < n; j++) {
                sumaFila += matriz[i][j];
            }
            if (sumaFila != sumaObjetivo) return false;
        }


        for (int j = 0; j < n; j++) {
            int sumaCol = 0;
            for (int i = 0; i < n; i++) {
                sumaCol += matriz[i][j];
            }
            if (sumaCol != sumaObjetivo) return false;
        }

        int sumaDiag1 = 0;
        for (int i = 0; i < n; i++) {
            sumaDiag1 += matriz[i][i];
        }
        if (sumaDiag1 != sumaObjetivo) return false;


        int sumaDiag2 = 0;
        for (int i = 0; i < n; i++) {
            sumaDiag2 += matriz[i][n - 1 - i];
        }
        if (sumaDiag2 != sumaObjetivo) return false;

        return true;
    }

    public int obtenerConstanteMagica() {
        return (n * (n * n + 1)) / 2;
    }

    public void imprimirMatriz() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
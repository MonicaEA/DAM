import java.util.Scanner;

public class Ejercicio3While {
    /*Escribe un programa que pida números al usuario y los vaya sumando. El bucle while debe continuar mientras el usuario
     introduzca números positivos. Cuando introduzca un número negativo o cero, el programa debe terminar y mostrar
      la suma total.
     */
    Scanner scanner = new Scanner(System.in);

    public void ejercicio3While() {
        // 1. Inicialización
        int sumaTotal = 0;
        System.out.println("Introduce un numero. 0 o negativo para terminar programa.");

// 2. Pedimos el PRIMER número (Lector Principal)
        int numero = scanner.nextInt();

// 3. Bucle 'while'
        while (numero > 0) {

            // A. ACUMULAMOS (Solo si es positivo)
            sumaTotal += numero;

            System.out.printf("Suma total: %d \n",sumaTotal);
            // B. Pedimos el SIGUIENTE número (para la próxima evaluación)
            System.out.println("Introduce otro numero. 0 o negativo para terminar programa.");
            numero = scanner.nextInt();



        }

        System.out.printf("\nPrograma terminado. Suma total: %d\n", sumaTotal);


    }
}
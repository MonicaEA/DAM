import java.util.Scanner;

public class SentenciaWhile {

    public void evaluacionNumero(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Inicio de evaluación de número ---");
        System.out.println("Introducir un número:");

        int numero = scanner.nextInt();

        while (numero < 10){
            System.out.println("El número introducido es **menor que 10**.");
            System.out.println("Introducir un número nuevo:");
            numero = scanner.nextInt(); // Lee un nuevo número en el bucle
        }
        System.out.println("El número es 10 o mayor. La evaluación ha **terminado**.");
        // No cierres el scanner aquí si lo vas a usar de nuevo, pero es buena práctica.
    }

    public void numeroAleatorio(){
        Scanner scanner = new Scanner(new java.io.InputStreamReader(System.in));
        int intentos = 0;

        // ✨ CORRECCIÓN CLAVE: Multiplicar primero, luego convertir a entero
        // Esto genera un número aleatorio entre 0 y 10 (ambos inclusive).
        int aleatorio = (int)(Math.random() * 11);

        System.out.println("\n--- Inicio de adivinanza de número ---");
        System.out.println("Intenta adivinar el número entre 0 y 10. Introduce tu primer intento:");

        int numero; // Declaramos la variable fuera

        // Usamos un bucle do-while para garantizar que el código dentro se ejecute al menos una vez
        do {
            numero = scanner.nextInt(); // Leer el intento del usuario
            intentos++; // Aumentar el contador de intentos

            if (aleatorio != numero) {
                System.out.println("El número no es correcto, ¡inténtalo de nuevo!");

                // Pistas opcionales (opcional, pero ayuda al usuario)
                if (numero < aleatorio) {
                    System.out.println("(Pista: Es **más grande**)");
                } else {
                    System.out.println("(Pista: Es **más pequeño**)");
                }

                System.out.println("Introducir un número nuevo:");
            }

        } while (aleatorio != numero); // La condición de repetición

        // Corrección en el formato: El printf usa "%d" para enteros.
        System.out.printf("¡Felicidades! Lo has acertado en **%d** intentos.\n", intentos);

        // NOTA: Para un código limpio, es mejor que cada método maneje su propio Scanner si se usa de forma independiente.
    }

    public void imprimirMenu(){

        int numero = 0;
        do {
            System.out.println("Ejecutando sentencia repetitiva con do-while");



        } while (numero!=0);

        System.out.println("Finalizando la repetición");





    }








}

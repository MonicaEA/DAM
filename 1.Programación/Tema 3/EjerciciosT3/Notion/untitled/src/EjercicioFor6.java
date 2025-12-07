public class EjercicioFor6 {
    /*
    Muestra las tablas de multiplicar del 1 al 10 usando bucles anidados.
    */

    public void generarTodasLasTablas(){

        // Bucle Exterior (variable 'i'): Controla el NÚMERO DE LA TABLA (1, 2, 3... hasta 10)
        for (int i = 1; i <= 10; i++) {

            // Imprime un separador y el encabezado de la tabla actual
            System.out.println("\n--- TABLA DEL " + i + " ---");

            // Bucle Interior (variable 'j'): Controla el MULTIPLICADOR (x1, x2, x3... hasta x10)
            for (int j = 1; j <= 10; j++) {

                // Imprime la operación completa: [i] x [j] = [i * j]
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }
    }

    // Método main: el punto de inicio para ejecutar la clase
    public static void main(String[] args) {
        // Creamos una instancia de la clase y llamamos al método para ejecutarlo
        new EjercicioFor6().generarTodasLasTablas();
    }
}
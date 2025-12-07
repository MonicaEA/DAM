import java.sql.SQLOutput;
import java.util.Scanner;

public class EjercicioFor10 {

    /*Crea un programa que muestre un menú con 3 tipos de ejercicios: 1=Flexiones, 2=Abdominales, 3=Sentadillas.
     Pide al usuario que elija un ejercicio y cuántas repeticiones quiere hacer. Usa un switch para determinar el
     ejercicio y un for para contar las repeticiones una a una.
     */
    Scanner scanner = new Scanner(System.in);

    public void ejercicioFor10() {
        System.out.println("-----EJERCICIOS------");
        System.out.println("1=Flexiones");
        System.out.println("2=Abdominales");
        System.out.println("3=Sentadillas");
        System.out.println("Elige un ejercicio (1-3)");
        int ejercicio = scanner.nextInt();
        String ejercicioElegido;


        ejercicioElegido = switch (ejercicio) {
            case 1 -> "Flexiones";
            case 2 -> "Abdominales";
            case 3 -> "Sentadillas";
            default -> "Introduce un número correcto";
        };
        System.out.println("Has elegido: "+ejercicioElegido);
        System.out.println("Introduce el número de repeticiones");
        int repeticiones = scanner.nextInt();

        for (int i = 1; i <= repeticiones ; i++) {

            System.out.println("Repetición " + i + " completada");


        }


        System.out.printf("Ejercicio completado: Has hecho %d %s",repeticiones,ejercicioElegido );

    scanner.close();
    }

}



















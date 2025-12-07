import java.util.Scanner;

public class EjercicioFor5 {
    /*Desarrolla un programa que pida un mes (número del 1 al 12) y use un switch para determinar la estación del año:
    Invierno (12, 1, 2), Primavera (3, 4, 5), Verano (6, 7, 8), Otoño (9, 10, 11).
     */
    Scanner scanner = new Scanner(System.in);


    public void ejercicioFor5() {

        System.out.println("Introduce el mes (número del 1 al 12)");
        int mes = scanner.nextInt();
        String estacion;

        estacion = switch (mes) {

            case 12, 1, 2 -> "Invierno";
            case 3, 4, 5 -> "Primavera";
            case 6, 7, 8 -> "Verano";
            case 9, 10, 11 -> "Otoño";
            default -> "El número de mes es invalido , debe ser del 1 al 12";
        };

        System.out.printf("El mes %d corresponde a la estacion %s%n",mes,estacion);
    }
}




















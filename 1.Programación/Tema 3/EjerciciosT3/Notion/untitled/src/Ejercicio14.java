import java.util.Scanner;

public class Ejercicio14 {
    /*Desarrolla un programa que determine si una persona es elegible para un préstamo bancario.
    Pide: edad, ingresos mensuales (€), y si tiene deudas pendientes (true/false). Los requisitos son:
     Edad entre 21 y 65 años, ingresos mensuales de al menos 1000€, y NO tener deudas pendientes.
     El programa debe evaluar cada condición y mostrar si es elegible o no, explicando qué requisitos no cumple.
     */


    public void ejercicio14(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu edad: ");
        int edad = scanner.nextInt();
        System.out.println("Introduce tus ingresos mensuales: ");
        double ingresosMensuales = scanner.nextDouble();
        System.out.println("¿Actualmente tienes deuda?(true/false)");
        boolean deuda = scanner.nextBoolean();

        if (edad>=21 && edad <=65 && ingresosMensuales>=1000 && !deuda){
            System.out.println("Puede acceder al prestamo");



        } else System.out.println("No puede acceder al prestamo");






    }

}

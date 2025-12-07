import java.util.Scanner;


public class Ejercicio7While {

    /*Crea un programa que pida al usuario cuántas calificaciones va a introducir. Luego, usa un bucle while
     para pedir cada calificación una por una, sumarlas y al final calcular y mostrar el promedio.
     */

Scanner scanner = new Scanner(System.in);

public void ejercicio7While(){
    System.out.println("¿Cuántas calificaciones vas a introducir?");
    int numeroCalificaciones = scanner.nextInt();
    int contador =0;
    double sumaNotas =0;

    while (contador <numeroCalificaciones) {
        System.out.println("Introduce calificación");
         double calificaciones = scanner.nextDouble();
         sumaNotas = sumaNotas + calificaciones;
         contador++;



    }

    double promedio = sumaNotas / numeroCalificaciones;
    System.out.println("Total suma calificaciones: " + sumaNotas);
    System.out.println("Resultado media de las notas: " + promedio);

    if (promedio>=5){
        System.out.println("Has aprobado!");
    } else System.out.println("Suspenso");

}



}

import java.util.Scanner;

public class Ejercicio3 {
    /*Escribe un programa que pida la nota de un examen (entre 0 y 10) y determine si el alumno
    ha aprobado (nota mayor o igual a 5) o ha suspendido.
     */


    public void ejercicio3(){
    Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la nota del examen: ");
        double nota = scanner.nextDouble();

        if (nota>=5){
            System.out.println("Has aprobado!! ");
        } else System.out.println("Has suspendido");




    }



}

import java.util.Scanner;

public class EjercicioFor1 {

    /*Crea un programa que pida un número del 1 al 7 y use un switch para mostrar el día de la semana correspondiente
 (1=Lunes, 2=Martes, etc.).
 */

    public void ejercicioFor1(){
        String nombreDia;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número del 1 al 7");
        int numero = scanner.nextInt();


        switch (numero){

            case 1:
                nombreDia = "Lunes";
                break;

            case 2:
                nombreDia = "Martes";
                break;

            case 3:
                nombreDia = "Miércoles";
                break;

            case 4:
                nombreDia = "Jueves";
                break;

            case 5:
                nombreDia = "Viernes";
                break;

            case 6:
                nombreDia = "Sábado";
                break;

            case 7:
                nombreDia = "Domingo";
                break;

            default:
                nombreDia = "Número no válido. Introduzca un número del 1 al 7";



        }
        System.out.println("El día de la semana es : "+nombreDia);


    }
}

import java.util.Scanner;

public class Ejercicio4 {
Scanner scanner= new Scanner(System.in);
    /*
    Hágase un programa que convierta segundos en horas, minutos y segundos.(Segundos)
Número de segundos: 24973Horas: 6Minutos: 56Segundos: 13
     */

public void ejercicio4(){

    //Primero tengo que pedir los segundos totales
    System.out.println("Introduce los segundos: ");
    int segundos = scanner.nextInt();

    //Calculos para pasar a horas , minutos y segundos

    int horas = segundos/3600;
    int restoHoras = segundos %3600;
    int minutos = restoHoras/60;
    int restoMinutos = minutos%60;
    int segundosRestantes = restoMinutos/60;

    System.out.println("Número de segundos: "+segundos);
    System.out.println("Horas: "+horas);
    System.out.println("Minutos: " +restoMinutos);
    System.out.println("Segundos: "+segundosRestantes);





}


}

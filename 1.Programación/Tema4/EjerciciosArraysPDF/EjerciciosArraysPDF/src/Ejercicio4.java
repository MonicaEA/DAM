
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {
/*Crear una aplicación que permita realizar el sorteo del mundial. Para ello el
sistema pedirá los nombres de las selecciones de los dos bombos, 5 por bombo.
Una vez introducidos. Mostrar los emparejamientos de los equipos. Ten en cuenta
que un mismo equipo no puede jugar más de un partido*/
Scanner scanner = new Scanner(System.in);


public void sorteoSelecciones(){

    String[]bombo1= new String[5];
    String[]bombo2= new String[5];

    System.out.println("Seleccionados primer bombo: ");
    for (int i = 0; i < bombo1.length; i++) {
        System.out.print("Introduce el país número " + (i + 1) + ": ");
        bombo1[i] = scanner.next();

    }
    System.out.println("Seleccionados segundo bombo: ");
    for (int i = 0; i < bombo2.length; i++) {
        System.out.print("Introduce el país número " + (i + 1) + ": ");
        bombo2[i] = scanner.next();


    }

    System.out.println("------BOMBO 1 ------");
    for (String item:bombo1){
        System.out.print(item +"\t");
    }
    System.out.println();
    System.out.println("------ BOMBO 2 ------");
    for (String item:bombo2){
        System.out.print(item+"\t");
    }
    System.out.println();

    // EMPAREJAMIENTOS ALEATORIOS SIN REPETIR



       }

    }












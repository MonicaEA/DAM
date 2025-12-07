import java.util.Scanner;

public class Ejercicio3 {

    /*Desarrolla un programa en Java que permita registrar, calcular e informar
    las notas de varios alumnos utilizando arrays.
    a. Declara un array de tipo double para almacenar las notas de 10 alumnos.
    b. Solicita al usuario que introduzca las 10 notas. En caso de introducir una
       nota inferior a 0 o superior a 10 volverá a pedirla.
    c. Calcula y muestra:
       i.   La nota media de la clase.
       ii.  La nota más alta y la más baja.
       iii. Cuántos alumnos han aprobado (nota igual o mayor a 5) y cuántos han
            suspendido.
    */

    public void calificacionesAlumnos() {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[10];

        System.out.println("Vamos a introducir 10 calificaciones: ");

        // b) Pedir las 10 notas con validación
        for (int i = 0; i < notas.length; i++) {
            double nota;
           do {
               System.out.println("INDICAME LA NOTA DEL ALUMNO");
            nota= scanner.nextDouble();
            if (nota<0 || nota>10){
                System.out.println("Nota invalida");
            }

           }while (nota<0.0 || nota>10.0);
           notas[i]=nota;


        }

        // Mostrar notas introducidas
        System.out.println("Las notas introducidas son:");
        for (double nota : notas) {
            System.out.print(nota + "\t");
        }
        System.out.println();

        // c.i) Nota media
        double sumaNotas = 0;
        for (int i = 0; i < notas.length; i++) {
            sumaNotas += notas[i];
        }
        double media = sumaNotas / notas.length;
        System.out.println("La nota media de la clase es: " + media);

        // c.ii) Nota más alta y más baja
        double notaMax = notas[0];
        double notaMin = notas[0];

        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > notaMax) {
                notaMax = notas[i];
            }
            if (notas[i] < notaMin) {
                notaMin = notas[i];
            }
        }

        System.out.println("La nota más alta es: " + notaMax);
        System.out.println("La nota más baja es: " + notaMin);

        // c.iii) Contar aprobados y suspensos
        int aprobados = 0;
        int suspensos = 0;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 5) {
                aprobados++;
            } else {
                suspensos++;
            }
        }

        System.out.println("Han aprobado: " + aprobados + " alumnos.");
        System.out.println("Han suspendido: " + suspensos + " alumnos.");
    }
}

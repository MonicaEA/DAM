package controller;

import model.Alumnos;

import java.util.Scanner;

public class AlumnosController {
    Scanner scanner = new Scanner(System.in);
    // 1. Declarar el array de objetos con el tamaño fijo que pide el ejercicio
    private Alumnos[] notas = new Alumnos[3];


    public void cargarNotas() {
        /*Pedir el nombre, apellido y las 4 notas.
        Crear un nuevo objeto Estudiante usando esos datos.
        Guardar ese objeto en la posición correspondiente del array listaAlumnos[i].*/

        System.out.println("Vamos a introducir los datos de los alumnos.... ");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Introduce el nombre del alumno: ");
            String nombre = scanner.next();
            System.out.println("Introduce el apellido del alumno: ");
            String apellido = scanner.next();
            System.out.println("Introduce la nota 1: ");
            double nota1 = scanner.nextDouble();
            System.out.println("Introduce la nota 2: ");
            double nota2 = scanner.nextDouble();
            System.out.println("Introduce la nota 3: ");
            double nota3 = scanner.nextDouble();
            System.out.println("Introduce la nota de las prácticas: ");
            double notaPracticas = scanner.nextDouble();
            notas[i] = new Alumnos(nombre,apellido,nota1, nota2, nota3, notaPracticas);
        }



    }

    public void mostrarNotaMedia(){
        for (int i = 0; i < notas.length; i++) {
            double resultado = notas[i].calcularNotaFinal();
            // Ahora usamos esa variable para decidir la calificación
            if (resultado <5){
                System.out.println("Alumno " + notas[i].getNombre() + " "+ notas[i].getApellido() + ": " + resultado + " - Calificación: SS");;
            } else if (resultado < 7) {
                System.out.println("Alumno " +  notas[i].getNombre() +" "+ notas[i].getApellido() +  ": " + resultado + " - Calificación: AP");

            } else if (resultado < 9) {
                System.out.println("Alumno " + notas[i].getNombre() +" "+ notas[i].getApellido() +  ": " + resultado + " - Calificación: NT");

            }else {
                System.out.println("Alumno " +  notas[i].getNombre() +" "+ notas[i].getApellido()  + ": " + resultado + " - Calificación: SB");
            }


        }

    }

    public void mostrarAprobados(){
        int aprobados = 0;
        for (int i = 0; i < notas.length; i++) {
            double resultado = notas[i].calcularNotaFinal();

            if (resultado >= 5){
                aprobados++;
            }

        }
        System.out.println("El número de aprobados es de : " + aprobados);
    }

    public void notaMáxima(){
       double notaMax = notas[0].calcularNotaFinal();

        for (int i = 0; i < notas.length; i++) {
            if (notas[i].calcularNotaFinal() > notaMax){
                notaMax = notas[i].calcularNotaFinal();
            }
        }
        System.out.println("La nota más alta es : " +notaMax);

    }

    public void notaMinima(){
        double notaMin = notas[0].calcularNotaFinal();

        for (int i = 0; i < notas.length; i++) {
            if (notas[i].calcularNotaFinal() < notaMin){
                notaMin = notas[i].calcularNotaFinal();
            }
        }
        System.out.println("La nota más baja es : " +notaMin);

    }

    public void estudiantesNotables(){
        boolean hayNotables = false;

        for (int i = 0; i < notas.length; i++) {

            double notaFinal = notas[i].calcularNotaFinal();
            if (notaFinal>=7 && notaFinal < 9) {
                System.out.println("El alumno " + notas[i].getNombre() +" "+ notas[i].getApellido() + " tiene un notable (" + notaFinal + ")");
                hayNotables = true;
            }
        }

        if (!hayNotables){
            System.out.println("No hay ningún alumno con notable.");
        }
    }
}

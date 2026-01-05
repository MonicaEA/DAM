package controller;

import java.sql.SQLOutput;
import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import model.Alumno;
import model.Profesor;

@Data



public class Colegio {

    private ArrayList<Alumno> alumnos;

    private Profesor profesor;
    private int matriculas;
    public Colegio(){
        alumnos = new ArrayList<>();
        profesor = new Profesor();
        matriculas = 1;

    }

    public Colegio( Profesor profesor) {
        this.alumnos = new ArrayList<>();
        this.profesor = profesor;
    }

    public void matricularAlumno(String nombre){
        alumnos.add( new Alumno(matriculas,nombre, 1,2,3 ) );
        matriculas++;
        System.out.println("Usuario agregado correctamente");

    }

    public void ponerNotas(){

        for (Alumno item:alumnos){
            profesor.ponerNotas(item);

        }
        System.out.println(" Notas puestas correctamente, podemos hacer el acta ");



    }

    public void mostrarDatos(){
        for (Alumno item : alumnos){
            System.out.println("Mostrando datos de : " + item.getNombre());
            item.mostrarDatos();
            System.out.println("La nota media del alummo es : " +profesor.calcularMedia(item) );

        }



    }

    public void buscarExpediente(int nMatricula){
        for (Alumno alumno :alumnos){
            if (alumno.getNMat() == nMatricula){
                alumno.mostrarDatos();
                System.out.println("Su media es: "+profesor.calcularMedia(alumno));
                return;
            }
        }
        System.out.println("Usuario no encontrado");




    }

}

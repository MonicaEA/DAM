package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@NoArgsConstructor
@Setter
@AllArgsConstructor

public class Alumno {


    private Asignatura asignatura1, asignatura2, asignatura3;
    private int nMat;
    private String nombre;


    public Alumno(int nMat, String nombre,Asignatura asignatura1, Asignatura asignatura2, Asignatura asignatura3){
        this.nombre = nombre;
        this.nMat= nMat;
        this.asignatura1 = asignatura1;
        this.asignatura2 = asignatura2;
        this.asignatura3 = asignatura3;
    }

    public Alumno(int nMat,String nombre,int id1, int id2, int id3){
        this.nombre = nombre;
        this.nMat = nMat;
        this.asignatura1 = new Asignatura(id1);
        this.asignatura2 = new Asignatura(id2);
        this.asignatura3 = new Asignatura(id3);
    }

    public void mostrarDatos(){
        System.out.println("Imprimiendo los datos del alumno");
        System.out.println("Los datos de " + nombre + " son:");
        asignatura1.mostrarDatos();
        asignatura2.mostrarDatos();
        asignatura3.mostrarDatos();
    }


}
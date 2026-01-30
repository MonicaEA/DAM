package controller;

import model.Alumno;

import java.util.ArrayList;
import java.util.HashMap;

public class Gestor {

    private ArrayList<Alumno> alumnos;
    private HashMap<String, Alumno> alumnosMap;

    public Gestor(){
        alumnos = new ArrayList<>();
        alumnosMap = new HashMap<>();


    }


    // agregar alumno
    // solo se pueden agregar alumnos con un dni que no esta ya en la lista.

    public void agregarAlumno(Alumno alumno){
        if (alumnosMap.containsKey(alumno.getDni())){
            System.out.println("no se puede agregar");
        } else {
            System.out.println("Añadido");
        }

    }

    public void agregarAlumno1(Alumno alumno){
        if (alumnosMap.put(alumno.getDni(),alumno)==null){
            System.out.println("Alumno agregado correctamente");
        } else{
            System.out.println("Alumno no agregado , dni duplicado");

        }
    }

    public void agregarAlumnoArray(Alumno alumno){
        for (Alumno item:alumnos){
            if (item.getDni().equals(alumno.getDni())){
                System.out.println("no puedo");
            }
        }


    }

    public void agregarAlumnoLambda(Alumno alumno){
    boolean esta = alumnos.stream().anyMatch(item -> item.getDni().equals(alumno.getDni()));
    if (esta){
        System.out.println("El dni esta en la lista, no se puede agregar");
    } else {
        System.out.println("Alumno agregado correctamente");
        alumnos.add(alumno);
    }

    }

    public void mostrarAlumnosArray(){
        alumnos.forEach(Alumno :: mostrarDatos);
        // asi muestro todos los alumnos
        alumnos.forEach(item->{if (item.getNota()>=5){item.mostrarDatos();}});


    }

    public void calificarAlumno(){
        alumnos.forEach(item ->{
            if (item.getNota()==-1){
                item.setNota((int)(Math.random()*11));
            }
        });

    }

 public void calcularMedia(){
        // variable sumatorio
        // con un foreach
        //sumo c
        //divido
     double acumulador=0;
     //alumnos.stream().map(item->item.getNota()).forEach(item-> acumulador+=item)/size;
     /* alumno -------
     steam ----------
     map -----------
      */
     double media = alumnos.stream().mapToDouble(Alumno ::getNota).sum()/alumnos.size();
     System.out.println("La nota media es : "+media);





 }

}

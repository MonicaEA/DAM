import controller.Gestor;
import model.Alumno;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Gestor gestor = new Gestor();
        gestor.agregarAlumno(new Alumno("Alumno1","Alumno1","123A",1));
        gestor.agregarAlumno(new Alumno("Alumno6","Alumno6","1243A",3));
        gestor.agregarAlumno(new Alumno("Alumno7","Alumno7","1236A",4));
        gestor.agregarAlumno(new Alumno("Alumno2","Alumno2","223A",7));
        gestor.agregarAlumno(new Alumno("Alumno3","Alumno3","323A",7));
        gestor.agregarAlumno(new Alumno("Alumno4","Alumno4","423A",6));
        // gestor.calificarAlumnos();
        // gestor.mostrarAlumnos();
        //gestor.calcularMedia();
        //System.out.println(gestor.getNumeroAprobados());
        //gestor.getAprobados().forEach(Alumno::mostrarDatos);
       /* if (gestor.getAlumnoByDni("111B").isPresent()){
            System.out.println("El usuario está");
        } else{
            System.out.println("El usuario no está");
        }*/
        String dni = "678B";
        gestor.getAlumnoByDni(dni).ifPresent(Alumno :: mostrarDatos);
        gestor.getAlumnoByDni(dni).ifPresentOrElse(Alumno::mostrarDatos,()->gestor.agregarAlumno(new Alumno("Nuevo","Nuevo",dni,10)));
        gestor.getAlumnoByDni(dni).ifPresentOrElse(Alumno::mostrarDatos,()->gestor.agregarAlumno(new Alumno("Nuevo","Nuevo",dni,10)));


        //gestor.ordenarPorNotas();
        //gestor.mostrarAlumnos();
        Scanner scanner  = new Scanner(System.in);
        System.out.println("¿Que nota quieres como umbral?");
        int umbral = scanner.nextInt();
        gestor.getAlumnosUmbral((Alumno item,Integer nota) ->item.getNota()>nota,umbral);
        gestor.getAlumnosUmbral((Alumno item, Integer nota) -> item.getNota()<nota,8);
        gestor.getAlumnosUmbral((Alumno item, Integer nota) -> (item.getNota()*2)/3<nota,8);


    }
}
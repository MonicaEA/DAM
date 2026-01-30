import controller.Gestor;
import model.Alumno;

public class Main {
    public static void main(String[] args) {


        Gestor gestor = new Gestor();
        gestor.agregarAlumnoLambda(new Alumno("Monica","espñeira","32313213p",-1));
        gestor.agregarAlumnoLambda(new Alumno("Pepe","espñeira","32312213p",-1));
        gestor.calificarAlumno();
        gestor.mostrarAlumnosArray();
        gestor.calcularMedia();

    }
}

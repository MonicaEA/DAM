import model.Alumno;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
    /*Realiza una aplicación para poder gestionar las notas de los alumnos de
una asignatura. Para ello el sistema contarña con un menú que permite la
selección de la acción a realizar. Este menú contará con las siguientes
opciones:
a. Introducir alumno: el sistema pedirá dni, nombre, apellido y nota del
alumno. en caso de una introducción incorrecta mostrará un
mensaje de aviso. No se podrán meter dnis duplicados
b. Buscar alumno nota: el sistema pedirá un dniy mostrará la nota de
todos los alumnos con ese nombre
c. Ver mejores expedientes: El sistema pedirá cual es el límite de
búsqueda y mostrará las n mejores notas
d. Ver expedientes superiores a una nota: El sistema pedirá una nota y
mostrará los expedientes con mínimo esa nota
e. Vaciar lista*/

        ArrayList<Alumno> listaAlumnos = new ArrayList<>();
        Alumno alumno1 = new Alumno("Borja", "Martin", "12345a",8);
        Alumno alumno2 = new Alumno("Borja2", "Martin2", "12345a2",9);
        Alumno alumno3 = new Alumno("Borja3", "Martin3", "12345a3",7);
        Alumno alumno4 = new Alumno("Borja4", "Martin4", "12345a4",5);


        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);


       /* for (Alumno item : listaAlumnos){
            item.mostrarDatos();
        }

        */


        // funcion de flecha o lambda. Funciones que se llaman despues de otras funciones.
        // me dices parametros de la funcion luego -> y luego el cuerpo

        /*listaAlumnos.forEach(element->{
            System.out.println("Vamos a imprimir los datos de : " element.getNombre());
            element.mostrarDatos()});
        */

        // me recorre el for each sin necesidad de escribirlo.si
        listaAlumnos.forEach(Alumno::mostrarDatos);

        // para imprimir por ejemplo las notas.

        listaAlumnos.forEach(data-> System.out.println(data.getNota()));

        // foreach -> Recorro y en cada iteracion obtengo un alumno.
        // map -> recorro y transformo .
                listaAlumnos.stream().map(Alumno::getNota).forEach(System.out::println);










    }












}

import controller.Colegio;
import model.Alumno;
import model.Asignatura;
import model.Profesor;

import java.util.ArrayList;
import java.util.Scanner;

/*
Modela asignaturas de un alumno y un profesor que pone notas y calcula la media.

- Asignatura: identificador, calificación; constructor con id; getters y setter de calificación.
- Alumno: tres Asignatura; constructores con 3 Asignatura o con 3 ids.
- Profesor: ponerNotas(Alumno) asigna aleatorias; calcularMedia(Alumno) devuelve double.
- Entrada: crear 3 Asignaturas, 1 Alumno, 1 Profesor; poner notas y mostrar media y notas.
 */


public class Main {

    public static void main(String[] args) {

       /* ArrayList<Alumno> listaAlumnos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Profesor profesor = new Profesor();
        Alumno alumno = new Alumno();

        for (int i = 1; i < 5 ; i++) {
            System.out.println("Introduce tu nombre: ");
            String nombre = scanner.next();
            listaAlumnos.add(new Alumno(i,nombre,1,2,3));

        }
        System.out.println("Vamos a proceder a poner las notas de todos los alumnos");

        for (Alumno item:listaAlumnos){
            profesor.ponerNotas(item);
            item.mostrarDatos();
            System.out.println("La media del alumno es :  "+profesor.calcularMedia(item));

        }


        }

        Asignatura programacion = new Asignatura(1);
        // id=1  calificacion=6.4
        Asignatura sistemas = new Asignatura(2);
        // id=2  calificacion=0.0
        Asignatura entornos = new Asignatura(3);
        // id=3  calificacion=0.0
        Asignatura baseDatos = new Asignatura();
        // id=0  calificacion=0.0
        Asignatura fundamentos = new Asignatura();
*/
        /* Alumno borja = new Alumno(17, 1, 2, 3);
        // asi1 = programacion(1,0.0) - asi2 = sistemas(2,0.0) - asi3 = entornos(3,0.0)

        Alumno maria = new Alumno(14, borja.getNombre(), programacion, sistemas, entornos);
        Alumno marcos = new Alumno(15,programacion, sistemas, entornos);
        Alumno celia = new Alumno(16,1, 2, 3);


        System.out.println("Comprobamos cuales son las notas de los alumnos");
        System.out.println("De marcos");
        marcos.mostrarDatos();
        System.out.println("De celia");
        celia.mostrarDatos();
        Profesor profesor = new Profesor();
        System.out.println("Procedemos a poner notas");
        profesor.ponerNotas(marcos);
        profesor.ponerNotas(celia);
        System.out.println("Comprobamos cuales son las notas de los alumnos despues de ponerlas");
        System.out.println("La media de celia es " + profesor.calcularMedia(celia));
        System.out.println("La media de marcos es " + profesor.calcularMedia(marcos));
        System.out.println("La media de maria es " + profesor.calcularMedia(maria));
        */
    Scanner scanner = new Scanner(System.in);
    Colegio colegio = new Colegio();

    int opcion = 0;
    do {
        System.out.println("1.Matricular alumnos");
        System.out.println("2.Poner notas alumnos");
        System.out.println("3.Ver notas y media de los alumnos");
        System.out.println("4.Buscar expediente");
        System.out.println("5.Salir");
        System.out.println("Que quieres hacer");
        opcion = scanner.nextInt();

        switch (opcion){

            case 1-> {
                System.out.println("Procedemos a matricular");
                System.out.println("Indica el nombre del alumno a matricular");
                String nombre = scanner.next();
                colegio.matricularAlumno(nombre);
            }
            case 2-> {
                colegio.ponerNotas();
            }
            case 3-> {
                colegio.mostrarDatos();
            }
            case 4-> {
                System.out.println("Indicame la matricula del alumno a buscar");
                int nAlumno = scanner.nextInt();
                colegio.buscarExpediente(nAlumno);
            }
            case 5-> {
                System.out.println("Saliendo....");

            }


        }

    }while (opcion!=5);

        System.out.println("Indica el nombre del alumno a matricular: ");
        String nombre = scanner.next();
        colegio.matricularAlumno(nombre);
        System.out.println("Indica el nombre del siguiente alumno a matricular");
        nombre = scanner.next();
        colegio.matricularAlumno(nombre);
    }
}
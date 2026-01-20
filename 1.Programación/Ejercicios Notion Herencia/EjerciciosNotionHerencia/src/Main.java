import Ejercicio2.Coche;
import Ejercicio2.Vehiculo;
import Ejercicio3.Estudiante;
import Ejercicio3.Persona;
import Ejercicio5.Desarrollador;
import Ejercicio5.Empleado;
import Ejercicio5.Gerente;


public class Main {

    public static void main(String[] args) {

    /*Gato gato = new Gato("Max", 5);
    gato.presentacion();
    gato.hacerSonido();
        System.out.println();
    Perro perro = new Perro("John", 8);
    perro.presentacion();
    perro.hacerSonido();
    */
     /*   Vehiculo vehiculo = new Vehiculo("Toyota", "Corolla");
        Coche coche1 = new Coche("Ford", "Focus", 3);
        vehiculo.mostrarVehiculo();
        coche1.mostrarVehiculo();
        Coche coche2 = new Coche("Seat","León", 5);
        coche2.mostrarVehiculo();
*/
      /*  Estudiante estudiante1 = new Estudiante("Yaiza Treus",33, "1 de DAM");
        estudiante1.presentarse();
        estudiante1.estudiar();
        estudiante1.setNombre("Carlos");
        System.out.println();
        estudiante1.presentarse();
        estudiante1.estudiar();
*/

        Gerente gerente1 = new Gerente("Mónica",18000, "Gerente", 5000);
        gerente1.mostrarDatos();
        System.out.println();
        Desarrollador empleado1 = new Desarrollador("Yaiza Treus", 25000,"Desarrollador", "Java");
        empleado1.mostrarDatos();









    }

}

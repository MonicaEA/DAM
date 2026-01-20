import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       /* Persona persona = new Persona("Juan", 23);
        System.out.println("Nombre : "+ persona.getNombre() );
        System.out.println("Edad : "+ persona.getEdad() );

        persona.setNombre("Pedro");
        persona.setEdad(25);

        System.out.println("");
        System.out.println("Datos : Modificados");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad()); */
       /* Rectangulo rectangulo = new Rectangulo(10,15);
        System.out.println("Rectangulo con base: " + rectangulo.getBase() + " y altura: "+ rectangulo.getAltura());
        System.out.println("Area : " + rectangulo.calcularArea());
        System.out.println("Perimetro: " + rectangulo.calcularPerimetro());
    */
      /*  Libro libro1 = new Libro();
        Libro libro2 = new Libro("Don quijote de la mancha", "Miguel de Cervantes");
        Libro libro3 = new Libro("Cien años de soledad", "Gabriel Garcia Marquez", 471);

        
        System.out.println("Libro 1: " + libro1.getTitulo() + " Autor: " + libro1.getAutor() + " Páginas : " + libro1.getPaginas() );
        System.out.println("Libro 2: " + libro2.getTitulo() + " Autor: " + libro2.getAutor() + " Páginas : " + libro2.getPaginas() );
        System.out.println("Libro 3: " + libro3.getTitulo() + " Autor: " + libro3.getAutor() + " Páginas : " + libro3.getPaginas() );
        */
      /*  CuentaBancaria cuenta1 = new CuentaBancaria("Yaiza Treus", 1500);
        CuentaBancaria cuenta2 = new CuentaBancaria("Mónica Espiñeira", 2000);
        CuentaBancaria cuenta3 = new CuentaBancaria("María Gonzalez", 2500);

        System.out.println("Cuenta de "+cuenta1.getTitular() + ": "+ cuenta1.getSaldo() + "€");
        cuenta1.depositarCantidad(1500);
        cuenta1.retirarCantidad(2500);
        System.out.println("Cuenta de "+cuenta2.getTitular() + ": "+ cuenta2.getSaldo()+ "€");
        cuenta2.depositarCantidad(10000);
        cuenta2.retirarCantidad(8250.75);
        System.out.println("Cuenta de "+cuenta3.getTitular() + ": "+ cuenta3.getSaldo() + "€");
        cuenta3.retirarCantidad(192.33);

       */
       /* Estudiante estudiante1 = new Estudiante("Yaiza Treus Gude ", 33);
        System.out.println("Estudiante : "+estudiante1.getNombre());
        estudiante1.setNota(13);
        estudiante1.setNota(7.5);
        estudiante1.setNota(10);
*/
      /*  Producto producto1 = new Producto("Auriculares",15.99,2);
        System.out.println(producto1);
        Producto producto2 = new Producto("Ratón", 18.95,3);
        System.out.println(producto2);
    */

/*
        // Primero crear la dirección
        Direccion dir1 = new Direccion("Calle Mayor 123", "Madrid", 28001);

        // Luego crear el cliente con esa dirección
        Cliente cliente1 = new Cliente("Juan Pérez", "juan@email.com", dir1);

        cliente1.mostrarDatos();
*/

       /* Empleado[] empleados = new Empleado[5];
        empleados[0] = new Empleado("María", "admin", 22500);
        empleados[1] = new Empleado("Juan", "tecnico", 2100);
        empleados[2] = new Empleado("Yaiza", "directora",4500);
        empleados[3] = new Empleado("Mónica", "comercial", 3300);
        empleados[4] = new Empleado("Betty", "secretaria", 2750);

        for (int i = 0; i < empleados.length; i++) {
            System.out.println(empleados[i]);  // usa toString()
        }

        Empleado mayorSalario = empleados[0];
        double maxSalario = empleados[0].getSalario();
        for (int i = 0; i < empleados.length; i++) {
            if (empleados[i].getSalario() > maxSalario){
                maxSalario = empleados[i].getSalario();
                mayorSalario = empleados[i];

            }


        }
        System.out.println("\nMayor salario : "+maxSalario);

        double suma = 0;
        for (Empleado emp : empleados) {
            suma += emp.getSalario();  // sumar todos los salarios
        }
        double promedio = suma / empleados.length;  // dividir por número de empleados
        System.out.printf("Salario promedio: €%.2f%n", promedio);
        */

       /* System.out.println("Suma: " + Calculadora.sumar(2,4));
        System.out.println("Resta: " + Calculadora.restar(2,4));
        System.out.println("Multiplicar: " + Calculadora.multiplicar(2,4));
        System.out.println("División: " + Calculadora.division(2,4));
        System.out.println("Potencia: " + Calculadora.potencia(2,4));
    */


        Libro1 libro1 = new Libro1("El principito", "Nose", "SDJKSAD15", true);
        Libro1 libro3 = new Libro1("El oso", "Dos", "SDJASDAKSAD15", true);

        Usuario usuario1 = new Usuario("Mónica Espiñeira", 123);
        Usuario usuario2 = new Usuario("Yaiza Treus", 800);

        System.out.println("------ BIBLIOTECA ------\n");
        System.out.println("Libros disponibles: ");
        System.out.println(libro1);
        System.out.println(libro3);
        System.out.println();

        // Préstamo 1: Mónica intenta tomar "El principito"
        System.out.println(usuario1 + " intenta tomar prestado: " + libro1.getTitulo());
        Prestamo p1 = new Prestamo(libro1, usuario1);
        p1.prestarLibro();   // cambia disponible a false
        System.out.println();

        // Préstamo 2: Yaiza intenta el mismo libro
        System.out.println(usuario2 + " intenta tomar prestado: " + libro1.getTitulo());
        Prestamo p2 = new Prestamo(libro1, usuario2);
        p2.prestarLibro();   // debería decir que NO está disponible
        System.out.println();

        // Devolver libro1
        p1.devolverLibro();
        System.out.println();

        // Ahora Yaiza vuelve a intentar
        System.out.println(usuario2 + " intenta tomar prestado: " + libro1.getTitulo());
        p2.prestarLibro();   // ahora sí debería poder
        System.out.println();

        // Otro préstamo con libro3
        System.out.println(usuario2 + " intenta tomar prestado: " + libro3.getTitulo());
        Prestamo p3 = new Prestamo(libro3, usuario2);
        p3.prestarLibro();

    }

}


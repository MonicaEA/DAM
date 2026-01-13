import java.sql.SQLOutput;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
      /*  Persona persona = new Persona("María",21);
        System.out.println("Estos son los datos de la persona seleccionada");
        System.out.println("Nombre: "+persona.getNombre());
        System.out.println("Edad: "+persona.getEdad());

        System.out.println("Procedemos a la modificación....");
        persona.setNombre("Ana");
        persona.setEdad(23);

        System.out.println("Datos modificados....");
        System.out.println("Nombre : "+ persona.getNombre());
        System.out.println("Edad : "+ persona.getEdad());
        */
  /*      Scanner scanner = new Scanner(System.in);
        System.out.println("Vamos a calcular el area de un rectangulo.....");
        Rectangulo rectangulo = new Rectangulo();
        rectangulo.calcularArea(scanner);
        rectangulo.calcularPerimetro();
*/

      /*  Libro libro = new Libro();
        libro.setAutor(" desconocido");
        libro.setTitulo(" desconocido");
        libro.setPaginas(0);
        System.out.println("Autor:" + libro.getAutor() + " Titulo:" + libro.getTitulo() + " " + libro.getPaginas() + " paginas");
        Libro libro1 = new Libro("Don Quijote de la Mancha","Miguel de Cervantes");
        libro1.setPaginas(456);
        System.out.println("Titulo: "+libro1.getTitulo()+ " Autor: "+ libro1.getAutor() + " " +libro.getPaginas()+ " paginas");
        Libro libro2 = new Libro("Don Quijote de la Mancha","Miguel de Cervantes", 670);
        System.out.println("Titulo: "+libro2.getTitulo()+ " Autor: "+ libro2.getAutor() + " " +libro2.getPaginas()+ " paginas");
*/

     /*   Scanner scanner = new Scanner(System.in);
        CuentasBancarias cuenta1 = new CuentasBancarias("María", 1200);
        CuentasBancarias cuenta2 = new CuentasBancarias("Juan", 1500);
        CuentasBancarias cuenta3 = new CuentasBancarias("Yaiza", 2000);

        System.out.println("---- INFORMACION DE CUENTAS : TITULARES Y SALDO INICIAL");
        System.out.println("Cuenta 1: Titular----> " +cuenta1.getTitular() + " Saldo ----->"+cuenta1.getSaldo()+"€");
        System.out.println("Cuenta 2: Titular----> " +cuenta2.getTitular() + " Saldo ----->"+cuenta2.getSaldo()+"€");
        System.out.println("Cuenta 3: Titular----> " +cuenta3.getTitular() + " Saldo ----->"+cuenta3.getSaldo()+"€");


        cuenta1.depositarCantidad(1500);
        cuenta2.depositarCantidad(300);
        cuenta3.depositarCantidad(235);

        System.out.println("---- INFORMACION DE CUENTAS : TITULARES Y SALDO TRAS INGRESOS");
        System.out.println("Cuenta 1: Titular----> " +cuenta1.getTitular() + " Saldo ----->"+cuenta1.getSaldo()+"€");
        System.out.println("Cuenta 2: Titular----> " +cuenta2.getTitular() + " Saldo ----->"+cuenta2.getSaldo()+"€");
        System.out.println("Cuenta 3: Titular----> " +cuenta3.getTitular() + " Saldo ----->"+cuenta3.getSaldo()+"€");

        cuenta1.retirarCantidad(122.40);
        cuenta2.retirarCantidad(324.10);
        cuenta3.retirarCantidad(1222.70);

        System.out.println("---- INFORMACION DE CUENTAS : TITULARES Y SALDO TRAS RETIRADAS");
        System.out.println("Cuenta 1: Titular----> " +cuenta1.getTitular() + " Saldo ----->"+cuenta1.getSaldo()+"€");
        System.out.println("Cuenta 2: Titular----> " +cuenta2.getTitular() + " Saldo ----->"+cuenta2.getSaldo()+"€");
        System.out.println("Cuenta 3: Titular----> " +cuenta3.getTitular() + " Saldo ----->"+cuenta3.getSaldo()+"€");
*/

        Estudiante estudiante = new Estudiante("Yaiza Treus", 20, 8.5);

        System.out.println("Estudiante: " + estudiante.getNombre());

        estudiante.setNota(8.5);
        System.out.println("Nota actual: " + estudiante.getNota());
        System.out.println();

        estudiante.setNota(10);
        System.out.println("Nota actual: " + estudiante.getNota());
        System.out.println();

        estudiante.setNota(-3);
        System.out.println("Nota actual: " + estudiante.getNota());
    }
}


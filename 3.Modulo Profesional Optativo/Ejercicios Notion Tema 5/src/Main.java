import controller.Agenda;
import model.Contacto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Agenda agenda = new Agenda();

        int opcion;

        do {
            System.out.println("\n--- AGENDA ---");
            System.out.println("1. Añadir contacto");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Eliminar contacto");
            System.out.println("4. Listar contactos");
            System.out.println("5. Contar contactos");
            System.out.println("6. Comprobar si existe contacto");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {

                case 1: // Añadir contacto
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Apellido: ");
                    String apellido = sc.nextLine();

                    System.out.print("Teléfono: ");
                    String telefono = sc.nextLine();

                    Contacto c = new Contacto(nombre, apellido, telefono);
                    // En la agenda: nombre -> teléfono
                    agenda.agregarContacto(c.getNombre(), c.getTelefono());
                    System.out.println("Contacto añadido/actualizado.");
                    break;

                case 2: // Buscar contacto
                    System.out.print("Nombre a buscar: ");
                    String nombreBuscar = sc.nextLine();
                    String resultado = agenda.buscarContacto(nombreBuscar);
                    System.out.println("Resultado: " + resultado);
                    break;

                case 3: // Eliminar contacto
                    System.out.print("Nombre a eliminar: ");
                    String nombreEliminar = sc.nextLine();
                    boolean eliminado = agenda.eliminarContacto(nombreEliminar);
                    if (eliminado) {
                        System.out.println("Contacto eliminado.");
                    } else {
                        System.out.println("No existía ese contacto.");
                    }
                    break;

                case 4: // Listar contactos
                    System.out.println("Contactos en la agenda:");
                    agenda.listarContactos();
                    break;

                case 5: // Contar contactos
                    System.out.println("Total de contactos: " + agenda.contarContactos());
                    break;

                case 6: // Comprobar existencia
                    System.out.print("Nombre a comprobar: ");
                    String nombreExiste = sc.nextLine();
                    System.out.println("Existe: " + agenda.existeContacto(nombreExiste));
                    break;

                case 0:
                    System.out.println("Saliendo de la agenda...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 0);

        sc.close();
    }
}

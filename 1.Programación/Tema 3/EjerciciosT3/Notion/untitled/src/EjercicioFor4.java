import java.util.Scanner;

public class EjercicioFor4 {
    /*Crea un programa que muestre un menú con 4 opciones:
     1=Ver perfil, 2=Configuración, 3=Ayuda, 4=Salir. Pide al usuario que elija una opción y usa un switch para
     mostrar el mensaje correspondiente a cada opción.
     */


    public void ejercicioFor4(){
    Scanner scanner = new Scanner(System.in);
        System.out.println("-----MENÚ-----");

        System.out.println("1.Ver perfil");
        System.out.println("2.Configuración");
        System.out.println("3.Ayuda");
        System.out.println("4.Salir");
        System.out.println("Elige una opción");

        String seleccion = scanner.next();

        switch (seleccion){

            case "1":
                System.out.println("Has seleccionado: Ver perfil");
                break;
            case "2":
                System.out.println("Has selecccionado: Configuración");
                break;
            case "3" :
                System.out.println("Has seleccionado : Ayuda");
                break;
            case "4":
                System.out.println("Has seleccionado : Salir");
                break;
            default:
                System.out.println("Opción no valida");





        }




    }

}

import java.util.Scanner;

public class Ejercicio5While {
    /*Desarrolla un programa con un menú que se repita usando do-while. El menú debe tener 4 opciones:
     1=Saludar, 2=Despedirse, 3=Ver hora actual (puedes mostrar un mensaje fijo), 4=Salir.
      Usa switch para procesar cada opción. El programa solo debe terminar cuando el usuario elija la opción 4.
     */


    public void ejercicio5While() {
    Scanner scanner = new Scanner(System.in);

int opcion;
        System.out.println("------Bienvenido al programa-------");
        System.out.println("---------------------------------");

        do {

            System.out.println("1.Saludar");
            System.out.println("2.Despedirse");
            System.out.println("3.Ver hora actual");
            System.out.println("4.Salir");
            System.out.println("Introduce tu opción");
            opcion = scanner.nextInt();

            if (opcion>4 || opcion<1){
                System.out.println("Introduce un número correcto");
            continue;
            }

            switch (opcion) {
                case 1:
                    System.out.println("Hola!!!");
                    break;
                case 2:
                    System.out.println("Hasta pronto");
                    break;
                case 3:
                    System.out.println("La hora actual es...La de ayer a estas horas");
                    break;

                case 4:
                    System.out.println("adios!");
                break;

            }
        } while (opcion != 4);



    }

    }




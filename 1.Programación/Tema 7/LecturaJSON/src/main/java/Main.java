import Controller.ApiController;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        ApiController apiController = new ApiController();
        //apiController.getAllLigas();
        //apiController.getAllClasificacion(id);

        Scanner scanner = new Scanner(System.in);
        int opcion =  -1;
        do {
            System.out.println("1.Ver ligas");
            System.out.println("2. Ver clasificación");
            System.out.println("3. Exportar clasificación");
            System.out.println("4.Salir");
            System.out.print("Selecciona una opción: ");

            try {
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        apiController.getAllLigas();
                        break;
                    case 2:
                        apiController.getAllClasificacion();
                        break;
                    case 3:
                        System.out.println("Funcionalidad de exportar en desarrollo...");
                        break;
                    case 4:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción no válida, intenta de nuevo.");
                }
            } catch (Exception e) {
                System.out.println("Error: Introduce un número válido.");
                scanner.next(); // Limpia el buffer del scanner si el usuario mete texto
            }

        } while (opcion != 4);

        scanner.close();
    }
        }






    }


}

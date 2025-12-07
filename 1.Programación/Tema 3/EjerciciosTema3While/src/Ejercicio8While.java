import java.util.Scanner;


public class Ejercicio8While {
    /*Desarrolla un programa que pida la edad del usuario. Usa un bucle do-while para validar que la edad
    introducida esté entre 0 y 120. Si no es válida, debe volver a pedirla. Una vez válida,
     muestra un mensaje de confirmación.
     */

    Scanner scanner = new Scanner(System.in);

    public void ejercicio8While(){

        int edad =0;

        do {
            System.out.println("Introduce tu edad: ");
             edad = scanner.nextInt();
           if (edad <0 || edad>120) {
               System.out.println("No puedes pasar. Introduce de nuevo tu edad");

           }
        } while (edad<0 || edad>120);
            System.out.println("Puedes pasar.");





    }

}

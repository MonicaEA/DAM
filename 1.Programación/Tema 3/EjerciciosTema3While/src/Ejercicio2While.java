import java.util.Scanner;


public class Ejercicio2While {
    /*Desarrolla un programa que pida al usuario una contraseña. La contraseña correcta es "1234".
     Usa un bucle do-while para seguir pidiendo la contraseña hasta que el usuario la introduzca correctamente.
     */

    Scanner scanner = new Scanner(System.in);

    public void ejercicioWhile2(){

        String contraseniaCorrecta = "1234";
        String contraseniaIntento = "";

        System.out.println("Contraseña requerida....");


        do {
            System.out.println("Introduzca la contraseña");
            contraseniaIntento = scanner.next();


            if (!contraseniaIntento.equals(contraseniaCorrecta)) {
                System.out.println("Contraseña incorrecta. Intenta de nuevo.");
                System.out.println("La contraseña contiene 4 números");

                
            }


        } while (!contraseniaIntento.equals(contraseniaCorrecta));
            System.out.println("Contraseña correcta: Acceso permitido.");










    }
}

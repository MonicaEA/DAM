import java.util.Scanner;

public class Ejercicio3 {
    /*Crear un programa que clasifique la temperatura en categorías usando rangos.

     **Requisitos:**

     1. Declara una variable `int temperatura` en grados Celsius.
     2. Usa `switch(true)` para clasificar la temperatura en: Helado (<0), Frío (0-15), Templado (16-25),
     Calor (26-35), Muy Caliente (>35).
     3. Muestra un mensaje descriptivo y una recomendación de vestimenta.
     */

    Scanner scanner = new Scanner(System.in);
    public void temperatura(){
        int temperatura = scanner.nextInt();

       /* switch (true) {
            case(temperatura<0):
                System.out.println("Helado, abrigate");
                break;
            case(temperatura<16):
                System.out.println("Hace frío.");
                break;
            case (temperatura<26):
                System.out.println("Templado, bastante buen tiempo");
                break;
            case (temperatura<35):
                System.out.println("Calor, saca el pantalón corto");
                break;
            case(temperatura>35):
                System.out.println("Muy caliente, no salgas a la calle sin agua");
                break;
            default:
                System.out.println("Temperatura no válida");



        }
*/


    }

}

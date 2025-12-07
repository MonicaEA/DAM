import java.util.Scanner;

public class WordleEj2 {
    /*Crea una aplicación que simule el funcionamiento del wordle. Para ello realiza
las siguientes acciones:
a. Crea una palabra de 5 letras. (funcionará como la palabra a adivinar)
b. El programa debe seleccionar aleatoriamente una palabra del array y
almacenarla como la palabra secreta.
c. El usuario tiene 5 intentos como máximo para adivinar la palabra secreta.
d. En cada intento, el usuario introduce una palabra por teclado.
e. Tras cada intento, el programa debe indicar al usuario:
i. Aciertos: cuántas letras tiene en la misma posición que la palabra
secreta.
ii. Aproximaciones: cuántas letras están en la palabra secreta, pero en una
posición diferente.
iii. Fallos: cuántas letras no están presentes en la palabra secreta.
     */
    Scanner scanner = new Scanner(System.in);

    public void wordle() {
        String palabraSistema = "frase";
        int intentos = 5;
        Scanner scanner = new Scanner(System.in); // Si no está declarado antes

        while (intentos > 0) {
            System.out.println("Introduce la palabra: ");
            String palabraUsuario = scanner.next();
            int aciertos = 0, aproximados = 0;

            for (int i = 0; i < palabraSistema.length(); i++) {
                if (i < palabraUsuario.length()) {
                    if (palabraSistema.charAt(i) == palabraUsuario.charAt(i)) {
                        aciertos++;
                    } else if (palabraSistema.contains(String.valueOf(palabraUsuario.charAt(i)))) {
                        aproximados++;
                    }
                }
            }

            if (palabraSistema.equals(palabraUsuario)) {
                System.out.println("¡Correcto! Has adivinado la palabra.");
                break;
            } else {
                System.out.println("Aciertos en posición: " + aciertos);
                System.out.println("Letras correctas pero en otra posición: " + aproximados);
                intentos--;
                System.out.println("Intentos restantes: " + intentos);
            }
        }

        if (intentos == 0) {
            System.out.println("Has agotado los intentos, la palabra era: " + palabraSistema);
        }
    }
}

import java.util.Scanner;



public class Ejercicio12 {

    /*Crea un programa que pida al usuario crear una contraseña. La contraseña debe cumplir estos requisitos:
   tener al menos 8 caracteres de longitud, contener al menos un número, y NO puede ser "12345678" o "password".
   El programa debe verificar cada condición por separado usando operadores lógicos y mostrar si la
   contraseña es válida o no, indicando qué requisitos no cumple.
   Nota: Para este ejercicio, asume que tienes funciones auxiliares como longitudCadena(texto), contienNumero(texto)*/

    public void ejercicio12 (){

        Scanner scanner = new Scanner(System.in);
        System.out.println("indica que contraseña quieres evaluar");
        String contrasenia = scanner.next();

        boolean requisitoLong = contrasenia.length() >=0;
        boolean contieneNumero = contrasenia.contains("1") || contrasenia.contains("2") || contrasenia.contains("3") || contrasenia.contains("4") || contrasenia.contains("5") || contrasenia.contains("6") || contrasenia.contains("7") || contrasenia.contains("8") || contrasenia.contains("9") || contrasenia.contains("0");

        boolean passInvalida = contrasenia.equals("password") || contrasenia.equals("12345678");
        System.out.println("requisito long: "+requisitoLong);
        System.out.println("Requisito num: "+contieneNumero);
        System.out.println("Requisito pass invalida: "+passInvalida);
        boolean passOk= requisitoLong && contieneNumero && !passInvalida;

        System.out.println("La contraseña es correcta: "+passOk);


    }


}

import java.util.Scanner;


public class Ejercicio4 {

    /*Desarrolla un programa que pida un número al usuario y determine si es par o impar usando el operador módulo.
    Muestra el resultado por consola.
    Ejemplo de salida por consola:
    Introduce un número: 7
    El número 7 es impar (resto al dividir entre 2: 1)*/
    Scanner scanner = new Scanner(System.in);
    public void ejercicio4(){
        System.out.println("Introduce un número");
        int num = scanner.nextInt();

      int resto = num % 2;

      if (resto==0){
          System.out.println("El número " + num+ " es par (resto al dividir entre 2: "+resto+ ")"
          );
      }
      else {
          System.out.println("El número " + num+ " es impar (resto al dividir entre 2: " + resto + ")");
      }

    }
}





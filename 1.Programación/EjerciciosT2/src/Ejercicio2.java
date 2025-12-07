import java.util.Scanner;

public class Ejercicio2 {

    Scanner scanner = new Scanner(System.in);
   /* Escribe un programa que pida dos números al usuario y muestre el resultado de todas las comparaciones relacionales
    entre ellos (mayor que, menor que, igual, diferente, mayor o igual, menor o igual).
    Ejemplo de salida por consola:
    Introduce el primer número: 10
    Introduce el segundo número: 10
            ¿10 es mayor que 10?: false
            ¿10 es menor que 10?: false
            ¿10 es igual a 10?: true
            ¿10 es diferente de 10?: false
            ¿10 es mayor o igual que 10?: true
            ¿10 es menor o igual que 10?: true*/

public void ejercicio2(){

    System.out.println("Escribe el primer número");
    int num1 = scanner.nextInt();
    System.out.println("Introduzca el segundo número");
    int num2 = scanner.nextInt();

    boolean mayorQue10 = num1>num2;
    boolean menorQue10 = num1<num1;
    boolean igualQue= num1==num2;
    boolean diferente = num1!=num2;
    boolean mayorIgual = num1 >= num2;
    boolean menorIgual = num1<=num2;


    System.out.println("¿ "+num1+" es mayor que "+num2 +"?: "+ mayorQue10);
    System.out.println("¿ "+num1+" es menor que "+num2 +"?: "+ menorQue10);
    System.out.println("¿ "+num1+" es igual que que "+num2 +"?: "+ igualQue);
    System.out.println("¿ "+num1+" es diferente a "+num2 +"?: "+ diferente);
    System.out.println("¿ "+num1+" es mayor o igual que "+num2 +"?: "+ mayorIgual);
    System.out.println("¿ "+num1+" es menor o igual que "+num2 +"?: "+ menorIgual);


}





    }


import java.util.Scanner;

public class Ejercicio5 {
/*Objetivo: Crear una calculadora simple que realice operaciones según un operador.

 **Requisitos:**

 1. Declara dos variables `double num1` y `double num2`.
 2. Declara una variable `char operador` con valores posibles: '+', '-', '*', '/'.
 3. Usa un `switch` para realizar la operación correspondiente.
 4. Maneja el caso especial de división por cero.*/


public void calculadora(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Introduce el primer número: ");
    double num1 = scanner.nextDouble();
    System.out.println("Introduce el segundo número: ");
    double num2 = scanner.nextDouble();

    System.out.println("Que operación quieres realizar: '+', '-', '*', '/' ");
    char operador = scanner.next().charAt(0);
    double total = 0;
    switch (operador){

        case '+' -> total=num1+num2;
        case '-' -> total=num1-num2;
        case '*' -> total=num1*num2;
        case '/' -> {
            if (num2 == 0 || num1==0){
            System.out.println("Error: división por cero no permitida");
            return;
        } total=num1/num2;}
    }
    System.out.println("El resultado de la operación "+operador+" es : "+total);
}



}

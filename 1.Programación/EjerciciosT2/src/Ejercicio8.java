import java.util.Scanner;
public class Ejercicio8 {
    Scanner scanner = new Scanner(System.in);

    /*Desarrolla un programa que pida tres números al usuario y calcule: la suma de los tres, el promedio,
    el resultado de multiplicar el primero por el segundo y dividirlo entre el tercero. Usa paréntesis para
    controlar la precedencia de operadores.

    Ejemplo de salida por consola:
    Introduce el primer número: 10
    Introduce el segundo número: 5
    Introduce el tercer número: 2
    Suma de los tres números: 15
    Promedio: 5.0
    Resultado de (número1 * número2) / número3: 25.0 */

    // Pide los números
    public void ejercicio8(){
        System.out.println("Primer número: ");
        double num1 = scanner.nextDouble();
        System.out.println("Segundo número: ");
        double num2 = scanner.nextDouble();
        System.out.println("Tercer número: ");
        double num3 = scanner.nextDouble();

     double suma = (num1+num2+num3);
     double promedio = (num1+num2+num3)/3.0;
     double operacion = (num1*num2)/num3;

        System.out.println("Suma de los tres números: "+suma);
        System.out.println("Promedio: "+promedio);
        System.out.println("Resultado de (número1 * número2) / número3: "+operacion);


    }

}

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    try {
        System.out.println("Introduce el número 1");
        int op1 = scanner.nextInt();
        System.out.println("Introduce el número 2");
        int op2 = scanner.nextInt();
        System.out.println("Pasamos a calcular los resultados");
        int suma = op1 +op2;
        int resta = op1 - op2;
        int multi = op1*op2;
        int div = op1/op2;
        System.out.println("Los resultados son :");
        System.out.println("La suma es : "+suma);
        System.out.println("La resta es : "+resta);
        System.out.println("La multiplicación es : "+multi);
        System.out.println("La división es : "+div);

    }catch (InputMismatchException e){
        System.out.println("Error en la introducción de datos por teclado.");


    }
    catch (ArithmeticException e){
        System.out.println("Calculo erroneo");

    }
    catch (Exception e) {
        System.out.println("Fallo en la introducción de los datos");
    }
        System.out.println("Terminando la calculadora");















    }





}

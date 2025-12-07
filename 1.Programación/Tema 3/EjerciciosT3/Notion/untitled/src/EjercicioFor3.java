import java.util.Scanner;


public class EjercicioFor3 {

    /*Escribe un programa que pida dos números y una operación (+, -, *, /). Usa un switch para
    realizar la operación correspondiente y mostrar el resultado.
     */

    public void ejercicioFor3(){
      Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el primer número");
        double num1 = scanner.nextInt();
        System.out.println("Introduce el segundo número");
        double num2 = scanner.nextInt();
        System.out.println("Que operación quieres realizar? (+,-,*,/)");
        String operacion = scanner.next();
        double resultado =0;

        switch (operacion){

            case "+":
                resultado=num1+num2;
                System.out.printf("El resultado de la suma es: %.2f",resultado);
                break;

            case "-":
                resultado=num1-num2;
                System.out.printf("El resultado de la resta es: %.2f",resultado);
                break;

            case "*":
                resultado=num1*num2;
                System.out.printf("El resultado de la multiplicación es: %.2f",resultado);
                break;

            case "/":
                resultado=num1/num2;
                System.out.printf("El resultado de la división es: %.2f",resultado);
                break;


            default:
                System.out.println("La operación introducida no es válida");

        }




        scanner.close();

    }

}

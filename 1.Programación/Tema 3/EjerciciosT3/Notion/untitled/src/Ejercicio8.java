import java.util.Scanner;



public class Ejercicio8 {
    /*Desarrolla un programa que pida dos números al usuario y determine cuál es mayor, o si son iguales.
     Muestra el resultado por consola.
     */

    public void ejercicio8(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el primer número: ");
        int num1 = scanner.nextInt();
        System.out.println("Introduce el segundo número: ");
        int num2 = scanner.nextInt();

        if (num1>num2){
            System.out.println("El número "+num1 +" es mayor que "+num2);
        } else if (num1<num2) {
            System.out.println("El número "+num1+" es menor que "+num2);

        }else System.out.println("El número "+num1+" es igual que "+num2);


    }


}

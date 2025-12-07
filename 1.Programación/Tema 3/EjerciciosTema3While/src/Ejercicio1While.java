import java.util.Scanner;


public class Ejercicio1While {
    /*Crea un programa que pida un número N y use un bucle while para contar desde 1 hasta N,
     mostrando cada número.
     */
    Scanner scanner = new Scanner(System.in);

    public void ejercicio1While (){

        System.out.println("Introduce un número: ");
        int numero = scanner.nextInt();
        int inicio = 1;
        System.out.println("Contando con While");

        while (inicio <= numero) {
            System.out.println(inicio);
            inicio ++;


        }

        System.out.println("Fin del conteo");


    }




}

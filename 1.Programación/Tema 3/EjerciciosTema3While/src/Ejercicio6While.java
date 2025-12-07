import java.util.Scanner;

public class Ejercicio6While {
/*Escribe un programa que pida un número N y use un bucle while para hacer una cuenta atrás desde N hasta 1,
 mostrando cada número. Al llegar a 1, debe mostrar "¡Despegue!".
 */
Scanner scanner = new Scanner(System.in);

public void ejercicio6While(){

    System.out.println("Introduce un número:");
    int numero = scanner.nextInt();


    while (numero>=1){
        System.out.println(numero);
        numero --;


    }
    System.out.println("¡Despegue!");



}

}

import java.util.Scanner;


public class EjercicioFor9 {
    /*Escribe un programa que pida un número entero positivo y calcule su factorial usando un bucle for.
     El factorial de N es: N! = N × (N-1) × (N-2) × ... × 1
     */
   Scanner scanner = new Scanner(System.in);

   public void ejercicioFor9(){
       System.out.println("Introduce un número");
       int numero = scanner.nextInt();
       System.out.printf("Calculando %d!\n",numero);
       int factorial =1;

       for (int i = numero; i >0 ; i--) {

           factorial *= i;


       }

       System.out.printf("El factorial de %d es %d",numero,factorial);


   }



}

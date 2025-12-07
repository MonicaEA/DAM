import java.util.Scanner;


public class Ejercicio1 {
    /*Objetivo:** Crear un programa que convierta una calificación numérica (0-10) en su equivalente alfabético
    usando un switch.

     **Requisitos:**

     1. Declara una variable `double calificacion` con un valor entre 0 y 10.
     2. Usa un `switch` para convertir la calificación a una letra (A, B, C, D, F).
     3. Considera: 9-10 = A, 7-8.9 = B, 5-6.9 = C, 4-4.9 = D, 0-3.9 = F
     4. Muestra un mensaje apropiado para cada calificación.
    */
   Scanner scanner = new Scanner(System.in);

   public void ejercicio1(){

       System.out.println("Introduce tu calificación (0-10): ");
       double calificacion = scanner.nextDouble();
       int notaEntera = (int)calificacion;

       String letra = switch (notaEntera) {

           case 9, 10 -> "A";
           case 7, 8 -> "B";
           case 5, 6 -> "C";
           case 4 -> "D";
           case 0, 3 -> "F";
           default -> "X";


       };
       if(letra.equals("X")){
           System.out.println("Valor fuera de rango");


       }else {
           System.out.println("Tu calificación es: "+letra);

       }



   }






}

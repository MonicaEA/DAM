import java.util.Scanner;


public class Ejercicio9 {
    Scanner scanner = new Scanner(System.in);
    /*Escribe un programa que pida al usuario la puntuación de tres exámenes. Calcula la nota media y usa operadores
     relacionales para determinar si ha aprobado (>=5), si tiene notable (>=7), y si tiene sobresaliente (>=9).
      Muestra todos los resultados.
Ejemplo de salida por consola:
Introduce la nota del primer examen: 8
Introduce la nota del segundo examen: 7
Introduce la nota del tercer examen: 9
Nota media: 8.0
¿Ha aprobado? (>=5): true
¿Tiene notable? (>=7): true
¿Tiene sobresaliente? (>=9): false */
    public void ejercicio9(){
        System.out.println("Introduce la nota del primer examen: ");
        double exam1 = scanner.nextDouble();
        System.out.println("Introduce la nota del segundo examen: ");
        double exam2 = scanner.nextDouble();
        System.out.println("Introduce la nota del tercer examen: ");
        double exam3 = scanner.nextDouble();

        //Calculos
        double notaMedia = (exam1+exam2+exam3)/3;




        //impresion por consola
        System.out.println("Nota media: "+notaMedia);
        System.out.println("¿Ha aprobado?: "+(notaMedia>=5));
        System.out.println("¿Tiene notable?: "+(notaMedia>=7));
        System.out.println("¿Tiene sobresaliente?: "+ (notaMedia>=9));


    }


}

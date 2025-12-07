import java.util.Scanner;

public class Ejercicio8 {

    /*Crea un programa con un array de 10 palabras (pueden repetirse).
     Pide al usuario una palabra y usa un bucle for para contar cuántas veces aparece esa palabra en el array.
     */


public void palabras (){
    Scanner scanner = new Scanner(System.in);
    String[] palabras = {"gato","perro","tortuga","perro","gacela","elefante","perro","pez","cisne","gato"};

    System.out.println("Introduce un animal: ");
    String animal = scanner.next();
    int animalesRepetidos = 0;

    for (int i = 0; i< palabras.length ; i++) {

        if (palabras[i].equals(animal)){

            animalesRepetidos++;
        }



    }

    System.out.println("El animal " + animal + " se repite "+animalesRepetidos + " veces.");

}

}

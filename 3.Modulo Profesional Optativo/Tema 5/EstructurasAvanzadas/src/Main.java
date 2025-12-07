import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
// Colecciones dinámicas ( Array.list)
        // Arraylist -> []

        ArrayList<Integer> listaCosas = new ArrayList<>();
        // el tamaño de la lista ->0
        System.out.println("El tamaño es de : "+listaCosas.size());
        listaCosas.add(5);
        listaCosas.add(15);
        listaCosas.add(25);
        listaCosas.add(25);

        System.out.println(listaCosas.size());
        System.out.println("El elemento en posicion 1 es : "+listaCosas.get(1));
        listaCosas.remove(3);
        System.out.println(listaCosas.size());

        // tamaño fijo -> estructuras estáticas
        /*String[]palabras =new String[] {"hola","adiosito","pescado","carnes","queso"};
        int[] numeros = new int[]{13, 24, 36, 74, 15, 86};
        //Arrays.sort(palabras); ordenar
        // 7 palabras
        Arrays.sort(palabras, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                System.out.println("Ejecutando");
                if (o1.length() > o2.length()) {
                    return 1;
                } else if (o1.length() < o2.length()) {
                    return -1;
                }
                return 0;
            };
            */

        /*numeros = Arrays.copyOf(numeros,numeros.length+1);
        for (int item :numeros){
            System.out.println(item);
        }*/

       /* for (int item:numeros){
            System.out.println(item); // imprime todo el array
        }

        // simular eliminar uno de los elementos
        System.out.println("indica que numero quieres borrar");
        int numeroBorrar = scanner.nextInt();
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroBorrar){
                numeros[i] = -1;
                break;

            }

        }
        for (int item : numeros){
            System.out.println(item);

        }*/


    }
}
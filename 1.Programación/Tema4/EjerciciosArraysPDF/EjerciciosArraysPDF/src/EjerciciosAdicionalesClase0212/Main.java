package EjerciciosAdicionalesClase0212;

public class Main {
/*Desarrolla un programa que cree un array de 6 números.
 Usa bucles for para encontrar el número mayor y el número menor del array, y muestra ambos resultados.
 */
    public static void main(String[] args) {

        int [] arrayNumeros = {15, 8, 23, 4, 19, 12};

        int max = arrayNumeros[0], min= arrayNumeros[0];
        for (int item: arrayNumeros){
            if (item>max){
                max = item;
            } if (item<min){
                min= item;
            }



        }


        System.out.println("El número mayor es : "+max);
        System.out.println("El número menor es : "+min);



        }

    }


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     /*Scanner scanner = new Scanner(System.in);
        Object[]persona = new Object[4];
        //nombre,apellido,correo,telefono
        persona[0] = "Borja";
        persona[1] = "Martin";
        persona[2] = "borja@gmail.com";
        persona[3] = 1245545;

        System.out.println("Nombre: ");
        String nombre = scanner.next();
        System.out.println("Apellido: ");
        String apellido = scanner.next();
        System.out.println("Correo: ");
        String mail = scanner.next();
        System.out.println("Telefono: ");
        int telefono = scanner.nextInt();


        Object[]persona1 = new Object[]{nombre,apellido,mail,telefono};
        System.out.println("Los datos del usuario son: ");
        for (Object item : persona1){
            System.out.println(item);
        }
*/

        int[][] numeros = new int[][]{{4,6,1},{1,8,9},{11,18,19}};
        // 4   6  1
        // 1   8  9
        // 11,18,19

        System.out.println(numeros[2][0]);

        //Tambíen puedes sobreescribir una posicion del array
        numeros[2][0]=20 ; //aqui cambiariamos esas posiciones.

        // tambien las podemos cambiar todas dentro de un fori

        for (int i = 0; i < numeros.length; i++) {

            for (int j = 0; j < numeros[i].length; j++) {

            }

        }

   }




}

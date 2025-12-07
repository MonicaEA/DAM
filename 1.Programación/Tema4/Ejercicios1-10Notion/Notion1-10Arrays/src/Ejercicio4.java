import java.util.Scanner;

public class Ejercicio4 {
    /*
    Crea un programa con un array de 7 números.
    Pide al usuario un número a buscar y usa un bucle for para recorrer el array.
    Si el número existe, muestra su posición. Si no existe, indica que no se encontró.
    */
    public void buscarElementoArray() {
        Scanner scanner = new Scanner(System.in);

        int[] numeroMaquina = {1, 60, 45, 7, 25, 99, 88};

        System.out.println("Introduce un número para buscar:");
        int numeroUsuario = scanner.nextInt();
        boolean numeroEncontrado = false;

        for (int i = 0; i < numeroMaquina.length; i++) {

            if (numeroUsuario==numeroMaquina[i]){
                System.out.println("El número "+numeroUsuario+ " se encuentra en la posición "+(i+1));
            numeroEncontrado=true;
            break;

            }

            }if (!numeroEncontrado){
            System.out.println("El número no está en la lista.");
        }




    }
}


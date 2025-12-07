public class Main {

    public static void main(String[] args) {

        //Array
        // mediante número de "huecos" o mediante elementos
        // su primera posición es la 0.

        int[] listaNumeros = new int[8]; //aqui digo que guarde 5 espacios. Cada espacio vale 0
        boolean[] listaAciertos = new boolean[3]; // aqui guardo 3. Cada uno un false
        double[] listaNotas = new double[6];// aqui guardo 6 espacios de 0.0 cada uno
        String[] listaNombres = new String[4]; // aqui creo 4 null
        int sumatorio = 0;

        //Para crear un array que indique el usuario sería.
        //System.out.println("¿cuantos datos quieres guardar?");
        // int tamanioNumeros = scanner.nextInt()
        // int []listaNumeros = new int [tamanioNumeros]


        // es importante saber cual es el tamaño del array ->cuantos elementos hay en el array.

        System.out.println("El tamaño del array es : " + listaNumeros.length);
        // se puede modificar uno de los elementos del array
        listaNumeros[listaNumeros.length - 1] = 34; // aqui modificaria el ultimo valor 0,0,0,0,0,0,0,34
        listaNumeros[0] = 64; // primera posicion 64,0,0,0,0,0,0,34
        listaNumeros[listaNumeros.length / 2] = 12; // aqui modifico la mitad. 64,0,0,0,12,0,0,34

        // Obterner uno de los elementos del array
        System.out.println("La posicion 0 es el valor " + listaNumeros[0]);
        System.out.println("La posicion 4 es el valor " + listaNumeros[listaNumeros.length / 2]);
        System.out.println("La posicion 7 es el valor : " + listaNumeros[listaNumeros.length - 1]);
        System.out.println("La posicion 1 es el valor " + listaNumeros[1]);

        // para imprimir el array
        for (int i = 0; i < listaNumeros.length; i++) {
            System.out.println(listaNumeros[i]);

        }

        //para rellenar con elementos aleatorios
        for (int i = 0; i < listaNumeros.length; i++) {
            listaNumeros[i] = (int) (Math.random() * 50);
            System.out.println(listaNumeros[1]);

        }

        // para sacar el sumatorio de todos los valores del array
        //for (int i = 0; i < listaNumeros.length; i++) {
        //System.out.println(listaNumeros[i]);
        //sumatorio += listaNumeros[i];


        for (int item : listaNumeros) {
            System.out.println("Ejecutando el valor " + item);
            sumatorio += item;


        }
        System.out.println("El sumatorio de los numeros del array es " + sumatorio);



    }

}
import java.util.Scanner;



public class SentenciasFor {


    public void palabraPalindromo(){

        String frase = "allivessevilla";
        boolean esPalindromo = true;
        for (int i = 0; i < frase.length()/2; i++) {

            //comparar cada letra 0-> ultimo
            // comparar cada dletra 1-> penultimo
            // comparar cada letra 2-> antepenultimo
            //i=2
            //letra uno = l


            char letraUno = frase.charAt(i);
            char letraDos = frase.charAt(frase.length()-1);
            if (letraUno!=letraDos){
                esPalindromo = false;
                break;
            }



        }





    }

    public void factorialNumero (){
        // el factorial de 5! = 5*4*3*2*1
        // por ejemplo factorial de 4 = 4*3=12 12*2=24 24*1=1
        // el factorial de un numero siempre es 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número para calcular su factorial: ");
        int numeroCalcular = scanner.nextInt();
        int factorial =1;
        for (int i = 1; i <=numeroCalcular ; i++) {

            factorial *= i;

        }
        System.out.printf("El factorial de %d es %d" ,numeroCalcular,factorial);





    }

    public void recorrerColeccion(){
        int[] numeros = {1,10,40,90};
        // un armario de posiciones 1,10,40,90

       /* for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }*/

        for ( int item : numeros ){
            System.out.println(item);

        }




    }

    



}

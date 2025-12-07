public class Main {
//el break para la repeticion en el momento donde se indica. Siempre es la ultima linea en el cuerpo de repetición.
// continue vas a pasar el turno cuando te indique
    // return
// if ternario decide el valor de una
    public static void main(String[] args) {

        /*for (int i = 0; i < 10; i++) {
            System.out.println("Repitiendo " +i);
            System.out.println("Terminando");
            if (i==3) {
                break;
            }


        }*/

       /* int acumulador=0;

        do {
            acumulador += (int)(Math.random()*41);
            if (acumulador>100 && acumulador<125);
            System.out.println("Te acercas peligrosamente, terminamos el programa");
            break;
        }while (acumulador<=301);
*/


        /*for (int i = 0; i < 10; i++) {
            System.out.println("La tabla del  " +i);

            for (int j = 0; j < 11; j++) {
                System.out.printf("\tEl resultado de %d * %d = %d%n" ,i,j,i*j);
                if (i==1)

                    break;

                }*/



        /*int acumulador=0;

        do {
            acumulador += (int)(Math.random()*41);

        }while (acumulador<=301);

        for (int i = 0; i < 10; i++) {
            System.out.println("Imprimiendo dato en posición "+i);
            return;

        }

        System.out.println("El acumulador tiene un valor acumulado de : "+acumulador);*/


     /*    int [] numeros = {1,4,34,-12,56,12,-56,78,12,-56};
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]<0) {
                continue;
            }
            System.out.println(numeros[i]);
        }*/

        // una variable va a tomar un valor , con una condicion logica , dependiendo del resultado este es el valor cuando es true, o de lo contrario si es false
        int nota =7;
        String resultado = nota<5 ? "Suspenso" : "aprobado";
        char numero = nota>=5? 'A' : 'F' ;
        System.out.println("Resultado : "+numero + " " + resultado);
            }

        }





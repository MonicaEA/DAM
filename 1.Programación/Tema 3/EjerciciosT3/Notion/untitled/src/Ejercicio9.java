import java.util.Scanner;
public class Ejercicio9 {
    /*Escribe un programa que pida el peso (en kg) y la altura (en metros) del usuario.
     Calcula el IMC (peso / altura²) y determina si está en peso normal (IMC entre 18.5 y 24.9), por debajo del
     peso normal (IMC menor a 18.5) o por encima del peso normal (IMC mayor a 24.9).
     */

    public void ejercicio9 (){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce tu peso en KG ");
        double peso = scanner.nextDouble();
        System.out.println("Introduce tu altura en metros, separa por comas");
        double altura = scanner.nextDouble();

        //Calculos

        double imc = peso / (altura*altura);

        if (imc<=24.9 && imc>=18.5){
            System.out.println("Tu IMC es normal");
        } else if (imc<18.5) {
            System.out.println("Estás por debajo del peso normal");

        }else System.out.println("Estas por encima del peso normal");


    }

}

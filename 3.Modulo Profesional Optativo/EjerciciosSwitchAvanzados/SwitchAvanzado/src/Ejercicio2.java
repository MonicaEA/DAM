import java.util.Scanner;

public class Ejercicio2 {
    /***Objetivo:** Crear un programa que convierta una cantidad en euros a otras monedas según la opción seleccionada.

     **Requisitos:**

     1. Crea un enum `Moneda` con: `DOLAR`, `LIBRA`, `YEN`, `PESO`.
     2. Declara una variable `double euros` con una cantidad.
     3. Usa un `switch` con el enum para aplicar la tasa de conversión correspondiente.
     4. Muestra el resultado de la conversión.
     */
    public enum Moneda{
        DOLAR,LIBRA,YEN,PESO
    }


    public void conversorMonedas(){
    Scanner scanner = new Scanner(System.in);

        double tasadolar=0.86;
        double tasalibra=1.14;
        double tasayen=0.01;
        double tasapesoMex=0.04;
        System.out.println("Introduce el importe en euros: ");
        double euros = scanner.nextDouble();
                System.out.println("Introduce a que quieres convertirlo: DOLAR, LIBRA, YEN O PESO ");
                String opcionElegida = scanner.next().toUpperCase();

        Moneda moneda = Moneda.valueOf(opcionElegida);


        double resultado = switch (moneda){
            case DOLAR -> euros*tasadolar;
            case LIBRA -> euros*tasalibra;
            case YEN -> euros*tasayen;
            case PESO -> euros*tasapesoMex;


        };
        System.out.println(euros + "EUR = "+ resultado+ " "+moneda);











    }

}

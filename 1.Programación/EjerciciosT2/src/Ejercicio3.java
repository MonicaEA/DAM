public class Ejercicio3 {


    /*Crea un programa que declare una variable con valor inicial 100 y aplique diferentes operadores de asignación
    compuesta (+=, -=, *=, /=). Muestra el valor de la variable después de cada operación.
Ejemplo de salida por consola:
Valor inicial: 100
Después de sumar 50 (+=): 150
Después de restar 30 (-=): 120
Después de multiplicar por 2 (*=): 240
Después de dividir entre 4 (/=): 60*/

    public void ejercicio3(){
        int valorInicial = 100;
        System.out.println("Valor inicial: "+valorInicial);
        valorInicial += 50;
        System.out.println("Después de sumar 50: "+valorInicial);
        valorInicial -= 30;
        System.out.println("Después de restar 30: "+valorInicial);
        valorInicial *= 2;
        System.out.println("Después de multiplicar por 2: "+valorInicial);
        valorInicial /= 4;
        System.out.println("Después de dividir entre 4: "+valorInicial);




    }
}

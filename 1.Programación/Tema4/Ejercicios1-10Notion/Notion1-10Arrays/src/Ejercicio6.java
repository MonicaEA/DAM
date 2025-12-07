public class Ejercicio6 {

    /*Crea un programa con un array de 8 números decimales.
     Recorre el array con un bucle for para calcular la suma de todos los elementos. Luego, calcula y muestra el promedio.
     */

    public void numerosDecimalesArray(){

        double[] numeroDecimales = {8.22,22.4,71.1,65.9,88.4,71.6,99.9,74.6};
        double sumaTotal = 0;


        for (int i = 0; i < numeroDecimales.length; i++) {

            sumaTotal=sumaTotal+numeroDecimales[i];

        }
        double promedio = sumaTotal/numeroDecimales.length;
        System.out.println("La suma total es : "+sumaTotal);
        System.out.println("El promedio es: "+promedio);







    }


}

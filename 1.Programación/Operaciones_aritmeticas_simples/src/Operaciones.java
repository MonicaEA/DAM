public class Operaciones {

    public static void main(String[] args) {
        System.out.println("Te damos la bienvenida a nuestra calculadora ");
        System.out.println("Vamos a realizar una serie de operaciones sencillas ");
        System.out.println();


        Calculos operaciones = new Calculos();
        System.out.println("El primer número es "+ operaciones.num1);
        System.out.println("El segundo número es "+ operaciones.num2);
        operaciones.sumar();
        operaciones.restar();
        operaciones.multiplicacion();
        operaciones.division();








    }
}

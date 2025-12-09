import model.Coche;

public class Main {

    public static void main(String[] args) {

        // esto es la instacia de la clase , es decir un objeto de la clase
        Coche ford = new Coche("Ford","Focus","1234a","Verde",150);
        Coche opel = new Coche();
        Coche mercedes = new Coche("Mercedes", "Clase C", 80000,250);
        mercedes.setCv();
        System.out.println("Los cv que tiene el Mercedes son "+ mercedes.setCv());



    }

}

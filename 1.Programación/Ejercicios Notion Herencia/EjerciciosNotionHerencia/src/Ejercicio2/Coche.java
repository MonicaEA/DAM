package Ejercicio2;

public class Coche extends Vehiculo{

    private int nPuertas;

    public Coche(String marca, String modelo, int nPuertas) {
        super(marca, modelo);
        this.nPuertas = nPuertas;
    }

    @Override
    public void mostrarVehiculo() {
        System.out.println("Coche: " + super.getInfoBasica() + ", " + nPuertas + " puertas.");
    }

    public int getnPuertas() {
        return nPuertas;
    }

    public void setnPuertas(int nPuertas) {
        this.nPuertas = nPuertas;
    }
}

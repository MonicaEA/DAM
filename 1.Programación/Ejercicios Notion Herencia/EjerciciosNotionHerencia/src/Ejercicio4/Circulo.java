package Ejercicio4;

public class Circulo extends Figura {
    private double radio;

    public Circulo() { super("Círculo"); }

    @Override
    public void mostrarDatos() {
        System.out.println(forma + " con radio " + radio);
    }

    @Override
    public double calcularArea() {
        return 0;
    }

    @Override
    public double calcularArea(double radio) {
        return Math.PI * Math.pow(radio,2);
    }
}

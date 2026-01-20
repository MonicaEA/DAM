package Ejercicio4;

public class Cuadrado extends Figura {
    private double lado = 4.0;

    public Cuadrado() {
        super("Cuadrado");
    }

    @Override
    public void mostrarDatos() {
        System.out.println(forma + " con lado " + lado);
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularArea(double radio) {
        return 0;
    }
}

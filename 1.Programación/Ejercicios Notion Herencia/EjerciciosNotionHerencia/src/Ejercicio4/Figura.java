package Ejercicio4;

/*Crea una clase Figura con un método calcularArea(). Crea dos clases hijas: Circulo (con atributo radio) y Cuadrado
(con atributo lado). Implementa el método calcularArea() en cada clase
hija con la fórmula correspondiente. Crea objetos de cada tipo y muestra sus áreas.
 */
public abstract class Figura {
    protected String forma;

    public Figura(String forma) {
        this.forma = forma;
    }

    // Método abstracto 1: mostrar forma
    public abstract void mostrarDatos();

    // Método abstracto 2: calcular área
    public abstract double calcularArea();

    // Método concreto: mostrar todo
    public void mostrarTodo() {
        mostrarDatos();
        System.out.println("Área: " + Math.round(calcularArea() * 100.0) / 100.0);
        System.out.println();
    }

    public abstract double calcularArea(double radio);
}
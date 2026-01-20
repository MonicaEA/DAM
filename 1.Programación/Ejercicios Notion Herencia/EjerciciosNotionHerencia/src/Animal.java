public abstract class Animal {  // abstract class

    private String nombre;
    private int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void presentacion() {
        System.out.println("Animal: " + nombre + ", " + edad + " años.");
    }

    // MÉTODO ABSTRACTO: obliga implementación en hijas
    public abstract void hacerSonido();  // SIN cuerpo!

    // getters/setters...
    public String getNombre() { return nombre; }
}
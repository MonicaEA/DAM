package Ejercicio5;

public abstract class Empleado {
    private String nombre;
    private int salarioBase;
    private String puesto;

    public Empleado(String nombre, int salarioBase, String puesto) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.puesto= puesto;
    }

    public void mostrarDatos(){
        System.out.println("Nombre: "+ getNombre());
        System.out.println("Puesto : " + getPuesto());
        System.out.println("Salario Base: "+ getSalarioBase());

    }

    public Empleado() {
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(int salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
}

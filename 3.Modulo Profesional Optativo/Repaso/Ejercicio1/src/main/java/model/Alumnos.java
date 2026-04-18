package model;

public class Alumnos {

    private String nombre;
    private String apellido;
    private double notaExamen1;
    private double notaExamen2;
    private double notaExamen3;
    private double notaPracticas;

    public Alumnos() {
    }

    public Alumnos(String nombre, String apellido, double notaExamen1, double notaExamen2, double notaExamen3, double notaPracticas) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.notaExamen1 = notaExamen1;
        this.notaExamen2 = notaExamen2;
        this.notaExamen3 = notaExamen3;
        this.notaPracticas = notaPracticas;
    }

    public double calcularNotaFinal() {
        // 1. Calculamos la media de los tres exámenes
        double mediaExamenes = (notaExamen1 + notaExamen2 + notaExamen3) / 3;

        // 2. Aplicamos los pesos (80% exámenes y 20% prácticas)
        return (mediaExamenes * 0.8) + (this.notaPracticas * 0.2);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getNotaExamen1() {
        return notaExamen1;
    }

    public void setNotaExamen1(double notaExamen1) {
        this.notaExamen1 = notaExamen1;
    }

    public double getNotaExamen2() {
        return notaExamen2;
    }

    public void setNotaExamen2(double notaExamen2) {
        this.notaExamen2 = notaExamen2;
    }

    public double getNotaExamen3() {
        return notaExamen3;
    }

    public void setNotaExamen3(double notaExamen3) {
        this.notaExamen3 = notaExamen3;
    }

    public double getNotaPracticas() {
        return notaPracticas;
    }

    public void setNotaPracticas(double notaPracticas) {
        this.notaPracticas = notaPracticas;
    }
}

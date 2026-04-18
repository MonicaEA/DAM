package model;

import java.util.ArrayList;

public class Estudiantes {

    private String nombre;
    private String apellidos;
    private int edad;
    private double notaMedia;
    private ArrayList<String> asignaturasAprobadas;
    private int horasEstudioSemanales;


    public Estudiantes() {
    }

    public Estudiantes(String nombre, String apellidos, int edad, double notaMedia, ArrayList<String> asignaturasAprobadas, int horasEstudioSemanales) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.notaMedia = notaMedia;
        this.asignaturasAprobadas = asignaturasAprobadas;
        this.horasEstudioSemanales = horasEstudioSemanales;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    public ArrayList<String> getAsignaturasAprobadas() {
        return asignaturasAprobadas;
    }

    public void setAsignaturasAprobadas(ArrayList<String> asignaturasAprobadas) {
        this.asignaturasAprobadas = asignaturasAprobadas;
    }

    public int getHorasEstudioSemanales() {
        return horasEstudioSemanales;
    }

    public void setHorasEstudioSemanales(int horasEstudioSemanales) {
        this.horasEstudioSemanales = horasEstudioSemanales;
    }
}

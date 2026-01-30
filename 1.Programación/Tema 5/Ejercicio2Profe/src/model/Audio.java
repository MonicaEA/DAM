package model;

import java.sql.SQLOutput;

public class Audio extends Multimedia{
    private int duracion;
    private String soporte;


    public Audio() {
    }

    @Override
    public void mostrarDatos() {
        System.out.println("AUDIO");
        super.mostrarDatos();
    }

    public Audio(int identificador, String titulo, String autor, int tamaño, String formato, int duracion, String soporte) {
        super(identificador, titulo, autor, tamaño, formato);
        this.duracion = duracion;
        this.soporte = soporte;
    }



    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getSoporte() {
        return soporte;
    }

    public void setSoporte(String soporte) {
        this.soporte = soporte;
    }
}

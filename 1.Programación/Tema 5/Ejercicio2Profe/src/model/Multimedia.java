package model;

public abstract class Multimedia {
    private int identificador;
    private String titulo;
    private String autor;
    private int tamaño;
    private String formato;


    public Multimedia() {
    }

    public Multimedia(int identificador, String titulo, String autor, int tamaño, String formato) {
        this.identificador = identificador;
        this.titulo = titulo;
        this.autor = autor;
        this.tamaño = tamaño;
        this.formato = formato;
    }


    public void mostrarDatos(){
        System.out.println("Identificador: "+identificador);
        System.out.println("Titulo: "+ titulo);
        System.out.println("Autor: "+autor);
        System.out.println("Tamaño: "+ tamaño);
        System.out.println("Formato: "+ formato);

    }



    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
}

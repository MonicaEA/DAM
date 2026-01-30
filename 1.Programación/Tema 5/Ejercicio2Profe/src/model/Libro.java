package model;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Libro extends Multimedia{

    private String isbn;
    private int nPaginas;


    public Libro() {
    }

    public Libro(int identificador, String titulo, String autor, int tamaño, String formato, String isbn, int nPaginas) {
        super(identificador, titulo, autor, tamaño, formato);
        this.isbn = isbn;
        this.nPaginas = nPaginas;
    }


    @Override
    public void mostrarDatos() {
        System.out.println("LIBRO");
        super.mostrarDatos();
        System.out.println("ISBN: "+isbn);
        System.out.println("Número de páginas: "+nPaginas);
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getnPaginas() {
        return nPaginas;
    }

    public void setnPaginas(int nPaginas) {
        this.nPaginas = nPaginas;
    }
}


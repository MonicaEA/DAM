package model;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Libro> listaLibros;
    public Biblioteca() {
        this.listaLibros = new ArrayList<>();
    }
    public Biblioteca(List<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public List<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(List<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    @Override
    public String toString() {
        return "Biblioteca{" + "listaLibros=" + listaLibros + '}';
    }
}
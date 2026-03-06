package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)


public class Libro {

    @XmlAnyAttribute
    private int anio;
    @XmlAnyAttribute
    private int isbn;
    @XmlAnyAttribute
    private int nPaginas;

    private String titulo;
    private String categoria;
    private String escritor;

    @XmlElement(name= "personaje")
    private List<Libro> personajes;


    public Libro() {
        personajes = new ArrayList<>();
    }

    public Libro(int anio, int isbn, int nPaginas, String titulo, String categoria, String escritor) {
        this.anio = anio;
        this.isbn = isbn;
        this.nPaginas = nPaginas;
        this.titulo = titulo;
        this.categoria = categoria;
        this.escritor = escritor;
        this.personajes = new ArrayList<>();
    }
}

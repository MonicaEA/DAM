package controller;

import model.Libreria;
import model.Libro;
import model.Personaje;

public class Gestor {

    public void exportarXML(){
        Libreria libreria = new Libreria();
        Libro libro1 = new Libro(1994,123123,100,"Libro1","Escritor1","CienciaFiccion");
            libro1.getPersonajes().add(new Personaje("p1libro1","Principal",true));
        Libro libro2 = new Libro(1995,1231232,150,"Libro2","Escritor2","Ciencias");
        Libro libro3 = new Libro(200,123123,90,"Libro3","Escritor3","Miedo");



    }
}
 
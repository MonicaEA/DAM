package controller;

import model.Libro;
import model.Multimedia;
import model.Video;

import java.util.ArrayList;

public class Gestor {
    private ArrayList<Multimedia> listaGeneral;


    public Gestor() {
        this.listaGeneral = new ArrayList<>();
    }

    private boolean existeId(int id ){
        boolean existe = false;

        for (Multimedia item : listaGeneral){
            if (item.getIdentificador()==id){
                System.out.println("El ID ya existe");
                return true;
            }

        } return false;
    }

    public void anadirAlaColeccion(Multimedia multimedia) {
        if (existeId(multimedia.getIdentificador())){
            System.out.println("No se puede añadir , el artículo ya existe");

        } else {
            listaGeneral.add(multimedia);
            System.out.println("Añadido correctamente a la colección");
        }



        }

     public void eliminarDeLaColeccion(int id){
        boolean encontrado = false;

        for (int i = 0; i < listaGeneral.size(); i++) {
             if (id == listaGeneral.get(i).getIdentificador()){

                 listaGeneral.remove(i);
                 System.out.println("El artículo ha sido borrado");
                 encontrado= true;
                 break;
             }

             }
            if (!encontrado){

                System.out.println("Artículo no esta en inventario. No se puede borrar.");

            }


         }

    public void buscarAutor(String autor) {
        for (int i = 0; i < listaGeneral.size(); i++) {

            if (autor.equals(listaGeneral.get(i).getAutor())) {
              listaGeneral.get(i).mostrarDatos();
            }else {
                System.out.println("Autor no encontrado");
            }
        }
    }


    public void buscarDirector(String director) {
        for (int i = 0; i < listaGeneral.size(); i++) {
            Multimedia item = listaGeneral.get(i);
            if (item instanceof Video) {
                Video video = (Video) item;
                if (director.equals(video.getDirector())) {
                    video.mostrarDatos();
                }
            }
        }
    }

    public void buscarActor(String actor) {
        for (int i = 0; i < listaGeneral.size(); i++) {
            Multimedia item = listaGeneral.get(i);
            if (item instanceof Video) {
                Video video = (Video) item;
                if (actor.equals(video.getActores())) {
                    video.mostrarDatos();
                }
            }
        }
    }


    public void listarColeccion(){

          listaGeneral.forEach(Multimedia::mostrarDatos);


         }

         }




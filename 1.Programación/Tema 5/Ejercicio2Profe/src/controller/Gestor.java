package controller;

import model.Libro;
import model.Multimedia;

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


         public void listarColeccion(){

          listaGeneral.forEach(Multimedia::mostrarDatos);


         }

         }




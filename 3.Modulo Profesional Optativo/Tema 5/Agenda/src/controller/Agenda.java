package controller;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Agenda {
    // dentro de una clase nos vamos a encontrar los atributos
    //atríbutos -> cualificar, son las características
    // estructura : nombre , apellido , correo, teléfono , dni
    private ArrayList<Object[]> listaContactos; // aqui se guardan los objetos de la estructura

    public Agenda() {
        listaContactos = new ArrayList<>();

    }

    // metodos -> son funciones que quiero que el objeto de la clase que quiero que el objeto pueda ejecutar
    // añadir , borrar , buscar y listar
    public void agregarContacto(Object[] contacto) {
        listaContactos.add(contacto);
        System.out.println("Contacto agregado correctamente.");
    }

    public void borrarContacto(String dni) {

        boolean borrado = listaContactos.removeIf(new Predicate<Object[]>() {
            @Override
            public boolean test(Object[] objects) {


                return objects[4].equals(dni);
            }
        });
        if (borrado) {
            System.out.println("Contacto borrado correctamente");
        } else {
            System.out.println("Contacto no encontrado.");
        }
    }
    /*for (Object[] item : listaContactos){


            if (item[3].equals(dni)){
                listaContactos.remove(item);
                return; // importante para que cuando lo encuentre no haga mas vueltas.

            }
        }
        System.out.println("No encontrado.");*/



    public void buscarContacto(String dni) {
        for (Object[] item : listaContactos) {

            if (item[3].equals(dni)) {
                System.out.println("Contacto encontrado");
                System.out.println("Nombre: " + item[0]);
                System.out.println("Apellido: " + item[1]);
                System.out.println("Correo: " + item[2]);
                System.out.println("DNI: " + item[3]);
                System.out.println("Teléfono: " + item[4]);
                return; // importante para que cuando lo encuentre no haga mas vueltas.

            }
        }
        System.out.println("No encontrado.");


    }

    public void listarContactos() {
        for (Object[] item : listaContactos) {
            System.out.println("Contacto encontrado");
            System.out.println("Nombre: " + item[0]);
            System.out.println("Apellido: " + item[1]);
            System.out.println("Correo: " + item[2]);
            System.out.println("DNI: " + item[3]);
            System.out.println("Teléfono: " + item[4]);


        }

    }
            public ArrayList<Object[]> getListaContactos () {
                return listaContactos;
            }

            public void setListaContactos (ArrayList < Object[]>listaContactos){
                this.listaContactos = listaContactos;
            }


        }


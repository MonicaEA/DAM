package controller;

import model.Persona;

import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class Agenda {

    private HashMap<String, Persona> listaContactos;

    public Agenda(){
        listaContactos = new HashMap<>();

    }

    public void agregarPersona(Persona persona){
        // cuando el DNI de la persona no esta en la lista la agregas.
        // para comprobar esto con un Array tengo que recorrer con un for each y pregunto y luego retorno.
        // con un hashmap es:

        if (listaContactos.containsKey(persona.getDni())){

            System.out.println("No se puede agregar, dni duplicado");


        }else {
            listaContactos.put(persona.getDni(), persona);
        }


    }

    public void borrarPersona(String dni){

        if (listaContactos.containsKey(dni)){
            listaContactos.remove(dni);
            System.out.println("Borrado correctamente");

        } else {
            System.out.println("El dni no se encuentra en la lista, no se puede borrar.");

        }


    }

    public Persona obtenerPersona(String dni){
        return listaContactos.get(dni);

    }

    public void obtenerPersonas(){
        // lo puedo hacer a traves de las keys o a traves de los values.

        // con keys
        System.out.println("Mostrando con keys");
        Set<String> keys = listaContactos.keySet();
        for (String key: keys){
            listaContactos.get(key).mostrasDatos();
        }
        //values
        System.out.println("Mostrando con values");
        Collections<Persona> values = listaContactos.values();
        for (Persona item : values){
            item.mostrasDatos();
        }


    }





}

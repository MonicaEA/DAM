package controller;

import java.util.HashMap;

// Agenda: nombre -> teléfono
public class Agenda {

    private HashMap<String, String> listaContactos;

    public Agenda() {
        listaContactos = new HashMap<>();
    }

    // 2) agregarContacto(nombre, telefono) -> añade o actualiza
    public void agregarContacto(String nombre, String telefono) {
        listaContactos.put(nombre, telefono);
    }

    // 3) buscarContacto(nombre) -> devuelve teléfono o mensaje
    public String buscarContacto(String nombre) {
        String telefono = listaContactos.get(nombre); // null si no existe

        if (telefono == null) {
            return "El contacto \"" + nombre + "\" no existe en la agenda.";
        } else {
            return telefono;
        }
    }

    // 4) eliminarContacto(nombre) -> true si se elimina, false si no existe
    public boolean eliminarContacto(String nombre) {
        String eliminado = listaContactos.remove(nombre); // valor eliminado o null
        return eliminado != null;
    }

    // 5) listarContactos() -> muestra todos por consola
    public void listarContactos() {
        for (String nombre : listaContactos.keySet()) {
            String telefono = listaContactos.get(nombre);
            System.out.println("Nombre: " + nombre + " - Teléfono: " + telefono);
        }
    }

    // 6) contarContactos() -> número total
    public int contarContactos() {
        return listaContactos.size();
    }

    // 7) existeContacto(nombre) -> true/false
    public boolean existeContacto(String nombre) {
        return listaContactos.containsKey(nombre);
    }
}


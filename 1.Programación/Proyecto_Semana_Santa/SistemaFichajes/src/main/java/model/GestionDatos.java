package model;


import java.util.ArrayList;

public class GestionDatos {
    // La lista vive aquí y es accesible desde cualquier parte

    private static ArrayList<Usuario> listaUsuarios = new ArrayList<>();

    // Un método para llenar la lista con ejemplos al empezar
    public static void inicializar() {
        listaUsuarios.add(new Administrador("Borja", "Martin", "1", "admin@test.com","12345"));
        listaUsuarios.add(new Trabajador("Ana", "García", "2", "ana@test.com","4321"));
    }

    public static ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public static void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        GestionDatos.listaUsuarios = listaUsuarios;
    }
}
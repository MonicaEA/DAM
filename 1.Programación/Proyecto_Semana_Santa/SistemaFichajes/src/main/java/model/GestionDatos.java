package model;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GestionDatos {
    // lista usuarios y fichajes
    private static List<Usuario> listaUsuarios = new ArrayList<>();
    private static List<String> listaFichajes = new ArrayList<>();

    // meto un par de ejemplos para arrancar con datos
    public static void inicializar() {
        if (listaUsuarios.isEmpty()) {
            listaUsuarios.add(new Administrador("Borja", "Martin", "1", "admin@test.com", "12345"));
            listaUsuarios.add(new Trabajador("Ana", "García", "2", "ana@test.com", "4321"));
        }
    }

    public static void registrarFichaje(String mensaje){
        listaFichajes.add(mensaje);
        guardarEnFichero(mensaje);
    }

    private static void guardarEnFichero(String linea) {
    try(BufferedWriter writter = new BufferedWriter(new FileWriter("fichajes.txt",true))){
        writter.write(linea);
        writter.newLine();

    } catch (IOException e) {
        System.out.println("Error al escribir en el fichero " + e.getMessage());
    }

    }

    public static List<String> leerFichajes(){
        List<String> registros = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader("fichajes.txt"))){
            String linea;
            while((linea = reader.readLine()) != null){
                registros.add(linea);
            }
        } catch (IOException e) {
            System.out.println("No se pudo leer el archivo de fichajes "+e.getMessage());
        }
        return registros;
    }

    public static List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }


}
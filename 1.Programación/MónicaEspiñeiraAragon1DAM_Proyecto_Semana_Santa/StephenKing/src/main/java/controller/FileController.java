package controller;

import model.Libro;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileController {

    String nombreFichero = "ficheros/favoritos.obj";

    public void exportarFavoritos(List<Libro> lista) {
        FileWriter fileWriter = null;
        PrintWriter printWriter = null;

        try {

            fileWriter = new FileWriter(nombreFichero, false);
            printWriter = new PrintWriter(fileWriter);

            // Recorremos la lista y guardamos los datos.
            for (Libro libro : lista) {
                printWriter.println(libro.getId() + "|" + libro.getTitle() + "|" + libro.getYear() + "|" + libro.getPages());
            }

            System.out.println("Archivo guardado.");

        } catch (Exception e) {
            System.out.println("No se ha podido guardar el archivo");
        } finally {

            try {
                if (printWriter != null) printWriter.close();
                if (fileWriter != null) fileWriter.close();
            } catch (Exception e) {
                System.out.println("Error al cerrar el fichero");
            }
        }
    }


    public List<Libro> importarFavoritos() {
        List<Libro> listaFavoritos = new ArrayList<>();
        File archivo = new File(nombreFichero);

        // Si el archivo no existe devolvemos la lista vacía
        if (!archivo.exists()) {
            return listaFavoritos;
        }

        try {
            FileReader fileReader = new FileReader(archivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String linea = "";

            // Leemos el archivo línea por línea
            while ((linea = bufferedReader.readLine()) != null) {
                String[] datos = linea.split("\\|");
                // Si la línea tiene los 4 campos, creamos el libro y lo metemos en la lista, lo paso a Integer
                if (datos.length == 4) {
                    Libro libro = new Libro();
                    libro.setId(Integer.parseInt(datos[0]));
                    libro.setTitle(datos[1]);
                    libro.setYear(Integer.parseInt(datos[2]));
                    libro.setPages(Integer.parseInt(datos[3]));

                    listaFavoritos.add(libro);
                }
            }

            bufferedReader.close();
            fileReader.close();

        } catch (Exception e) {
            System.out.println("Error al leer los favoritos");
        }

        return listaFavoritos;
    }
}
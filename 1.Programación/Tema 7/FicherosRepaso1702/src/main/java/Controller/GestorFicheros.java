package Controller;

import java.io.*;
import java.util.Scanner;

public class GestorFicheros {

    public void crearFichero(String path) {
        File file = new File(path);
        try {
            file.createNewFile();


        } catch (IOException e) {
            System.out.println("Error en la creación del fichero");
        }

    }

    public void crearCarpeta(String path) {
        File file = new File(path);
        file.mkdir();


    }

    public void lectorFichero(String path) {
        File file = new File(path);
        FileReader reader = null;
        int codigo;

        try {
            reader = new FileReader(file);
            while ((codigo = reader.read()) != -1) { // Comparamos con -1
                System.out.print((char) codigo);
            }
        } catch (FileNotFoundException e) {
            System.out.println("El fichero no existe en la ruta especificada.");
        } catch (IOException e) { // Añadimos este catch por si falla la lectura a mitad
            System.out.println("Error durante la lectura del fichero.");
        } finally {
            try {
                if (reader != null) reader.close();
            } catch (IOException e) {
                System.out.println("Error al cerrar el lector.");
            }
        }
    }

    public void lectorLineas(String path) {
        File file = new File(path);
        BufferedReader bufferedReader = null;

        try {
            // src/main/java/recursos/lectura.txt
            bufferedReader = new BufferedReader(new FileReader(file));
            String linea = null;
            while ((linea = bufferedReader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            System.out.println("el fichero no existe");
            // lectorFichero("asdasd");
        } catch (IOException e) {
            System.out.println("Error en la lectura");
            // ponte en contacto con el admin de la empresa
        } finally {
            try {
                bufferedReader.close();
            } catch (Exception e) {
                System.out.println("Error en el cerrado");
            }
        }
    }

    public void escribirCaracteres(String path) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Que mensaje quieres guardar");
        String mensaje = scanner.nextLine();
        File file = new File(path);
        FileWriter writer = null;

        try {
            writer = new FileWriter(file,true);
            for (int i = 0; i < mensaje.length(); i++) {
                char letra = mensaje.charAt(i);
                writer.write((int)letra);
            }

        } catch (IOException e) {
            System.out.println("Error en la escritura");
        } finally {
            try {
                writer.close();

            } catch (IOException e) {
                System.out.println("Error en el cerrado");
            }


        }


    }

    public void escribirLineas(String path){
        File file = new File(path);

        PrintWriter printWriter = null;
        try{
            printWriter = new PrintWriter(new FileWriter(file));
            printWriter.println(" esta linea es un ejemplo de la nueva forma de escribir");
            printWriter.println(" y probamos probamosss");
        } catch (IOException e) {
            System.out.println("Error en la escritura");
        } finally {
            try{
                printWriter.close();
            } catch (Exception e) {
                System.out.println("Error en el cerrado");
            }
        }

    }


}





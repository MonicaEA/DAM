import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Date;
import java.util.Scanner;

public class OperacionesNotion {

    public void leerArchivo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la ruta del archivo: ");
        String ruta = scanner.nextLine();

        File file = new File(ruta);

        try{
            Scanner lector = new Scanner(file);
            System.out.println("\nContenido del archivo:");
            while(lector.hasNextLine()){
                System.out.println(lector.nextLine());
            }
            lector.close();
        } catch (FileNotFoundException e){
            System.out.println("No se encontro el archivo");

        }





    }

    public void buscarPalabra(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la ruta");
        String ruta = scanner.next();

        System.out.println("Palabra a buscar:");
        String palabra = scanner.next();

        int contador = 0;
        File file = new File(ruta);
        try{
            Scanner lector = new Scanner(file);
            while(lector.hasNext()){
                String palabraActual = lector.next();
                if (palabraActual.equalsIgnoreCase(palabra)){
                    contador++;
                }
            }
            System.out.println("\nLa palabra " + palabra + " aparece " + contador + " veces");
            lector.close();

        }catch(FileNotFoundException e){
            System.out.println("Error no se puede encontrar el archivo");
        }





    }

    public void copiarUnArchivo(){

    Scanner scanner = new Scanner(System.in);
        System.out.println("Indica la ruta del archivo: ");
        String rutaOrigen = scanner.next();

        System.out.println("Indica la ruta de destino: ");
        String rutaDestino = scanner.next();

        try{
           Path origenPath = Path.of(rutaOrigen);
           Path destinoPath = Path.of(rutaDestino);

            Files.copy(origenPath,destinoPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Archivo copiado correctamente");

    } catch (Exception e) {
            System.out.println("Error al copiar: "+ e.getMessage());
        }





}

    public void obtenerInformacion(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la ruta del archivo: ");
        String ruta = scanner.nextLine();

        File archivo = new File(ruta);
        if (archivo.exists()){
            System.out.println("Tamaño: "+ archivo.length());
            System.out.println("Última modificación: "+ archivo.lastModified());
            System.out.println("Permisos: Lectura "+archivo.canRead()+ " Escritura: "+archivo.canWrite()+ " Ejecución: "+archivo.canExecute());
            System.out.println("Archivo oculto: "+ archivo.isHidden());
            System.out.println("Ruta absoluta: "+ archivo.getAbsolutePath());
        }else {
            System.out.println("El archivo no existe.");
        }



    }

    public void contarLineas(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indica la ruta del archivo: ");
        String ruta = scanner.nextLine();

        File archivo = new File(ruta);

        try{
            Scanner lector = new Scanner(archivo);
            int contador =  0;

            while(lector.hasNextLine()){
                lector.nextLine();
                contador++;
            }
            System.out.println("El archivo contiene " + contador + " líneas.");
        } catch (FileNotFoundException e) {
            System.out.println("Error: el archivo no existe.");
        }




    }

    public void crearArchivoCSV() {
        String nombreArchivo = "estudiantes.csv";

        // Usamos try-with-resources para que el archivo se cierre solo (más "fino")
        try (PrintWriter escritor = new PrintWriter(nombreArchivo)) {

            escritor.println("Nombre,Edad,Calificación");
            escritor.println("Ana,20,9.5");
            escritor.println("Juan,25,7.0");
            // Cambiamos print por println para no romper el formato de la última fila
            escritor.println("Pepe,32,5.5");

            System.out.println("Archivo creado correctamente.");

        } catch (FileNotFoundException e) {
            // Somos específicos con la excepción: el archivo no se pudo crear/abrir
            System.out.println("Error: No se pudo crear el archivo. Verifique los permisos.");
        }
    }

    public void exploracionBasica(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indica la ruta a explorar");
        String ruta = scanner.nextLine();

        File file = new File(ruta);

            if (file.isDirectory()) {
                File[] lista = file.listFiles();
                for (File item : lista) {
                    Date fecha = new Date(item.lastModified());
                    if (item.isDirectory()) {
                        System.out.println("Directorio: " + item.getName() + " " + item.length() + " " + fecha);
                    }

                 else{
                    System.out.println("Archivo: " + item.getName() + " " + item.length() + " " + fecha);


                }
            }

            }else {
                System.out.println("No es un directorio.");
            }

        }

    }



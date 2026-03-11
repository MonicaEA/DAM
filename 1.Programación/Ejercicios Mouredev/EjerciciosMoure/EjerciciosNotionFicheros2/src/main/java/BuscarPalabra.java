import java.io.*;
import java.util.Scanner;

public class BuscarPalabra {
    //Escribe un programa que busque cuántas veces aparece una palabra específica en un archivo de texto. El usuario debe introducir la ruta del archivo y la palabra a buscar.

   public void buscarPalabra(String path){
       Scanner scanner = new Scanner(System.in);
       File file = new File(path);

       System.out.println("Que palabra quieres buscar??");
       String palabra = scanner.next();
       int contador = 0;

       try {
           FileReader fileReader = new FileReader(file);
           BufferedReader buffered = new BufferedReader(fileReader);
           String linea;
           while ((linea = buffered.readLine()) != null) {
               //Dividimos la linea en palabras
               String[] palabrasEnLinea = linea.split(" ");

               for (String p : palabrasEnLinea) {
                   if (p.equals(palabra)) {
                       contador++;
                   }


               }

           }
           System.out.println("La palabra "+palabra + " aparece "+contador+ " veces.");


       } catch (FileNotFoundException e) {
               System.out.println("El fichero no existe.");

           } catch (IOException e) {
           System.out.println("La El fichero no existe.");
       }


   }


}

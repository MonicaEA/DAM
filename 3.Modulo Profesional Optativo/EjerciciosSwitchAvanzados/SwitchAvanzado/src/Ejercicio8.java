public class Ejercicio8 {

/*Objetivo: Crear un programa que identifique el tipo de archivo según su extensión.

 **Requisitos:**

 1. Declara una variable `String extension` (por ejemplo: "jpg", "pdf", "txt", "mp3").
 2. Usa un `switch` para agrupar extensiones similares: Imágenes (jpg, png, gif),
 Documentos (pdf, doc, txt), Audio (mp3, wav), Video (mp4, avi).
 3. Muestra el tipo de archivo y el programa recomendado para abrirlo.   */


public void tipoArchivo(){

    String extension = "jpg";

    switch (extension.toLowerCase()){

        case "jpg","png","gif" -> {
            System.out.println("Tipo de archivo : Imagen");
            System.out.println("Has seleccionado "+extension);
            System.out.println("Programa recomendado VISOR DE ARCHIVOS");
        }
        case "pdf","doc","txt" -> {
            System.out.println("Tipo de archivo : Documentos");
            System.out.println("Has seleccionado "+extension);
            System.out.println("Programa recomendado WORD");


        }
        case "mp3","wav","mp4" -> {
            System.out.println("Tipo de archivo : Audio y Video");
            System.out.println("Has seleccionado "+extension);
            System.out.println("Programa recomendado WINAMP");



        }


    }




}



}

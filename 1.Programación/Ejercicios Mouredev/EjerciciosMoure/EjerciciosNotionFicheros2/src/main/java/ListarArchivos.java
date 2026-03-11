import java.io.File;
import java.util.Scanner;

public class ListarArchivos {

    public void ListarArchivos() {
    Scanner scanner  = new Scanner(System.in);

    //1. pedir ruta.
        System.out.println("Introduce la ruta que quieres: ");
        String path = scanner.nextLine();

        File file = new File(path);

     //2. comprobar si la ruta existe.

        if(file.exists() && file.isDirectory()){
            System.out.println("Archivos en el directorio " + file + " : " );

            //Creamos la lista

            File [] listaArchivos = file.listFiles();

            if (listaArchivos!=null){
                int contador = 1;

                for (File archivo : listaArchivos){

                    if (archivo.isFile()){
                        System.out.println(contador + ". " + archivo.getName());

                    }

                    scanner.close();

                }



            }



            }


        }

    }


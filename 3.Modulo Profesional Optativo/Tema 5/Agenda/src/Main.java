import java.util.ArrayList;
import java.util.Objects;
import java.util.function.Predicate;

public class Main {
    // ejercicio para acabar nosotros. Agenda de contactos-> Estrucctura de datos en ArrayList<>
    // necesito poder guardar tantos contactos como necesite
    // cada contacto tiene unos datos fijos -> nombre , apellido , dni y teléfono -> Object[]
    // Object[]{"Borja","Martin","12324a",622016513}
    //ArrayList<Object[]> -> [{"b","N","1234a",1234}] - esto es lo que guardo en cada hueco del ArrayList
    // lista.get(0) ->Object[][0]-> "b"
    //ArrayList<Object> -> [{}]

    static ArrayList<Object[]> listaContactos = new ArrayList<>();

    public static void main(String[] args) {

        listaContactos.add(new Object[]{"Borja", "Martin", "1234A", 1234});
        listaContactos.add(new Object[]{"María", "Gómez", "4321A", 66666});
        listaContactos.add(new Object[]{"Juan", "Martinez", "6621A", 77666});

        System.out.println("Vamos a sacar solo el nombre del último contacto" );
        listaContactos.add(new Object[]{"Marta", "Aragón", "7721A", 88666});
        listaContactos.removeIf(new Predicate<Object[]>() {
            @Override
            public boolean test(Object[] objects) {

            }
        })
        mostrarContactos();
        Object[] contacto = listaContactos.get(listaContactos.size()-1);
        System.out.println(contacto[1]);
        System.out.println("Procedemos ahora a borrar un elemento");
        borrarContacto("1234A");
    }

        public static void mostrarContactos(){
            for (Object[] contacto : listaContactos){
                System.out.println("Imprimiendo datos del contacto");
                System.out.printf("\tNombre: %s Apellido: %s DNI: %s Teléfono: %d%n",contacto[0],contacto[1],contacto[2],(int)contacto[3]);
            }
        }

        public static void borrarContacto(String dni){
        // listaContactos.remove(posicion) -> borra el elemento de dicha posicion
            for (int i = 0; i < listaContactos.size() ; i++) {
                if (listaContactos.get(i)[2].equals(dni)){
                    listaContactos.remove(i);
                    break;


                }

            }



        }


    }











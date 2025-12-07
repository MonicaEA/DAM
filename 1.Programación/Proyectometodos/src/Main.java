import model.Multiplicacion;

public class Main {

    public static void main(String[] args) {

        System.out.println("Proyecto metodos");
        System.out.println("Vamos a realizar llamadas a metodos");
        saludar("Mónica");
        saludar("Manolo");
        despedir();
        Calculadora calculadoramatematica = new Calculadora();
        calculadoramatematica.sumar(20,2);
        calculadoramatematica.restar(137,14);
        Multiplicacion multiplicacion = new Multiplicacion();
        multiplicacion.multiplicacion(40,50);

        

    }


        public static void saludar(String nombre){

            System.out.println("Hola "+nombre);
            System.out.println("Encantada de saludarte vamos a practicar");
            System.out.println("Vamos a practicar el llamado de metodos");
            System.out.println("Ánimo no decaigas en tu tarea");
            System.out.println("probando");
            

        }
public static void despedir(){
    System.out.println("A cerrar el portatil");


}

    }


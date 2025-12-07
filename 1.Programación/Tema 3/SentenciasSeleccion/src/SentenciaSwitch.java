import java.io.PrintStream;
import java.util.Scanner;


public class SentenciaSwitch {

    public void usoSwitch(){

        int valor = 7;
        String nombre = null;

        // quiero evaluar si los elementos sin 1,5,7 o resto
        switch (valor){

            case 1:
                //cuerpo cuando la variable toma valor 1
                nombre = "Borja";
                System.out.println("Toma valor de 1");
                break;
            case 5 :
                // cuerpo cuando la variable toma valor 5
                nombre = "Juan";
                System.out.println("Toma valor de 5");
                break;

            case 7 :
                //cuerpo cuando la variable toma valor 7
                nombre = "María";
                System.out.println("Toma valor de 7");
                break;
            default:
                nombre = "sin nombre";
                System.out.println("Valor no contemplado");



        }



    }

    public void usoSwitchString(){

        String nombre = "Borja";

        switch (nombre){

            case "Borja":
                break;
            case "Maria":
            break;
            case "Juan":
            break;






        }



    }

    public void usoSwitchChar(){
        char letra = 'A';

        switch (letra){

            case 'A':
                break;

            case 'B':
                break;

            case 'a':
                break;

            case 'C':
                break;

            case 'd':
                break;

            case 68:
                break;

            default:
                System.out.println("Letra no contemplada");


        }


    }

    public void usoSwitchLambda(){

        int nota = 7;
        switch (nota){
            // el break se sustituye con la llave
            case 1 -> {
                System.out.println("Contemplado caso 1");
            }
            case 2 -> {
                System.out.println("Contemplado caso 2");
            }
            case 3 -> {
                System.out.println("Contemplado caso 3");
            }
            case 4|5|6|7|8|9 -> {
                System.out.println("Contemplado caso 4");
            }
            default -> {
                System.out.println("Sin contemplar");
            }


        }



    }

    public void menuOpciones(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu operaciones");
        System.out.println("1.Sumar");
        System.out.println("2.Restar");
        System.out.println("3.Multiplicar");
        System.out.println("4.Dividir");
        System.out.println("5.Modulo");
        System.out.println("Que operacion quieres hacer");
        
        int opcion = scanner.nextInt();
        System.out.println("Dime el primer operando");
        int op1 = scanner.nextInt();
        System.out.println("Dime el segundo operando");
        int op2 = scanner.nextInt();
        int resultado = 0;
        
        switch (opcion){
            
            case 1 -> {
                System.out.println("Vas a sumar");
                resultado = op1+op2;
            }  case 2 -> {
                System.out.println("Vas a restar");
                resultado = op1-op2;
            }  case 3 -> {
                System.out.println("Vas a multiplicar");
                resultado = op1*op2;
            }  case 4 -> {
                System.out.println("Vas a dividir");
                resultado = op1/op2;
            }  case 5 -> {
                System.out.println("Vas a modulo");
                resultado = op1%op2;
            }


        }
        System.out.println("El resultado es: "+resultado);
     


    }

    


}

import java.util.Scanner;


public class EjercicioFor2 {
    /*Desarrolla un programa que pida una letra de calificación (A, B, C, D, F) y use un switch para mostrar el mensaje
    correspondiente: A="Excelente", B="Muy bien", C="Bien", D="Suficiente", F="Insuficiente".
     */

Scanner scanner = new Scanner(System.in);

    public void ejercicioFor2 (){

        System.out.println("Introduce la letra de tu calificación : (A,B,C,D,F)");

        String nota = scanner.next();
        String notaFinal = nota;

        switch (nota){

            case "A":
                notaFinal = "Excelente";
                break;
            case "B":
                notaFinal = "Muy Bien";
                break;
            case "C":
                notaFinal = "Bien";
                break;
            case "D":
                notaFinal = "Suficiente";
                break;
            case "F":
                notaFinal = "Insuficiente";
                break;
            default:
                notaFinal = "Introduzca un valor válido";

        }

        int num = 1;
        int num2= 2;
        String letra = "letras";
        double decimal = 2.2;

        System.out.printf("\nCalificación:%s Tu nota es:%s",nota,notaFinal)
        System.out.printf("los numeros son %d y %d . La palabra es %s y el numero decimal es %f "num,num2,letra,decimal);
                //%s letras %d %f

        scanner.close();

    }


}

import java.util.Scanner;


public class Entrada {

    public static void main(String[] args) {

        System.out.println("Iniciando programa de operadores");
        Operadores operadores = new Operadores();
        //operadores.operadoresAritmeticos();
        //operadores.operadoresAsignacion();
        //operadores.operadoresComparacion();
        //operadores.operadoresLogicos();
        Scanner lectorTeclado = new Scanner(System.in);
        operadores.evaluarCandidato();
        System.out.print("¿Qué salario quieres ganar?: ");
        int sueldo = lectorTeclado.nextInt();

        System.out.print("¿Qué edad tienes?: ");
        int edad = lectorTeclado.nextInt();

        System.out.print("¿Tienes coche? (true/false): ");
        boolean conducir = lectorTeclado.nextBoolean();

        operadores.evaluarCandidato();

        lectorTeclado.close();
    }
}




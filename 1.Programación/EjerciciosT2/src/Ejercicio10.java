import java.util.Scanner;

public class Ejercicio10 {
    Scanner scanner = new Scanner(System.in);

    /*Crea un programa que pida el salario base por hora, las horas trabajadas y si ha hecho horas extra (true/false).
    Si ha hecho horas extra y trabajó más de 40 horas, las horas que excedan de 40 se pagan al doble. Usa operadores
    lógicos, relacionales y aritméticos para calcular el salario total.
Ejemplo de salida por consola:
Introduce el salario por hora: 10
Introduce las horas trabajadas: 45
¿Has hecho horas extra? (true/false): true
Horas normales (máximo 40): 40
Horas extra: 5
¿Trabajaste más de 40 horas?: true
¿Tienes derecho a horas extra?: true
¿Se aplican horas extra? (>40 AND permitido): true
Salario por horas normales: 400.0€
Salario por horas extra (al doble): 100.0€
Salario total: 500.0€*/
    public void ejercicio10() {


        System.out.print("Introduce el salario por hora: ");
        int salarioBaseHora = scanner.nextInt();
        System.out.println("Indica horas trabajadas: ");
        int horasTrabajadas = scanner.nextInt();
        System.out.println("Has realizado horas extras?: ");
        boolean horasExtras = scanner.nextBoolean();


        int horasExtrasTotal =  horasTrabajadas - 40;
        int salarioBase = 40*salarioBaseHora;
        int salarioBaseExtra = horasExtrasTotal*salarioBaseHora*2;
        int salarioTotal = salarioBase+salarioBaseExtra;






    }
}



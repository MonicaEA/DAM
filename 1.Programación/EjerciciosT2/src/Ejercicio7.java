import java.util.Scanner;

public class Ejercicio7 {
Scanner scanner = new Scanner(System.in);
    /*Crea un programa que pida al usuario su edad y si es estudiante (true/false).
Usa operadores lógicos (AND, OR, NOT) para determinar si puede acceder a diferentes descuentos: descuento
joven (menor de 26 años), descuento estudiante, o descuento especial (menor de 26 Y estudiante).
Ejemplo de salida por consola:
Introduce tu edad: 24
¿Eres estudiante? (true/false): true
¿Eres menor de 26 años?: true
¿Eres estudiante?: true
¿NO eres estudiante?: false
¿Tienes descuento joven? (menor de 26): true
¿Tienes descuento estudiante?: true
¿Tienes descuento especial? (menor de 26 AND estudiante): true*/

    public  void ejercicio7() {

        //Solicitar la edad
        System.out.print("Introduce tu edad: ");
        int edad = scanner.nextInt();

        //Solicitar si es estudiante
        System.out.print("¿Eres estudiante? (true/false): ");
        boolean esEstudiante = scanner.nextBoolean();

        //Determinar condiciones
        boolean esMenorDe26 = edad < 26;

        //Mostrar las condiciones base
        System.out.println("¿Eres menor de 26 años?: " + esMenorDe26);
        System.out.println("¿Eres estudiante?: " + esEstudiante);


        boolean noEsEstudiante = !esEstudiante;
        System.out.println("¿NO eres estudiante? (NOT): " + noEsEstudiante);

        boolean descuentoJoven = esMenorDe26;

        // Descuento Estudiante (Es estudiante) - Ya determinado en la condición base
        boolean descuentoEstudiante = esEstudiante;

        // Descuento Especial: Menor de 26 Y Estudiante
        boolean descuentoEspecial = esMenorDe26 && esEstudiante;

        // 8. Mostrar los resultados de los descuentos
                System.out.println("¿Tienes descuento joven? (menor de 26): " + descuentoJoven);
        System.out.println("¿Tienes descuento estudiante?: " + descuentoEstudiante);
        System.out.println("¿Tienes descuento especial? (menor de 26 AND estudiante): " + descuentoEspecial);


        scanner.close();




    }


}

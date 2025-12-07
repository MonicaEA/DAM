import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio {
    private Scanner scanner;

/*Hágase una aplicación que permita introducir el número de bebidas y bocadillos
    comprados (valores entre 0 y 20). Además se podrá introducir el precio de cada
    bebida (valor entre 0.00 € y 3.00 €) y de cada bocadillo (valor entre 0.00 € y 5.00
    €). También se podrá introducir el número de alumnos que realizaron la compra
    (valor entre 0 y 10). Se mostrará el total de la compra (con el subtotal de las
    bebidas y de los bocadillos) y la cantidad que debe pagar cada alumno
    redondeada a 2 decimales. (CosteBar) */

    public void ejercicio1() {
        //1. introducir valores
        //2. Guardar en variables
        //3. Realizar calculos
        //4. Mostrar datos
        scanner = new Scanner(System.in);
        System.out.println("¿Cuantos bocatas vais a pedir?");
        int numerobocatas = scanner.nextInt();
        System.out.println("¿Cuantas bebidas vais a pedir");
        int numerobebidas = scanner.nextInt();
        System.out.println("¿Cuanto cuesta cada bocata?");
        double preciobocata = scanner.nextDouble();
        System.out.println("¿Cuanto cuesta cada bebida?");
        double preciobebida = scanner.nextDouble();
        System.out.println("¿Cuantas personas entran en la cuenta?");
        int personas = scanner.nextInt();

        //3 Realizar calculos

        double precioBocatas = numerobocatas * preciobocata;
        double precioBebidas = numerobebidas * preciobebida;
        double costeTotal = precioBocatas + precioBebidas;
        double precioPersona = costeTotal / personas;

        //4 Mostrar datos

        System.out.printf("El precio de los bocatas es %.2f%n", precioBocatas);
        System.out.printf("El precio de las bebidas es %.2f%n", precioBebidas);
        System.out.printf("El precio total es %.2f%n", costeTotal);
        System.out.printf("El precio por persona es %.2f%n", precioPersona);
        scanner.close();
        scanner = null;

    }

    //Hágase un programa que convierta segundos en horas, minutos y segundos.
    public void ejercicio4() {
        scanner = new Scanner(System.in);
        //1.Pedir Datos
        //2.Realizar calculos
        //3.Mostrar datos

        System.out.println("¿Cuantos segundos quieres pasar a tiempo");
        System.out.print("Introduce una cantidad de segundos: ");
        int segundosTotales = scanner.nextInt();

        // 2. Realizar cálculos
        int horas = segundosTotales / 3600;                  // 1 hora = 3600 segundos
        int restoDespuesHoras = segundosTotales % 3600;      // resto de segundos tras quitar las horas
        int minutos = restoDespuesHoras / 60;                // 1 minuto = 60 segundos
        int segundos = restoDespuesHoras % 60;

        // 3. Mostrar datos
        System.out.println("Equivale a: " + horas + " horas, " + minutos + " minutos y " + segundos + " segundos.");

        scanner.close();
    }

    //Haz un programa que lea una cantidad de minutos y los convierta en días, horas y minutos.
    //Por ejemplo, si el usuario introduce 1500, el programa debe indicar cuántos días, horas y minutos son.
    public void ejercicio3() {
        Scanner scanner = new Scanner(System.in);

        //1. Pedir Datos
        System.out.print("Introduce una cantidad de minutos: ");
        int minutosTotales = scanner.nextInt();

        //2. Realizar cálculos
        int dias = minutosTotales / 1440;
        int restoDias = minutosTotales % 1440;
        int horas = restoDias / 60;
        int minutos = restoDias % 60;

        // Aquí haces tus cálculos


        //3. Mostrar datos
        System.out.println("Equivale a " + dias + " días, " + horas + " horas y " + minutos + " minutos.");

    }
//Crea un metodo que pida al usuario una cantidad de segundos y convierta esa cantidad en horas, minutos y segundos restantes.

    public void ejercicio5() {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Introduzca cantidad de segundos ");
        int segundos = scanner.nextInt();

        //realizar calculos
        int horas = segundos/3600;
        int restoHoras = segundos%3600;
        int minutos = restoHoras/60;
        int restoSegundos = restoHoras%60;

        //Mostrar resultado por consola
        System.out.println("Equivale a " + horas + " horas, " + minutos + " minutos y " + restoSegundos + " segundos.");

    }

    /*En una fiesta de cumpleaños hay 8 niños y la madre de la cumpleañera ha comprado 96 caramelos para repartirlos a partes iguales.
    Después, llegan 2 niños más y deciden volver a repartir todos los caramelos de forma equitativa.

    Pregunta:
    ¿Cuántos caramelos recibía cada niño al principio?
    ¿Y cuántos recibe cada uno después de que lleguen los dos nuevos?*/

    public void ejercicio6(){
        Scanner scanner = new Scanner(System.in);

        //1. introducir valores
        int niños = 8;
        int caramelos = 96;
        int nuevosInvitados = 2;


        //2. Guardar en variables
        int reparto = caramelos / niños;
        int totaldeNiños = niños + nuevosInvitados;
        int nuevoReparto = caramelos/totaldeNiños;

        //3. Realizar calculos
        //4. Mostrar datos
        System.out.println("En el primer reparto han recibido "+reparto+" y en el segundo "+nuevoReparto);


    }

}


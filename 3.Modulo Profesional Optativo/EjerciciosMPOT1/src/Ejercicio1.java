import java.util.Scanner;

/*Hágase una aplicación que permita introducir el número de bebidas y bocadillos comprados
 (valores entre 0 y 20). Además se podrá introducir el precio de cada bebida (valor entre 0.00 € y 3.00 €)
 y de cada bocadillo (valor entre 0.00 € y 5.00 €). También se podrá introducir el número de alumnos que realizaron
  la compra (valor entre 0 y 10). Se mostrará el total de la compra (con el subtotal de las bebidas y de los
  bocadillos) y la cantidad que debe pagar cada alumno redondeada a 2 decimales. (CosteBar)

Número de bebidas (entre 0 y 20): 3Número de bocadillos (entre 0 y 20): 5Precio de cada bebida
(entre 0,00 y 3,00): 1,20Precio de cada bocadillo (entre 0,00 y 5,00): 2,05Número de alumnos
 (entre 1 y 10): 5Subtotal bebidas: 3,60 €Subtotal bocadillos: 10,25 €Total de la compra: 13,85 €
 Cantidad por alumno: 2,77 €
*/
public class Ejercicio1 {
Scanner scanner = new Scanner(System.in);

public void ejercicio1(){
    // pedimos datos

    int bebidas,bocadillos,alumnos;
    double precioBebida,precioBocadillo;

    System.out.println("Introduce el número de bebidas ( 0 a 20):");
    bebidas = scanner.nextInt();
    while (bebidas < 0 || bebidas > 20) {
        System.out.println("Número no válido. Introduce un valor entre 0 y 20:");
        bebidas = scanner.nextInt();
    }

    System.out.println("Introduce el número de bocadillos ( 0 a 20):");
    bocadillos = scanner.nextInt();
    while (bocadillos <0 || bocadillos >20){
        System.out.println("Numero no válido. Introduce un valor entre 0 y 20: ");
        bocadillos = scanner.nextInt();

    }

    System.out.println("Introduce el precio de la bebida ( 0 a 3):");
    precioBebida = scanner.nextDouble();
    while (precioBebida < 0 || precioBebida > 3) {
        System.out.println("Número no válido. Introduce un valor entre 0 y 3:");
        precioBebida = scanner.nextDouble();
    }

    System.out.println("Introduce el precio del bocadillo ( 0 a 5):");
    precioBocadillo = scanner.nextDouble();
    while (precioBocadillo <0 || precioBocadillo >5){
        System.out.println("Numero no válido. Introduce un valor entre 0 y 5: ");
        precioBocadillo = scanner.nextDouble();

    }

    System.out.println("Introduce el número de alumnos:");
    alumnos = scanner.nextInt();
    while (alumnos <0 || alumnos >10){
        System.out.println("Número no válido. Introduce un valor entre 0 y 10: ");
        alumnos = scanner.nextInt();

    }

//Calculos

    double subtotalBebidas = bebidas * precioBebida;
    double subtotalBocadillos = bocadillos * precioBocadillo;
    double total = subtotalBocadillos+subtotalBebidas;
    double precioPorAlumno = total / alumnos;


    System.out.printf("Bebidas: %d x %.2f€ = %.2f€%n", bebidas, precioBebida, subtotalBebidas);
    System.out.printf("Bocadillos: %d x %.2f€ = %.2f€%n", bocadillos, precioBocadillo, subtotalBocadillos);
    System.out.println("-------------------------------------");
    System.out.printf("TOTAL COMPRA: %.2f€%n", total);
    System.out.printf("Cada alumno paga: %.2f€%n", precioPorAlumno);





}




}

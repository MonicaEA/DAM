import java.util.Scanner;

public class Rectangulo {

    private int base;
    private int altura;
    public Rectangulo() {

    }

    public void calcularArea(Scanner scanner){
        System.out.println("Introduce la base en centímetros : ");
        base= scanner.nextInt();

        System.out.println("Introduce la altura en centímetros : ");
        altura= scanner.nextInt();
        int area = base * altura;
        System.out.println("El calculo del area es : "+area+ "cm2.");
        System.out.println("Base usada: "+getBase() + " cm.");
        System.out.println("Altura usada: "+getAltura() + " cm.");

    }

    public void calcularPerimetro(){
        System.out.println("+++++++  PERÍMETRO  +++++++");
        System.out.println("El calculo del perímetro de este rectangulo es........");
        int perimetro = 2*(base*altura);
        System.out.println(perimetro + " CM.");


    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

}

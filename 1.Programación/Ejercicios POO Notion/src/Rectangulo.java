import java.util.Scanner;

public class Rectangulo {
    /*Crea una clase Rectangulo con atributos base y altura.
     Añade métodos calcularArea() y calcularPerimetro() que devuelvan el área y el perímetro respectivamente.
     Crea un objeto y muestra los resultados.
     */

    private int base;
    private int altura;
    private int area;
    private int perimetro;

    public Rectangulo(int base,int altura){
        this.base = base;
        this.altura = altura;

    }


    public int calcularArea(){

        area = base*altura;
        return area;

    }

    public  int calcularPerimetro(){

        perimetro = 2*(base+altura);

        return perimetro;
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

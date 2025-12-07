import java.util.Scanner;

public class Ejercicio4 {
/*Simular un sistema de pedidos de restaurante con diferentes categorías.

 **Requisitos:**

 1. Crea un enum `CategoriaPlato` con: `ENTRADA`, `PRINCIPAL`, `POSTRE`, `BEBIDA`.
 2. Declara una variable del tipo enum.
 3. Usa un `switch` para mostrar 3 opciones disponibles de cada categoría.
 4. Agrupa categorías similares si es apropiado.*/

Scanner scanner = new Scanner(System.in);
public enum CategoriaPlato{
    ENTRADA,PRINCIPAL,POSTRE,BEBIDA
}

public void pedidoRestaurante(){
    System.out.println("Elige una categoria: ENTRADA,PRINCIPAL,POSTRE,BEBIDA");
    String opcionElegida = scanner.next().toUpperCase();

    CategoriaPlato categoriaPlato = CategoriaPlato.valueOf(opcionElegida);

    String opciones = switch (categoriaPlato){
        case ENTRADA -> "Ensalada,Sopa,Gazpacho";
        case PRINCIPAL -> "Carne,Pescado,Pasta";
        case POSTRE -> "Tiramisú,Natillas,Fruta";
        case BEBIDA -> "Refresco,Agua,Vino";


    };
    String tipo = switch (categoriaPlato){
        case ENTRADA,PRINCIPAL -> "Opciones comida";
        case BEBIDA,POSTRE -> "Opciones secundarias";


    };
    System.out.println("Has elegido la categoría: "+categoriaPlato);
    System.out.println("Tienes estas opciones: "+opciones);
    System.out.println("Se encuentra dentro de la categoria: "+tipo);



}
}

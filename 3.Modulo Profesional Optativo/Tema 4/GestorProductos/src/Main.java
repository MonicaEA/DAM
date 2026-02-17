import controller.GestorProductos;
import model.Categoria;
import model.Producto;

public class Main {

    public static void main(String[] args) {

        GestorProductos gestor = new GestorProductos();
        Producto television = new Producto("TV LG", "001lgt",499.99, Categoria.TECNOLOGICO);
        Producto movil = new Producto("Movil LG", "003lgt",199.99, Categoria.MUEBLES);
        gestor.agregarProducto(television);
        gestor.agregarProducto(movil);
        System.out.println(gestor.calcularPrecioMedio());
        System.out.println(gestor.getNumeroProductosCaros(200));
        gestor.getProductosPorCondicion((item,val)->
            item.getPrecio()>val && item.getCategoria() == Categoria.ROPA
        ,90.00);




    }

}

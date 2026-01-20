public class Prestamo {

    private Libro1 libro1;
    private Usuario usuario;

    public Prestamo(Libro1 libro1, Usuario usuario) {
        this.libro1 = libro1;
        this.usuario = usuario;
    }

    public boolean estaDisponible() {
        return libro1.isDisponible();
    }

    public boolean prestarLibro() {
        if (libro1.isDisponible()) {
            libro1.setDisponible(false);
            System.out.println("Préstamo realizado a " + usuario.getNombre() +
                    " del libro: " + libro1.getTitulo());
            return true;
        } else {
            System.out.println("El libro '" + libro1.getTitulo() + "' NO está disponible.");
            return false;
        }
    }

    public void devolverLibro() {
        libro1.setDisponible(true);
        System.out.println("Libro devuelto: " + libro1.getTitulo());
    }

    public Libro1 getLibro1() {
        return libro1;
    }

    public Usuario getUsuario() {
        return usuario;
    }
}

public class Usuario {

    private String nombre;
    private int nSocio;


    public Usuario() {
    }

    public Usuario(String nombre, int nSocio) {
        this.nombre = nombre;
        this.nSocio = nSocio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getnSocio() {
        return nSocio;
    }

    public void setnSocio(int nSocio) {
        this.nSocio = nSocio;
    }

    @Override
    public String toString() {
        return "Usuario: "+ nombre + " (Socio "+nSocio+")";
    }
}

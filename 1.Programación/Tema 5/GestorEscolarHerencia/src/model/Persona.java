package model;

public class Persona {
    private String nombre,apellido;



    //TODO me olvido del contructor vacio, lo hacemos mas adelante


    public Persona(String nombre, String apellido){
        this.nombre= nombre;
        this.apellido= apellido;

    }
    public void mostrarDatos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);

    }
    public void saludar(){
        System.out.println();

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    
}

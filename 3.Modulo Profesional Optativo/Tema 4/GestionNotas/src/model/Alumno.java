package model;

public class Alumno {

    private String nombre, apellido , dni;
    private int nota;


    public Alumno(String nombre, String apellido, String dni, int nota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.nota = nota;



    }
// mismo metodo pero con datos diferentes, esto se llama sobrecarga, en vez de llamar a todos los this, hago asi y llama al de arriba con la modificacion en int nota
    public Alumno(String nombre, String apellido, String dni) {
        this(nombre,apellido,dni,-1);



    }

    public void mostrarDatos(){
        System.out.println("Nombre: "+nombre);

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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}

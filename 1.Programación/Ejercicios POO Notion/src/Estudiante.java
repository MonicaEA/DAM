public class Estudiante {

    private String nombre;
    private int edad;
    private double nota;


    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nuevaNota) {
        System.out.print("Asignando nota : " + nuevaNota + ": ");

        if (nuevaNota>=0 && nuevaNota <= 10){
            this.nota = nuevaNota;
            System.out.println("Correcto");

        } else{
            System.out.println("Error --- La nota debe estar entre 0 y 10.");

        }
        System.out.println("Nota actual : "+ this.nota);
        System.out.println();

    }



}

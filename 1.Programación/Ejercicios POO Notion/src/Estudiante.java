public class Estudiante {
    /*Crea una clase Estudiante con atributos privados nombre, edad y nota. La nota debe estar entre 0 y 10.
     Implementa el setter de nota validando que esté en el rango correcto (si no lo está, muestra un mensaje de error).
      Crea un objeto y prueba con diferentes valores.
     */

    private String nombre;
    private int edad;
    private double nota;

    public Estudiante(String nombre, int edad,double nota){
        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota;

    }

    public void setNota(double nota) {
        System.out.print("Asignando nota " + nota + ": ");
        if (nota >= 0 && nota <= 10) {
            this.nota = nota;
            System.out.println("Correcto");
        } else {
            System.out.println("Error - La nota debe estar entre 0 y 10");
        }
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
}

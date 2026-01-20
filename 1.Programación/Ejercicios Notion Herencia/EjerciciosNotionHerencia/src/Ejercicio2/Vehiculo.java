package Ejercicio2;

public class Vehiculo {

    /*Crea una clase Vehiculo con atributos marca y modelo. Crea una clase Coche que herede de Vehiculo
     y añada el atributo numeroPuertas. Implementa constructores en ambas clases usando super().
     Crea varios objetos y muestra su información.
     */

    private String marca;
    private String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void mostrarVehiculo(){
        System.out.println("Vehiculo: "+ marca + " "+ modelo);

    }

    public String getInfoBasica() {
        return getMarca() + " " + getModelo();
    }
    public Vehiculo() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}

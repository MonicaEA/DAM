package model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Coche {

    private String marca,modelo,matricula,bastidor,color;
    private int cv;
    private double precio;

    // por defecto , en toda clase hay un constructor que se denomina constructor vacio
    // public Coche(){cuerpo}

    // esto es un constructor no lleva void ni nada porque no lleva retorno

    private boolean usado = false;
    public Coche(){


    }
    public Coche(String marca, String modelo , String bastidor , String color , int cv){
    this.marca = marca;
    this.modelo = modelo;
    this.bastidor = bastidor;
    this.color = color;
    this.cv = cv;



    }
    public Coche(String marca, String modelo, double precio, int cv){
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.cv = cv;


    }

    public boolean isUsado() {
        return usado;
    }

    // esto es un getter, devuelve valor
    public int getCv(){
    // aqui puedo hacer peticiones o validaciones de datos
        // los caballos del coche han sido modificados?
        // en caso de estar modificados retorno los reales
        return this.cv;
    }

    // esto es un setter, asigna valor
    // por ejemplo podriamos meter una validacion , si el coche pasa de 1000cv se queda como estaba
    public void setCv() {
        this.cv = this.cv+cv;

    }

    public String setCv() {
    }
}

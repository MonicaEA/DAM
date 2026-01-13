package model;

public class Coche {
    private String marca;
    private String modelo;
    private int km;
    private int puntosTotales;
    private int primerPuesto;
    private int segundoPuesto;
    private int tercerPuesto;



    public Coche(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;


    }

    public void avanzarKm(int km){
        km = (int) (Math.random() * (50 - 20 + 1)) + 20;

    }

    public void resetKm(){
        km =0;

    }

    public void addPuntos(int puntos){
    this.puntosTotales += puntos;


    }

    public void primerPuesto (){
        primerPuesto++;
    }

    public void segundoPuesto (){
        segundoPuesto++;
    }

    public void tercerPuesto (){
        tercerPuesto++;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public int getPuntosTotales() {
        return puntosTotales;
    }

    public void setPuntosTotales(int puntosTotales) {
        this.puntosTotales = puntosTotales;
    }

    public int getPrimerPuesto() {
        return primerPuesto;
    }

    public void setPrimerPuesto(int primerPuesto) {
        this.primerPuesto = primerPuesto;
    }

    public int getSegundoPuesto() {
        return segundoPuesto;
    }

    public void setSegundoPuesto(int segundoPuesto) {
        this.segundoPuesto = segundoPuesto;
    }

    public int getTercerPuesto() {
        return tercerPuesto;
    }

    public void setTercerPuesto(int tercerPuesto) {
        this.tercerPuesto = tercerPuesto;
    }
}

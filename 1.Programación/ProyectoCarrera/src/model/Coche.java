package model;

public class Coche {
    private String marca;
    private String modelo;
    private int dorsal;
    private String piloto;
    private int kmTotales;
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
        kmTotales =0;

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


    @Override
    public String toString() {
        return "Dorsal " + dorsal +
                " - " + piloto +
                " (" + marca + " " + modelo + ")" +
                " | Km: " + kmTotales +
                " | Puntos: " + puntosTotales;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getKmTotales() {
        return kmTotales;
    }

    public void setKmTotales(int kmTotales) {
        this.kmTotales = kmTotales;
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

    public String getPiloto() {
        return piloto;
    }

    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }
}

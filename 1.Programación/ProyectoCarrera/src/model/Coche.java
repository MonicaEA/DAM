package model;

public class Coche {
    private String marca;
    private String modelo;
    private int dorsal;
    private int km;
    private int puntos;
    private int primerPuesto;
    private int segundoPuesto;
    private int tercerPuesto;

    public Coche(String marca, String modelo, int dorsal) {
        this.marca = marca;
        this.modelo = modelo;
        // el dorsal lo voy a usar para desempatar, el más bajo en caso de empate gana.
        this.dorsal = dorsal;
        this.km = 0;
        this.puntos = 0;
        // esto me va a servir para sumar los podios.
        this.primerPuesto = 0;
        this.segundoPuesto = 0;
        this.tercerPuesto = 0;
    }

    public void avanzarKm() {
        km += (int)(Math.random() * 31) + 20;   // suma km entre 20 y 50
    }

    public void addPuntos(int puntos){
        this.puntos += puntos;     // suma a los puntos que ya tenía
    }

    public void resetKm(){
        km = 0;                    // deja el contador de km a cero para la nueva carrera
    }

    public void addPrimerPuesto(){
        primerPuesto++;
    }

    public void addSegundoPuesto(){
        segundoPuesto++;
    }

    public void addTercerPuesto(){
        tercerPuesto++;
    }

    @Override
    public String toString() {
        return "#" + dorsal + " - " + marca + " " + modelo +
                " | puntos: " + puntos +
                " | podios: " + primerPuesto + "-" + segundoPuesto + "-" + tercerPuesto;
    }

    public String getMarca() {
        return marca; }

    public void setMarca(String marca) {
        this.marca = marca; }

    public String getModelo() {
        return modelo; }

    public void setModelo(String modelo) {
        this.modelo = modelo; }

    public int getDorsal() {
        return dorsal; }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal; }

    public int getKm() {
        return km; }

    public void setKm(int km) {
        this.km = km; }

    public int getPuntos() {
        return puntos; }

    public void setPuntos(int puntos) {
        this.puntos = puntos; }

    public int getPrimerPuesto() {
        return primerPuesto; }

    public int getSegundoPuesto() {
        return segundoPuesto; }

    public int getTercerPuesto() {
        return tercerPuesto; }
}

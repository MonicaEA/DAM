package model;

public abstract class Llamadas {

    private long nOrigen;
    private long nDestino;
    private int duracion;
    private double coste;

    public Llamadas(long nOrigen, long nDestino, int duracion) {
        this.nOrigen = nOrigen;
        this.nDestino = nDestino;
        this.duracion = duracion;
        this.coste = 0;
    }

    public Llamadas() {
    }

    public void mostrarLlamadas(){
        System.out.println("*** LLAMADA REALIZADA ***");
        System.out.println();
        System.out.println("Número de origen: "+nOrigen);
        System.out.println("Número de destino: "+nDestino);
        System.out.println("Duración: "+duracion);
        System.out.println("Coste: "+ coste);



    }


    public long getnOrigen() {
        return nOrigen;
    }

    public void setnOrigen(long nOrigen) {
        this.nOrigen = nOrigen;
    }

    public long getnDestino() {
        return nDestino;
    }

    public void setnDestino(long nDestino) {
        this.nDestino = nDestino;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public double getCoste() {
        return coste;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }
}

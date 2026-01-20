package model;

import java.util.ArrayList;

public class Carrera {

    private int kmTotales;
    private ArrayList<Coche> coches;

        public Carrera(int kmTotales,ArrayList<Coche>coches ){
            this.kmTotales = kmTotales;
            this.coches = new ArrayList<>(coches);

        }

    public int getKmTotales() {
        return kmTotales;
    }

    public void setKmTotales(int kmTotales) {
        this.kmTotales = kmTotales;
    }

    public ArrayList<Coche> getCoches() {
        return coches;
    }

    public void setCoches(ArrayList<Coche> coches) {
        this.coches = coches;
    }
}

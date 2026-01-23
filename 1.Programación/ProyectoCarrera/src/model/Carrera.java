package model;

import java.util.ArrayList;

public class Carrera {

    private int kmCarrera;
    private ArrayList<Coche> cochesCarrera;

    public Carrera(int kmCarrera, ArrayList<Coche> cochesCarrera) {
        this.kmCarrera = kmCarrera;
        this.cochesCarrera = new ArrayList<>(cochesCarrera); // copia defensiva
    }

    public int getKmCarrera() {
        return kmCarrera;
    }

    public ArrayList<Coche> getCochesCarrera() {
        return cochesCarrera;
    }
}

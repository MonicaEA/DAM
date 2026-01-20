package model;

import java.util.ArrayList;

public class Campeonato {
    ArrayList<Coche> coches;
    ArrayList<Carrera>carreras;


    public Campeonato(ArrayList<Coche> coches, ArrayList<Carrera> carreras) {
        this.coches = coches;
        this.carreras = carreras;
    }

    public void addCarrera(Carrera carrera){
        carreras.add(carrera);

    }

    public ArrayList<Coche> getCoches() {
        return coches;
    }

    public ArrayList<Carrera> getCarreras() {
        return carreras;
    }
}

package model;

import java.util.ArrayList;

public class Campeonato {

    private ArrayList<Coche> cochesCampeonato;
    private ArrayList<Carrera> carrerasCampeonato;

    public Campeonato(ArrayList<Coche> coches) {
        this.cochesCampeonato = new ArrayList<>(coches);
        this.carrerasCampeonato = new ArrayList<>();
    }

    public void addCarrera(Carrera carrera){
        carrerasCampeonato.add(carrera);
    }

    public ArrayList<Coche> getCochesCampeonato() {
        return cochesCampeonato;
    }

    public ArrayList<Carrera> getCarrerasCampeonato() {
        return carrerasCampeonato;
    }
}

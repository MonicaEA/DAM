package model;

import java.util.ArrayList;

public class Carrera {

    private int kmTotales;
    private ArrayList<Coche> coches;

        public Carrera(int kmTotales,ArrayList<Coche>coches ){
            this.kmTotales = kmTotales;
            this.coches = new ArrayList<>(coches);

        }

        


}

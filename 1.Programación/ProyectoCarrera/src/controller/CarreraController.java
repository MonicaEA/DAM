package controller;

import model.Carrera;
import model.Coche;

import java.util.Collections;
import java.util.Comparator;

public class CarreraController {

    public void simularCarrera(Carrera carrera) {
        // Reset km todos coches
        for (Coche coche : carrera.getCochesCarrera() ){
            coche.resetKm();
        }

        // Añadir km hasta que alguien llegue y sea ganador
        boolean hayGanador = false;
        while (!hayGanador){
            for (Coche coche : carrera.getCochesCarrera()){
                coche.avanzarKm();
                if (coche.getKm() >= carrera.getKmCarrera()){
                    hayGanador = true;
                }
            }
        }

        // Ordenar clasificación por km (de mayor a menor)
        Collections.sort(
                carrera.getCochesCarrera(),
                new Comparator<Coche>() {
                    @Override
                    public int compare(Coche coche1, Coche coche2) {
                        // Más km primero
                        int comparacion = Integer.compare(coche2.getKm(), coche1.getKm());
                        if (comparacion != 0) return comparacion;

                        // Si empatan en km, gana el dorsal más bajo
                        return Integer.compare(coche1.getDorsal(), coche2.getDorsal());
                    }
                }
        );

        // Cojo las posiciones del Array ordenadas para dar puntos y podios
        Coche primerPuesto = carrera.getCochesCarrera().get(0);
        Coche segundoPuesto = carrera.getCochesCarrera().get(1);
        Coche tercerPuesto = carrera.getCochesCarrera().get(2);

        // Doy puntos por posición
        primerPuesto.addPuntos(10);
        segundoPuesto.addPuntos(8);
        tercerPuesto.addPuntos(6);

        // Sumo podios al primero, segundo y tercero
        primerPuesto.addPrimerPuesto();
        segundoPuesto.addSegundoPuesto();
        tercerPuesto.addTercerPuesto();

        // Salida por consola
        System.out.println("Ya tenemos a los campeones!!!!!");
        System.out.println("Procedemos a mostrar el podio de la carrera.");
        System.out.println();
        System.out.println("================== PODIO CARRERA ==================");
        System.out.println("1º " + primerPuesto);
        System.out.println("2º " + segundoPuesto);
        System.out.println("3º " + tercerPuesto);
    }
}

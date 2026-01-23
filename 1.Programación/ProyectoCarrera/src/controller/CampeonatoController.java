package controller;

import model.Campeonato;
import model.Carrera;
import model.Coche;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class CampeonatoController {

    public void iniciarCampeonato() {
        Scanner scanner = new Scanner(System.in);


        ArrayList<Coche> coches = leerCoches(scanner);
        Campeonato campeonato = new Campeonato(coches);

        //Preguntar cuántas carreras habrá
        System.out.print("¿Cuántas carreras tendrá el campeonato? ");
        int numCarreras = scanner.nextInt();
        scanner.nextLine();

        CarreraController carreraController = new CarreraController();

        //por cada carrera,datos, simular y mostrar podio
        for (int i = 0; i < numCarreras; i++) {
            System.out.println("\n=== CONFIGURACIÓN CARRERA " + (i + 1) + " ===");
            System.out.print("¿KM de esta carrera? ");
            int kmCarrera = scanner.nextInt();
            System.out.println();

            // carrera con los coches del campeonato
            Carrera carrera = new Carrera(kmCarrera, campeonato.getCochesCampeonato());

            // guardar la carrera en el campeonato.
            campeonato.addCarrera(carrera);

            // Simular carrera y mostrar su podio
            carreraController.simularCarrera(carrera);

            // clasificación provisional después de esta carrera:
            mostrarClasificacionFinal(campeonato);
        }

        // Al terminar todas las carreras: clasificación final

        System.out.println();
        System.out.println("¡¡Y POR FIN TENEMOS ACCESO AL PODIO DEFINITIVO!!");
        mostrarClasificacionFinal(campeonato);

        scanner.close();
    }


    // Leer coches por teclado
    private ArrayList<Coche> leerCoches(Scanner scanner) {
        ArrayList<Coche> coches = new ArrayList<>();

        System.out.println("¿Cuántos coches participan en el campeonato?");
        int numCoches = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numCoches; i++) {
            System.out.println("=+=+= Coche " + (i + 1) + " =+=+=");

            System.out.print("Marca: ");
            String marca = scanner.nextLine();

            System.out.print("Modelo: ");
            String modelo = scanner.nextLine();

            System.out.print("Dorsal: ");
            int dorsal = scanner.nextInt();
            scanner.nextLine();

            Coche coche = new Coche(marca, modelo, dorsal);
            coches.add(coche);
        }

        return coches;
    }

    // Configurar las carreras
    private void configurarCarreras(Scanner scanner, Campeonato campeonato) {
        System.out.println("¿Cuántas carreras tendrá el campeonato?");
        int numCarreras = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numCarreras; i++) {
            System.out.println("¿KM de esta carrera?");
            int kmCarrera = scanner.nextInt();


            Carrera carrera = new Carrera(kmCarrera, campeonato.getCochesCampeonato());
            campeonato.addCarrera(carrera);
        }
    }

    // Simular campeonato
    public void simularCampeonato(Campeonato campeonato) {
        CarreraController carreraController = new CarreraController();

        for (Carrera carrera : campeonato.getCarrerasCampeonato()) {
            System.out.println("Simulando carrera de " + carrera.getKmCarrera() + " km");
            carreraController.simularCarrera(carrera);
        }
    }

    // Mostrar clasificación final
    public void mostrarClasificacionFinal(Campeonato campeonato) {

        ArrayList<Coche> listaParaOrdenar = new ArrayList<>(campeonato.getCochesCampeonato());

        // uso sort para ordenar
        Collections.sort(listaParaOrdenar, new Comparator<Coche>() {
            @Override
            public int compare(Coche coche1, Coche coche2) {

                if (coche1.getPuntos() > coche2.getPuntos()) {
                    return -1;
                }
                if (coche1.getPuntos() < coche2.getPuntos()) {
                    return 1;
                }

                // desempate por puestos
                if (coche1.getPrimerPuesto() > coche2.getPrimerPuesto()) {
                    return -1;
                }
                if (coche1.getPrimerPuesto() < coche2.getPrimerPuesto()) {
                    return 1;
                }

                if (coche1.getSegundoPuesto() > coche2.getSegundoPuesto()) {
                    return -1;
                }
                if (coche1.getSegundoPuesto() < coche2.getSegundoPuesto()) {
                    return 1;
                }

                if (coche1.getTercerPuesto()> coche2.getTercerPuesto()){
                    return -1;
                }

                if (coche1.getTercerPuesto()< coche2.getTercerPuesto()){
                    return 1;
                }

                // desempate por dorsal, el mas bajo gana.
                if (coche1.getDorsal() < coche2.getDorsal()) {
                    return -1; //
                }
                if (coche1.getDorsal() > coche2.getDorsal()) {
                    return 1;
                }


                return 0;
            }
        });


        System.out.println("=========== CLASIFICACIÓN FINAL DEL CAMPEONATO ===========");
        int posicion = 1;
        for (Coche coche : listaParaOrdenar) {
            System.out.println(posicion + "º " + coche);
            posicion++;
        }
    }
}

package controller;

import model.Coche;

import java.util.ArrayList;
import java.util.Scanner;

public class CampeonatoController {

    private Scanner scanner = new Scanner(System.in);

    public ArrayList<Coche> pedirCochesParticipantes(){
        System.out.println("¿Cuantos coches van a competir en el campeonato?");
        int numCoches = scanner.nextInt();

        scanner.nextLine(); //TODO ver que significa limpiar salto de linea.

        ArrayList<Coche> coches = new ArrayList<>();

        for (int i = 0; i < numCoches; i++) {
            System.out.println("Coche " + i + ":");

            System.out.print("  Marca: ");
            String marca = scanner.nextLine();

            System.out.print("  Modelo: ");
            String modelo = scanner.nextLine();

            System.out.print("  Piloto: ");
            String piloto = scanner.nextLine();

            System.out.print("  Dorsal (número): ");
            int dorsal = scanner.nextInt();
            scanner.nextLine();

            Coche coche = new Coche(marca,modelo,piloto,dorsal);
            coches.add(coche);
        }
    return coches;
    }



}

package controller;

import model.Partido;

import java.util.ArrayList;

public class Registrador {
    private ArrayList<Partido> listaPartido;


    public Registrador(ArrayList<Partido> listaPartido) {
        this.listaPartido = listaPartido;
    }


    public void anadirPartido(Partido partido){
      this.listaPartido.add(partido);



    }

    public void mostrarPartidos(){

        for (Partido partido : listaPartido){
            partido.mostrarDatos();


        }


    }

    public void jugarAplazados(){
        for (Partido partido :listaPartido){
            partido.mostrarDatos();
        }



    }

    public void mostrarPartidos(String equipo){
        for (Partido partido : listaPartido){
            if (partido.isJugado() && partido.getEquipoLocal().getNombre().equals(equipo) || partido.getEquipoVisitante().getNombre().equals(equipo));

            {
                partido.mostrarDatos();


            }


        }



        public void mostrarEstadisticas(String ){
            for (Partido partido : listaPartido){
                if (partido.getEquipoVisitante().getNombre().equals(equipo))



            }



        }
    }























}

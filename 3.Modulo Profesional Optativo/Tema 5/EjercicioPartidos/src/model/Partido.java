package model;

public class Partido {

    private Equipo equipoLocal, equipoVisitante;
    private int gLocal, gVisitante;
    private boolean jugado;


    public Partido() {
    }

    public Partido(Equipo equipoLocal, Equipo equipoVisitante) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;

    }

    public Partido(Equipo equipoLocal, int gVisitante, int gLocal, Equipo equipoVisitante) {
        this.equipoLocal = equipoLocal;
        this.gVisitante = gVisitante;
        this.gLocal = gLocal;
        this.equipoVisitante = equipoVisitante;
        jugado = true;
        equipoLocal.setgFavor(equipoLocal.getgFavor()+gLocal);
        equipoLocal.setgFavor(equipoLocal.getgContra()+gVisitante);
        equipoVisitante.setgFavor(equipoVisitante.getgFavor()+gVisitante);
        equipoVisitante.setgContra(equipoVisitante.getgContra()+gLocal);

    }

    public void mostrarDatos(){
        System.out.printf("%s:%d VS %d:%s%n", equipoLocal,equipoVisitante,gLocal,gVisitante);

    }

    public void jugarPartido(){
        if (!jugado){
            gLocal = (int)(Math.random()*4);
            gVisitante =(int)(Math.random()*4);
            jugado=true;
        } else{
            System.out.println("Partido ya disputado");
        }



    }

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public boolean isJugado() {
        return jugado;
    }

    public void setJugado(boolean jugado) {
        this.jugado = jugado;
    }

    public int getgVisitante() {
        return gVisitante;
    }

    public void setgVisitante(int gVisitante) {
        this.gVisitante = gVisitante;
    }

    public int getgLocal() {
        return gLocal;
    }

    public void setgLocal(int gLocal) {
        this.gLocal = gLocal;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(Equipo equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }
}

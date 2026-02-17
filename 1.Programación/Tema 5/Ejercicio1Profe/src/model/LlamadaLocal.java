package model;

public class LlamadaLocal extends Llamadas{


    public LlamadaLocal() {
    }

    public LlamadaLocal(long nOrigen, long nDestino, int duracion) {
        super(nOrigen, nDestino, duracion);
    }


    @Override
    public void mostrarLlamadas() {
        super.mostrarLlamadas();
        System.out.println("RECUERDA QUE TUS LLAMADAS LOCALES SIEMPRE SON GRATUITAS");
    }
}

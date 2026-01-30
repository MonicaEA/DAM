package model;

public class Video extends Multimedia {


    private String director;
    private String actores;

    public Video(int identificador, String titulo, String autor, int tamaño, String formato,String director, String actores) {
        super(identificador, titulo, autor, tamaño, formato);
        this.director = director;
        this.actores = actores;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("VIDEO");
        super.mostrarDatos();

    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActores() {
        return actores;
    }

    public void setActores(String actores) {
        this.actores = actores;
    }


}

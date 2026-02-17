package model;

public enum Categoria {

    ALIMENTACION(), MUEBLES("esta categoria es de muebles para decorar"), ROPA(), TECNOLOGICO("esta categoria marca productos de ultima generación");

    private String descripcion;


    Categoria(){}

    Categoria(String descripcion){
        this.descripcion = descripcion;
    }


    public String getDescripcion(){
        return descripcion;
    }






}

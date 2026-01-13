public class Libro {
/*Crea una clase Libro con atributos titulo, autor y paginas. Implementa tres constructores:
 uno sin parámetros (valores por defecto), uno con título y autor, y otro con los tres parámetros.
 Crea tres objetos usando cada constructor y muestra sus datos.
 */

    private String titulo;
    private String autor;
    private int paginas;


    public Libro(String titulo,String autor, int paginas){
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;

    }

    public Libro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }

    public Libro(){

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
}

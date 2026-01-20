public class Gato extends Animal {

    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    // OBLIGADO por el abstract
    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " hace: Miauuuuu!!");
    }
}



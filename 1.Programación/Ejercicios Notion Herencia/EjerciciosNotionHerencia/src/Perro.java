public class Perro extends Animal {

    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    // OBLIGADO por el abstract
    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " hace: Guau, guau!!");
    }
}

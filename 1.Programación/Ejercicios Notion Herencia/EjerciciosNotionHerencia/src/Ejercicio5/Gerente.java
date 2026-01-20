package Ejercicio5;

public class Gerente extends Empleado{
    private int bonus;


    public Gerente(String nombre, int salarioBase, String puesto, int bonus) {
        super(nombre, salarioBase, puesto);
        this.bonus = bonus;
    }

    public void calcularSalarioTotal(){
        double salarioTotal = getSalarioBase()+bonus;
        System.out.println("Salario Total : "+salarioTotal);

    }

    public int getBonus() {
        return bonus;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Bonus: "+bonus);
        calcularSalarioTotal();
    }
}

import java.util.Scanner;

public class CuentasBancarias {

    /*Crea una clase CuentaBancaria con atributos titular y saldo. Implementa métodos depositar(cantidad)
     y retirar(cantidad). Crea tres cuentas diferentes, realiza varias operaciones en cada una y muestra
     el saldo final de todas.
     */

    private String titular;
    private double saldo;

    Scanner scanner = new Scanner(System.in);
    public CuentasBancarias(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositarCantidad(double deposito){
        saldo = saldo + deposito;


    }

    public void retirarCantidad(double retirada){
        saldo = saldo - retirada;

    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


}

public class CuentaBancaria {

    private String titular;
    private double saldo;
    private double retirada;
    private double deposito;


    public CuentaBancaria(String titular, double saldoInicial){
        this.titular = titular;
        this.saldo = saldoInicial;

    }

    public void depositarCantidad(double cantidadDeposito){
        saldo += cantidadDeposito;
        System.out.println("Deposito de "+cantidadDeposito + "€. Nuevo saldo " +saldo);
    }

    public void retirarCantidad(double cantidadRetirada){
        saldo += cantidadRetirada;
        System.out.println("Deposito de "+cantidadRetirada + "€. Nuevo saldo " +saldo);


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

    public double getRetirada() {
        return retirada;
    }

    public void setRetirada(double retirada) {
        this.retirada = 0;
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }
}

public abstract class CuentaBancaria {
    protected double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double cantidad) {
        saldo += cantidad;
        System.out.println("Depósito realizado: " + cantidad + ". Saldo actual: " + saldo);
    }

    public abstract void retirar(double cantidad);
}

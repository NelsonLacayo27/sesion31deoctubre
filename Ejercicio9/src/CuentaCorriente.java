public class CuentaCorriente extends CuentaBancaria {
    private double limiteDescubierto;

    public CuentaCorriente(double saldoInicial, double limiteDescubierto) {
        super(saldoInicial);
        this.limiteDescubierto = limiteDescubierto;
    }

    @Override
    public void retirar(double cantidad) {
        if (cantidad <= saldo + limiteDescubierto) {
            saldo -= cantidad;
            System.out.println("Retiro de Cuenta Corriente: " + cantidad + ". Saldo restante: " + saldo);
        } else {
            System.out.println("Fondos insuficientes en Cuenta Corriente.");
        }
    }
}

public class CuentaAhorros extends CuentaBancaria {

    public CuentaAhorros(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro de Cuenta Ahorros: " + cantidad + ". Saldo restante: " + saldo);
        } else {
            System.out.println("Fondos insuficientes en Cuenta Ahorros.");
        }
    }
}

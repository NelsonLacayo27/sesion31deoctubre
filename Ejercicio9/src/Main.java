public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        // Crear cuentas
        CuentaBancaria cuentaAhorros = new CuentaAhorros(1000);
        CuentaBancaria cuentaCorriente = new CuentaCorriente(500, 200);

        // Agregar cuentas al banco
        banco.agregarCuenta(cuentaAhorros);
        banco.agregarCuenta(cuentaCorriente);

        // Realizar depósitos
        banco.realizarDeposito(0, 300); // Cuenta Ahorros
        banco.realizarDeposito(1, 150); // Cuenta Corriente

        // Realizar retiros
        banco.realizarRetiro(0, 500); // Cuenta Ahorros
        banco.realizarRetiro(1, 600); // Cuenta Corriente
        banco.realizarRetiro(1, 300); // Cuenta Corriente
    }
}

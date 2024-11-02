import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<CuentaBancaria> cuentas;

    public Banco() {
        cuentas = new ArrayList<>();
    }

    public void agregarCuenta(CuentaBancaria cuenta) {
        cuentas.add(cuenta);
        System.out.println("Cuenta agregada.");
    }

    public void realizarDeposito(int index, double cantidad) {
        if (index < cuentas.size()) {
            cuentas.get(index).depositar(cantidad);
        } else {
            System.out.println("Índice de cuenta no válido.");
        }
    }

    public void realizarRetiro(int index, double cantidad) {
        if (index < cuentas.size()) {
            cuentas.get(index).retirar(cantidad);
        } else {
            System.out.println("Índice de cuenta no válido.");
        }
    }
}

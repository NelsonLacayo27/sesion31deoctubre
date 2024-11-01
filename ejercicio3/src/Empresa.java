// Clase Empresa
public class Empresa {
    // Atributos privados
    private String nombreEmpresa;
    private Direccion direccion; // Composición

    // Constructor
    public Empresa(String nombreEmpresa, Direccion direccion) {
        this.nombreEmpresa = nombreEmpresa;
        this.direccion = direccion;
    }

    // Método para mostrar los detalles de la empresa
    public void mostrarDetalles() {
        System.out.printf("Nombre de la Empresa: %s%n", nombreEmpresa);
        System.out.println("Dirección:");
        direccion.imprimirDireccion();
    }
}

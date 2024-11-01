// Clase Main
public class Main {
    public static void main(String[] args) {
        // Crear una dirección
        Direccion direccion = new Direccion("Av. Libertador 1234", "Buenos Aires", "C1001");

        // Crear una empresa con la dirección
        Empresa empresa = new Empresa("Tech Solutions", direccion);

        // Mostrar detalles de la empresa
        empresa.mostrarDetalles();
    }
}

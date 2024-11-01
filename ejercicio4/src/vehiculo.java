
public class vehiculo {
    // Atributos
    private String marca;
    private String modelo;
    private int año;

    // Constructor
    public Vehiculo(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    // Método para imprimir información básica del vehículo
    public void imprimirInformacion() {
        System.out.printf("Marca: %s%nModelo: %s%nAño: %d%n", marca, modelo, año);
    }
}


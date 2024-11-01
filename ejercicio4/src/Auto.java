// Clase Auto que hereda de Vehículo
public class Auto extends Vehiculo {
    // Atributo específico
    private int puertas;

    // Constructor
    public Auto(String marca, String modelo, int año, int puertas) {
        super(marca, modelo, año); // Llamar al constructor de la clase base
        this.puertas = puertas;
    }

    // Método para imprimir información del auto
    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion(); // Llama al método de la clase base
        System.out.printf("Número de puertas: %d%n", puertas);
    }
}


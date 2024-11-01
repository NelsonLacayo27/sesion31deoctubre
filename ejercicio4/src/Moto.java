// Clase Moto que hereda de Vehículo
public class Moto extends Vehiculo {
    // Atributo específico
    private boolean tieneSidecar;

    // Constructor
    public Moto(String marca, String modelo, int año, boolean tieneSidecar) {
        super(marca, modelo, año); // Llamar al constructor de la clase base
        this.tieneSidecar = tieneSidecar;
    }

    // Método para imprimir información de la moto
    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion(); // Llama al método de la clase base
        System.out.printf("¿Tiene sidecar? %s%n", tieneSidecar ? "Sí" : "No");
    }
}


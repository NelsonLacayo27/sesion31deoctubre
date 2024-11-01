// Clase Dirección
public class Direccion {
    // Atributos privados
    private String calle;
    private String ciudad;
    private String codigoPostal;

    // Constructor
    public Direccion(String calle, String ciudad, String codigoPostal) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
    }

    // Método para imprimir la dirección
    public void imprimirDireccion() {
        System.out.printf("Calle: %s%nCiudad: %s%nCódigo Postal: %s%n", calle, ciudad, codigoPostal);
    }
}

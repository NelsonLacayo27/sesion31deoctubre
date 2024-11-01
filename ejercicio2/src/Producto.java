public class Producto {
    // Atributos privados
    private final String nombre;
    private final double precio;
    private int cantidadDisponible;

    // Constructor
    public Producto(String nombre, double precio, int cantidadDisponible) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
    }

    // Método para actualizar la cantidad disponible
    public void actualizarCantidad(int nuevaCantidad) {
        this.cantidadDisponible = nuevaCantidad;
    }

    // Método para calcular el valor total de la existencia
    public double calcularValorTotal() {
        return precio * cantidadDisponible;
    }

    // Método para imprimir la información del producto
    public void imprimirInformacion() {
        System.out.printf("Nombre: %s%nPrecio: $%.2f%nCantidad Disponible: %d%nValor Total de la Existencia: $%.2f%n",
                nombre, precio, cantidadDisponible, calcularValorTotal());
    }
}

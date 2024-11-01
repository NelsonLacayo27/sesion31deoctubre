import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear una lista de productos
        ArrayList<Producto> productos = new ArrayList<>();

        // Agregar productos a la lista
        productos.add(new Producto("Laptop", 800.00, 10));
        productos.add(new Producto("Teléfono", 500.00, 20));
        productos.add(new Producto("Tableta", 300.00, 15));
        productos.add(new Producto("Auriculares", 100.00, 25));
        productos.add(new Producto("Smartwatch", 200.00, 30));

        // Imprimir información de todos los productos
        System.out.println("Lista de Productos:");
        for (Producto producto : productos) {
            producto.imprimirInformacion();
            System.out.println(); // Línea en blanco para separación
        }

        // Actualizar la cantidad disponible de un producto
        productos.getFirst().actualizarCantidad(5); // Actualiza cantidad de Laptop

        // Imprimir información actualizada
        System.out.println("Información actualizada de los productos:");
        for (Producto producto : productos) {
            producto.imprimirInformacion();
            System.out.println(); // Línea en blanco para separación
        }
    }
}

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros;

    public Biblioteca() {
        libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
        System.out.println("Libro '" + libro.getTitulo() + "' agregado a la biblioteca.");
    }

    public void eliminarLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                libros.remove(libro);
                System.out.println("Libro '" + titulo + "' eliminado de la biblioteca.");
                return;
            }
        }
        System.out.println("Libro '" + titulo + "' no encontrado en la biblioteca.");
    }

    public void mostrarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
            return;
        }
        System.out.println("Libros disponibles en la biblioteca:");
        for (Libro libro : libros) {
            System.out.println("- " + libro);
        }
    }
}

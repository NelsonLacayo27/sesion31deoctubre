public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez");
        Libro libro2 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes");

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        biblioteca.mostrarLibros();

        biblioteca.eliminarLibro("Cien años de soledad");
        biblioteca.mostrarLibros();
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione la figura (1: Círculo, 2: Rectángulo): ");
        int opcion = scanner.nextInt();
        FiguraGeometrica figura;

        if (opcion == 1) {
            figura = new Circulo();
        } else {
            figura = new Rectangulo();
        }

        figura.solicitarValores();
        double area = figura.calcularArea();
        System.out.println("El área de la figura es: " + area);
    }
}

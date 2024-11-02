import java.util.Scanner;

public class Rectangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    @Override
    public void solicitarValores() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la base del rectángulo: ");
        this.base = scanner.nextDouble();
        System.out.print("Ingrese la altura del rectángulo: ");
        this.altura = scanner.nextDouble();
    }

    @Override
    public double calcularArea() {
        return base * altura; // Fórmula del área: base * altura
    }
}

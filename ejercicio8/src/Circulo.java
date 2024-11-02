import java.util.Scanner;

public class Circulo extends FiguraGeometrica {
    private double radio;

    @Override
    public void solicitarValores() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el radio del círculo: ");
        this.radio = scanner.nextDouble();
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio; // Fórmula del área: πr²
    }
}


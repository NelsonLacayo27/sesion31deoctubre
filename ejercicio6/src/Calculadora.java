public class Calculadora {

    // Método para sumar dos enteros
    public int sumar(int a, int b) {
        int resultado = a + b;
        System.out.println("Suma de dos enteros: " + a + " + " + b + " = " + resultado);
        return resultado;
    }

    // Método para sumar dos doubles
    public double sumar(double a, double b) {
        double resultado = a + b;
        System.out.println("Suma de dos doubles: " + a + " + " + b + " = " + resultado);
        return resultado;
    }

    // Método para sumar tres enteros
    public int sumar(int a, int b, int c) {
        int resultado = a + b + c;
        System.out.println("Suma de tres enteros: " + a + " + " + b + " + " + c + " = " + resultado);
        return resultado;
    }
}

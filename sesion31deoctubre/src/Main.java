public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona("Juan", 30, "Masculino");

        persona.imprimirInformacion();

        persona.setNombre("Carlas Avalas Patricia");
        persona.setEdad(35);
        persona.setGenero("Masculino");


        System.out.println("\nInformación actualizada:");
        persona.imprimirInformacion();
    }
}

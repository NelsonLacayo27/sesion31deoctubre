package com.animales;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de Perro y Gato
        Acciones perro = new Perro();
        Acciones gato = new Gato();

        // Llamar a los métodos de cada objeto
        perro.caminar();
        perro.comer();

        gato.caminar();
        gato.comer();
    }
}

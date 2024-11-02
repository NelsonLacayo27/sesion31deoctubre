package com.animales;

public class Perro implements Acciones {
    @Override
    public void caminar() {
        System.out.println("El perro camina de manera alegre y mueve la cola.");
    }

    @Override
    public void comer() {
        System.out.println("El perro come croquetas y se relame los labios.");
    }
}

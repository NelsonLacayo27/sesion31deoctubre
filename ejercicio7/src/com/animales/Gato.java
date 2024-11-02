package com.animales;

public class Gato implements Acciones {
    @Override
    public void caminar() {
        System.out.println("El gato camina sigilosamente y con gracia.");
    }

    @Override
    public void comer() {
        System.out.println("El gato come atún y se estira después.");
    }
}

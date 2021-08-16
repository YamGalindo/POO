package com.company;

public abstract class Comestible {
     private String nombre;

    public Comestible(String nombre) {
        this.nombre = nombre;
    }

    public abstract Double calcularPrecio();

    @Override
    public String toString() {
        return "El comestible es " +
                nombre +  " y su precio " +
                calcularPrecio();
    }
}

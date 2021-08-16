package com.company;

public class Productos extends Comestible{
    private Double precio;

    public Productos(String nombre, Double precio) {
        super(nombre);
        this.precio = precio;
    }

    @Override
    public Double calcularPrecio() {
        return precio;
    }
}

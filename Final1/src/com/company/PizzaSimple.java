package com.company;

public class PizzaSimple extends Consumible{

    private Double precioBase;
    private Boolean esGrande;


    public PizzaSimple(String nombre, String descripcion, Boolean esGrande, Double precioBase) {
        super(nombre, descripcion);
        this.esGrande = esGrande;
        this.precioBase = precioBase;
    }

    public Double calcularPrecio() {
        return  this.esGrande ? this.precioBase * 2 : this.precioBase;
    }

    @Override
    public String toString() {
        return "Pizza simple = " +
                " " + this.getNombre() +
                ", Precio : " + " " + calcularPrecio();
    }
}

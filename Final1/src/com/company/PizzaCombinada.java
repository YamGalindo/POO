package com.company;

import java.util.ArrayList;
import java.util.List;

public class PizzaCombinada extends Consumible{

    private List<PizzaSimple> pizza = new ArrayList<PizzaSimple>();

    public PizzaCombinada(String nombre, String descripcion, ArrayList<PizzaSimple> pizza) {
        super(nombre, descripcion);
        this.pizza = pizza;

    }

    public Double calcularPrecio() {

        Double precio = 0.00;

        for(int i = 0; i < this.pizza.size(); i++){
            precio += this.pizza.get(i).calcularPrecio() / this.pizza.size();
        }
        return precio;
    }

    @Override
    public String toString() {

        return "Pizza  = " +
                " " + this.getNombre() +
                ", Precio : " + " " + this.calcularPrecio();
    }
}

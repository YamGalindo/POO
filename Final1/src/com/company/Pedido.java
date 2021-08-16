package com.company;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private List<Consumible> pizzas = new ArrayList();

    public Pedido(List<Consumible> pizzas) {
        this.pizzas = pizzas;
    }

    public void mostrar(){
        for (Consumible pizza: pizzas) {
            System.out.println(pizza.toString());
        }
    }

}

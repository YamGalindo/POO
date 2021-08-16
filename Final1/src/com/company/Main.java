package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        PizzaSimple pizza1 = new PizzaSimple("muzzarella chica", "pizza con muizzarella pequeña", false,700.00);
        PizzaSimple pizza2 = new PizzaSimple("especial chica", "pizza con especial pequeña", false, 850.00);
        PizzaSimple pizza3 = new PizzaSimple("anana chica", "pizza con anana pequeña", false,950.00);

        ArrayList<PizzaSimple> pizzas = new ArrayList<PizzaSimple>();
        pizzas.add(pizza2);
        pizzas.add(pizza3);

        PizzaCombinada pizza4 = new PizzaCombinada("Pizza loca", "mitad especial mitad anana", pizzas);

        ArrayList<Consumible> pedidos = new ArrayList<>();

        pedidos.add(pizza1);
        pedidos.add(pizza2);
        pedidos.add(pizza3);
        pedidos.add(pizza4);


        Pedido pedido = new Pedido(pedidos);
        pedido.mostrar();

    }

}

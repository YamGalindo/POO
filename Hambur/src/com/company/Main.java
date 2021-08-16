package com.company;

public class Main {

    public static void main(String[] args) {

        ComestibleFactory carlos = ComestibleFactory.getInstancia();
        Carrito carrito = new Carrito();
        carrito.agregarComestible(carlos.crearComestible("combo1"));
        carrito.agregarComestible(carlos.crearComestible("hamburguesa"));
        carrito.agregarComestible(carlos.crearComestible("sandwich"));
        carrito.generarInforme();
    }
}

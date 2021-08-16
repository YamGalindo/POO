package com.company;

public class ComestibleFactory {
    private static ComestibleFactory instancia;

    private ComestibleFactory() {
    }

    public static ComestibleFactory getInstancia() {
        if(instancia == null){
            instancia = new ComestibleFactory();
        }return instancia;
    }

    public Comestible crearComestible(String comestible){
        switch (comestible){
            case "hamburguesa":
                return new Productos("hamburguesa", 200.0);
            case "sandwich" :
                return new Productos("sandwich", 300.0);
            case "combo1" :
                Combo combo1 = new Combo("Combo Macdonalds");
                combo1.agregarComestible(new Productos("sandwich", 300.0));
                combo1.agregarComestible(crearComestible("sandwich"));
                return combo1;
                default:
                    System.out.println("Código inválido");
        }return null;
    }

}

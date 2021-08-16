package com.company;

import java.util.ArrayList;
import java.util.List;

public class Combo extends Comestible{
    private List<Comestible> comestibles;

    public Combo(String nombre) {
        super(nombre);
        comestibles = new ArrayList<>();
    }

    @Override
    public Double calcularPrecio() {
        Double precioTotal = 0.0;
        for (Comestible comestible : comestibles) {
            precioTotal += comestible.calcularPrecio();
        }
        return precioTotal;
    }

    public void agregarComestible(Comestible comestible){
        comestibles.add(comestible);
    }
}

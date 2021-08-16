package com.company;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private List<Comestible> comestibles;

    public Carrito() {
        comestibles = new ArrayList<>();
    }

    public void generarInforme(){
        for (Comestible comestible : comestibles) {
            System.out.println(comestible);
        }
    }

    public void agregarComestible(Comestible comestible){
        comestibles.add(comestible);
    }
}

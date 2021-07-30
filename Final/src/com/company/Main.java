package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Casa casa1 = new Casa("Av. San Martin", 130, 500.0);
        Casa casa2 = new Casa("Miltre", 233, 700.0);

        ArrayList<Casa> barrio = new ArrayList<Casa>();
        barrio.add(casa1);
        barrio.add(casa2);

        BarrioCerrado barrio1 = new BarrioCerrado(barrio,"Gutierres", 330, 2);

        ArrayList<BarrioCerrado> barrios = new ArrayList<BarrioCerrado>();
        barrios.add(barrio1);

        Municipio municipio = new Municipio(barrio,barrios);
        municipio.Mostrar();
    }
}

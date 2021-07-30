package com.company;

import java.util.ArrayList;

public class Municipio {

    private ArrayList <Casa> casas;
    private ArrayList <BarrioCerrado> barrios;

    public Municipio(ArrayList<Casa> casas, ArrayList<BarrioCerrado> barrios) {
        this.casas = casas;
        this.barrios = barrios;
    }

    public void Mostrar(){

        for(BarrioCerrado barrio : barrios) {
            System.out.println(barrio.getCalle() + " " + barrio.getNumero() + " " + barrio.calcularImpuesto());
        }
        for (Casa casa :casas) {
            System.out.println(casa.getCalle() + " " + casa.getNumero() + " " + casa.calcularImpuesto());
        }
    }
}

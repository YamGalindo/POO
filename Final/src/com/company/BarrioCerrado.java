package com.company;

import java.util.ArrayList;

public class BarrioCerrado implements Impuesto {

    private ArrayList <Casa> barrio;
    private String calle;
    private int numero;
    private int factorMultiplicador;

    public BarrioCerrado(ArrayList<Casa> barrio, String calle, int numero, int factorMultiplicador) {
        this.barrio = barrio;
        this.calle = calle;
        this.numero = numero;
        this.factorMultiplicador = factorMultiplicador;
    }

    @Override
    public Double calcularImpuesto() {

        double valorImpuesto = 0;

        for(int i = 0; i < this.barrio.size(); i++){
           valorImpuesto += this.barrio.get(i).getMontoBase();
        }
        return valorImpuesto * factorMultiplicador;
    }

    public String getCalle() {
        return calle;
    }

    public int getNumero() {
        return numero;
    }
}

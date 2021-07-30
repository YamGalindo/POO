package com.company;

public class Casa implements Impuesto{

    private String calle;
    private int numero;
    private double montoBase;

    public Casa(String calle, int numero, double montoBase) {
        this.calle = calle;
        this.numero = numero;
        this.montoBase = montoBase;
    }

    @Override
    public Double calcularImpuesto(){

        double valorImpuesto = 0;

        if(this.getCalle().equals("Av. San Martin")){
            valorImpuesto = this.montoBase + (this.montoBase * 0.1);
            return valorImpuesto;
        } else {
            return this.montoBase;
        }
    }

    public String getCalle() {
        return calle;
    }

    public int getNumero() {
        return numero;
    }

    public double getMontoBase() {
        return montoBase;
    }
}

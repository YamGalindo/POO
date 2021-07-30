package com.company;

public class Arma {

    private int cantMunicion;
    private int alcance;
    private int calibre;
    private String estado;

    //constructor de la clase Arma
    public Arma(int cantMunicion, int alcance, int calibre, String estado) {
        this.cantMunicion = cantMunicion;
        this.alcance = alcance;
        this.calibre = calibre;
        this.estado = estado;
    }

    //getter y setter usado por funciones.
    public int getAlcance() {
        return alcance;
    }

    public int getCalibre() {
        return calibre;
    }

    public String getEstado() {
        return estado;
    }

}

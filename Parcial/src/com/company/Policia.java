package com.company;

public class Policia {

    private String nombre;
    private String apellido;
    private int legajo;
    private Arma arma;

    //constructor de la clase Policia
    public Policia(String nombre, String apellido, int legajo, Arma arma) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.arma = arma;
    }
}


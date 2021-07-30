package com.company;

public class Larga extends Arma implements Usable{

    private boolean selloRenar;
    private String justificacion;
    private int nivel;
    private boolean comprable;

    //constructor de la clase Larga
    public Larga(int cantMunicion, int alcance, int calibre, String estado, boolean selloRenar, String justificacion, int nivel, boolean comprado) {
        super(cantMunicion, alcance, calibre, estado);
        this.selloRenar = selloRenar;
        this.justificacion = justificacion;
        this.nivel = nivel;
        this.comprable = comprado;
    }

    // Metodo para comprar arma Larga

    public void comprar(){
        if(isComprable()){
            System.out.println("Arma ya fue vendida");
        }else{
            System.out.println("Arma comprada");
            setComprable(false);
        }
    }

    // implementacion de interfas
    @Override
    public void Usable() {
        if((getEstado() == "EN USO") && (getCalibre() >= 9)){
            System.out.println("El arma esta en condiciones para poder ser usada por un policia en un enfrentamiento");
        }else{
            System.out.println("El arma no esta en condiciones para poder ser usada por un policia en un enfrentamiento");
        }
    }

    //getter y setter usados por funciones.

    public boolean isComprable() {
        return comprable;
    }

    public void setComprable(boolean comprable) {
        this.comprable = comprable;
    }
}

package com.company;

public class Corta extends Arma implements Usable{

    private boolean automatica;

    //constructor de la clase corta
    public Corta(int cantMunicion, int alcance, int calibre, String estado, boolean automatica) {
        super(cantMunicion, alcance, calibre, estado);
        this.automatica = automatica;
    }

    //metodo para calcular alcance de arma corta.
    public void calcularAlcance(){
        if(getAlcance() > 200){
            System.out.println("Arma supera los 200 metros de alcance");
        }else
            System.out.println("Arma  no supera los 200 metros de alcance");
    }

    //implementacion de interfas
    @Override
    public void Usable() {
        if((getEstado() == "EN USO") && (getCalibre() >= 9)){
            System.out.println("El arma esta en condiciones para poder ser usada por un policia en un enfrentamiento");
        }else{
            System.out.println("El arma no esta en condiciones para poder ser usada por un policia en un enfrentamiento");
        }
    }

}

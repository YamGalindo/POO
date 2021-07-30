package com.company;

public class Main {

    public static void main(String[] args) {

        Arma arma1 = new Corta(15, 210, 10, "EN USO", true);
        Arma arma2 = new Corta(15, 199, 8, "EN USO", false);
        Arma arma3 = new Larga(15, 199, 11, "EN USO", true, "por que esta mamalona", 3, true);
        Arma arma4 = new Larga(15, 210, 10, "Nueva", true, "por que esta mamalona x2 ", 3, false);
        Policia policia1 = new Policia("alberto", "perez", 12345, arma1);

        //pruebas para los metodos de las clases.

        // ((Corta) arma1).calcularAlcance();
        // ((Corta) arma1).Usable();
        // ((Corta) arma2).calcularAlcance();
        // ((Corta) arma2).Usable();
        // ((Larga) arma3).comprar();
        // ((Larga) arma4).comprar();
        // ((Larga) arma3).Usable();
        // ((Larga) arma4).Usable();


    }
}
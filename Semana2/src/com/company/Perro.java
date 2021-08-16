package com.company;

import java.awt.*;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Perro {

    private String nombre;
    private Boolean adoptable;
    private String raza;
    private int anoNacimiento;
    private int peso;
    private Boolean chip;
    private Boolean lastimado;

    public Perro(String nombre, Boolean adoptable, String raza, int anoNacimiento, int peso, Boolean chip, Boolean lastimado) {
        this.nombre = nombre;
        this.adoptable = adoptable;
        this.raza = raza;
        this.anoNacimiento = anoNacimiento;
        this.peso = peso;
        this.chip = chip;
        this.lastimado = lastimado;
    }

    public void getEdad() {

        LocalDate fechaActual = LocalDate.now();
        int anoActual = fechaActual.getYear();
        System.out.println(anoActual - anoNacimiento);

    }

    public void tieneChip(){
        if(chip){
            System.out.println("No es factible a perderse.");
        }else {
            System.out.println("Es factible a perderse.");
        }
    }

    public void esAdoptable(){
        if(!lastimado && (peso > 5)){
            adoptable = true;
        }else{
            adoptable = false;
        }
    }

}


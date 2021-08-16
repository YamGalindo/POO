package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        try {
            Paciente paciente=new Paciente("Juan","Perez","12345",new Date(10,5,10)); //Pasa algo extraño con ese objeto Date
            paciente.darAlta(new Date = parse("2010, 8, 12")); //Fecha correcta
            paciente.darAlta(new Date(9, 8, 12)); //Fecha incorrecta
        } catch (PacienteException e) {

            e.printStackTrace();
        }

    }
}


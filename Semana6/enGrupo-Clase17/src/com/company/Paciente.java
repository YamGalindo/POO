package com.company;

import java.util.Date;

public class Paciente {
    String nombre;
    String apellido;
    String historiaClinica;
    Date fechaInternacion;
    Date fechaAlta;


    Paciente(String nombre, String apellido, String historiaClinica, Date fechaInternacion) throws PacienteException
    {
        Date hoy = new Date();

        if(fechaInternacion.after(hoy)){
//            System.out.println(hoy);
//            System.out.println(fechaInternacion.after(hoy));
//            System.out.println(fechaInternacion);
            throw new PacienteException("La fecha de internación es posterior a la fecha de actual");
        }else{
//            System.out.println(hoy);
//            System.out.println(fechaInternacion.after(hoy));
//            System.out.println(fechaInternacion);
            this.fechaInternacion=fechaInternacion;
        }

        this.nombre=nombre;
        this.apellido=apellido;
        fechaAlta=null;

        this.historiaClinica = historiaClinica;

    }

    public Date getFechaInternacion() {
        return fechaInternacion;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void darAlta(Date fechaAlta) throws PacienteException {
        if (fechaAlta.after(fechaInternacion))
            System.out.println("Ok, el paciente ha sido dado de alta");
        else
            throw new PacienteException("El paciente no puede salir sin haber ingresado");
    }



}

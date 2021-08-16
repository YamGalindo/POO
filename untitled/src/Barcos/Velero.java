package Barcos;

import java.util.Date;

public class Velero extends Embarcacion implements calcularAlquiler{

    private int cantMastiles;

    public Velero(int precioBase, int valorAdicional, int anoFabricacion, int eslora, Capitan capitan, int cantMastiles) {
        super(precioBase, valorAdicional, anoFabricacion, eslora, capitan);
        this.cantMastiles = cantMastiles;
    }

    public boolean esGrande() {
        if(getCantMastiles() > 4) return true;
            return false;
    }

    public void xd(){
        if(esGrande()) {System.out.println("Hola");
        }else {
            System.out.println("Adios");
        }
        System.out.println(alquilable());
     }

    public int getCantMastiles() {
        return cantMastiles;
    }

    @Override
    public int alquilable() {
        if(getAnoFabricacion()> 2020) return getPrecioBase() + getValorAdicional();
        return getPrecioBase();
    }



}

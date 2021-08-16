package Barcos;

import java.util.Date;

public class Embarcacion {

    private int precioBase;
    private int valorAdicional;
    private int anoFabricacion;
    private int eslora;
    private Capitan capitan;

    public Embarcacion(int precioBase, int valorAdicional, int anoFabricacion, int eslora, Capitan capitan) {
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.anoFabricacion = anoFabricacion;
        this.eslora = eslora;
        this.capitan = capitan;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }

    public int getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(int valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public int getAnoFabricacion() {
        return anoFabricacion;
    }

    public void setAnoFabricacion(int anoFabricacion) {
        this.anoFabricacion = anoFabricacion;
    }
}

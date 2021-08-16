package Barcos;

public class Yate extends Embarcacion implements calcularAlquiler{

    private int cantCamarotes;
    private boolean comprado;

    public Yate(int precioBase, int valorAdicional, int anoFabricacion, int eslora, Capitan capitan, int cantCamarotes, boolean comprado) {
        super(precioBase, valorAdicional, anoFabricacion, eslora, capitan);
        this.cantCamarotes = cantCamarotes;
        this.comprado = comprado;
    }

    public void comprar(){
        setComprado(true);
    }

    public Yate compararLujo(Yate yate1, Yate yate2){

        if(yate1.cantCamarotes > yate2.cantCamarotes) return yate1;
            return yate2;
    }

    @Override
    public int alquilable() {
        if(getAnoFabricacion() > 2020) return getPrecioBase() + getValorAdicional();
        return getPrecioBase();
    }

    public void setComprado(boolean comprado) {
        this.comprado = comprado;
    }
}

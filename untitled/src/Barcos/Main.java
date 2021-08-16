package Barcos;

public class Main {

    public static void main(String[] args) {

        Capitan pepe = new Capitan("pepe", "perez", 123);
        Capitan oscar = new Capitan("oscar", "perez", 123);

        Embarcacion barco = new Velero(100, 10, 2021, 20, pepe, 5);
        Embarcacion barco2 = new Yate(100, 10, 2019, 20, oscar, 5, false);
        Embarcacion barco3 = new Yate(100, 10, 2019, 20, oscar, 4, false);

        ((Velero) barco).esGrande();
        ((Velero) barco).xd();
        ((Velero) barco).alquilable();
    }
}

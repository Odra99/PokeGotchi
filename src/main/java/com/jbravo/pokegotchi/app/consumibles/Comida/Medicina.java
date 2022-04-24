package com.jbravo.pokegotchi.app.consumibles.Comida;

public abstract class Medicina {

    protected String aspecto;
    protected int curarEnfermedades;

    public Medicina(){}

    public String getAspecto() {
        return aspecto;
    }
    public int getCurarEnfermedades() {
        return curarEnfermedades;
    }
}

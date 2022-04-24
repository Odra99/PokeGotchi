package com.jbravo.pokegotchi.app.consumibles.Comida;

public abstract class Medicina {

    protected String aspecto;
    protected int curarEnfermedades;
    protected int precio;

    public Medicina(){}

    public String getAspecto() {
        return aspecto;
    }
    public int getCurarEnfermedades() {
        return curarEnfermedades;
    }

    public int getPrecio(){
        return precio;
    }
}

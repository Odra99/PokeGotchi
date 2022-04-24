package com.jbravo.pokegotchi.app.consumibles.Medicina;

public abstract class Comida {

    //Solo accesa a ella el programa principal en el main,
    // se declara una comida de cada una y se accede a ese obj cada vez que se de de comer
    // Se accesa a cada objeto comida para mostrar su imagen
    // El usuario solo tiene contadores int de cada comida

    protected String aspecto;
    protected int comidasParaMorir;
    protected int saciarPeticionComida = 1;
    protected int precio;

    public String getAspecto() {
        return aspecto;
    }

    public int getComidasParaMorir() {
        return comidasParaMorir;
    }

    public int getSaciarPeticionComida() {
        return saciarPeticionComida;
    }

    public int getPrecio(){
        return precio;
    }
}

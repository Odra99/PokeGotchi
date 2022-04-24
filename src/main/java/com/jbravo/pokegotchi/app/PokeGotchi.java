package com.jbravo.pokegotchi.app;

import com.jbravo.pokegotchi.app.consumibles.*;
import com.jbravo.pokegotchi.app.consumibles.Comida.Analgesico;
import com.jbravo.pokegotchi.app.consumibles.Comida.Antibiotico;
import com.jbravo.pokegotchi.app.consumibles.Comida.Vitaminas;
import com.jbravo.pokegotchi.app.consumibles.Medicina.Cereal;
import com.jbravo.pokegotchi.app.consumibles.Medicina.Manzana;
import com.jbravo.pokegotchi.app.consumibles.Medicina.Waffles;
import com.jbravo.pokegotchi.app.motor.Jugador;
import com.jbravo.pokegotchi.ui.PrincipalFrame;

public class PokeGotchi {

    public static Jugador jugador = new Jugador();
    // Comidas y medicinas a las que se accede
    public static final Manzana manzana = new Manzana();
    public static final Cereal cereal = new Cereal();
    public static final Waffles waffles = new Waffles();

    public static final Vitaminas vitaminas = new Vitaminas();
    public static final Analgesico analgesico = new Analgesico();
    public static final Antibiotico antibiotico = new Antibiotico();
    public static PrincipalFrame ventanaPrincipal = new PrincipalFrame();
    public static int tiempoDeVida = 15; //rango para el tiempo de vida random

    public static void main(String [] args){

        ventanaPrincipal.setLocationRelativeTo(null);
        ventanaPrincipal.setVisible(true);

    }
}

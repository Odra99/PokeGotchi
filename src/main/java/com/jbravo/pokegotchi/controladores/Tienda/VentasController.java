package com.jbravo.pokegotchi.controladores.Tienda;

import com.jbravo.pokegotchi.app.motor.Jugador;
import com.jbravo.pokegotchi.servidores.Tienda.VentasService;

public class VentasController {

    private VentasService ventas = new VentasService();
    
    public String venderManzana(Jugador jugador){
        return ventas.venderManzana(jugador);
    }

    public String venderCereal(Jugador jugador){
        return ventas.venderCereal(jugador);
    }

    public String venderWaffles(Jugador jugador){
        return ventas.venderWaffles(jugador);
    }

    public String venderVitaminas(Jugador jugador){
        return ventas.venderVitaminas(jugador);
    }

    public String venderAnalgesico(Jugador jugador){
        return ventas.venderAnalgesico(jugador);
    }

    public String venderAntibiotico(Jugador jugador){
        return ventas.venderAntibiotico(jugador);
    }

}

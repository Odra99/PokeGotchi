package com.jbravo.pokegotchi.controladores.Tienda;

import com.jbravo.pokegotchi.app.motor.Jugador;
import com.jbravo.pokegotchi.servidores.Tienda.VentasService;

public class VentasController {

    private VentasService ventas = new VentasService();



    public String venderComida(Jugador jugador, int posicion){
        return ventas.venderComida(jugador, posicion);
    }


    public String venderMedicinas(Jugador jugador, int posicion){
        return ventas.venderMedicina(jugador, posicion);
    }


}

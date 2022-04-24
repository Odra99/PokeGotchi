package com.jbravo.pokegotchi.servidores.Tienda;

import com.jbravo.pokegotchi.app.PokeGotchi;
import com.jbravo.pokegotchi.app.motor.Jugador;




public class VentasService {




    public String venderComida(Jugador jugador, int posicion){
        if(jugador.getMonedas() >= PokeGotchi.comidas[posicion].getPrecio()){
            jugador.setMonedas(jugador.getMonedas() - PokeGotchi.comidas[posicion].getPrecio());
            jugador.setContadorComida(posicion,jugador.getContadorComindaPosicion(posicion)+1);
            return "Compra realizada exitosamente";
        }else{
            return "No tiene suficiente dinero :c";
        }
    }

    public String venderMedicina(Jugador jugador, int posicion){
        if(jugador.getMonedas() >= PokeGotchi.medicinas[posicion].getPrecio()){
            jugador.setMonedas(jugador.getMonedas() - PokeGotchi.medicinas[posicion].getPrecio());
            jugador.setContadorComida(posicion,jugador.getContadorMedicinaPosicion(posicion)+1);
            return "Compra realizada exitosamente";
        }else{
            return "No tiene suficiente dinero :c";
        }
    }

    
}

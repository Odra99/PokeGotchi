package com.jbravo.pokegotchi.servidores.Tienda;

import com.jbravo.pokegotchi.app.PokeGotchi;
import com.jbravo.pokegotchi.app.motor.Jugador;




public class VentasService {


    public String venderManzana(Jugador jugador){
        
        if(jugador.getMonedas() >= PokeGotchi.manzana.getPrecio()){
            jugador.setMonedas(jugador.getMonedas() - PokeGotchi.manzana.getPrecio());
            jugador.setContadorManzanas(jugador.getContadorManzanas()+1);
            return "Compra realizada exitosamente";
        }else{
            return "No tiene suficiente dinero :c";
        }

    }

    public String venderCereal(Jugador jugador){
        if(jugador.getMonedas() >= PokeGotchi.cereal.getPrecio()){
            jugador.setMonedas(jugador.getMonedas() - PokeGotchi.cereal.getPrecio());
            jugador.setContadorManzanas(jugador.getContadorCereal()+1);
            return "Compra realizada exitosamente";
        }else{
            return "No tiene suficiente dinero :c";
        }

    }

    public String venderWaffles(Jugador jugador){
        if(jugador.getMonedas() >= PokeGotchi.waffles.getPrecio()){
            jugador.setMonedas(jugador.getMonedas() - PokeGotchi.waffles.getPrecio());
            jugador.setContadorManzanas(jugador.getContadorWaffles()+1);
            return "Compra realizada exitosamente";
        }else{
            return "No tiene suficiente dinero :c";
        }

    }

    public String venderVitaminas(Jugador jugador){
        if(jugador.getMonedas() >= PokeGotchi.vitaminas.getPrecio()){
            jugador.setMonedas(jugador.getMonedas() - PokeGotchi.vitaminas.getPrecio());
            jugador.setContadorManzanas(jugador.getContadorVitaminas()+1);
            return "Compra realizada exitosamente";
        }else{
            return "No tiene suficiente dinero :c";
        }

    }

    public String venderAnalgesico(Jugador jugador){
        if(jugador.getMonedas() >= PokeGotchi.analgesico.getPrecio()){
            jugador.setMonedas(jugador.getMonedas() - PokeGotchi.analgesico.getPrecio());
            jugador.setContadorManzanas(jugador.getContadorAnalgesico()+1);
            return "Compra realizada exitosamente";
        }else{
            return "No tiene suficiente dinero :c";
        }

    }

    public String venderAntibiotico(Jugador jugador){
        if(jugador.getMonedas() >= PokeGotchi.antibiotico.getPrecio()){
            jugador.setMonedas(jugador.getMonedas() - PokeGotchi.antibiotico.getPrecio());
            jugador.setContadorManzanas(jugador.getContadorAntibiotico()+1);
            return "Compra realizada exitosamente";
        }else{
            return "No tiene suficiente dinero :c";
        }

    }
}

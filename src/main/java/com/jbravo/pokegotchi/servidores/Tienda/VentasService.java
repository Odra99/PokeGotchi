package com.jbravo.pokegotchi.servidores.Tienda;

import com.jbravo.pokegotchi.app.consumibles.Comida.Analgesico;
import com.jbravo.pokegotchi.app.consumibles.Comida.Antibiotico;
import com.jbravo.pokegotchi.app.consumibles.Comida.Vitaminas;
import com.jbravo.pokegotchi.app.consumibles.Medicina.Cereal;
import com.jbravo.pokegotchi.app.consumibles.Medicina.Manzana;
import com.jbravo.pokegotchi.app.consumibles.Medicina.Waffles;
import com.jbravo.pokegotchi.app.motor.Jugador;




public class VentasService {

    private static Manzana manzana = new Manzana();
    private static Cereal cereal = new Cereal();
    private static Waffles waffles = new Waffles();
    private static Analgesico analgesico = new Analgesico();
    private static Vitaminas vitaminas = new Vitaminas();
    private static Antibiotico antibiotico = new Antibiotico();

    public String venderManzana(Jugador jugador){
        if(jugador.getMonedas() >= manzana.getPrecio()){
            jugador.setMonedas(jugador.getMonedas() - manzana.getPrecio());
            jugador.setContadorManzanas(jugador.getContadorManzanas()+1);
            return "Compra realizada exitosamente";
        }else{
            return "No tiene suficiente dinero :c";
        }

    }

    public String venderCereal(Jugador jugador){
        if(jugador.getMonedas() >= cereal.getPrecio()){
            jugador.setMonedas(jugador.getMonedas() - cereal.getPrecio());
            jugador.setContadorManzanas(jugador.getContadorCereal()+1);
            return "Compra realizada exitosamente";
        }else{
            return "No tiene suficiente dinero :c";
        }

    }

    public String venderWaffles(Jugador jugador){
        if(jugador.getMonedas() >= waffles.getPrecio()){
            jugador.setMonedas(jugador.getMonedas() - waffles.getPrecio());
            jugador.setContadorManzanas(jugador.getContadorWaffles()+1);
            return "Compra realizada exitosamente";
        }else{
            return "No tiene suficiente dinero :c";
        }

    }

    public String venderVitaminas(Jugador jugador){
        if(jugador.getMonedas() >= vitaminas.getPrecio()){
            jugador.setMonedas(jugador.getMonedas() - vitaminas.getPrecio());
            jugador.setContadorManzanas(jugador.getContadorVitaminas()+1);
            return "Compra realizada exitosamente";
        }else{
            return "No tiene suficiente dinero :c";
        }

    }

    public String venderAnalgesico(Jugador jugador){
        if(jugador.getMonedas() >= analgesico.getPrecio()){
            jugador.setMonedas(jugador.getMonedas() - analgesico.getPrecio());
            jugador.setContadorManzanas(jugador.getContadorAnalgesico()+1);
            return "Compra realizada exitosamente";
        }else{
            return "No tiene suficiente dinero :c";
        }

    }

    public String venderAntibiotico(Jugador jugador){
        if(jugador.getMonedas() >= antibiotico.getPrecio()){
            jugador.setMonedas(jugador.getMonedas() - antibiotico.getPrecio());
            jugador.setContadorManzanas(jugador.getContadorAntibiotico()+1);
            return "Compra realizada exitosamente";
        }else{
            return "No tiene suficiente dinero :c";
        }

    }
}

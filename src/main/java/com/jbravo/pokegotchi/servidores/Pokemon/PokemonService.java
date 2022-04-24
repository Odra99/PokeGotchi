package com.jbravo.pokegotchi.servidores.Pokemon;

import com.jbravo.pokegotchi.app.motor.Jugador;
import com.jbravo.pokegotchi.app.pokemons.PokemonVacio;

public class PokemonService {
    

    public String revivirPokemon(Jugador jugador,int posicion,  int precio){
        if(jugador.getCementerio(0) instanceof PokemonVacio){
            return "Este es un espacio vacío";
        }else{
            if(jugador.getMonedas()>= precio){
                jugador.getCementerio(posicion).revivir();
                Jugador.colocarNuevoPokemon(jugador.getCementerio(posicion));
                jugador.setCementerio(posicion, new PokemonVacio());
                jugador.setMonedas(jugador.getMonedas()-precio);
                return "";
            }else{
                return "No tiene suficientes monedas para revivir a esta mascota :c";
            }
        }
    }

}

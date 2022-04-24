package com.jbravo.pokegotchi.controladores.Pokemon;

import com.jbravo.pokegotchi.app.motor.Jugador;
import com.jbravo.pokegotchi.servidores.Pokemon.PokemonService;

public class PokemonController {
    
    private PokemonService pokemonService = new PokemonService();


    public String revivirPokemon(Jugador jugador,int posicion, int precio){
        return pokemonService.revivirPokemon(jugador, posicion,precio);
    }

}

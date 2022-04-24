package com.jbravo.pokegotchi.app.pokemons;


public class PokemonGen extends Pokemon{

    public PokemonGen(String apo, String aspecto, String nombre){
        super.nombrePokemon = nombre;
        super.apodo = apo;
        super.aspecto = aspecto;
        super.nivel = 1;

        super.fechaDeNacimiento = super.nacimiento();

    }
}

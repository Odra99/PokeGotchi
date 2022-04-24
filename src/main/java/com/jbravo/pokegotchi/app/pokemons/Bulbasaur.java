package com.jbravo.pokegotchi.app.pokemons;

public class Bulbasaur extends Pokemon{

    public Bulbasaur(String apo){
        super.nombrePokemon = "Bulbasaur";
        super.apodo = apo;
        super.aspecto = "/Sprites/001.png";

        super.fechaDeNacimiento = super.nacimiento();
    }
}

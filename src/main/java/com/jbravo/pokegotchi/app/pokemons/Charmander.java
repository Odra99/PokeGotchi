package com.jbravo.pokegotchi.app.pokemons;

public class Charmander extends Pokemon{

    public Charmander(String apo){
        super.nombrePokemon = "Charmander";
        super.apodo = apo;
        super.aspecto = "/Sprites/004.png";

        super.fechaDeNacimiento = super.nacimiento();
    }
}

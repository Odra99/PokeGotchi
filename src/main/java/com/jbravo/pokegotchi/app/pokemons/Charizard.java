package com.jbravo.pokegotchi.app.pokemons;

public class Charizard extends Pokemon{

    Charizard(String apo){
        super.nombrePokemon = "Charizard";
        super.apodo = apo;
        super.aspecto = "/Sprites/006.png";

        super.fechaDeNacimiento = super.nacimiento();
    }
}

package com.jbravo.pokegotchi.app.pokemons;

import javax.swing.*;

public class PokemonVacio extends Pokemon{

    public PokemonVacio(){
        super.nombrePokemon = "Espacio vacío :3";
        super.apodo = "Puedes adoptar en Tienda";
        super.aspecto = "/icons/Vacio.png";
        super.fechaDeNacimiento = " ";
        super.batallasParaSubirDeNivel = 0;

        super.nivel = 0;
    }

    @Override
    public void alimentar(String comida) {
        JOptionPane.showMessageDialog(null, "¡Espacio vacío! Puedes adoptar en tienda");
    }

    @Override
    public void curar(String medicina) {
        super.alerta("¡Espacio vacío! Puedes adoptar en tienda");
    }
}

package com.jbravo.pokegotchi.app.motor;

import com.jbravo.pokegotchi.app.PokeGotchi;
import com.jbravo.pokegotchi.app.pokemons.PokemonVacio;

import javax.swing.*;
import java.util.Random;

public class Paseo {

    public static void pasear(int posicion){

        if(Jugador.getPokemons(posicion) instanceof PokemonVacio){
            alertaWindow("Este es un espacio vacío, puedes adoptar en tienda");

        }else{

            Random random = new Random();
            Jugador.getPokemons(posicion).setContPeticionPaseo(0);

            int encontrarPokemonSalvaje = random.nextInt(2);

            if (encontrarPokemonSalvaje == 0) {  //Si encuentra un pokemon
                alertaWindow("Durante el paseo " + Jugador.getPokemons(posicion).getNombrePokemon() + " se encontró a un pokemon salvaje");
                Jugador.getPokemons(posicion).setContadorBatallas(Jugador.getPokemons(posicion).getContadorBatallas() + 1);

                int ganar = random.nextInt(2);
                if (ganar == 0) { //Le gana?
                    int dineroGanado = Jugador.getPokemons(posicion).DineroGanado();
                    alertaWindow("¡" + Jugador.getPokemons(posicion).getNombrePokemon() + " ganó la batalla y obtuvo " + dineroGanado + " monedas!");
                    PokeGotchi.jugador.setMonedas(PokeGotchi.jugador.getMonedas() + dineroGanado);
                } else {
                    //perdió

                    alertaWindow("¡" + Jugador.getPokemons(posicion).getNombrePokemon() + " perdió la batalla!");
                }

            } else {
                alertaWindow("Durante el paseo " + Jugador.getPokemons(posicion).getNombrePokemon() + " no se encontró ningún pokemon salvaje");
            }
            Jugador.getPokemons(posicion).SubirNivel();
            PokeGotchi.ventanaPrincipal.dibujarEnFrame();
        }
    }
    
    public static void alertaWindow(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
    }
}

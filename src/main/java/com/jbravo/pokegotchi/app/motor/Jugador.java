package com.jbravo.pokegotchi.app.motor;

import com.jbravo.pokegotchi.app.PokeGotchi;
import com.jbravo.pokegotchi.app.motor.vida.VidaPokemon;
import com.jbravo.pokegotchi.app.pokemons.Pokemon;
import com.jbravo.pokegotchi.app.pokemons.PokemonVacio;

import javax.swing.*;

public class Jugador {

    int monedas;
    int contadorManzanas;
    int contadorCereal;
    int contadorWaffles;
    int contadorVitaminas;
    int contadorAnalgesico;
    int contadorAntibiotico;

    static Pokemon [] pokemons = new Pokemon[5];      //pokemones disponibles
    static Pokemon [] cementerio = new Pokemon[5];    //pokemones muertos que pueden revivir :c

    public Jugador(){

        monedas             = 100;
        contadorManzanas    =   0;
        contadorCereal      =   0;
        contadorWaffles     =   0;
        contadorVitaminas   =   0;
        contadorAnalgesico  =   0;
        contadorAntibiotico =   0;

        for(int i = 0; i < 5; i++){
            pokemons[i] = new PokemonVacio();
            cementerio[i] = new PokemonVacio();
        }

    }

    public static Pokemon getPokemons(int posicion) {return pokemons[posicion];} //GET Y SET POKEMON
    public void setPokemons(int posicion, Pokemon cambio) {pokemons[posicion] = cambio;}

    public int getMonedas() {return monedas;}public void setMonedas(int monedas) {this.monedas = monedas;}
    public int getContadorManzanas() {return contadorManzanas;}public void setContadorManzanas(int contadorManzanas) {this.contadorManzanas = contadorManzanas;}
    public int getContadorCereal() {return contadorCereal;}public void setContadorCereal(int contadorCereal) {this.contadorCereal = contadorCereal;}
    public int getContadorWaffles() {return contadorWaffles;}public void setContadorWaffles(int contadorWaffles) {this.contadorWaffles = contadorWaffles;}
    public int getContadorVitaminas() {return contadorVitaminas;}public void setContadorVitaminas(int contadorVitaminas) {this.contadorVitaminas = contadorVitaminas;}
    public int getContadorAnalgesico() {return contadorAnalgesico;} public void setContadorAnalgesico(int contadorAnalgesico) {this.contadorAnalgesico = contadorAnalgesico;}
    public int getContadorAntibiotico() {return contadorAntibiotico;} public void setContadorAntibiotico(int contadorAntibiotico) {this.contadorAntibiotico = contadorAntibiotico;}

    public Pokemon getCementerio(int posicion) {return cementerio[posicion];}

    public void setCementerio(int posicion, Pokemon cambio) {cementerio[posicion] = cambio;}

    // Metodos funcionales para el jugador
    public static void colocarNuevoPokemon(Pokemon nuevo){
        int colocar = 0;
        String mensaje;
        for (int i = 0; i < pokemons.length; i++) {
            if(pokemons[i] instanceof PokemonVacio){
                colocar = i;
                break;
            }else{
               colocar = 11;
            }
        }
        if (colocar == 11){
            mensaje = "No hay espacios disponibles para colocar esta mascota";
        }else {
            pokemons[colocar] = nuevo;
            pokemons[colocar].setPosicionMascota(colocar);
            pokemons[colocar].setPosicionMascota(colocar);
            mensaje = "¡Mascota adoptada exitosamente!";
        }
        JFrame jFrame = new JFrame();
        JOptionPane.showMessageDialog(jFrame, mensaje);

        switch (colocar){ //Iniciar vida de los pokemones
            case 0: VidaPokemon vida1 = new VidaPokemon(colocar);vida1.start();break;
            case 1: VidaPokemon vida2 = new VidaPokemon(colocar);vida2.start();break;
            case 2: VidaPokemon vida3 = new VidaPokemon(colocar);vida3.start();break;
            case 3: VidaPokemon vida4 = new VidaPokemon(colocar);vida4.start();break;
            case 4: VidaPokemon vida5 = new VidaPokemon(colocar); vida5.start();break;
        }
    }

    public static void colocarCementerio(Pokemon nuevo){
        int colocar = 0;
        String mensaje;
        for (int i = 0; i < cementerio.length; i++) {
            if(cementerio[i] instanceof PokemonVacio){
                colocar = i;
                break;
            }else{
                colocar = 11;
            }
        }
        if (colocar == 11){
            mensaje = "No hay espacios disponibles para colocar nuevas mascotas en el cementerio";
        }else {
            cementerio[colocar] = nuevo;
            cementerio[colocar].setPosicionMascota(colocar);
            mensaje = "La mascota ha sido ubicada en el cementerio";
        }
        JFrame jFrame = new JFrame();
        JOptionPane.showMessageDialog(jFrame, mensaje);
    }

    public static void muerteMascota(int posicionMascota){

        colocarCementerio(pokemons[posicionMascota]);
        /*
        for (int i = 0; i < cementerio.length; i++) {
            if(cementerio[i] instanceof PokemonVacio){
                cementerio[i] = pokemons[posicionMascota];
                pokemons[posicionMascota] = new PokemonVacio();
            }
        }*/
        pokemons[posicionMascota] = new PokemonVacio();
        PokeGotchi.ventanaPrincipal.dibujarEnFrame();
    }
}

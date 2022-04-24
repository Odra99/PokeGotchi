package com.jbravo.pokegotchi.app.motor.vida;

import com.jbravo.pokegotchi.app.PokeGotchi;
import com.jbravo.pokegotchi.app.motor.Jugador;
import com.jbravo.pokegotchi.ui.PrincipalFrame;

import java.util.Random;

public class VidaPokemon extends Thread {

    private static int posicionMascota;
    private static boolean vivo = true;
    private String pokemon;
    private int vida;

    public VidaPokemon(int posicion){
        posicionMascota = posicion;
        pokemon = " '" + Jugador.getPokemons(posicionMascota).getNombrePokemon() + "' ";
    }

    @Override
    public void run(){
        Random random = new Random();
        int tiempoA;
        int tiempoB;
        int tiempoC;
        int tiempoD;

        try{

            do {
                Jugador.getPokemons(posicionMascota).vida();
                vida = Jugador.getPokemons(posicionMascota).getVida();
                tiempoA = (random.nextInt(vida) + 2) * 10000;
                Thread.sleep(tiempoA);
                Jugador.getPokemons(posicionMascota).setContPeticionPaseo( Jugador.getPokemons(posicionMascota).getContPeticionPaseo()+1);
                PokeGotchi.ventanaPrincipal.alerta("La mascota " + (posicionMascota + 1) + pokemon +" quiere salir a pasear");
                PokeGotchi.ventanaPrincipal.dibujarEnFrame();
                if(Jugador.getPokemons(posicionMascota).getContPeticionPaseo() == 4){
                    Jugador.getPokemons(posicionMascota).setContadorEnfermedades(Jugador.getPokemons(posicionMascota).getContadorEnfermedades()+1);
                    PokeGotchi.ventanaPrincipal.alerta("La mascota " + (posicionMascota + 1) + pokemon + " se enfermó por no pasear");
                    Jugador.getPokemons(posicionMascota).setContPeticionPaseo(0);
                    PokeGotchi.ventanaPrincipal.dibujarEnFrame();
                    comprobarEnfermedadesPokemon();
                }

                tiempoB = (random.nextInt(vida) + 2) * 10000;
                Thread.sleep(tiempoB);
                Jugador.getPokemons(posicionMascota).setContPeticionComida( Jugador.getPokemons(posicionMascota).getContPeticionComida()+1);
                PokeGotchi.ventanaPrincipal.alerta("La mascota " + (posicionMascota + 1) + pokemon + " quiere comer");
                PokeGotchi.ventanaPrincipal.dibujarEnFrame();
                if (Jugador.getPokemons(posicionMascota).getContPeticionComida() == Jugador.getPokemons(posicionMascota).getCantidadComidasParaMorir()){
                    //matar mascota
                    PokeGotchi.ventanaPrincipal.alerta("La mascota " + (posicionMascota + 1) + pokemon + " ha muerto de hambre");
                    PokeGotchi.ventanaPrincipal.dibujarEnFrame();
                    break;
                }

                if (Jugador.getPokemons(posicionMascota).getContadorComida() >= 2){
                    tiempoC = (random.nextInt(vida) + 2) * 10000;
                    Thread.sleep(tiempoC);
                    PokeGotchi.ventanaPrincipal.alerta("La mascota " + (posicionMascota + 1) + pokemon + " se hizo popo :c");
                    Jugador.getPokemons(posicionMascota).setContPopo(Jugador.getPokemons(posicionMascota).getContPopo()+1);
                    PokeGotchi.ventanaPrincipal.dibujarEnFrame();
                    Jugador.getPokemons(posicionMascota).setContadorComida(0);
                    if (Jugador.getPokemons(posicionMascota).getContPopo() == 3){
                        PokeGotchi.ventanaPrincipal.alerta("La mascota " + (posicionMascota + 1) + pokemon + " se ha enfermado por no limpiarlo");
                        Jugador.getPokemons(posicionMascota).setContPopo(0);
                        Jugador.getPokemons(posicionMascota).setContadorEnfermedades(Jugador.getPokemons(posicionMascota).getContadorEnfermedades()+1);
                        PokeGotchi.ventanaPrincipal.dibujarEnFrame();
                        comprobarEnfermedadesPokemon();
                    }
                }

                if(Jugador.getPokemons(posicionMascota).getNivel() == 5){
                    tiempoD = (random.nextInt(vida) + 2) * 10000;
                    Thread.sleep(tiempoD);
                    vivo = false;
                }

            } while (vivo);
            Jugador.muerteMascota(posicionMascota);
            PokeGotchi.ventanaPrincipal.dibujarEnFrame();
        }catch(Exception e){
            //implementar una logica para manejar la excepcion
        }
    }

    private void comprobarEnfermedadesPokemon(){
        if (Jugador.getPokemons(posicionMascota).getContadorEnfermedades()==6){
            Jugador.muerteMascota(posicionMascota);
            PokeGotchi.ventanaPrincipal.alerta("La mascota " + (posicionMascota + 1) + pokemon + " ha muerto por enfermedades :c");
            PokeGotchi.ventanaPrincipal.dibujarEnFrame();
        }
    }

}

package com.jbravo.pokegotchi.app.pokemons;

import com.jbravo.pokegotchi.app.PokeGotchi;
import com.jbravo.pokegotchi.app.motor.Jugador;
import com.jbravo.pokegotchi.app.motor.VidaPokemon;
import com.jbravo.pokegotchi.ui.PrincipalFrame;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public abstract class Pokemon {

    Random random = new Random();

    protected String nombrePokemon;
    protected String apodo;
    protected String aspecto;
    protected String fechaDeNacimiento;

    protected int nivel = 0;
    protected int contadorBatallas = 0;                     //cantidad de batallas realizadas
    protected int batallasParaSubirDeNivel = 1;             //cantidad de batallas que hay que alcanzar para subir de nivel

    protected int contadorComida = 0;                       //cuenta las veces que come, si llega a 2 hace popo, popo +1
    protected int contPeticionComida = 0;                   //cuenta las peticiones de comida,
    protected int cantidadComidasParaMorir = 5;             //por defecto 5 peticiones son necesarias para morir;
    protected int contPopo = 0;
    protected int contPeticionPaseo = 0;

    protected int posicionMascota;                          //indica la posicion del array donde se encuentra.

    protected int contadorEnfermedades = 0;                 //Si alcanza 6 muere
    protected int vida;
    protected int tiempoRandom = PokeGotchi.tiempoDeVida;   //random inicial del tiempo

    protected boolean enfermo = false;
    public Pokemon(){}                                      //Constructor

    //------------------------------------------------------------------------------------------------------------


    public String nacimiento(){
        Date fecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        return formato.format(fecha);
    }

    public void vida(){
        vida = nivel * tiempoRandom;
    }

    public void revivir(){
        fechaDeNacimiento = nacimiento();
        nivel = 1; //Reiniciar stats básicos -----------------
        contadorBatallas = 0;
        batallasParaSubirDeNivel = 1;
        contadorComida = 0;
        contPeticionComida = 0;
        cantidadComidasParaMorir = 5;
        contPopo = 0;
        contPeticionPaseo = 0;
        //posicionMascota;
        contadorEnfermedades = 0;
    }

    public int DineroGanado(){ return (10 + (20 * nivel) + (random.nextInt(15-1)+1)); }

    public void SubirNivel(){
        if (batallasParaSubirDeNivel == contadorBatallas){
            nivel = nivel + 1;
            batallasParaSubirDeNivel = (random.nextInt(15-5)+5) * nivel;
            JOptionPane.showMessageDialog(null, "¡" + nombrePokemon + " ha subido de nivel!");
        }
    }

    public void verificarEnfermedades(){//la mascota muere :c
        if(contadorEnfermedades == 6){
            Jugador.muerteMascota(posicionMascota);
        }
    }

    public void alimentar(String comida){
        switch (comida){
            case "Manzana": if (PokeGotchi.jugador.getContadorManzanas() >= 1){ //alimentar
                contPeticionComida = 0;
                cantidadComidasParaMorir = PokeGotchi.manzana.getComidasParaMorir();
                PokeGotchi.jugador.setContadorManzanas(PokeGotchi.jugador.getContadorManzanas()-1);
                contadorComida = contadorComida + 1;
                JOptionPane.showMessageDialog(null, "¡Le diste una manzana!");
            }else{//no tiene manzanas para darle
                JOptionPane.showMessageDialog(null, "No tiene manzanas para dar :c");}
            break;

            case "Cereal":
                if (PokeGotchi.jugador.getContadorCereal() >= 1){ //alimentar
                    contPeticionComida = 0;
                    cantidadComidasParaMorir = PokeGotchi.cereal.getComidasParaMorir();
                    PokeGotchi.jugador.setContadorCereal(PokeGotchi.jugador.getContadorCereal()-1);
                    contadorComida = contadorComida + 1;
                    JOptionPane.showMessageDialog(null, "¡Le diste cereal!");
                }else{//no tiene cereal para darle
                    JOptionPane.showMessageDialog(null, "No tiene cereal para dar :c");}
                break;

            default:
                if (PokeGotchi.jugador.getContadorWaffles() >= 1){ //alimentar
                    contPeticionComida = 0;
                    cantidadComidasParaMorir = PokeGotchi.waffles.getComidasParaMorir();
                    PokeGotchi.jugador.setContadorWaffles(PokeGotchi.jugador.getContadorWaffles()-1);
                    contadorComida = contadorComida + 1;
                    JOptionPane.showMessageDialog(null, "¡Le diste waffles!");
                }else{//no tiene manzanas para darle
                    JOptionPane.showMessageDialog(null, "No tiene waffles para dar :c");}
                break;
        }
    }


    public void curar(String medicina){
        if(contadorEnfermedades > 0){
            switch (medicina){
                case "Vitaminas":
                    if(PokeGotchi.jugador.getContadorVitaminas() >= 1){
                        contadorEnfermedades = contadorEnfermedades - PokeGotchi.vitaminas.getCurarEnfermedades();
                        PokeGotchi.jugador.setContadorVitaminas(PokeGotchi.jugador.getContadorVitaminas()-1);
                        alerta("Le diste vitaminas, curaste 1 enfermedad");
                    }else{
                        alerta("No tiene vitaminas para dar :c");
                    }break;
                case "Analgesico":
                    if(PokeGotchi.jugador.getContadorAnalgesico()>=1){
                        contadorEnfermedades = contadorEnfermedades - PokeGotchi.analgesico.getCurarEnfermedades();
                        PokeGotchi.jugador.setContadorAnalgesico(PokeGotchi.jugador.getContadorAnalgesico()-1);
                        alerta("Le diste analgésico, curaste 2 enfermedades");
                    }else{
                        alerta("No tiene analgesico para dar :c");
                    }break;

                case "Antibiotico":

                    if (PokeGotchi.jugador.getContadorAntibiotico()>=1){
                        contadorEnfermedades = contadorEnfermedades - PokeGotchi.antibiotico.getCurarEnfermedades();
                        PokeGotchi.jugador.setContadorAntibiotico(PokeGotchi.jugador.getContadorAntibiotico()-1);
                        alerta("Le diste antibiotico, curaste 3 enfermedades");
                    }else{
                        alerta("No tiene antibiotico para dar");
                    }break;
            }
        }else{
            alerta("No hay enfermedades que curar :3");
        }
        if(contadorEnfermedades<0){
            contadorEnfermedades = 0;
        }
        PokeGotchi.ventanaPrincipal.dibujarEnFrame();

    }
    private void corregirEnfermedades(){ if(contadorEnfermedades < 0 ){contadorEnfermedades = 0;}}

    protected void alerta(String mensaje){JOptionPane.showMessageDialog(null, mensaje);}

    public Random getRandom() {
        return random;
    }

    public String getNombrePokemon() {
        return nombrePokemon;
    }

    public String getApodo() {
        return apodo;
    }

    public String getAspecto() {
        return aspecto;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public int getNivel() {
        return nivel;
    }

    public int getContadorBatallas() {
        return contadorBatallas;
    }

    public int getBatallasParaSubirDeNivel() {
        return batallasParaSubirDeNivel;
    }

    public int getContadorComida() {
        return contadorComida;
    }

    public int getContPeticionComida() {
        return contPeticionComida;
    }

    public int getCantidadComidasParaMorir() {
        return cantidadComidasParaMorir;
    }

    public int getContPopo() {
        return contPopo;
    }

    public int getContPeticionPaseo() {
        return contPeticionPaseo;
    }

    public int getPosicionMascota() {
        return posicionMascota;
    }

    public int getContadorEnfermedades() {
        return contadorEnfermedades;
    }

    public boolean isEnfermo() {return enfermo;}

    public int getVida() {return vida;}

    public int getTiempoRandom() {return tiempoRandom;}
    ////////////////////////////////////


    public void setNombrePokemon(String nombrePokemon) {
        this.nombrePokemon = nombrePokemon;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setAspecto(String aspecto) {
        this.aspecto = aspecto;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setContadorBatallas(int contadorBatallas) {
        this.contadorBatallas = contadorBatallas;
    }

    public void setBatallasParaSubirDeNivel(int batallasParaSubirDeNivel) {
        this.batallasParaSubirDeNivel = batallasParaSubirDeNivel;
    }

    public void setContadorComida(int contadorComida) {
        this.contadorComida = contadorComida;
    }

    public void setContPeticionComida(int contPeticionComida) {
        this.contPeticionComida = contPeticionComida;
    }

    public void setCantidadComidasParaMorir(int cantidadComidasParaMorir) {
        this.cantidadComidasParaMorir = cantidadComidasParaMorir;
    }

    public void setContPopo(int contPopo) {
        this.contPopo = contPopo;
    }

    public void setContPeticionPaseo(int contPeticionPaseo) {
        this.contPeticionPaseo = contPeticionPaseo;
    }

    public void setPosicionMascota(int posicionMascota) {
        this.posicionMascota = posicionMascota;
    }

    public void setContadorEnfermedades(int contadorEnfermedades) {
        this.contadorEnfermedades = contadorEnfermedades;
    }

    public void setEnfermo(boolean enfermo) {this.enfermo = enfermo;}

    public void setVida(int vida) {this.vida = vida;}

    public void setTiempoRandom(int tiempoRandom) {this.tiempoRandom = tiempoRandom;}
}

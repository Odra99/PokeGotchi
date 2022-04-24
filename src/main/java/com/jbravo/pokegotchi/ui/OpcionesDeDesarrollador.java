package com.jbravo.pokegotchi.ui;

import com.jbravo.pokegotchi.app.PokeGotchi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OpcionesDeDesarrollador extends JFrame {


    private JPanel panel1;
    private JSpinner tiempoDeVidaSpnr;
    private JButton okButton;
    private JSpinner monedasGratisSpnr;
    private JButton okButton1;

    public OpcionesDeDesarrollador(){
        setSize(500,200);
        setContentPane(panel1);
        this.setTitle("Opciones de desarrollador - PokeGotchi");

        Image icon = new ImageIcon(getClass().getResource("/Sprites/025.png")).getImage();
        setIconImage(icon);
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { //cambiar el tiempo de vida

                try{
                    PokeGotchi.tiempoDeVida = Integer.parseInt(tiempoDeVidaSpnr.getValue().toString());
                    JOptionPane.showMessageDialog(null, "Ha cambiado el tiempo a: " + tiempoDeVidaSpnr.getValue().toString());
                }catch (Exception x){
                    //manejar excepcion
                }

            }
        });
        okButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    PokeGotchi.jugador.setMonedas(Integer.parseInt(monedasGratisSpnr.getValue().toString()));
                    PokeGotchi.ventanaPrincipal.dibujarEnFrame();
                    JOptionPane.showMessageDialog(null, "Sus monedas han cambiado a " + monedasGratisSpnr.getValue().toString());
                }catch (Exception a){
                    //manejar excepcion
                }
            }
        });
    }

}

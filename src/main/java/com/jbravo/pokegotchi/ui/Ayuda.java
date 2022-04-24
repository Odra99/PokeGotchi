package com.jbravo.pokegotchi.ui;

import javax.swing.*;
import java.awt.*;

public class Ayuda extends JFrame {


    private JPanel panel1;

    public Ayuda(){
        setSize(650,450);
        setContentPane(panel1);
        this.setTitle("Ayuda - PokeGotchi");

        Image icon = new ImageIcon(getClass().getResource("/Sprites/025.png")).getImage();
        setIconImage(icon);
    }
}

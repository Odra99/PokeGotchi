package com.jbravo.pokegotchi.ui;

import javax.swing.*;
import java.awt.*;

public class AcercaDeFrame extends JDialog {


    private JPanel panel1;

    public AcercaDeFrame(){
        setSize(400,200);
        setContentPane(panel1);
        this.setTitle("Acerca De - PokeGotchi");

        Image icon = new ImageIcon(getClass().getResource("/Sprites/025.png")).getImage();
        setIconImage(icon);
    }
}

package com.jbravo.pokegotchi.ui;

import com.jbravo.pokegotchi.app.PokeGotchi;
import com.jbravo.pokegotchi.app.motor.Jugador;
import com.jbravo.pokegotchi.app.motor.Paseo;
import com.jbravo.pokegotchi.app.motor.tienda.ListadoPokemons;
import com.jbravo.pokegotchi.app.pokemons.Pokemon;
import com.jbravo.pokegotchi.app.pokemons.PokemonGen;
import com.jbravo.pokegotchi.app.pokemons.PokemonVacio;
import com.jbravo.pokegotchi.controladores.Pokemon.PokemonController;
import com.jbravo.pokegotchi.controladores.Tienda.VentasController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class PrincipalFrame extends JFrame{
    private JTabbedPane PrincipalJtp;
    private JPanel MascotasPnl;
    private JPanel TiendaPnl;
    private JPanel principalPanelPnl = new JPanel();
    private JTabbedPane MascotasJtp;
    private JPanel mascota1Pnl;
    private JPanel mascota2Pnl;
    private JPanel mascota3Pnl;
    private JPanel mascota4Pnl;
    private JButton curarMasc1Btn;
    private JButton alimentarMasc1Btn;
    private JButton limpiarMasc1Btn;
    private JLabel aspMasc1Lbl=new JLabel();
    private JLabel nombMasc1Lbl=new JLabel();
    private JLabel apMasc1Lbl=new JLabel();
    private JLabel fnMasc1Lbl=new JLabel();
    private JLabel nivelMasc1Lbl=new JLabel();
    private JLabel batMasc1Lbl=new JLabel();
    private JLabel batSubNivMasc1Lbl=new JLabel();
    private JLabel contEnfMasc1Lbl=new JLabel();
    private JLabel contComidasMasc1Lbl=new JLabel();
    private JLabel contPetComidaMasc1Lbl=new JLabel();
    private JLabel contPoposMasc1Lbl=new JLabel();
    private JLabel contPetPaseoMasc1Lbl=new JLabel();
    private JButton pasearMasc1Btn;
    private JLabel aspMasc2Lbl=new JLabel();
    private JButton pasearMasc2Btn;
    private JButton alimentarMasc2Btn;
    private JButton curarMasc2Btn;
    private JButton limpiarMasc2Btn;
    private JLabel nombMasc2Lbl=new JLabel();
    private JLabel apMasc2Lbl=new JLabel();
    private JLabel fnMasc2Lbl=new JLabel();
    private JLabel contPetPaseoMasc2Lbl=new JLabel();
    private JLabel nivelMasc2Lbl=new JLabel();
    private JLabel batMasc2Lbl=new JLabel();
    private JLabel batSubNivMasc2Lbl=new JLabel();
    private JLabel contEnfMasc2Lbl=new JLabel();
    private JLabel contComidasMasc2Lbl=new JLabel();
    private JLabel contPetComidaMasc2Lbl=new JLabel();
    private JLabel contPoposMasc2Lbl=new JLabel();
    private JButton pasearButton;
    private JButton alimentarButton;
    private JButton curarButton;
    private JButton limpiarButton;
    private JLabel nombMasc3Lbl=new JLabel();
    private JLabel apMasc3Lbl=new JLabel();
    private JLabel fnMasc3Lbl=new JLabel();
    private JLabel contPetPaseoMasc3Lbl=new JLabel();
    private JLabel nivelMasc3Lbl=new JLabel();
    private JLabel batMasc3Lbl=new JLabel();
    private JLabel batSubNivMasc3Lbl=new JLabel();
    private JLabel contEnfMasc3Lbl=new JLabel();
    private JLabel contComidasMasc3Lbl=new JLabel();
    private JLabel contPetComidaMasc3Lbl=new JLabel();
    private JLabel contPoposMasc3Lbl=new JLabel();
    private JLabel aspMasc3Lbl=new JLabel();
    private JButton Pasear;
    private JButton alimentarMasc4Btn;
    private JButton Curar;
    private JButton limpiarButton1;
    private JLabel nombMasc4Lbl;
    private JLabel apMasc4Lbl;
    private JLabel fnMasc4Lbl;
    private JLabel contPetPaseoMasc4Lbl;
    private JLabel nivelMasc4Lbl;
    private JLabel batMasc4Lbl;
    private JLabel batSubNivMasc4Lbl;
    private JLabel contEnfMasc4Lbl;
    private JLabel contComidasMasc4Lbl;
    private JLabel contPetComidaMasc4Lbl;
    private JLabel contPoposMasc4Lbl;
    private JLabel aspMasc4Lbl;
    private JButton pasearButton1;
    private JButton alimentarMasc5Btn;
    private JButton curarButton1;
    private JButton limpiarButton2;
    private JLabel nombMasc5Lbl;
    private JLabel apMasc5Lbl;
    private JLabel fnMasc5Lbl;
    private JLabel contPetPaseoMasc5Lbl;
    private JLabel nivelMasc5Lbl;
    private JLabel batMasc5Lbl;
    private JLabel batSubNivMasc5Lbl;
    private JLabel contEnfMasc5Lbl;
    private JLabel contComidasMasc5Lbl;
    private JLabel contPetComidaMasc5Lbl;
    private JLabel contPoposMasc5Lbl;
    private JLabel aspMasc5Lbl;
    private JSpinner posicionPokemonSpnr;
    private JButton previsualizarPokemonButton;
    private JButton adoptarPokemonBtn;
    private JLabel previsualizarPokemonLbl;
    private JTextField apodoMascTxf;
    private JLabel contManzanasLbl;
    private JLabel contCerealLbl;
    private JLabel contWafflesLbl;
    private JLabel contVitaminasLbl;
    private JLabel contAnalgesicoLbl;
    private JLabel contAntibioticoLbl;
    private JComboBox medicinaCbxMasc1 = new JComboBox<>();
    private JComboBox comidaCbxMasc1= new JComboBox<>();
    private JComboBox comidaCbxMasc2= new JComboBox<>();
    private JComboBox medicinaCbxMasc2= new JComboBox<>();
    private JComboBox medicinaCbxMasc3= new JComboBox<>();
    private JComboBox comidaCbxMasc3= new JComboBox<>();
    private JComboBox medicinaCbxMasc4= new JComboBox<>();
    private JComboBox comidaCbxMasc4= new JComboBox<>();
    private JComboBox comidaCbxMasc5= new JComboBox<>();
    private JComboBox medicinaCbxMasc5= new JComboBox<>();
    private JButton $10Button;
    private JButton $30Button;
    private JButton $50Button;
    private JButton $20Button;
    private JButton $50Button1;
    private JButton $80Button;
    private JLabel monedasJugadorLbl;
    private JLabel nombreMascotaPrevLbl;
    private JLabel alertasLbl;
    private JButton button1;
    private JButton ayudaButton;
    private JButton opcionesDeDesarrolladorButton;
    private JButton cem1Lbl;
    private JButton cem2Lbl;
    private JButton cem3Lbl;
    private JButton cem4Lbl;
    private JButton cem5Lbl;
    private JLabel precioLbl1;
    private JLabel precioLbl2;
    private JLabel precioLbl3;
    private JLabel precioLbl4;
    private JLabel precioLbl5;
    private JLabel lblRevivirMascotas;

    private int precioARevivir1;
    private int precioARevivir2;
    private int precioARevivir3;
    private int precioARevivir4;
    private int precioARevivir5;

    private final JFrame alerta = new JFrame();

    private VentasController ventaControler = new VentasController();
    private PokemonController pokemonController = new PokemonController();

    public PrincipalFrame(){
        setSize(750,640);
        setContentPane(principalPanelPnl);
        this.setTitle("PokeGotchi");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Image icon = new ImageIcon(getClass().getResource("/Sprites/025.png")).getImage();
        setIconImage(icon);

        llenarCbx();
        dibujarEnFrame();
        dibujarMonedas();

        previsualizarPokemonButton.addActionListener(new ActionListener() { //PREVISUALIZAR POKEMON ------------------
            @Override
            public void actionPerformed(ActionEvent e) {
                int posicion = 1;
                try{
                    posicion = Integer.parseInt(posicionPokemonSpnr.getValue().toString());
                }catch (Exception a){
                    //manejar excepcion
                    alertaWindow("Ha introducido un valor que no se puede procesar, se tomará 1 por defecto");
                }
                String pokemonAGenerar = ListadoPokemons.Pokemon(posicion);
                String[] propiedades = pokemonAGenerar.split("-");
                previsualizarPokemonLbl.setIcon(new ImageIcon(getClass().getResource(propiedades[0])));
                nombreMascotaPrevLbl.setText("El Pokemon seleccionado es: " + propiedades[1]);
            }
        });
        adoptarPokemonBtn.addActionListener(new ActionListener() { //ADOPTAR POKEMON ---------------------------------
            @Override
            public void actionPerformed(ActionEvent e) {
                int posicion = 1;
                try{
                    posicion = Integer.parseInt(posicionPokemonSpnr.getValue().toString());
                }catch (Exception a){
                    //manejar excepcion
                    alertaWindow("Ha introducido un valor que no se puede procesar, se tomará 1 por defecto");
                    posicion = 1;
                }
                if(PokeGotchi.jugador.getMonedas() >= 50){
                    if(posicion <1 || posicion>151){
                        alertaWindow("Imposible, posición inválida");
                    }else{
                        String pokemonAGenerar = ListadoPokemons.Pokemon(posicion);
                        String[] propiedades = pokemonAGenerar.split("-");
                        String apodo = apodoMascTxf.getText();
                        Pokemon nuevo = new PokemonGen(apodo,propiedades[0],propiedades[1]);
                        Jugador.colocarNuevoPokemon(nuevo);
                        apodoMascTxf.setText("");
                        PokeGotchi.jugador.setMonedas(PokeGotchi.jugador.getMonedas() - 50);
                    }
                }else{
                    alertaWindow("Usted no tiene dinero suficiente para adoptar una mascota :c");
                }
                dibujarEnFrame();
                nombreMascotaPrevLbl.setText("Seleccione una posicion");
            }
        });
        $10Button.addActionListener(new ActionListener() {//VENDER MANZANA, VALE 10 -------------------------------------
            @Override
            public void actionPerformed(ActionEvent e) {
                String mensaje = ventaControler.venderManzana(PokeGotchi.jugador);
                
                JOptionPane.showMessageDialog(alerta, mensaje);
                
                dibujarMonedas();dibujarInventario();
            }
        });
        $30Button.addActionListener(new ActionListener() {//VENDER CEREAL, VALE 30
            @Override
            public void actionPerformed(ActionEvent e) {
                String mensaje = ventaControler.venderCereal(PokeGotchi.jugador);
                
                JOptionPane.showMessageDialog(alerta, mensaje);
                
                dibujarMonedas();dibujarInventario();
            }
        });
        $50Button.addActionListener(new ActionListener() { // VENDER WAFFLES
            @Override
            public void actionPerformed(ActionEvent e) {
                String mensaje = ventaControler.venderWaffles(PokeGotchi.jugador);
                
                JOptionPane.showMessageDialog(alerta, mensaje);
                
                dibujarMonedas();dibujarInventario();
            }
        });
        $20Button.addActionListener(new ActionListener() { //VENDER VITAMINAS
            @Override
            public void actionPerformed(ActionEvent e) {
                String mensaje = ventaControler.venderVitaminas(PokeGotchi.jugador);
                
                JOptionPane.showMessageDialog(alerta, mensaje);
                dibujarMonedas();dibujarInventario();
            }
        });
        $50Button1.addActionListener(new ActionListener() { //VENDER ANALGESICO
            @Override
            public void actionPerformed(ActionEvent e) {
                String mensaje = ventaControler.venderAnalgesico(PokeGotchi.jugador);
                
                JOptionPane.showMessageDialog(alerta, mensaje);
                dibujarMonedas();dibujarInventario();
            }
        });
        $80Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String mensaje = ventaControler.venderAntibiotico(PokeGotchi.jugador);
                
                JOptionPane.showMessageDialog(alerta, mensaje);
                dibujarMonedas();
                dibujarInventario();
            }
        });
        alimentarMasc1Btn.addActionListener(new ActionListener() { //ALIMENTAR MASCOTAS-------------------------------------------
            @Override
            public void actionPerformed(ActionEvent e) {
                String comida = Objects.requireNonNull(comidaCbxMasc1.getSelectedItem()).toString();
                comida = comidaCbxMasc1.getSelectedItem().toString();

                Jugador.getPokemons(0).alimentar(comida);
                dibujarEnFrame();
            }
        });
        alimentarMasc2Btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String comida = Objects.requireNonNull(comidaCbxMasc2.getSelectedItem()).toString();
                comida = comidaCbxMasc2.getSelectedItem().toString();

                Jugador.getPokemons(1).alimentar(comida);
                dibujarEnFrame();
            }
        });
        alimentarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String comida = Objects.requireNonNull(comidaCbxMasc3.getSelectedItem()).toString();
                comida = comidaCbxMasc3.getSelectedItem().toString();

                Jugador.getPokemons(2).alimentar(comida);
                dibujarEnFrame();
            }
        });
        alimentarMasc4Btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String comida = Objects.requireNonNull(comidaCbxMasc4.getSelectedItem()).toString();
                comida = comidaCbxMasc4.getSelectedItem().toString();

                Jugador.getPokemons(3).alimentar(comida);
                dibujarEnFrame();
            }
        });
        alimentarMasc5Btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String comida = Objects.requireNonNull(comidaCbxMasc5.getSelectedItem()).toString();
                comida = comidaCbxMasc5.getSelectedItem().toString();

                Jugador.getPokemons(4).alimentar(comida);
                dibujarEnFrame();
            }
        });
        limpiarMasc1Btn.addActionListener(new ActionListener() { // LIMPIAR MASCOTAS ---------------------------------------------
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiarMascota(0);
            }
        });
        limpiarMasc2Btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiarMascota(1);
            }
        });
        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiarMascota(2);
            }
        });
        limpiarButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiarMascota(3);
            }
        });
        limpiarButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiarMascota(4);
            }
        });
        curarMasc1Btn.addActionListener(new ActionListener() { //CURAR POKEMONES -------------------------------------------
            @Override
            public void actionPerformed(ActionEvent e) {
                String medicina = Objects.requireNonNull(medicinaCbxMasc1.getSelectedItem()).toString();
                medicina = medicinaCbxMasc1.getSelectedItem().toString();
                Jugador.getPokemons(0).curar(medicina);
                dibujarEnFrame();
            }
        });
        curarMasc2Btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String medicina = Objects.requireNonNull(medicinaCbxMasc2.getSelectedItem()).toString();
                medicina = medicinaCbxMasc2.getSelectedItem().toString();
                Jugador.getPokemons(1).curar(medicina);
                dibujarEnFrame();
            }
        });
        curarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String medicina = Objects.requireNonNull(medicinaCbxMasc3.getSelectedItem()).toString();
                medicina = medicinaCbxMasc3.getSelectedItem().toString();
                Jugador.getPokemons(2).curar(medicina);
                dibujarEnFrame();
            }
        });
        Curar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String medicina = Objects.requireNonNull(medicinaCbxMasc4.getSelectedItem()).toString();
                medicina = medicinaCbxMasc4.getSelectedItem().toString();
                Jugador.getPokemons(3).curar(medicina);
                dibujarEnFrame();
            }
        });
        curarButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String medicina = Objects.requireNonNull(medicinaCbxMasc5.getSelectedItem()).toString();
                medicina = medicinaCbxMasc5.getSelectedItem().toString();
                Jugador.getPokemons(4).curar(medicina);
                dibujarEnFrame();
            }
        });
        button1.addActionListener(new ActionListener() { //MENU ACERCA DE, AYUDA Y OPCIONES DE DESARROLLADOR ---------------------------------------------------
            @Override
            public void actionPerformed(ActionEvent e) {
                AcercaDeFrame acercaDeFrame = new AcercaDeFrame();
                acercaDeFrame.setLocationRelativeTo(null);
                acercaDeFrame.setVisible(true);
            }
        });
        ayudaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ayuda ayuda = new Ayuda();
                ayuda.setLocationRelativeTo(null);
                ayuda.setVisible(true);
            }
        });
        opcionesDeDesarrolladorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                OpcionesDeDesarrollador opcionesDeDesarrollador = new OpcionesDeDesarrollador();
                opcionesDeDesarrollador.setLocationRelativeTo(null);
                opcionesDeDesarrollador.setVisible(true);
            }
        });
        cem1Lbl.addActionListener(new ActionListener() { // REVIVIR POKEMONES ---------------------------
            @Override
            public void actionPerformed(ActionEvent e) {
                String mensaje = pokemonController.revivirPokemon(PokeGotchi.jugador,0, precioARevivir1);

                if(mensaje != ""){
                    alertaWindow(mensaje);
                }
                dibujarEnFrame();
            }
        });
        cem2Lbl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String mensaje = pokemonController.revivirPokemon(PokeGotchi.jugador,1, precioARevivir2);

                if(mensaje != ""){
                    alertaWindow(mensaje);
                }
                dibujarEnFrame();
            }
        });
        cem3Lbl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String mensaje = pokemonController.revivirPokemon(PokeGotchi.jugador,2, precioARevivir3);

                if(mensaje != ""){
                    alertaWindow(mensaje);
                }
                dibujarEnFrame();
            }
        });
        cem4Lbl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String mensaje = pokemonController.revivirPokemon(PokeGotchi.jugador,3, precioARevivir4);

                if(mensaje != ""){
                    alertaWindow(mensaje);
                }
                dibujarEnFrame();
            }
        });
        cem5Lbl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String mensaje = pokemonController.revivirPokemon(PokeGotchi.jugador,4, precioARevivir1);

                if(mensaje != ""){
                    alertaWindow(mensaje);
                }
                dibujarEnFrame();
            }
        });
        pasearMasc1Btn.addActionListener(new ActionListener() { //PASEAR -----------------------------------------
            @Override
            public void actionPerformed(ActionEvent e) {
                Paseo.pasear(0);
            }
        });
        pasearMasc2Btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Paseo.pasear(1);
            }
        });
        pasearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Paseo.pasear(2);
            }
        });
        Pasear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Paseo.pasear(3);
            }
        });
        pasearButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Paseo.pasear(4);
            }
        });
    }

    public void dibujarEnFrame() {
    dibujarMasc1();
    dibujarMasc2();
    dibujarMasc3();
    dibujarMasc4();
    dibujarMasc5();
    dibujarInventario();
    dibujarCementerio();
    dibujarMonedas();
    }

    private void dibujarMasc1(){
        //Dibujar aspectos
        aspMasc1Lbl.setIcon(new ImageIcon(getClass().getResource(Jugador.getPokemons(0).getAspecto())));
        //Dibujar nombres -------------------------------------------------------------------------------------------------------
        nombMasc1Lbl.setText(Jugador.getPokemons(0).getNombrePokemon());
        //Dibujar apodos
        apMasc1Lbl.setText(Jugador.getPokemons(0).getApodo());
        //Dibujar fecha de nacimiento
        fnMasc1Lbl.setText(Jugador.getPokemons(0).getFechaDeNacimiento());
        //Dibujar cont paseo ----------------------------------------------------------------------------------------------------
        contPetPaseoMasc1Lbl.setText(String.valueOf(Jugador.getPokemons(0).getContPeticionPaseo()));
        //Dubujar niveles
        nivelMasc1Lbl.setText( String.valueOf(Jugador.getPokemons(0).getNivel()));
        //Dibujar batallas
        batMasc1Lbl.setText(String.valueOf(Jugador.getPokemons(0).getContadorBatallas()));
        //Dibujar batallas para subir de nivel
        batSubNivMasc1Lbl.setText(String.valueOf(Jugador.getPokemons(0).getBatallasParaSubirDeNivel()));
        //Dibujar contador enfermedades
        contEnfMasc1Lbl.setText(String.valueOf(Jugador.getPokemons(0).getContadorEnfermedades()));
        //dibujar contador comidas
        contComidasMasc1Lbl.setText(String.valueOf(Jugador.getPokemons(0).getContadorComida()));
        //dibujar peticiones de comida
        contPetComidaMasc1Lbl.setText(String.valueOf(Jugador.getPokemons(0).getContPeticionComida()));
        //dibujar contador popos
        contPoposMasc1Lbl.setText(String.valueOf(Jugador.getPokemons(0).getContPopo()));

    }


    public void dibujarMasc2(){

        aspMasc2Lbl.setIcon(new ImageIcon(getClass().getResource(Jugador.getPokemons(1).getAspecto())));
        //Dibujar nombres -------------------------------------------------------------------------------------------------------
        nombMasc2Lbl.setText(Jugador.getPokemons(1).getNombrePokemon());/**/apMasc2Lbl.setText(Jugador.getPokemons(1).getApodo());/**/fnMasc2Lbl.setText(Jugador.getPokemons(1).getFechaDeNacimiento());
        contPetPaseoMasc2Lbl.setText(String.valueOf(Jugador.getPokemons(1).getContPeticionPaseo()));
        nivelMasc2Lbl.setText( String.valueOf(Jugador.getPokemons(1).getNivel()));/**/batMasc2Lbl.setText(String.valueOf(Jugador.getPokemons(1).getContadorBatallas()));/**/batSubNivMasc2Lbl.setText(String.valueOf(Jugador.getPokemons(1).getBatallasParaSubirDeNivel()));
        contEnfMasc2Lbl.setText(String.valueOf(Jugador.getPokemons(1).getContadorEnfermedades()));
        contComidasMasc2Lbl.setText(String.valueOf(Jugador.getPokemons(1).getContadorComida()));/**/contPetComidaMasc2Lbl.setText(String.valueOf(Jugador.getPokemons(1).getContPeticionComida()));
        contPoposMasc2Lbl.setText(String.valueOf(Jugador.getPokemons(1).getContPopo()));
    }

    public void dibujarMasc3(){
        aspMasc3Lbl.setIcon(new ImageIcon(getClass().getResource(Jugador.getPokemons(2).getAspecto())));
        //Dibujar nombres -------------------------------------------------------------------------------------------------------
        nombMasc3Lbl.setText(Jugador.getPokemons(2).getNombrePokemon());/**/apMasc3Lbl.setText(Jugador.getPokemons(2).getApodo());/**/fnMasc3Lbl.setText(Jugador.getPokemons(2).getFechaDeNacimiento());
        contPetPaseoMasc3Lbl.setText(String.valueOf(Jugador.getPokemons(2).getContPeticionPaseo()));
        nivelMasc3Lbl.setText( String.valueOf(Jugador.getPokemons(2).getNivel()));/**/batMasc3Lbl.setText(String.valueOf(Jugador.getPokemons(2).getContadorBatallas()));/**/batSubNivMasc3Lbl.setText(String.valueOf(Jugador.getPokemons(2).getBatallasParaSubirDeNivel()));
        contEnfMasc3Lbl.setText(String.valueOf(Jugador.getPokemons(2).getContadorEnfermedades()));
        contComidasMasc3Lbl.setText(String.valueOf(Jugador.getPokemons(2).getContadorComida()));/**/contPetComidaMasc3Lbl.setText(String.valueOf(Jugador.getPokemons(2).getContPeticionComida()));
        contPoposMasc3Lbl.setText(String.valueOf(Jugador.getPokemons(2).getContPopo()));
    }

    private void dibujarMasc4() {
        aspMasc4Lbl.setIcon(new ImageIcon(getClass().getResource(Jugador.getPokemons(3).getAspecto())));
        //Dibujar nombres -------------------------------------------------------------------------------------------------------
        nombMasc4Lbl.setText(Jugador.getPokemons(3).getNombrePokemon());/**/apMasc4Lbl.setText(Jugador.getPokemons(3).getApodo());/**/fnMasc4Lbl.setText(Jugador.getPokemons(3).getFechaDeNacimiento());
        contPetPaseoMasc4Lbl.setText(String.valueOf(Jugador.getPokemons(3).getContPeticionPaseo()));
        nivelMasc4Lbl.setText( String.valueOf(Jugador.getPokemons(3).getNivel()));/**/batMasc4Lbl.setText(String.valueOf(Jugador.getPokemons(3).getContadorBatallas()));/**/batSubNivMasc4Lbl.setText(String.valueOf(Jugador.getPokemons(3).getBatallasParaSubirDeNivel()));
        contEnfMasc4Lbl.setText(String.valueOf(Jugador.getPokemons(3).getContadorEnfermedades()));
        contComidasMasc4Lbl.setText(String.valueOf(Jugador.getPokemons(3).getContadorComida()));/**/contPetComidaMasc4Lbl.setText(String.valueOf(Jugador.getPokemons(3).getContPeticionComida()));
        contPoposMasc4Lbl.setText(String.valueOf(Jugador.getPokemons(3).getContPopo()));
    }

    private void dibujarMasc5() {

        aspMasc5Lbl.setIcon(new ImageIcon(getClass().getResource(Jugador.getPokemons(4).getAspecto())));
        //Dibujar nombres -------------------------------------------------------------------------------------------------------
        nombMasc5Lbl.setText(Jugador.getPokemons(4).getNombrePokemon());/**/apMasc5Lbl.setText(Jugador.getPokemons(4).getApodo());/**/fnMasc5Lbl.setText(Jugador.getPokemons(4).getFechaDeNacimiento());
        contPetPaseoMasc5Lbl.setText(String.valueOf(Jugador.getPokemons(4).getContPeticionPaseo()));
        nivelMasc5Lbl.setText( String.valueOf(Jugador.getPokemons(4).getNivel()));/**/batMasc5Lbl.setText(String.valueOf(Jugador.getPokemons(4).getContadorBatallas()));/**/batSubNivMasc5Lbl.setText(String.valueOf(Jugador.getPokemons(4).getBatallasParaSubirDeNivel()));
        contEnfMasc5Lbl.setText(String.valueOf(Jugador.getPokemons(4).getContadorEnfermedades()));
        contComidasMasc5Lbl.setText(String.valueOf(Jugador.getPokemons(4).getContadorComida()));/**/contPetComidaMasc5Lbl.setText(String.valueOf(Jugador.getPokemons(4).getContPeticionComida()));
        contPoposMasc5Lbl.setText(String.valueOf(Jugador.getPokemons(4).getContPopo()));
    }

    private void dibujarInventario(){
        contManzanasLbl.setText(" x " + PokeGotchi.jugador.getContadorManzanas());
        contManzanasLbl.setIcon(new ImageIcon(getClass().getResource(  PokeGotchi.manzana.getAspecto())));
        contCerealLbl.setText(" x " + PokeGotchi.jugador.getContadorCereal());
        contCerealLbl.setIcon(new ImageIcon(getClass().getResource(  PokeGotchi.cereal.getAspecto())));
        contWafflesLbl.setText(" x " + PokeGotchi.jugador.getContadorWaffles());
        contWafflesLbl.setIcon(new ImageIcon(getClass().getResource(  PokeGotchi.waffles.getAspecto())));
        contVitaminasLbl.setText(" x " + PokeGotchi.jugador.getContadorVitaminas());
        contVitaminasLbl.setIcon(new ImageIcon(getClass().getResource(  PokeGotchi.vitaminas.getAspecto())));
        contAnalgesicoLbl.setText(" x " + PokeGotchi.jugador.getContadorAnalgesico());
        contAnalgesicoLbl.setIcon(new ImageIcon(getClass().getResource(  PokeGotchi.analgesico.getAspecto())));
        contAntibioticoLbl.setText(" x " + PokeGotchi.jugador.getContadorAntibiotico());
        contAntibioticoLbl.setIcon(new ImageIcon(getClass().getResource(  PokeGotchi.antibiotico.getAspecto())));
    }

    private  void llenarCbx(){
        medicinaCbxMasc1.addItem("Vitaminas")   ; comidaCbxMasc1.addItem("Manzana");
        medicinaCbxMasc1.addItem("Analgesico")  ; comidaCbxMasc1.addItem("Cereal") ;
        medicinaCbxMasc1.addItem("Antibiotico") ; comidaCbxMasc1.addItem("Waffles");

        medicinaCbxMasc2.addItem("Vitaminas")   ; comidaCbxMasc2.addItem("Manzana");
        medicinaCbxMasc2.addItem("Analgesico")  ; comidaCbxMasc2.addItem("Cereal") ;
        medicinaCbxMasc2.addItem("Antibiotico") ; comidaCbxMasc2.addItem("Waffles");

/*        medicinaCbxMasc3.addItem("Vitaminas")   ; comidaCbxMasc3.addItem("Manzana");
        medicinaCbxMasc3.addItem("Analgesico")  ; comidaCbxMasc3.addItem("Cereal") ;
        medicinaCbxMasc3.addItem("Antibiotico") ; comidaCbxMasc3.addItem("Waffles"); */

        medicinaCbxMasc3.addItem("Vitaminas")   ; comidaCbxMasc3.addItem("Manzana");
        medicinaCbxMasc3.addItem("Analgesico")  ; comidaCbxMasc3.addItem("Cereal") ;
        medicinaCbxMasc3.addItem("Antibiotico") ; comidaCbxMasc3.addItem("Waffles");

        medicinaCbxMasc4.addItem("Vitaminas")   ; comidaCbxMasc4.addItem("Manzana");
        medicinaCbxMasc4.addItem("Analgesico")  ; comidaCbxMasc4.addItem("Cereal") ;
        medicinaCbxMasc4.addItem("Antibiotico") ; comidaCbxMasc4.addItem("Waffles");


        medicinaCbxMasc5.addItem("Vitaminas")   ; comidaCbxMasc5.addItem("Manzana");
        medicinaCbxMasc5.addItem("Analgesico")  ; comidaCbxMasc5.addItem("Cereal") ;
        medicinaCbxMasc5.addItem("Antibiotico") ; comidaCbxMasc5.addItem("Waffles");
    }

    private void dibujarMonedas(){
        monedasJugadorLbl.setText("Sus monedas disponibles son: " + PokeGotchi.jugador.getMonedas());
    }

    public void alerta(String mensaje){
        alertasLbl.setText(mensaje);
    }

    public void alertaWindow(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
    }

    private void limpiarMascota(int posicion){
        Jugador.getPokemons(posicion).setContPopo(0);
        alertaWindow("¡Se ha limpiado correctamente!");
        dibujarEnFrame();
    }

    public void dibujarCementerio(){

        cem1Lbl.setIcon(new ImageIcon(getClass().getResource(PokeGotchi.jugador.getCementerio(0).getAspecto())));
        precioARevivir1 = 5 * PokeGotchi.jugador.getCementerio(0).getNivel() + 10;
        precioLbl1.setText("Revivir por: $" + precioARevivir1);

        cem2Lbl.setIcon(new ImageIcon(getClass().getResource(PokeGotchi.jugador.getCementerio(1).getAspecto())));
        precioARevivir2 = 5 * PokeGotchi.jugador.getCementerio(1).getNivel() + 10;
        precioLbl2.setText("Revivir por: $" + precioARevivir2);

        cem3Lbl.setIcon(new ImageIcon(getClass().getResource(PokeGotchi.jugador.getCementerio(2).getAspecto())));
        precioARevivir3 = 5 * PokeGotchi.jugador.getCementerio(2).getNivel() + 10;
        precioLbl3.setText("Revivir por: $" + precioARevivir3);

        cem4Lbl.setIcon(new ImageIcon(getClass().getResource(PokeGotchi.jugador.getCementerio(3).getAspecto())));
        precioARevivir4 = 5 * PokeGotchi.jugador.getCementerio(3).getNivel() + 10;
        precioLbl4.setText("Revivir por: $" + precioARevivir4);

        cem5Lbl.setIcon(new ImageIcon(getClass().getResource(PokeGotchi.jugador.getCementerio(4).getAspecto())));
        precioARevivir5 = 5 * PokeGotchi.jugador.getCementerio(4).getNivel() + 10;
        precioLbl5.setText("Revivir por: $" + precioARevivir5);

        lblRevivirMascotas.setText("Seleccione la mascota que desea revivir    (Sus monedas disponibles son: " + PokeGotchi.jugador.getMonedas() + " monedas)");

    }

}

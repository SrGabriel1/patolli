/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUIs;

import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import logica.ControladorVentanas;
import mensajes.Mensaje;

/**
 *
 * @author Gabriel
 */
public class vistaLobby extends javax.swing.JFrame implements Observer{
    ControladorVentanas controlador;
    private int JugadoresListos = 0;
    private int TotalJugadores = 0;

    /**
     * Creates new form vistaMenuInicio
     */
    public vistaLobby(ControladorVentanas controlador) {
        this.controlador=controlador;
        initComponents();
        setLocationRelativeTo(null);
    }

    public vistaLobby(int total) {
        initComponents();
        setLocationRelativeTo(null);
        TotalJugadores = total;
        ContadorJugadores.setText("(" + JugadoresListos + "/" + TotalJugadores + ")");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ContadorJugadores = new javax.swing.JLabel();
        Codigo = new javax.swing.JLabel();
        jugador1 = new javax.swing.JLabel();
        jugador2 = new javax.swing.JLabel();
        jugador3 = new javax.swing.JLabel();
        jugador4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnJuego = new javax.swing.JButton();
        botonListo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ContadorJugadores.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        ContadorJugadores.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(ContadorJugadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 530, 120, 60));

        Codigo.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        Codigo.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(Codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 130, 50));

        jugador1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jugador1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 200, 30));

        jugador2.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jugador2.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 200, 30));

        jugador3.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jugador3.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jugador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 200, 30));

        jugador4.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jugador4.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jugador4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 200, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Lobby.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 450, 630));

        btnJuego.setText("jButton5");
        btnJuego.setBorderPainted(false);
        btnJuego.setContentAreaFilled(false);
        btnJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJuegoActionPerformed(evt);
            }
        });
        getContentPane().add(btnJuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 150, 80));

        botonListo.setText("jButton1");
        botonListo.setBorderPainted(false);
        botonListo.setContentAreaFilled(false);
        botonListo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonListoActionPerformed(evt);
            }
        });
        getContentPane().add(botonListo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 510, 120, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJuegoActionPerformed
        vistaJuego juego = new vistaJuego(controlador);
        juego.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnJuegoActionPerformed

    private void botonListoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonListoActionPerformed
        if (JugadoresListos < TotalJugadores) {
            JugadoresListos++;
            ContadorJugadores.setText("(" + JugadoresListos + "/" + TotalJugadores + ")");
        }

        // Solo abre la vista del juego cuando se alcanza exactamente el número máximo de jugadores
        if (JugadoresListos == TotalJugadores) {
            vistaTablero Tablero;
            try {
                Tablero = new vistaTablero(TotalJugadores);
                Tablero.setVisible(true);
                this.dispose();
            } catch (Exception ex) {
                Logger.getLogger(vistaLobby.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_botonListoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Codigo;
    private javax.swing.JLabel ContadorJugadores;
    private javax.swing.JButton botonListo;
    private javax.swing.JButton btnJuego;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jugador1;
    private javax.swing.JLabel jugador2;
    private javax.swing.JLabel jugador3;
    private javax.swing.JLabel jugador4;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        Mensaje mensaje = (Mensaje) arg;
        if (mensaje.getTipo().equalsIgnoreCase("Codigo")) {
            Codigo.setText((String) mensaje.getContenido());
        }else if(mensaje.getTipo().equalsIgnoreCase("UsuarioNuevo")){
            comprobarLabelVacio().setText((String)mensaje.getContenido());
        }else if(mensaje.getTipo().equalsIgnoreCase("UsuariosConectados")){
            List<String> usuarios=( List<String>)mensaje.getContenido();
            for(String s:usuarios){
                comprobarLabelVacio().setText(s);
            }
        }
    }
    
    public JLabel comprobarLabelVacio(){
        if(jugador1.getText().equalsIgnoreCase("")){
            return jugador1;
        }else if(jugador2.getText().equalsIgnoreCase("")){
            return jugador2;
        }else if(jugador3.getText().equalsIgnoreCase("")){
            return jugador3;
        }else if(jugador4.getText().equalsIgnoreCase("")){
            return jugador4;
        }else{
            return null;
        }
    }

}

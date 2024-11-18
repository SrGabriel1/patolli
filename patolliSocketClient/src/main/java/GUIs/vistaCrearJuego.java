/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUIs;

import Entidades.CondicionesPartida;
import logica.ControladorVentanas;

/**
 *
 * @author Gabriel
 */
public class vistaCrearJuego extends javax.swing.JFrame {

    ControladorVentanas control;
    CondicionesPartida condiciones;
    /**
     * Creates new form vistaRegistroUsuario
     */
    private int MinJugadores = 2;
    private final int TotalJugadores = 4;
    private int minSemillas = 100;
    private final int SemillasMax = 900;
    private int minApuesta = 10;
    private final int MaxApuesta = 900;

    public vistaCrearJuego(ControladorVentanas control,CondicionesPartida condiciones) {
        this.control=control;
        this.condiciones=condiciones;
        initComponents();
        setLocationRelativeTo(null);
        jugadores.setText("(" + MinJugadores + "/" + TotalJugadores + ")");
        semillas.setText("(" + minSemillas + "/" + SemillasMax + ")");
        Apuesta.setText("(" + minApuesta + "/" + MaxApuesta + ")");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jugadores = new javax.swing.JLabel();
        semillas = new javax.swing.JLabel();
        Apuesta = new javax.swing.JLabel();
        btnJugadorMenos = new javax.swing.JButton();
        btnJugadorMas = new javax.swing.JButton();
        btnSemillasMenos = new javax.swing.JButton();
        btnApuestaMas = new javax.swing.JButton();
        btnApuestaMenos = new javax.swing.JButton();
        btnSemillasMas = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnInicio = new javax.swing.JButton();
        btnLobby = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jugadores.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jugadores.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jugadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 100, 50));

        semillas.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        semillas.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(semillas, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 200, 40));

        Apuesta.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        Apuesta.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(Apuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, 190, 50));

        btnJugadorMenos.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        btnJugadorMenos.setForeground(new java.awt.Color(0, 0, 0));
        btnJugadorMenos.setText("<");
        btnJugadorMenos.setBorderPainted(false);
        btnJugadorMenos.setContentAreaFilled(false);
        btnJugadorMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugadorMenosActionPerformed(evt);
            }
        });
        getContentPane().add(btnJugadorMenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 90, 40));

        btnJugadorMas.setFont(new java.awt.Font("Segoe UI Black", 2, 48)); // NOI18N
        btnJugadorMas.setForeground(new java.awt.Color(0, 0, 0));
        btnJugadorMas.setText(">");
        btnJugadorMas.setBorderPainted(false);
        btnJugadorMas.setContentAreaFilled(false);
        btnJugadorMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugadorMasActionPerformed(evt);
            }
        });
        getContentPane().add(btnJugadorMas, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 70, 40));

        btnSemillasMenos.setFont(new java.awt.Font("Segoe UI Black", 2, 48)); // NOI18N
        btnSemillasMenos.setForeground(new java.awt.Color(0, 0, 0));
        btnSemillasMenos.setText("<");
        btnSemillasMenos.setBorderPainted(false);
        btnSemillasMenos.setContentAreaFilled(false);
        btnSemillasMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSemillasMenosActionPerformed(evt);
            }
        });
        getContentPane().add(btnSemillasMenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 70, 50));

        btnApuestaMas.setFont(new java.awt.Font("Segoe UI Black", 2, 48)); // NOI18N
        btnApuestaMas.setForeground(new java.awt.Color(0, 0, 0));
        btnApuestaMas.setText(">");
        btnApuestaMas.setBorderPainted(false);
        btnApuestaMas.setContentAreaFilled(false);
        btnApuestaMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApuestaMasActionPerformed(evt);
            }
        });
        getContentPane().add(btnApuestaMas, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, 100, 80));

        btnApuestaMenos.setFont(new java.awt.Font("Segoe UI Black", 2, 48)); // NOI18N
        btnApuestaMenos.setForeground(new java.awt.Color(0, 0, 0));
        btnApuestaMenos.setText("<");
        btnApuestaMenos.setBorderPainted(false);
        btnApuestaMenos.setContentAreaFilled(false);
        btnApuestaMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApuestaMenosActionPerformed(evt);
            }
        });
        getContentPane().add(btnApuestaMenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 80, 70));

        btnSemillasMas.setFont(new java.awt.Font("Segoe UI Black", 2, 48)); // NOI18N
        btnSemillasMas.setForeground(new java.awt.Color(0, 0, 0));
        btnSemillasMas.setText(">");
        btnSemillasMas.setBorderPainted(false);
        btnSemillasMas.setContentAreaFilled(false);
        btnSemillasMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSemillasMasActionPerformed(evt);
            }
        });
        getContentPane().add(btnSemillasMas, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 70, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/crearJuego.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, -1));

        btnInicio.setText("jButton1");
        btnInicio.setBorderPainted(false);
        btnInicio.setContentAreaFilled(false);
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        getContentPane().add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 120, 80));

        btnLobby.setText("jButton1");
        btnLobby.setBorderPainted(false);
        btnLobby.setContentAreaFilled(false);
        btnLobby.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLobbyActionPerformed(evt);
            }
        });
        getContentPane().add(btnLobby, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 560, 160, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        vistaInicio inicio = new vistaInicio();
        inicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnLobbyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLobbyActionPerformed
        condiciones.setJugadores(MinJugadores);
        condiciones.setSemillas(minSemillas);
        condiciones.setApuestas(minApuesta);
        control.cambiaraVentanaLobby(this,condiciones);
    }//GEN-LAST:event_btnLobbyActionPerformed

    private void btnJugadorMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugadorMenosActionPerformed
        if (MinJugadores > 0 && MinJugadores != 2) {
            MinJugadores--;
            jugadores.setText("(" + MinJugadores + "/" + TotalJugadores + ")");
        }
    }//GEN-LAST:event_btnJugadorMenosActionPerformed

    private void btnJugadorMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugadorMasActionPerformed
        if (MinJugadores < 4) {
            MinJugadores++;
            jugadores.setText("(" + MinJugadores + "/" + TotalJugadores + ")");
        }
    }//GEN-LAST:event_btnJugadorMasActionPerformed

    private void btnApuestaMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApuestaMenosActionPerformed
        if (minApuesta > 10 && minApuesta != 10) {
            minApuesta=minApuesta-10;
            Apuesta.setText("(" + minApuesta + "/" + MaxApuesta + ")");
        }
    }//GEN-LAST:event_btnApuestaMenosActionPerformed

    private void btnApuestaMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApuestaMasActionPerformed
        if (minApuesta < 900) {
            minApuesta=minApuesta+10;
            Apuesta.setText("(" + minApuesta + "/" + MaxApuesta + ")");
        }
    }//GEN-LAST:event_btnApuestaMasActionPerformed

    private void btnSemillasMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSemillasMenosActionPerformed
        if (minSemillas != 100) {
            minSemillas=minSemillas-100;
            semillas.setText("(" + minSemillas + "/" + SemillasMax + ")");
        }
    }//GEN-LAST:event_btnSemillasMenosActionPerformed

    private void btnSemillasMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSemillasMasActionPerformed
        if (minSemillas < 900) {
            minSemillas=100+minSemillas;
            semillas.setText("(" + minSemillas + "/" + SemillasMax + ")");
        }
    }//GEN-LAST:event_btnSemillasMasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Apuesta;
    private javax.swing.JButton btnApuestaMas;
    private javax.swing.JButton btnApuestaMenos;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnJugadorMas;
    private javax.swing.JButton btnJugadorMenos;
    private javax.swing.JButton btnLobby;
    private javax.swing.JButton btnSemillasMas;
    private javax.swing.JButton btnSemillasMenos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jugadores;
    private javax.swing.JLabel semillas;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUIs;

import logica.PatolliPanel;
import javax.swing.*;
import java.awt.Dimension;
import java.awt.Image;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import logica.ControlPartida;
import logica.ControladorVentanas;
import mensajes.Mensaje;
import mensajes.MensajeALobby;
import mensajes.MensajeMovimiento;

public class vistaTablero extends JFrame implements Observer {

    private ControladorVentanas controlador;
    private static final int ANCHO_CAÑA = 70;
    private static final int ALTO_CAÑA = 35;
    private ControlPartida controlPartida;
    private int jugadorActual = 0;
    private int jugadoresMax;
    private String codigoLobby;
    private int numeroJugador;

    public vistaTablero(int jugadores, String codigoLobby, ControladorVentanas controlador) throws Exception {
        initComponents();
        this.controlador = controlador;
        esperandoTuTurnoLabel.setText("Espera tu turno...");
        esperandoTuTurnoLabel.setVisible(false);
        this.codigoLobby = codigoLobby;
        setLocationRelativeTo(null);
        jugadoresMax = jugadores;

        // Crea un JLayeredPane para manejar capas
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setPreferredSize(new Dimension(Tablero.getIcon().getIconWidth(), Tablero.getIcon().getIconHeight()));

        // Fondo del tablero
        Tablero.setBounds(0, 0, Tablero.getIcon().getIconWidth(), Tablero.getIcon().getIconHeight());
        layeredPane.add(Tablero, Integer.valueOf(0));

        // Capa del tablero de juego
        PatolliPanel tablero = new PatolliPanel(jugadores, Tablero.getIcon().getIconWidth(), Tablero.getIcon().getIconHeight());
        controlPartida = new ControlPartida(tablero, jugadores);

        tablero.setOpaque(false);
        tablero.setBounds(0, 0, Tablero.getIcon().getIconWidth(), Tablero.getIcon().getIconHeight());
        layeredPane.add(tablero, Integer.valueOf(1));

        // Redimensiona las cañas y posiciona
        redimensionarCañas();
        posicionarCañas(layeredPane);

        // Botones
        Tirar.setBounds(340, 650, 170, 60);
        layeredPane.add(Tirar, Integer.valueOf(2));

        btnVolverInicio.setBounds(10, 650, 100, 60);
        layeredPane.add(btnVolverInicio, Integer.valueOf(2));

        // Agrega el layeredPane al JFrame
        setContentPane(layeredPane);
        pack();
        revalidate();
        repaint();

    }

    private void posicionarCañas(JLayeredPane layeredPane) {
        int[][] posiciones = {
            {820, 210}, {820, 250}, {820, 290}, {820, 330}, {820, 370}
        };

        JLabel[] cañas = {cana1, cana2, cana3, cana4, cana5};

        for (int i = 0; i < cañas.length; i++) {
            cañas[i].setBounds(posiciones[i][0], posiciones[i][1], ANCHO_CAÑA, ALTO_CAÑA);
            layeredPane.add(cañas[i], Integer.valueOf(2));
        }
    }

    private void redimensionarCañas() {
        JLabel[] cañas = {cana1, cana2, cana3, cana4, cana5};

        for (JLabel caña : cañas) {
            ImageIcon iconoOriginal = (ImageIcon) caña.getIcon();
            Image imagenRedimensionada = iconoOriginal.getImage().getScaledInstance(ANCHO_CAÑA, ALTO_CAÑA, Image.SCALE_SMOOTH);
            caña.setIcon(new ImageIcon(imagenRedimensionada));
        }
    }

    private void mostrarCañas(boolean[] resultados) {
        JLabel[] cañas = {cana1, cana2, cana3, cana4, cana5};
        for (int i = 0; i < cañas.length; i++) {
            String rutaImagen = resultados[i] ? "/img/cañaPunto.png" : "/img/cañaVacia.png";
            ImageIcon iconoOriginal = new ImageIcon(getClass().getResource(rutaImagen));
            Image imagenRedimensionada = iconoOriginal.getImage().getScaledInstance(ANCHO_CAÑA, ALTO_CAÑA, Image.SCALE_SMOOTH);
            cañas[i].setIcon(new ImageIcon(imagenRedimensionada));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        esperandoTuTurnoLabel = new javax.swing.JLabel();
        cana3 = new javax.swing.JLabel();
        cana1 = new javax.swing.JLabel();
        cana4 = new javax.swing.JLabel();
        cana5 = new javax.swing.JLabel();
        cana2 = new javax.swing.JLabel();
        Turno = new javax.swing.JLabel();
        Nombre1 = new javax.swing.JLabel();
        Dinero1 = new javax.swing.JLabel();
        Nombre2 = new javax.swing.JLabel();
        Dinero2 = new javax.swing.JLabel();
        Nombre3 = new javax.swing.JLabel();
        Dinero3 = new javax.swing.JLabel();
        Nombre4 = new javax.swing.JLabel();
        Dinero4 = new javax.swing.JLabel();
        Tirar = new javax.swing.JButton();
        btnVolverInicio = new javax.swing.JButton();
        Tablero = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        esperandoTuTurnoLabel.setBackground(new java.awt.Color(255, 255, 255));
        esperandoTuTurnoLabel.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(esperandoTuTurnoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 626, 210, 50));

        cana3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cañaVacia.png"))); // NOI18N
        getContentPane().add(cana3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 320, 110, 50));

        cana1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cañaVacia.png"))); // NOI18N
        getContentPane().add(cana1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 200, 110, 50));

        cana4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cañaVacia.png"))); // NOI18N
        getContentPane().add(cana4, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 410, 110, 50));

        cana5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cañaVacia.png"))); // NOI18N
        getContentPane().add(cana5, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 480, 110, 50));

        cana2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cañaVacia.png"))); // NOI18N
        getContentPane().add(cana2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 270, 110, 50));

        Turno.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Turno.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(Turno, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 50, 50));

        Nombre1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Nombre1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(Nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 140, 50));

        Dinero1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Dinero1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(Dinero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 130, 40));

        Nombre2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Nombre2.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(Nombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 170, 40));

        Dinero2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Dinero2.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(Dinero2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 50, 150, 40));

        Nombre3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Nombre3.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(Nombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 170, 40));

        Dinero3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Dinero3.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(Dinero3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 580, 140, 40));

        Nombre4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Nombre4.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(Nombre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 570, 160, 40));

        Dinero4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Dinero4.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(Dinero4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 620, 150, 40));

        Tirar.setBorderPainted(false);
        Tirar.setContentAreaFilled(false);
        Tirar.setFocusPainted(false);
        Tirar.setFocusable(false);
        Tirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TirarActionPerformed(evt);
            }
        });
        getContentPane().add(Tirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 620, 200, 60));

        btnVolverInicio.setBorderPainted(false);
        btnVolverInicio.setContentAreaFilled(false);
        btnVolverInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverInicioActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolverInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 630, 110, 60));

        Tablero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tablero2.png"))); // NOI18N
        getContentPane().add(Tablero, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverInicioActionPerformed
        vistaInicio inicio = new vistaInicio();
        inicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverInicioActionPerformed

    private void TirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TirarActionPerformed
        try {
            boolean[] resultados = controlPartida.generarCañasAleatorias();
            mostrarCañas(resultados);
            int pasos = controlPartida.calcularPasos(resultados);
            boolean victoria = controlPartida.moverFichaJugador(numeroJugador, pasos);

            if (victoria == true) {
                controlador.mandarMensajeAServidor(new Mensaje("MensajeALobby", new MensajeALobby(codigoLobby, "Gano", numeroJugador)));
            }
            esperandoTuTurnoLabel.setVisible(true);
            Tirar.setEnabled(false);
            controlador.mandarMensajeAServidor(new Mensaje("MensajeALobby", new MensajeALobby(codigoLobby, "Tirar", new MensajeMovimiento(numeroJugador, pasos))));
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al tirar los dados: " + e.getMessage());
        }
    }//GEN-LAST:event_TirarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Dinero1;
    private javax.swing.JLabel Dinero2;
    private javax.swing.JLabel Dinero3;
    private javax.swing.JLabel Dinero4;
    private javax.swing.JLabel Nombre1;
    private javax.swing.JLabel Nombre2;
    private javax.swing.JLabel Nombre3;
    private javax.swing.JLabel Nombre4;
    private javax.swing.JLabel Tablero;
    private javax.swing.JButton Tirar;
    private javax.swing.JLabel Turno;
    private javax.swing.JButton btnVolverInicio;
    private javax.swing.JLabel cana1;
    private javax.swing.JLabel cana2;
    private javax.swing.JLabel cana3;
    private javax.swing.JLabel cana4;
    private javax.swing.JLabel cana5;
    private javax.swing.JLabel esperandoTuTurnoLabel;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        Mensaje mensaje = (Mensaje) arg;
        if (mensaje.getTipo().equalsIgnoreCase("Tu Turno")) {
            Tirar.setEnabled(true);
        } else if (mensaje.getTipo().equalsIgnoreCase("TuNumeroDeJugador")) {
            numeroJugador = (int) mensaje.getContenido();
            System.out.println(numeroJugador);
        } else if (mensaje.getTipo().equalsIgnoreCase("TiroJugador")) {
            MensajeMovimiento movimiento = (MensajeMovimiento) mensaje.getContenido();
            controlPartida.moverFichaJugador(movimiento.getUsuarioTira(), movimiento.getPasos());
        }

    }
}

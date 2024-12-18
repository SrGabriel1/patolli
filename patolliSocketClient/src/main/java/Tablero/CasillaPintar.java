/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tablero;

/**
 *
 * @author Gabriel
 */
public class CasillaPintar {

    private final int numJugadores;
    private TableroBuilder.TipoTablero tipoTablero;

    /**
     * Constructor para inicializar la clase CasillaPintar.
     *
     * @param numJugadores Número de jugadores en el tablero.
     * @param tipoTablero Tipo de tablero (ARRIBA, ABAJO, IZQUIERDA, DERECHA).
     */
    public CasillaPintar(int numJugadores, TableroBuilder.TipoTablero tipoTablero) {
        this.numJugadores = numJugadores;
        this.tipoTablero = tipoTablero;
    }

    /**
     * Determina si una casilla específica es amarilla.
     *
     * @param posicion La posición de la casilla en el tablero.
     * @return true si la casilla en la posición dada es amarilla, false en caso
     * contrario.
     * @throws IllegalArgumentException si el número de jugadores no está
     * soportado.
     */
    public boolean esCasillaAmarilla(int posicion) {
        switch (numJugadores) {
            case 2:
                return switch (tipoTablero) {
                    case ARRIBA ->
                        posicion == 61;
                    case ABAJO ->
                        posicion == 27;
                    case IZQUIERDA ->
                        posicion == 10;
                    case DERECHA ->
                        posicion == 44;
                    default ->
                        false;
                };
            case 3:
                return switch (tipoTablero) {
                    case ARRIBA ->
                        posicion == 73;
                    case ABAJO ->
                        posicion == 33;
                    case IZQUIERDA ->
                        posicion == 12;
                    case DERECHA ->
                        posicion == 54;
                    default ->
                        false;
                };
            case 4:
                return switch (tipoTablero) {
                    case ARRIBA ->
                        posicion == 103;
                    case ABAJO ->
                        posicion == 45;
                    case IZQUIERDA ->
                        posicion == 16;
                    case DERECHA ->
                        posicion == 74;
                    default ->
                        false;
                };
            default:
                throw new IllegalArgumentException("Número de jugadores no soportado: " + numJugadores);
        }
    }

    /**
     * Determina si una casilla específica es roja.
     *
     * @param posicion La posición de la casilla en el tablero.
     * @return true si la casilla en la posición dada es roja, false en caso
     * contrario.
     * @throws IllegalArgumentException si el número de jugadores no está
     * soportado.
     */
    public boolean esCasillaRoja(int posicion) {
        switch (numJugadores) {
            case 2:
                return switch (tipoTablero) {
                    case ARRIBA ->
                        (posicion == 3 || posicion == 66);
                    case ABAJO ->
                        (posicion == 33 || posicion == 36);
                    case IZQUIERDA ->
                        (posicion == 15 || posicion == 20);
                    case DERECHA ->
                        (posicion == 49 || posicion == 54);
                    default ->
                        false;
                };
            case 3:
                return switch (tipoTablero) {
                    case ARRIBA ->
                        (posicion == 3 || posicion == 80);
                    case ABAJO ->
                        (posicion == 40 || posicion == 45);
                    case IZQUIERDA ->
                        (posicion == 24 || posicion == 19);
                    case DERECHA ->
                        (posicion == 64 || posicion == 61);
                    default ->
                        false;
                };
            case 4:
                return switch (tipoTablero) {
                    case ARRIBA ->
                        (posicion == 3 || posicion == 114);
                    case ABAJO ->
                        (posicion == 56 || posicion == 61);
                    case IZQUIERDA ->
                        (posicion == 27 || posicion == 32);
                    case DERECHA ->
                        (posicion == 90 || posicion == 85);
                    default ->
                        false;
                };
            default:
                throw new IllegalArgumentException("Número de jugadores no soportado: " + numJugadores);
        }
    }
}

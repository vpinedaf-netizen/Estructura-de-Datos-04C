package Corte_3.Ejercicios_Arboles.Ejercicio_4_Arboles;

public class Jugador {

    int elo;
    String nombreUsuario;
    String pais;
    int partidasJugadas;

    Jugador izquierda;
    Jugador derecha;

    public Jugador(int elo, String nombreUsuario,
                   String pais, int partidasJugadas) {

        this.elo = elo;
        this.nombreUsuario = nombreUsuario;
        this.pais = pais;
        this.partidasJugadas = partidasJugadas;

        izquierda = null;
        derecha = null;
    }
}

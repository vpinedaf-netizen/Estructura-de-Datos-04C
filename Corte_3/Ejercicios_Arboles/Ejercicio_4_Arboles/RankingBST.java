package Corte_3.Ejercicios_Arboles.Ejercicio_4_Arboles;

public class RankingBST {

    private Jugador raiz;

    // Insertar jugador
    public void insertar(int elo, String nombre,
                         String pais, int partidas) {

        raiz = insertarRec(raiz, elo, nombre, pais, partidas);
    }

    private Jugador insertarRec(Jugador nodo,
                                int elo,
                                String nombre,
                                String pais,
                                int partidas) {

        if (nodo == null) {
            return new Jugador(elo, nombre, pais, partidas);
        }

        if (elo < nodo.elo) {
            nodo.izquierda = insertarRec(
                    nodo.izquierda, elo, nombre, pais, partidas);
        } else if (elo > nodo.elo) {
            nodo.derecha = insertarRec(
                    nodo.derecha, elo, nombre, pais, partidas);
        }

        return nodo;
    }

    // Listar jugadores dentro de un rango ELO
    public void listarEnRango(int eloMin, int eloMax) {

        if (raiz == null) {
            System.out.println("No hay jugadores registrados.");
            return;
        }

        System.out.println("\n=== JUGADORES CLASIFICADOS ===");
        listarEnRangoRec(raiz, eloMin, eloMax);
    }

    private void listarEnRangoRec(Jugador nodo,
                                  int eloMin,
                                  int eloMax) {

        if (nodo == null) {
            return;
        }

        // PODA: si el ELO es mayor que el mínimo,
        // puede haber valores válidos a la izquierda
        if (nodo.elo > eloMin) {
            listarEnRangoRec(nodo.izquierda, eloMin, eloMax);
        }

        // Si está dentro del rango, imprimir
        if (nodo.elo >= eloMin && nodo.elo <= eloMax) {

            System.out.println(
                    "ELO: " + nodo.elo +
                    " | Usuario: " + nodo.nombreUsuario +
                    " | País: " + nodo.pais +
                    " | Partidas: " + nodo.partidasJugadas
            );
        }

        // PODA: si el ELO es menor que el máximo,
        // puede haber valores válidos a la derecha
        if (nodo.elo < eloMax) {
            listarEnRangoRec(nodo.derecha, eloMin, eloMax);
        }
    }
}

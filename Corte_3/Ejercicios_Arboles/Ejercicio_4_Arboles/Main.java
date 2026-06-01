package Corte_3.Ejercicios_Arboles.Ejercicio_4_Arboles;

// 4. Torneo de Ajedrez (Sistema de Rankings ELO)
// Una plataforma de ajedrez en línea gestiona el ranking ELO de sus jugadores en un BST. 
// A medida que los jugadores completan partidas, su ELO se actualiza y se reinsertan en el árbol. 
// El director del torneo necesita obtener la lista de jugadores que clasifican a la siguiente ronda, es decir, 
// todos aquellos cuyo ELO se encuentre dentro de un rango específico.

// La Clase Jugador (Nodo): Debe contener elo (int, clave del BST), nombreUsuario (String), pais (String) y 
// partidasJugadas (int).
// El Problema: Para la ronda de clasificación, el director fija un rango mínimo y máximo de ELO (por ejemplo, 
// entre 1800 y 2200). Todos los jugadores en ese rango deben ser listados de menor a mayor ELO para armar los emparejamientos.
// Reto: Implementa el método listarEnRango(int eloMin, int eloMax) que recorra el árbol e imprima los datos de 
// todos los jugadores cuyo elo esté dentro del rango [eloMin, eloMax] en orden ascendente. Usa la propiedad del BST 
// para podar: si el nodo actual es menor que eloMin, solo explora el subárbol derecho; si es mayor que eloMax, solo explora 
// el izquierdo.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        RankingBST ranking = new RankingBST();

        int opcion;

        do {

            System.out.println("\n===== TORNEO DE AJEDREZ =====");
            System.out.println("1. Registrar jugador");
            System.out.println("2. Listar jugadores por rango ELO");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("ELO: ");
                    int elo = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nombre de usuario: ");
                    String nombre = sc.nextLine();

                    System.out.print("Pais: ");
                    String pais = sc.nextLine();

                    System.out.print("Partidas jugadas: ");
                    int partidas = sc.nextInt();

                    ranking.insertar(
                            elo,
                            nombre,
                            pais,
                            partidas
                    );

                    System.out.println("Jugador registrado.");
                    break;

                case 2:

                    System.out.print("ELO minimo: ");
                    int min = sc.nextInt();

                    System.out.print("ELO maximo: ");
                    int max = sc.nextInt();

                    ranking.listarEnRango(min, max);
                    break;

                case 3:
                    System.out.println("Fin del programa.");
                    break;

                default:
                    System.out.println("Opcion invalida.");
            }

        } while (opcion != 3);

        sc.close();
    }
}

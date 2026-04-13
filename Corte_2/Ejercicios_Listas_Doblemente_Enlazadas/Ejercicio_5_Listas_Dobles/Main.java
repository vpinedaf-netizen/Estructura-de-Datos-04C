package Corte_2.Ejercicios_Listas_Doblemente_Enlazadas.Ejercicio_5_Listas_Dobles;

//5. Reproductor de Música Premium
//Mejora el ejercicio de Spotify de la semana pasada usando listas dobles.

// La Clase Cancion (Nodo): Debe contener titulo (String), artista (String) y duracion (int).
// El Problema: El reproductor ahora permite la función "Canción Anterior" de manera eficiente sin tener que recorrer toda la lista desde el principio.
// Reto: Implementa un método saltarAtras() que retroceda una posición y saltarAdelante() que avance una. Si se intenta saltar atrás desde la primera canción, debe mostrar un mensaje de error.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Reproductor reproductor = new Reproductor();

        int opcion;

        do {
            System.out.println("\n=== REPRODUCTOR DE MÚSICA ===");
            System.out.println("1. Agregar canción");
            System.out.println("2. Mostrar canción actual");
            System.out.println("3. Siguiente canción");
            System.out.println("4. Canción anterior");
            System.out.println("5. Mostrar lista");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();

                    System.out.print("Artista: ");
                    String artista = sc.nextLine();

                    System.out.print("Duración (segundos): ");
                    int duracion = sc.nextInt();
                    sc.nextLine();

                    reproductor.agregarCancion(titulo, artista, duracion);
                    break;

                case 2:
                    reproductor.mostrarActual();
                    break;

                case 3:
                    reproductor.saltarAdelante();
                    break;

                case 4:
                    reproductor.saltarAtras();
                    break;

                case 5:
                    reproductor.mostrarLista();
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 0);

        sc.close();
    }
}

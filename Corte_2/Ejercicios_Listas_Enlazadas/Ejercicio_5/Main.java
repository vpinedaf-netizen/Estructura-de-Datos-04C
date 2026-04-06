package Corte_2.Ejercicios_Listas_Enlazadas.Ejercicio_5;

//5. Spotify Lite (Lista de Reproducción)
//Crea un reproductor de música simplificado que gestione una lista de canciones.

//La Clase Cancion (Nodo): Debe contener titulo (String), artista (String), duracionSegundos (int) y genero (String).
//El Problema: El usuario puede agregar canciones "A continuación" (insertar después de la actual) o "Al final de la cola".
//Reto: Implementa un método que sume la duración de todas las canciones y muestre el tiempo total de la lista en formato MM:SS.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaReproduccion lista = new ListaReproduccion();
        int opcion;

        do {
            System.out.println("\n--- Reproductor ---");
            System.out.println("1. Agregar canción al final");
            System.out.println("2. Agregar canción a continuación");
            System.out.println("3. Mostrar lista");
            System.out.println("4. Cambiar canción actual");
            System.out.println("5. Mostrar duración total");
            System.out.println("6. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                case 2:
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();

                    System.out.print("Artista: ");
                    String artista = sc.nextLine();

                    System.out.print("Duración (segundos): ");
                    int duracion = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Género: ");
                    String genero = sc.nextLine();

                    if (opcion == 1) {
                        lista.agregarAlFinal(titulo, artista, duracion, genero);
                    } else {
                        lista.agregarAContinuacion(titulo, artista, duracion, genero);
                    }
                    break;

                case 3:
                    lista.mostrarLista();
                    break;

                case 4:
                    System.out.print("Ingrese posición de la canción: ");
                    int pos = sc.nextInt();
                    lista.cambiarActual(pos);
                    break;

                case 5:
                    lista.mostrarDuracionTotal();
                    break;

                case 6:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 6);

        sc.close();
    }
}

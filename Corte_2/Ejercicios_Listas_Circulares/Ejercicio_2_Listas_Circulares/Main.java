package Corte_2.Ejercicios_Listas_Circulares.Ejercicio_2_Listas_Circulares;

// 2. Carrusel de Anuncios (Pantalla Digital)
// Una tienda tiene una pantalla que muestra anuncios en rotación continua. Cuando termina el último anuncio, 
// vuelve automáticamente al primero.

// La Clase Anuncio (Nodo): Debe contener titulo(String), duracionSegundos(int), vecesRepetido(int) y 
// categoria(String - ej: "Oferta", "Marca", "Evento").
// El Problema: La pantalla necesita saber cuánto tiempo total lleva encendida y cuál es el anuncio que más 
// veces se ha repetido.
// Reto: Implementa el método reproducir(int ciclos)que simula ciclospasadas completas por todos los anuncios, 
// incrementando vecesRepetidoen cada paso e imprimiendo qué anuncio está en pantalla. Al finalizar, muestra el 
// anuncio más repetido y el tiempo total acumulado en la pantalla.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pantalla pantalla = new Pantalla();

        int opcion;

        do {
            System.out.println("\n=== PANTALLA DIGITAL ===");
            System.out.println("1. Agregar anuncio");
            System.out.println("2. Mostrar anuncios");
            System.out.println("3. Reproducir anuncios");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();

                    System.out.print("Duración (segundos): ");
                    int duracion = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Categoría: ");
                    String categoria = sc.nextLine();

                    pantalla.agregarAnuncio(titulo, duracion, categoria);
                    break;

                case 2:
                    pantalla.mostrarAnuncios();
                    break;

                case 3:
                    System.out.print("Número de ciclos: ");
                    int ciclos = sc.nextInt();
                    pantalla.reproducir(ciclos);
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

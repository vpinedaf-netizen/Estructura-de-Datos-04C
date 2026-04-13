package Corte_2.Ejercicios_Listas_Doblemente_Enlazadas.Ejercicio_2_Listas_Dobles;

// 2. Carrusel de Imágenes (Galería Interactiva)
// Simula el comportamiento de una galería de fotos en una aplicación móvil.

// La Clase Fotografia (Nodo): Debe contener nombreArchivo (String), tamanoMB (double) y resolucion (String).
// El Problema: El usuario puede avanzar a la "Siguiente Foto" o retroceder a la "Foto Anterior". Si llega al final, no puede avanzar más (a menos que sea circular, pero por ahora manténlo lineal).
// Reto: Crea un método reproducirGaleria() que recorra toda la lista hacia adelante y luego toda la lista hacia atrás para mostrar todas las fotos.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Galeria galeria = new Galeria();

        int opcion;

        do {
            System.out.println("\n=== GALERÍA DE IMÁGENES ===");
            System.out.println("1. Agregar foto");
            System.out.println("2. Mostrar foto actual");
            System.out.println("3. Siguiente foto");
            System.out.println("4. Foto anterior");
            System.out.println("5. Reproducir galería");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Nombre archivo: ");
                    String nombre = sc.nextLine();

                    System.out.print("Tamaño (MB): ");
                    double tamano = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Resolución: ");
                    String resolucion = sc.nextLine();

                    galeria.agregarFoto(nombre, tamano, resolucion);
                    break;

                case 2:
                    galeria.mostrarActual();
                    break;

                case 3:
                    galeria.siguiente();
                    break;

                case 4:
                    galeria.anterior();
                    break;

                case 5:
                    galeria.reproducirGaleria();
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

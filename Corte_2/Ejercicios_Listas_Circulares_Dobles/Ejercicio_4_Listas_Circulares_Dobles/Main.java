package Corte_2.Ejercicios_Listas_Circulares_Dobles.Ejercicio_4_Listas_Circulares_Dobles;


// 4. Galería de Fotos
// Una app de galería muestra las fotos de un álbum de una en una. El usuario puede pasar a la foto siguiente, 
// volver a la anterior, y marcar cualquier foto como favorita. Al eliminar una foto, la galería continúa desde la 
// siguiente sin interrupciones.

// La Clase Foto (Nodo): Debe contener titulo (String), fecha (String) y esFavorita (boolean).
// El Problema: La galería mantiene un puntero actual a la foto que se está viendo. Navegar con "siguiente" o "anterior" mueve 
// ese puntero. Marcar como favorita simplemente alterna el campo esFavorita de la foto actual. Eliminar la foto actual 
// desconecta el nodo en O(1) y mueve actual a la siguiente.
// Reto: Implementa los métodos siguiente(), anterior(), toggleFavorita(), eliminarActual() y mostrarGaleria(). mostrarGaleria() 
// recorre todas las fotos marcando con [★] las favoritas y con [▶] la foto actual. Simula: carga 5 fotos, avanza dos veces, 
// marca la actual como favorita, retrocede una, elimina esa foto y muestra el estado final de la galería.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Galeria galeria = new Galeria();

        // Cargar 5 fotos iniciales
        galeria.agregarFoto("Foto1", "01/01/2024");
        galeria.agregarFoto("Foto2", "02/01/2024");
        galeria.agregarFoto("Foto3", "03/01/2024");
        galeria.agregarFoto("Foto4", "04/01/2024");
        galeria.agregarFoto("Foto5", "05/01/2024");

        int opcion;

        do {
            System.out.println("\n--- GALERIA ---");
            System.out.println("1. Siguiente");
            System.out.println("2. Anterior");
            System.out.println("3. Marcar/Desmarcar Favorita");
            System.out.println("4. Eliminar actual");
            System.out.println("5. Mostrar galeria");
            System.out.println("6. Ejecutar simulacion automatica");
            System.out.println("0. Salir");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    galeria.siguiente();
                    break;
                case 2:
                    galeria.anterior();
                    break;
                case 3:
                    galeria.toggleFavorita();
                    break;
                case 4:
                    galeria.eliminarActual();
                    break;
                case 5:
                    galeria.mostrarGaleria();
                    break;
                case 6:
                    // Simulación pedida
                    galeria.siguiente();
                    galeria.siguiente();
                    galeria.toggleFavorita();
                    galeria.anterior();
                    galeria.eliminarActual();
                    galeria.mostrarGaleria();
                    break;
            }

        } while (opcion != 0);

        sc.close();
    }
}

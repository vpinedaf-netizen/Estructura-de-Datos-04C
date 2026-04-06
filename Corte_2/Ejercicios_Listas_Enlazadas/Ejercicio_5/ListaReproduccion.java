package Corte_2.Ejercicios_Listas_Enlazadas.Ejercicio_5;

public class ListaReproduccion {
    private Cancion cabeza;
    private Cancion actual; // canción en reproducción

    // Agregar al final
    public void agregarAlFinal(String titulo, String artista, int duracion, String genero) {
        Cancion nueva = new Cancion(titulo, artista, duracion, genero);

        if (cabeza == null) {
            cabeza = nueva;
            actual = nueva;
        } else {
            Cancion temp = cabeza;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nueva;
        }
    }

    // Agregar después de la actual
    public void agregarAContinuacion(String titulo, String artista, int duracion, String genero) {
        if (actual == null) {
            System.out.println("No hay canción actual.");
            return;
        }

        Cancion nueva = new Cancion(titulo, artista, duracion, genero);
        nueva.siguiente = actual.siguiente;
        actual.siguiente = nueva;
    }

    // Mostrar lista
    public void mostrarLista() {
        if (cabeza == null) {
            System.out.println("Lista vacía.");
            return;
        }

        Cancion temp = cabeza;
        int i = 1;

        while (temp != null) {
            System.out.println(i + ". " + temp.titulo + " - " + temp.artista +
                    " (" + temp.duracionSegundos + "s, " + temp.genero + ")");
            temp = temp.siguiente;
            i++;
        }
    }

    // Calcular duración total
    public void mostrarDuracionTotal() {
        int totalSegundos = 0;
        Cancion temp = cabeza;

        while (temp != null) {
            totalSegundos += temp.duracionSegundos;
            temp = temp.siguiente;
        }

        int minutos = totalSegundos / 60;
        int segundos = totalSegundos % 60;

        System.out.println(" Duración total: " + minutos + ":" + String.format("%02d", segundos));
    }

    // Cambiar canción actual (por posición)
    public void cambiarActual(int posicion) {
        Cancion temp = cabeza;
        int i = 1;

        while (temp != null) {
            if (i == posicion) {
                actual = temp;
                System.out.println(" Ahora suena: " + actual.titulo);
                return;
            }
            temp = temp.siguiente;
            i++;
        }

        System.out.println("Posición inválida.");
    }
}

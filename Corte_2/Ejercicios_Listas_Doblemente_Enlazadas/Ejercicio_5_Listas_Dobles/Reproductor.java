package Corte_2.Ejercicios_Listas_Doblemente_Enlazadas.Ejercicio_5_Listas_Dobles;

public class Reproductor {
    private Cancion inicio;
    private Cancion fin;
    private Cancion actual;

    public Reproductor() {
        inicio = null;
        fin = null;
        actual = null;
    }

    // Agregar canción al final
    public void agregarCancion(String titulo, String artista, int duracion) {
        Cancion nueva = new Cancion(titulo, artista, duracion);

        if (inicio == null) {
            inicio = fin = actual = nueva;
        } else {
            fin.siguiente = nueva;
            nueva.anterior = fin;
            fin = nueva;
        }
    }

    // Mostrar canción actual
    public void mostrarActual() {
        if (actual != null) {
            System.out.println("Reproduciendo:");
            actual.mostrar();
        } else {
            System.out.println("No hay canciones.");
        }
    }

    // Método del reto: avanzar
    public void saltarAdelante() {
        if (actual != null && actual.siguiente != null) {
            actual = actual.siguiente;
            mostrarActual();
        } else {
            System.out.println("Ya estás en la última canción.");
        }
    }

    // Método del reto: retroceder
    public void saltarAtras() {
        if (actual != null && actual.anterior != null) {
            actual = actual.anterior;
            mostrarActual();
        } else {
            System.out.println("No puedes retroceder, estás en la primera canción.");
        }
    }

    // Mostrar toda la lista
    public void mostrarLista() {
        Cancion temp = inicio;

        if (temp == null) {
            System.out.println("Lista vacía.");
            return;
        }

        while (temp != null) {
            temp.mostrar();
            temp = temp.siguiente;
        }
    }
}

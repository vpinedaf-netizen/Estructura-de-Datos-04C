package Corte_2.Ejercicios_Listas_Doblemente_Enlazadas.Ejercicio_5_Listas_Dobles;

public class Cancion {
    String titulo;
    String artista;
    int duracion; // en segundos

    Cancion siguiente;
    Cancion anterior;

    public Cancion(String titulo, String artista, int duracion) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
        this.siguiente = null;
        this.anterior = null;
    }

    public void mostrar() {
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Duración: " + duracion + " seg");
        System.out.println("---------------------------");
    }
}

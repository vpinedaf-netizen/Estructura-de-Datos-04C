package Corte_2.Ejercicios_Listas_Circulares.Ejercicio_2_Listas_Circulares;

public class Anuncio {
    String titulo;
    int duracionSegundos;
    int vecesRepetido;
    String categoria;

    Anuncio siguiente;

    public Anuncio(String titulo, int duracionSegundos, String categoria) {
        this.titulo = titulo;
        this.duracionSegundos = duracionSegundos;
        this.categoria = categoria;
        this.vecesRepetido = 0;
        this.siguiente = null;
    }

    public void mostrar() {
        System.out.println("Título: " + titulo);
        System.out.println("Duración: " + duracionSegundos + " seg");
        System.out.println("Categoría: " + categoria);
        System.out.println("Veces repetido: " + vecesRepetido);
        System.out.println("---------------------------");
    }
}
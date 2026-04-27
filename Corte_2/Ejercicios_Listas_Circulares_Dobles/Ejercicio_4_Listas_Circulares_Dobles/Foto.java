package Corte_2.Ejercicios_Listas_Circulares_Dobles.Ejercicio_4_Listas_Circulares_Dobles;

public class Foto {
    String titulo;
    String fecha;
    boolean esFavorita;

    Foto siguiente;
    Foto anterior;

    public Foto(String titulo, String fecha) {
        this.titulo = titulo;
        this.fecha = fecha;
        this.esFavorita = false;
        this.siguiente = null;
        this.anterior = null;
    }
}

package Corte_2.Ejercicios_Listas_Circulares_Dobles.Ejercicio_3_Listas_Circulares_Dobles;

class Capa {
    String nombre;
    boolean visible;
    String tipo;

    Capa siguiente;
    Capa anterior;

    public Capa(String nombre, boolean visible, String tipo) {
        this.nombre = nombre;
        this.visible = visible;
        this.tipo = tipo;
    }
}

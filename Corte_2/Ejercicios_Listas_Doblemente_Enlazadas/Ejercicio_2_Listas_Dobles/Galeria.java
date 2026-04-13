package Corte_2.Ejercicios_Listas_Doblemente_Enlazadas.Ejercicio_2_Listas_Dobles;

public class Galeria {
    private Fotografia inicio;
    private Fotografia fin;
    private Fotografia actual;

    public Galeria() {
        inicio = null;
        fin = null;
        actual = null;
    }

    // Agregar al final
    public void agregarFoto(String nombre, double tamano, String resolucion) {
        Fotografia nueva = new Fotografia(nombre, tamano, resolucion);

        if (inicio == null) {
            inicio = fin = actual = nueva;
        } else {
            fin.siguiente = nueva;
            nueva.anterior = fin;
            fin = nueva;
        }
    }

    // Mostrar foto actual
    public void mostrarActual() {
        if (actual != null) {
            actual.mostrar();
        } else {
            System.out.println("No hay fotos.");
        }
    }

    // Siguiente foto
    public void siguiente() {
        if (actual != null && actual.siguiente != null) {
            actual = actual.siguiente;
            mostrarActual();
        } else {
            System.out.println("Ya estás en la última foto.");
        }
    }

    // Foto anterior
    public void anterior() {
        if (actual != null && actual.anterior != null) {
            actual = actual.anterior;
            mostrarActual();
        } else {
            System.out.println("Ya estás en la primera foto.");
        }
    }

    // Método del reto
    public void reproducirGaleria() {
        if (inicio == null) {
            System.out.println("Galería vacía.");
            return;
        }

        System.out.println("Recorriendo hacia adelante:");
        Fotografia temp = inicio;

        while (temp != null) {
            temp.mostrar();
            if (temp.siguiente == null) break;
            temp = temp.siguiente;
        }

        System.out.println("Recorriendo hacia atrás:");
        while (temp != null) {
            temp.mostrar();
            temp = temp.anterior;
        }
    }
}

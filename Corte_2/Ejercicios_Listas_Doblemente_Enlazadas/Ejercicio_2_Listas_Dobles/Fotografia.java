package Corte_2.Ejercicios_Listas_Doblemente_Enlazadas.Ejercicio_2_Listas_Dobles;

public class Fotografia {
    String nombreArchivo;
    double tamanoMB;
    String resolucion;

    Fotografia siguiente;
    Fotografia anterior;

    public Fotografia(String nombreArchivo, double tamanoMB, String resolucion) {
        this.nombreArchivo = nombreArchivo;
        this.tamanoMB = tamanoMB;
        this.resolucion = resolucion;
        this.siguiente = null;
        this.anterior = null;
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombreArchivo);
        System.out.println("Tamaño: " + tamanoMB + " MB");
        System.out.println("Resolución: " + resolucion);
        System.out.println("---------------------------");
    }
}

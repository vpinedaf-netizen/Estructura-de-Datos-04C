package Corte_2.Ejercicios_Listas_Enlazadas.Ejercicio_3;

public class TorreControl {
    private Vuelo cabeza;

    // Agregar vuelo
    public void agregarVuelo(String numero, String aerolinea, int combustible, int pasajeros) {
        Vuelo nuevo = new Vuelo(numero, aerolinea, combustible, pasajeros);

        // Si es emergencia desde el inicio
        if (combustible < 10) {
            nuevo.siguiente = cabeza;
            cabeza = nuevo;
            return;
        }

        // Si está vacía
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Vuelo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    // Método del reto
    public void reportarEmergencia(String numeroVuelo) {
        if (cabeza == null) return;

        Vuelo actual = cabeza;
        Vuelo anterior = null;

        while (actual != null && !actual.numeroVuelo.equals(numeroVuelo)) {
            anterior = actual;
            actual = actual.siguiente;
        }

        if (actual == null) {
            System.out.println("Vuelo no encontrado");
            return;
        }

        if (anterior == null) {
            System.out.println("Ya está en prioridad máxima");
            return;
        }

        // Quitar de su posición
        anterior.siguiente = actual.siguiente;

        // Llevar al inicio
        actual.siguiente = cabeza;
        cabeza = actual;

        System.out.println("Vuelo movido a emergencia");
    }

    public void mostrarCola() {
        Vuelo actual = cabeza;

        while (actual != null) {
            System.out.println(actual.numeroVuelo + " - " + actual.aerolinea +
                    " - Combustible: " + actual.combustibleRestante);
            actual = actual.siguiente;
        }
    }
}

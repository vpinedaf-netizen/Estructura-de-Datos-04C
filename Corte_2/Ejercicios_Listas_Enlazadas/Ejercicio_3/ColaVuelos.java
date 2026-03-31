package Corte_2.Ejercicios_Listas_Enlazadas.Ejercicio_3;

class ColaVuelos {
    Vuelo cabeza;
    Vuelo cola;

    // Agregar vuelo al final
    public void agregarVuelo(String numero, String aerolinea, int combustible, int pasajeros) {
        Vuelo nuevo = new Vuelo(numero, aerolinea, combustible, pasajeros);

        if (cabeza == null) {
            cabeza = cola = nuevo;
        } else {
            cola.siguiente = nuevo;
            cola = nuevo;
        }
    }

    // Mostrar vuelos
    public void mostrarVuelos() {
        if (cabeza == null) {
            System.out.println("No hay vuelos en espera.");
            return;
        }

        Vuelo actual = cabeza;
        while (actual != null) {
            System.out.println("Vuelo: " + actual.numeroVuelo +
                    " | Aerolínea: " + actual.aerolinea +
                    " | Combustible: " + actual.combustibleRestante +
                    " | Pasajeros: " + actual.pasajeros);
            actual = actual.siguiente;
        }
    }

    // Reportar emergencia
    public void reportarEmergencia(String numeroVuelo) {
        if (cabeza == null) {
            System.out.println("No hay vuelos.");
            return;
        }

        Vuelo actual = cabeza;
        Vuelo anterior = null;

        while (actual != null) {
            if (actual.numeroVuelo.equals(numeroVuelo)) {

                if (actual.combustibleRestante >= 10) {
                    System.out.println("El vuelo no tiene combustible crítico.");
                    return;
                }

                // Si ya está en la cabeza
                if (anterior == null) {
                    System.out.println("El vuelo ya está en prioridad.");
                    return;
                }

                // Desconectar nodo
                anterior.siguiente = actual.siguiente;

                // Si era el último
                if (actual == cola) {
                    cola = anterior;
                }

                // Mover al inicio
                actual.siguiente = cabeza;
                cabeza = actual;

                System.out.println("⚠️ Emergencia atendida. Vuelo movido al inicio.");
                return;
            }

            anterior = actual;
            actual = actual.siguiente;
        }

        System.out.println("Vuelo no encontrado.");
    }
}

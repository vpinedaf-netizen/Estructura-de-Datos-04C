package Corte_2.Ejercicios_Listas_Enlazadas.Ejercicio_4;

public class ListaLecturas {
    private Lectura cabeza;

    // Insertar al inicio
    public void agregarInicio(int idSensor, double temperatura, double presion, String hora) {
        Lectura nueva = new Lectura(idSensor, temperatura, presion, hora);
        nueva.siguiente = cabeza;
        cabeza = nueva;
    }

    // Mostrar todas las lecturas
    public void mostrarLecturas() {
        if (cabeza == null) {
            System.out.println("No hay lecturas registradas.");
            return;
        }

        Lectura actual = cabeza;
        while (actual != null) {
            System.out.println("Sensor: " + actual.idSensor +
                               " | Temp: " + actual.temperatura +
                               " | Presión: " + actual.presion +
                               " | Hora: " + actual.hora);
            actual = actual.siguiente;
        }
    }

    // Buscar la temperatura más alta
    public void mostrarTemperaturaMaxima() {
        if (cabeza == null) {
            System.out.println("No hay lecturas.");
            return;
        }

        Lectura actual = cabeza;
        Lectura max = cabeza;

        while (actual != null) {
            if (actual.temperatura > max.temperatura) {
                max = actual;
            }
            actual = actual.siguiente;
        }

        System.out.println("\n Lectura con mayor temperatura:");
        System.out.println("Sensor: " + max.idSensor +
                           " | Temp: " + max.temperatura +
                           " | Presión: " + max.presion +
                           " | Hora: " + max.hora);
    }
}

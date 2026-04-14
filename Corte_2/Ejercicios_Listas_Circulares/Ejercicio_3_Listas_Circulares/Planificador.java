package Corte_2.Ejercicios_Listas_Circulares.Ejercicio_3_Listas_Circulares;

import java.util.ArrayList;

public class Planificador {
    private Proceso cabeza;

    public Planificador() {
        cabeza = null;
    }

    // Agregar proceso (circular)
    public void agregarProceso(String nombre, int pid, int tiempo, int prioridad) {
        Proceso nuevo = new Proceso(nombre, pid, tiempo, prioridad);

        if (cabeza == null) {
            cabeza = nuevo;
            cabeza.siguiente = cabeza;
        } else {
            Proceso temp = cabeza;

            while (temp.siguiente != cabeza) {
                temp = temp.siguiente;
            }

            temp.siguiente = nuevo;
            nuevo.siguiente = cabeza;
        }
    }

    // Mostrar procesos
    public void mostrarProcesos() {
        if (cabeza == null) {
            System.out.println("No hay procesos.");
            return;
        }

        Proceso temp = cabeza;

        do {
            temp.mostrar();
            temp = temp.siguiente;
        } while (temp != cabeza);
    }

    // Eliminar proceso
    private void eliminarProceso(Proceso actual, Proceso anterior) {
        if (actual == cabeza && actual.siguiente == cabeza) {
            cabeza = null;
        } else {
            if (actual == cabeza) {
                cabeza = cabeza.siguiente;
            }
            anterior.siguiente = actual.siguiente;
        }
    }

    // METODO DEL RETO
    public void ejecutar(int quantum) {
        if (cabeza == null) {
            System.out.println("No hay procesos para ejecutar.");
            return;
        }

        ArrayList<String> ordenFinalizacion = new ArrayList<>();

        Proceso actual = cabeza;
        Proceso anterior = null;

        while (cabeza != null) {

            System.out.println("Ejecutando proceso: " + actual.nombre);

            actual.tiempoRestante -= quantum;

            if (actual.tiempoRestante > 0) {
                System.out.println("Tiempo restante: " + actual.tiempoRestante);
                anterior = actual;
                actual = actual.siguiente;
            } else {
                System.out.println("Proceso terminado: " + actual.nombre);
                ordenFinalizacion.add(actual.nombre);

                // eliminar proceso
                if (anterior == null) {
                    // encontrar el último
                    anterior = actual;
                    while (anterior.siguiente != actual) {
                        anterior = anterior.siguiente;
                    }
                }

                eliminarProceso(actual, anterior);

                actual = anterior.siguiente;

                if (cabeza == null) {
                    break;
                }
            }

            System.out.println("-------------------------");
        }

        // Mostrar orden final
        System.out.println("Orden de finalización:");
        for (String nombre : ordenFinalizacion) {
            System.out.println(nombre);
        }
    }
}

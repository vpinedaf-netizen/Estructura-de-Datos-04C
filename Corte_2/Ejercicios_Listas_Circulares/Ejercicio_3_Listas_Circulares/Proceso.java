package Corte_2.Ejercicios_Listas_Circulares.Ejercicio_3_Listas_Circulares;

public class Proceso {
    String nombre;
    int pid;
    int tiempoRestante;
    int prioridad;

    Proceso siguiente;

    public Proceso(String nombre, int pid, int tiempoRestante, int prioridad) {
        this.nombre = nombre;
        this.pid = pid;
        this.tiempoRestante = tiempoRestante;
        this.prioridad = prioridad;
        this.siguiente = null;
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("PID: " + pid);
        System.out.println("Tiempo restante: " + tiempoRestante);
        System.out.println("Prioridad: " + prioridad);
        System.out.println("------------------------");
    }
}

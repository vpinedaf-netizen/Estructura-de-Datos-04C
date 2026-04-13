package Corte_2.Ejercicios_Listas_Doblemente_Enlazadas.Ejercicio_4_Listas_Dobles;

public class Paciente {
    String nombre;
    int edad;
    int nivelUrgencia;

    Paciente siguiente;
    Paciente anterior;

    public Paciente(String nombre, int edad, int nivelUrgencia) {
        this.nombre = nombre;
        this.edad = edad;
        this.nivelUrgencia = nivelUrgencia;
        this.siguiente = null;
        this.anterior = null;
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Urgencia: " + nivelUrgencia);
        System.out.println("---------------------------");
    }
}

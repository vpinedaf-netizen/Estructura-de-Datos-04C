package Corte_2.Ejercicios_Listas_Circulares.Ejercicio_3_Listas_Circulares;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Planificador planificador = new Planificador();

        int opcion;

        do {
            System.out.println("\n=== PLANIFICADOR ROUND ROBIN ===");
            System.out.println("1. Agregar proceso");
            System.out.println("2. Mostrar procesos");
            System.out.println("3. Ejecutar planificador");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("PID: ");
                    int pid = sc.nextInt();

                    System.out.print("Tiempo restante: ");
                    int tiempo = sc.nextInt();

                    System.out.print("Prioridad (1-3): ");
                    int prioridad = sc.nextInt();
                    sc.nextLine();

                    planificador.agregarProceso(nombre, pid, tiempo, prioridad);
                    break;

                case 2:
                    planificador.mostrarProcesos();
                    break;

                case 3:
                    System.out.print("Quantum: ");
                    int quantum = sc.nextInt();
                    planificador.ejecutar(quantum);
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 0);

        sc.close();
    }
}

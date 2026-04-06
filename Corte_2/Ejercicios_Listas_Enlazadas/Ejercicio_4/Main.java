package Corte_2.Ejercicios_Listas_Enlazadas.Ejercicio_4;
//4. Monitoreo Industrial (Sensores en Tiempo Real)
//Una planta química registra lecturas de sus tanques cada hora en una lista enlazada para auditoría.

//La Clase Lectura (Nodo): Debe contener idSensor (int), temperatura (double), presion (double) y hora (String).
//El Problema: Las lecturas se van agregando al inicio para que la más reciente sea siempre la primera que vea el supervisor.
//Reto: Implementa un método que busque y muestre la lectura con la temperatura más alta registrada en el historial.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaLecturas lista = new ListaLecturas();
        int opcion;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Agregar lectura");
            System.out.println("2. Mostrar lecturas");
            System.out.println("3. Mostrar temperatura más alta");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("ID Sensor: ");
                    int id = sc.nextInt();

                    System.out.print("Temperatura: ");
                    double temp = sc.nextDouble();

                    System.out.print("Presión: ");
                    double presion = sc.nextDouble();
                    sc.nextLine(); // limpiar buffer

                    System.out.print("Hora: ");
                    String hora = sc.nextLine();

                    lista.agregarInicio(id, temp, presion, hora);
                    break;

                case 2:
                    lista.mostrarLecturas();
                    break;

                case 3:
                    lista.mostrarTemperaturaMaxima();
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 4);

        sc.close();
    }
}

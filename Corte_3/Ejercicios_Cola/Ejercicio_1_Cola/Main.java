package Corte_3.Ejercicios_Cola.Ejercicio_1_Cola;

// 1. Centro de Llamadas (Atención al Cliente)
// Una empresa de telecomunicaciones recibe cientos de llamadas al día. Cuando todos los agentes están ocupados, 
// las llamadas entrantes se ponen en espera formando una fila virtual. La primera llamada en esperar es la primera en 
// ser atendida por el próximo agente disponible. Cada llamada se clasifica según su motivo: "Facturación", "Soporte Técnico", 
// "Cancelación"o "Información".

// La Clase Llamada (Nodo): Debe contener idLlamada(String), nombreCliente(String), motivoConsulta(String) y 
// duracionEstimadaMinutos(int).
// El Problema: El supervisor necesita saber cuántas llamadas en espera corresponden a un motivo específico, 
// para decidir si activa agentes especializados.
// Reto: Implementa un método contarPorMotivo(String motivo)que recorra la cola y devuelva la cantidad de llamadas cuyo 
// motivoConsultacoincida con el parámetro recibido, sin modificar la cola.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ColaLlamadas cola = new ColaLlamadas();

        int opcion;

        do {

            System.out.println("\n===== MENÚ CENTRO DE LLAMADAS =====");
            System.out.println("1. Agregar llamada");
            System.out.println("2. Mostrar llamadas");
            System.out.println("3. Atender llamada");
            System.out.println("4. Contar llamadas por motivo");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("\nIngrese ID de llamada: ");
                    String id = sc.nextLine();

                    System.out.print("Ingrese nombre del cliente: ");
                    String nombre = sc.nextLine();

                    System.out.print("Ingrese motivo de consulta: ");
                    String motivo = sc.nextLine();

                    System.out.print("Ingrese duración estimada: ");
                    int duracion = sc.nextInt();

                    Llamada llamada = new Llamada(
                            id,
                            nombre,
                            motivo,
                            duracion
                    );

                    cola.agregarLlamada(llamada);

                    break;

                case 2:

                    cola.mostrarLlamadas();

                    break;

                case 3:

                    Llamada atendida = cola.atenderLlamada();

                    if (atendida == null) {

                        System.out.println("\nNo hay llamadas en espera.");

                    } else {

                        System.out.println("\nLlamada atendida:");
                        System.out.println(atendida);
                    }

                    break;

                case 4:

                    System.out.print("\nIngrese el motivo a buscar: ");
                    String buscarMotivo = sc.nextLine();

                    int cantidad = cola.contarPorMotivo(buscarMotivo);

                    System.out.println(
                            "\nCantidad de llamadas con motivo '" +
                            buscarMotivo + "': " + cantidad
                    );

                    break;

                case 5:

                    System.out.println("\nSaliendo del sistema...");
                    break;

                default:

                    System.out.println("\nOpción inválida.");
            }

        } while (opcion != 5);

        sc.close();
    }
}

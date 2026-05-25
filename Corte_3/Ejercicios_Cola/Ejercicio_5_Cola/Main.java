package Corte_3.Ejercicios_Cola.Ejercicio_5_Cola;

// 5. Fábrica de Pedidos (Comercio electrónico)
// Una tienda en línea recibe pedidos de manera continua. Cada pedido ingresa a una cola central de procesamiento. 
// El sistema de bodega toma los pedidos en orden de llegada para preparar el envío. Si un pedido ya fue cancelado por 
// el cliente, debe ser descartado automáticamente al momento de ser procesado.

// La Clase Pedido (Nodo): Debe contener numeroPedido(String), cliente(String), totalPagar(double) y cancelado(boolean).
// El Problema: La bodega necesita procesar solo los pedidos vigentes. Los cancelados deben ser eliminados sin ser despachados, 
// pero registrados en un conteo.
// Reto: Implementa un método procesarPedidos()que recorra y vacíe la cola. Para cada pedido: si cancelado = true, lo descarta e 
// incrementa un contador de cancelados; si cancelado = false, lo "despacha" imprimiendo sus datos. Al finalizar, muestra el total
// despachado y el total cancelado.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ColaPedidos cola = new ColaPedidos();

        int opcion;

        do {

            System.out.println("\n===== MENÚ FÁBRICA DE PEDIDOS =====");
            System.out.println("1. Agregar pedido");
            System.out.println("2. Mostrar pedidos");
            System.out.println("3. Procesar pedidos");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("\nIngrese el número del pedido: ");
                    String numero = sc.nextLine();

                    System.out.print("Ingrese el nombre del cliente: ");
                    String cliente = sc.nextLine();

                    System.out.print("Ingrese el total a pagar: ");
                    double total = sc.nextDouble();

                    System.out.print("¿El pedido está cancelado? (true/false): ");
                    boolean cancelado = sc.nextBoolean();

                    Pedido pedido = new Pedido(
                            numero,
                            cliente,
                            total,
                            cancelado
                    );

                    cola.agregarPedido(pedido);

                    break;

                case 2:

                    cola.mostrarPedidos();

                    break;

                case 3:

                    cola.procesarPedidos();

                    break;

                case 4:

                    System.out.println("\nSaliendo del sistema...");
                    break;

                default:

                    System.out.println("\nOpción inválida.");
            }

        } while (opcion != 4);

        sc.close();
    }
}

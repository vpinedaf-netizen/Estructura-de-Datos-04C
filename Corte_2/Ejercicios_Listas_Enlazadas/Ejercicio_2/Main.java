package Corte_2.Ejercicios_Listas_Enlazadas.Ejercicio_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Inventario inventario = new Inventario();
        int opcion;

        do {
            System.out.println("\n== INVENTARIO DE LÁCTEOS ==");
            System.out.println("1. Agregar producto");
            System.out.println("2. Mostrar todos los productos");
            System.out.println("3. Mostrar productos por vencer (<5 días)");
            System.out.println("4. Salir");
            System.out.print("Seleccione: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Cantidad: ");
                    int cantidad = sc.nextInt();

                    System.out.print("Días para vencer: ");
                    int dias = sc.nextInt();
                    sc.nextLine();

                    inventario.agregarProducto(nombre, cantidad, dias);
                    break;

                case 2:
                    inventario.mostrarProductos();
                    break;

                case 3:
                    inventario.productosPorVencer();
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
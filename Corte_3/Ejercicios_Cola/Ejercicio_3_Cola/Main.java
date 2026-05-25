package Corte_3.Ejercicios_Cola.Ejercicio_3_Cola;

// 3. Impresora Compartida (Red de Oficina)
// En una oficina de arquitectura, varias computadoras comparten una única impresora de gran formato. Cada vez que alguien 
// envía un documento, este se agrega al final de la cola de impresión. La impresora procesa los trabajos en el orden exacto 
// en que fueron recibidos.

// La Clase Documento (Nodo): Debe contener nombreArchivo(String), usuario(String), numeroPaginas(int) y esColor(boolean).
// El Problema: Antes de imprimir, el jefe de oficina quiere saber cuántas páginas en total tiene la cola de impresión pendiente.
// Reto: Implementa un método calcularPaginasTotales()que recorra la cola y retorne la suma de numeroPaginastodos los documentos 
// en espera, sin alterar la cola.


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ColaImpresion cola = new ColaImpresion();

        int opcion;

        do {

            System.out.println("\n===== MENÚ IMPRESORA COMPARTIDA =====");
            System.out.println("1. Agregar documento");
            System.out.println("2. Mostrar cola de impresión");
            System.out.println("3. Imprimir documento");
            System.out.println("4. Calcular páginas totales");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("\nIngrese el nombre del archivo: ");
                    String nombreArchivo = sc.nextLine();

                    System.out.print("Ingrese el usuario: ");
                    String usuario = sc.nextLine();

                    System.out.print("Ingrese el número de páginas: ");
                    int paginas = sc.nextInt();

                    System.out.print("¿Es impresión a color? (true/false): ");
                    boolean color = sc.nextBoolean();

                    Documento documento = new Documento(
                            nombreArchivo,
                            usuario,
                            paginas,
                            color
                    );

                    cola.agregarDocumento(documento);

                    break;

                case 2:

                    cola.mostrarCola();

                    break;

                case 3:

                    Documento impreso = cola.imprimirDocumento();

                    if (impreso == null) {
                        System.out.println("\nNo hay documentos para imprimir.");
                    } else {
                        System.out.println("\nDocumento impreso:");
                        System.out.println(impreso);
                    }

                    break;

                case 4:

                    int total = cola.calcularPaginasTotales();

                    System.out.println("\nTotal de páginas pendientes: " + total);

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
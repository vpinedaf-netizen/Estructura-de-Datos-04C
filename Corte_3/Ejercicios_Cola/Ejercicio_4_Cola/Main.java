package Corte_3.Ejercicios_Cola.Ejercicio_4_Cola;

// 4. Paz Inteligente (Control de Tráfico)
// En una autopista de peaje, los vehículos ingresan a un carril y avanzan en fila hasta la cabina de cobro. 
// El sistema registra automáticamente cada vehículo al entrar al carril. El cajero cobra en el orden estricto de llegada.

// La Clase Vehiculo (Nodo): Debe contener placa(String), tipoVehiculo(String), tarifa(double) y esExento(boolean).
// El Problema: Al cerrar el turno, el sistema debe calcular el total recaudado, ignorando los vehículos exentos de pago.
// Reto: Implementa un método cerrarTurno()que extraiga ( dequeue) todos los vehículos de la cola, acumula la tarifa solo 
// de los que tengan esExento = falsee imprime el total recaudado al finalizar.




import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ColaPeaje cola = new ColaPeaje();

        int opcion;

        do {

            System.out.println("\n===== MENÚ PEAJE INTELIGENTE =====");
            System.out.println("1. Ingresar vehículo");
            System.out.println("2. Mostrar cola");
            System.out.println("3. Atender vehículo");
            System.out.println("4. Cerrar turno");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("\nIngrese la placa: ");
                    String placa = sc.nextLine();

                    System.out.print("Ingrese el tipo de vehículo: ");
                    String tipo = sc.nextLine();

                    System.out.print("Ingrese la tarifa: ");
                    double tarifa = sc.nextDouble();

                    System.out.print("¿Es exento de pago? (true/false): ");
                    boolean exento = sc.nextBoolean();

                    Vehiculo vehiculo = new Vehiculo(
                            placa,
                            tipo,
                            tarifa,
                            exento
                    );

                    cola.ingresarVehiculo(vehiculo);

                    break;

                case 2:

                    cola.mostrarCola();

                    break;

                case 3:

                    Vehiculo atendido = cola.atenderVehiculo();

                    if (atendido == null) {
                        System.out.println("\nNo hay vehículos en la cola.");
                    } else {
                        System.out.println("\nVehículo atendido:");
                        System.out.println(atendido);
                    }

                    break;

                case 4:

                    cola.cerrarTurno();

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
package Corte_2.Ejercicios_Pilas.Ejercicio_3_Pila;

// 3. Logística de Distribución (Callejón sin Salida)
// Un centro de logística urbana tiene un muelle de carga ubicado al final de un callejón muy estrecho. Los camiones de 
// reparto entran uno tras otro y quedan "atrapados" en el orden de llegada. El último camión en entrar debe ser obligatoriamente 
// el primero en salir para permitir que los demás se retiren.

// La Clase Camion (Nodo): Debe contener placa(String), conductor(String) y cargaToneladas(double).
// El Problema: El supervisor necesita saber cuánta carga total hay en el callejón sin mover los camiones esencialmente 
// (solo consultando la estructura).
// Reto: Implementa un método que recorra la pila (sin destruirla permanentemente, o reconstruyéndola) y calcula la suma 
// total de cargaToneladastodos los camiones estacionados.

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        PilaCamiones pila = new PilaCamiones();

        int opcion;

        do 
        {
            System.out.println("\n===== LOGÍSTICA DE DISTRIBUCIÓN =====");
            System.out.println("1. Agregar camión");
            System.out.println("2. Mostrar camiones");
            System.out.println("3. Calcular carga total");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) 
            {
                case 1:

                    System.out.print("Placa: ");
                    String placa = sc.nextLine();

                    System.out.print("Conductor: ");
                    String conductor = sc.nextLine();

                    System.out.print("Carga en toneladas: ");
                    double carga = sc.nextDouble();

                    Camion camion = new Camion(placa, conductor, carga);

                    pila.apilar(camion);

                    System.out.println("Camión agregado correctamente");
                    break;

                case 2:

                    pila.mostrar();
                    break;

                case 3:

                    double total = pila.calcularCargaTotal();

                    System.out.println("Carga total en el callejón: "
                            + total + " toneladas");
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
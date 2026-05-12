package Corte_2.Ejercicios_Pilas.Ejercicio_5_Pila;

// 5. Ruta de Rescate (Espeleología Geológica)
// Un equipo de rescatistas entra en una cueva inexplorada. Para no perderse, van dejando "Estaciones de Seguridad" 
// representadas por una baliza que registra los datos del entorno.

// La Clase Estacion (Nodo): Debe contener nombrePunto(String), profundidad(int) y nivelOxigeno(double).
// El Problema: Para salir de la cueva, el equipo debe seguir las estaciones en el orden inverso al que fueron 
// colocadas (de la más profunda a la entrada).
// Reto: Implementa el método retrocederASuperficie(). Este debe mostrar el nombre de cada estación a medida que se 
// desapila. Importante: Si en alguna estación el nivelOxigenoes inferior al 18%, el sistema debe imprimir una alerta de 
// "Uso de Tanque de Emergencia Requerido" al pasar por ese punto.

import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        PilaEstaciones pila = new PilaEstaciones();

        int opcion;

        do 
        {
            System.out.println("\n===== RUTA DE RESCATE =====");
            System.out.println("1. Agregar estación");
            System.out.println("2. Mostrar estaciones");
            System.out.println("3. Retroceder a superficie");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) 
            {
                case 1:

                    System.out.print("Nombre del punto: ");
                    String nombre = sc.nextLine();

                    System.out.print("Profundidad: ");
                    int profundidad = sc.nextInt();

                    System.out.print("Nivel de oxígeno: ");
                    double oxigeno = sc.nextDouble();

                    Estacion estacion = new Estacion(
                            nombre,
                            profundidad,
                            oxigeno
                    );

                    pila.apilar(estacion);

                    System.out.println("Estación agregada correctamente");
                    break;

                case 2:

                    pila.mostrar();
                    break;

                case 3:

                    pila.retrocederASuperficie();
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

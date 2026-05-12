package Corte_3.Ejercicios_Pilas.Ejercicio_2_Pila;

// 2. Control de Calidad (Línea de Ensamblaje)
// Un brazo robótico en una fábrica de motores apila componentes siguiendo una secuencia precisa. Un sensor de visión 
// artificial inspecciona cada pieza después de ser colocada.

// La Clase Pieza (Nodo): Debe contener nombrePieza(String), numeroSerie(String) y esDefectuosa(boolean).
// El Problema: Si el sensor detecta una pieza defectuosa, la línea de producción debe detenerse inmediatamente.
// Reto: Crea un método limpiarHastaDefecto()que extraiga ( pop) todas las piezas de la pila hasta encontrar la primera 
// que tenga esDefectuosa = true. El método debe imprimir el nombre de todas las piezas "buenas" que tuvieron que ser retiradas
//  y descartadas antes de llegar a la pieza fallida.

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        PilaPiezas pila = new PilaPiezas();

        int opcion;

        do 
        {
            System.out.println("\n===== CONTROL DE CALIDAD =====");
            System.out.println("1. Agregar pieza");
            System.out.println("2. Mostrar piezas");
            System.out.println("3. Limpiar hasta defecto");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) 
            {
                case 1:

                    System.out.print("Nombre de la pieza: ");
                    String nombre = sc.nextLine();

                    System.out.print("Número de serie: ");
                    String serie = sc.nextLine();

                    System.out.print("¿Es defectuosa? (true/false): ");
                    boolean defectuosa = sc.nextBoolean();

                    Pieza pieza = new Pieza(nombre, serie, defectuosa);

                    pila.apilar(pieza);

                    System.out.println("Pieza agregada correctamente");
                    break;

                case 2:

                    pila.mostrar();
                    break;

                case 3:

                    pila.limpiarHastaDefecto();
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

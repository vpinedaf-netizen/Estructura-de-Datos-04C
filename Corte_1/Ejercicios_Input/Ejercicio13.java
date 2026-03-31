package Corte_1.Ejercicios_Input;
/*
 * Ejercicio 13 — Buscar en lista (lineal)
 * Tema 3 — Estructuras lineales y no lineales
 *
 * Descripción:
 * Pedir 5 nombres de empleados para llenar un arreglo. Luego pedir el nombre
 * que desea buscar. Recorrer el arreglo y mostrar si el empleado fue encontrado
 * y en qué posición.
 *
 * Datos de entrada: String x 5 nombres, String nombre a buscar
 * Salida esperada: "María" encontrada en la posición 2.
 */

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] empleados = new String[5];
        System.out.println("Ingrese los nombres de 5 empleados:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Empleado " + (i + 1) + ": ");
            empleados[i] = sc.nextLine();
        }

        System.out.print("\nNombre a buscar: ");
        String nombreBuscar = sc.nextLine();

        int posicion = -1;
        for (int i = 0; i < 5; i++) {
            if (empleados[i].equalsIgnoreCase(nombreBuscar)) {
                posicion = i;
                break;
            }
        }

        if (posicion >= 0) {
            System.out.println("\"" + nombreBuscar + "\" encontrado en la posición " + (posicion + 1) + ".");
        } else {
            System.out.println("\"" + nombreBuscar + "\" no encontrado en la lista.");
        }

        sc.close();
    }
}

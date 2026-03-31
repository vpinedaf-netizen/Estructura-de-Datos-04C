package Corte_1.Ejercicios_Input;
/*
 * Ejercicio 11 — Lista de pasajeros (lineal)
 * Tema 3 — Estructuras lineales y no lineales
 *
 * Descripción:
 * 1. Pedir cuántos pasajeros tiene el vuelo (máximo 8).
 * 2. Pedir el nombre de cada pasajero.
 * 3. Mostrar una lista numerada con número de asiento y nombre.
 * 4. Indicar cuántos asientos quedan disponibles de un total de 8.
 *
 * Datos de entrada: int cantidad, String nombres (por cada pasajero)
 */

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MAX_ASIENTOS = 8;

        System.out.println("¿Cuántos pasajeros tiene el vuelo? (máximo " + MAX_ASIENTOS + ")");
        int cantidad = sc.nextInt();
        sc.nextLine();

        if (cantidad > MAX_ASIENTOS) {
            System.err.println("Error: el número de pasajeros no puede exceder de " + MAX_ASIENTOS + ".");
            sc.close();
            return;
        }

        String[] nombres = new String[cantidad];
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Nombre del pasajero " + (i + 1) + ": ");
            nombres[i] = sc.nextLine();
        }

        System.out.println("\n--- Lista de pasajeros ---");
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Asiento " + (i + 1) + ": " + nombres[i]);
        }

        int asientosDisponibles = MAX_ASIENTOS - cantidad;
        System.out.println("\nAsientos disponibles: " + asientosDisponibles + " de " + MAX_ASIENTOS);

        sc.close();
    }
}

package Ejercicios_Input;
/*
 * Ejercicio 8 — Copia real vs referencia
 * Tema 2 — Variables por referencia
 *
 * Descripción:
 * 1. Pedir 3 calificaciones para llenar el arreglo notas[].
 * 2. Crear una copia real de notas[] en notasRespaldo[] (elemento por elemento).
 * 3. Modificar notas[0] con un nuevo valor ingresado por el usuario.
 * 4. Mostrar ambos arreglos.
 * 5. Verificar que notasRespaldo no cambió (copia independiente).
 */

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        double[] notas = new double[3];
        System.out.println("Ingrese 3 calificaciones:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }

        double[] notasRespaldo = new double[3];
        for (int i = 0; i < 3; i++) {
            notasRespaldo[i] = notas[i];
        }

        System.out.print("\nNuevo valor para notas[0]: ");
        notas[0] = sc.nextDouble();

        System.out.println("\n--- Arreglo notas ---");
        for (int i = 0; i < notas.length; i++) {
            String msg = (i == 0) ? " <- cambió" : "";
            System.out.println("notas[" + i + "] = " + notas[i] + msg);
        }
        System.out.println("\n--- Arreglo notasRespaldo ---");
        for (int i = 0; i < notasRespaldo.length; i++) {
            String msg = (i == 0) ? " <- no cambió, es una copia independiente" : "";
            System.out.println("notasRespaldo[" + i + "] = " + notasRespaldo[i] + msg);
        }

        sc.close();
    }
}

package Corte_1.Ejercicios_Input;
/*
 * Ejercicio 12 — Registro de temperaturas (lineal)
 * Tema 3 — Estructuras lineales y no lineales
 *
 * Descripción:
 * 1. Pedir las temperaturas máximas de los 7 días de la semana.
 * 2. Calcular e imprimir: promedio semanal, día más caluroso, día más frío,
 *    y qué días estuvieron por encima del promedio semanal.
 * Índice 0 = Lunes.
 *
 * Datos de entrada: double (7 temperaturas)
 */

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        String[] dias = { "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo" };
        double[] temperaturas = new double[7];

        System.out.println("Ingrese la temperatura máxima de cada día:");
        for (int i = 0; i < 7; i++) {
            System.out.print(dias[i] + ": ");
            temperaturas[i] = sc.nextDouble();
        }

        double suma = 0;
        for (int i = 0; i < 7; i++) {
            suma += temperaturas[i];
        }
        double promedio = suma / 7;

        int indiceCaluroso = 0;
        int indiceFrio = 0;
        for (int i = 1; i < 7; i++) {
            if (temperaturas[i] > temperaturas[indiceCaluroso]) indiceCaluroso = i;
            if (temperaturas[i] < temperaturas[indiceFrio]) indiceFrio = i;
        }

        System.out.println("\n--- Resultados ---");
        System.out.println("Promedio semanal: " + promedio);
        System.out.println("Día más caluroso: " + dias[indiceCaluroso] + " (" + temperaturas[indiceCaluroso] + "°)");
        System.out.println("Día más frío: " + dias[indiceFrio] + " (" + temperaturas[indiceFrio] + "°)");
        System.out.print("Días por encima del promedio: ");

        boolean primero = true;

        for (int i = 0; i < 7; i++) {
            if (temperaturas[i] > promedio) {
                if (!primero) System.out.print(", ");
                System.out.print(dias[i]);
                primero = false;
            }
        }
        if (primero) System.out.print("ninguno");
        System.out.println();

        sc.close();
    }
}

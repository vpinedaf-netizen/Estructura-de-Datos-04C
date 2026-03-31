package Corte_1.Ejercicios_Input;
/*
 * Ejercicio 14 — Ventas por sucursal (lineal)
 * Tema 3 — Estructuras lineales y no lineales
 *
 * Descripción:
 * Pedir las ventas mensuales de 5 sucursales de una cadena. Mostrar:
 * la sucursal con más ventas, la de menos ventas, el total de la cadena
 * y el porcentaje que cada sucursal representa del total.
 *
 * Datos de entrada: String nombre de sucursal + double venta x 5
 */

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        String[] sucursales = new String[5];
        double[] ventas = new double[5];

        System.out.println("Ingrese nombre y ventas de cada sucursal:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Sucursal " + (i + 1) + " - Nombre: ");
            sucursales[i] = sc.nextLine();
            System.out.print("Sucursal " + (i + 1) + " - Ventas: ");
            ventas[i] = sc.nextDouble();
            sc.nextLine();
        }

        double total = 0;
        for (int i = 0; i < 5; i++) {
            total += ventas[i];
        }

        int indiceMayor = 0;
        int indiceMenor = 0;
        for (int i = 1; i < 5; i++) {
            if (ventas[i] > ventas[indiceMayor]) indiceMayor = i;
            if (ventas[i] < ventas[indiceMenor]) indiceMenor = i;
        }

        System.out.println("\n--- Resultados ---");
        System.out.println("Sucursal con más ventas: " + sucursales[indiceMayor] + " (" + ventas[indiceMayor] + ")");
        System.out.println("Sucursal con menos ventas: " + sucursales[indiceMenor] + " (" + ventas[indiceMenor] + ")");
        System.out.println("Total de la cadena: " + total);
        System.out.println("\nPorcentaje por sucursal:");
        for (int i = 0; i < 5; i++) {
            double porcentaje = total > 0 ? (ventas[i] / total) * 100 : 0;
            System.out.println("  " + sucursales[i] + ": " + porcentaje + "%");
        }

        sc.close();
    }
}

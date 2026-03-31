package Corte_1.Ejercicios_Input;
/*
 * Ejercicio 7 — Arreglo compartido (inventario)
 * Tema 2 — Variables por referencia
 *
 * Descripción:
 * 1. Llenar un arreglo inicial pidiendo 4 precios al usuario (precios[]).
 * 2. Crear preciosAuditoria como referencia al arreglo precios (preciosAuditoria = precios).
 * 3. Pedir índice y nuevo precio; aplicar la corrección usando preciosAuditoria.
 * 4. Mostrar ambos arreglos y verificar que el cambio se refleja en los dos.
 */

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        double[] precios = new double[4];
        System.out.println("Ingrese 4 precios:");
        for (int i = 0; i < 4; i++) {
            System.out.print("Precio " + (i + 1) + ": ");
            precios[i] = sc.nextDouble();
        }

        double[] preciosAuditoria = precios;

        System.out.println("\n--- Corrección ---");
        System.out.print("Índice a corregir (0-3): ");
        int indice = sc.nextInt();
        System.out.print("Nuevo precio: ");
        double nuevoPrecio = sc.nextDouble();
        preciosAuditoria[indice] = nuevoPrecio;

        System.out.println("\n--- Arreglo precios ---");
        for (int i = 0; i < precios.length; i++) {
            System.out.println("precios[" + i + "] = " + precios[i]);
        }
        System.out.println("\n--- Arreglo preciosAuditoria ---");
        for (int i = 0; i < preciosAuditoria.length; i++) {
            System.out.println("preciosAuditoria[" + i + "] = " + preciosAuditoria[i]);
        }
        System.out.println("\nAmbos arreglos comparten la misma referencia: el cambio se ve en los dos.");

        sc.close();
    }
}

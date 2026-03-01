package Ejercicios_Input;
/*
 * Ejercicio 6 — Demostración por valor
 * Tema 2 — Variables por referencia
 *
 * Descripción:
 * 1. Pedir al usuario dos números enteros, a y b.
 * 2. Asignar el valor de a a b (b = a).
 * 3. Pedir al usuario un nuevo valor para b.
 * 4. Imprimir los valores de a y b después del último cambio.
 * 5. Explicar por qué a no cambió (paso por valor).
 */

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("Ingrese el valor de a:");
        int a = sc.nextInt();

        System.out.println("Ingrese el valor de b:");
        int b = sc.nextInt();

        b = a;

        System.out.println("Ingrese un nuevo valor para b:");
        b = sc.nextInt();

        System.out.println("\na = " + a + " + no cambió, se pasó por VALOR");
        System.out.println("b = " + b + " + esta sí cambió");

        sc.close();
    }
}

package Ejercicios_Input;
/*
 * Ejercicio 10 — Intercambio de valores
 * Tema 2 — Variables por referencia
 *
 * Descripción:
 * Pedir dos números enteros x e y. Intercambiar sus valores usando una
 * variable auxiliar temp. Mostrar los valores antes y después del intercambio.
 * Pista: Si asignas x = y directamente sin temp, pierdes el valor original de x.
 *
 * Datos de entrada: int x, int y
 */

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el valor de x:");
        int x = sc.nextInt();
        System.out.println("Ingrese el valor de y:");
        int y = sc.nextInt();

        System.out.println("Antes: x=" + x + ", y=" + y);

        int temp = x;
        x = y;
        y = temp;

        System.out.println("Después: x=" + x + ", y=" + y);

        sc.close();
    }
}

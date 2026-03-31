package Corte_1.Ejercicios_Input;
/*
 * Ejercicio 15 — Árbol de decisiones (no lineal)
 * Tema 3 — Estructuras lineales y no lineales
 *
 * Descripción:
 * Pedir un número entero al usuario. Navegar un árbol de decisiones para
 * clasificarlo como: Par positivo, Impar positivo, Cero o Negativo.
 * El árbol se implementa con nodos que tienen String descripcion e hijos
 * izquierdo y derecho.
 *
 * Estructura del árbol:
 * Raíz: ¿Número > 0?
 *   Sí → ¿Par o Impar? → Par → Par positivo / Impar → Impar positivo
 *   No → ¿Es cero? → Sí → Cero / No → Negativo
 */

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        NodoDecision root = new NodoDecision("¿Número > 0?");
        root.derecho = new NodoDecision("¿Par o Impar?");
        root.derecho.izquierdo = new NodoDecision("Par positivo");
        root.derecho.derecho = new NodoDecision("Impar positivo");
        root.izquierdo = new NodoDecision("¿Es cero?");
        root.izquierdo.derecho = new NodoDecision("Cero");
        root.izquierdo.izquierdo = new NodoDecision("Negativo");

        System.out.println("Ingrese un número entero:");
        int n = sc.nextInt();


        NodoDecision actual = root;
        while (actual != null) {
            if (actual.izquierdo == null && actual.derecho == null) {
                System.out.println("Clasificación: " + actual.descripcion);
                break;
            }
            if (actual.descripcion.equals("¿Número > 0?")) {
                actual = n > 0 ? actual.derecho : actual.izquierdo;
            } else if (actual.descripcion.equals("¿Par o Impar?")) {
                actual = (n % 2 == 0) ? actual.izquierdo : actual.derecho;
            } else if (actual.descripcion.equals("¿Es cero?")) {
                actual = (n == 0) ? actual.derecho : actual.izquierdo;
            }
        }

        sc.close();
    }
}

class NodoDecision {
    public String descripcion;
    public NodoDecision izquierdo;
    public NodoDecision derecho;

    public NodoDecision(String descripcion) {
        this.descripcion = descripcion;
        this.izquierdo = null;
        this.derecho = null;
    }
}


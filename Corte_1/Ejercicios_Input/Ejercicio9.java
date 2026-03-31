package Corte_1.Ejercicios_Input;
/*
 * Ejercicio 9 — String inmutable
 * Tema 2 — Variables por referencia
 *
 * Descripción:
 * 1. Pedir al usuario su nombre.
 * 2. Asignar el valor del nombre a una variable llamada alias (alias = nombre).
 * 3. Pedir al usuario un nuevo alias.
 * 4. Mostrar en consola que la variable original nombre no cambió.
 * 5. Explicar la inmutabilidad de la clase String con un mensaje en consola.
 */

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nombre:");
        String nombre = sc.nextLine();

        String alias = nombre;

        System.out.println("Ingrese un nuevo alias:");
        String nuevoAlias = sc.nextLine();
        alias = nuevoAlias;

        System.out.println("\nnombre = " + nombre + " <- no cambió");
        System.out.println("alias  = " + alias + " <- se actualizó con el nuevo valor");
        System.out.println("\nEn Java, String es inmutable: al asignar un nuevo valor a 'alias',");
        System.out.println("solo cambia la referencia; el objeto original 'nombre' sigue igual.");

        sc.close();
    }
}

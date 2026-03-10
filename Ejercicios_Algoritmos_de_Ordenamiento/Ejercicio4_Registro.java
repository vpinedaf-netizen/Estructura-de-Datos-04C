// 4. Registro Alfabético de Estudiantes
// Algoritmo obligatorio: Ordenamiento por Inserción (Insertion Sort)

// Contexto: El profesor necesita pasar asistencia y requiere que la lista de nombres ingresada en el sistema se ordene alfabéticamente de la A a la Z.
// Detalle del ejercicio: El programa debe preguntar cuántos alumnos hay en clase y solicitar sus nombres (cadenas de texto).
// Lógica de Texto: Se debe usar el método de Inserción adaptado para String.
// Requisito técnico: El estudiante debe investigar y aplicar el método nombre1.compareToIgnoreCase(nombre2). Es vital explicar que si el resultado es mayor a 0, el primer nombre es alfabéticamente "mayor" que el segundo.
// Resultado esperado: La lista de asistencia impresa en orden alfabético perfecto.


package Ejercicios_Algoritmos_de_Ordenamiento;

import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio4_Registro {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de estudiantes: ");
        int n = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        String[] nombres = new String[n];

        // Ingreso de nombres
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el nombre del estudiante " + (i + 1) + ": ");
            nombres[i] = sc.nextLine();
        }

        // Mostrar lista original
        System.out.println("\nLista original:");
        System.out.println(Arrays.toString(nombres));

        // Insertion Sort para Strings
        for (int i = 1; i < n; i++) {

            String clave = nombres[i];
            int j = i - 1;

            /*
            compareToIgnoreCase compara dos textos sin importar
            si están en mayúsculas o minúsculas.

            Si resultado > 0 → el primer nombre es mayor al segundo
            alfabéticamente y debe moverse a la derecha.
            Si resultado < 0 → ya está en la posición correcta.
            */

            while (j >= 0 && nombres[j].compareToIgnoreCase(clave) > 0) {
                nombres[j + 1] = nombres[j];
                j--;
            }

            nombres[j + 1] = clave;
        }

        // Mostrar lista ordenada
        System.out.println("\nLista de asistencia ordenada (A-Z):");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        sc.close();
    }
}
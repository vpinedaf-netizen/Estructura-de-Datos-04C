package Corte_1.Ejercicios_Algoritmos_de_Ordenamiento;
// 1. El Podio de la Competencia
// Algoritmo obligatorio: Ordenamiento por Selección (Selection Sort)

// Contexto: Se ha realizado una carrera de 100 metros planos y el comité olímpico 
// necesita determinar quiénes ganaron las medallas.
// Detalle del ejercicio: El programa debe solicitar primero cuántos corredores 
// participaron (ej. 5 a 10). Luego, debe pedir el tiempo en segundos (con decimales) 
// de cada corredor.
// Lógica de Selección: El algoritmo debe buscar el tiempo más bajo (el más rápido) 
// en cada iteración y colocarlo al inicio.
// Resultado esperado: El programa debe imprimir el arreglo totalmente ordenado y, 
// adicionalmente, mostrar un mensaje claro indicando quién obtuvo el Oro (1er lugar), 
// Plata (2do lugar) y Bronce (3er lugar).

import java.util.Scanner;

public class Ejercicio1_Podio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de corredores: ");
        int n = sc.nextInt();

        double[] tiempos = new double[n];

        // Pedir tiempos
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el tiempo del corredor " + (i + 1) + " en segundos: ");
            tiempos[i] = sc.nextDouble();
        }

        // Ordenamiento por selección
        for (int i = 0; i < n - 1; i++) {
            int min = i;

            for (int j = i + 1; j < n; j++) {
                if (tiempos[j] < tiempos[min]) {
                    min = j;
                }
            }

            // Intercambio
            double temp = tiempos[i];
            tiempos[i] = tiempos[min];
            tiempos[min] = temp;
        }

        // Mostrar arreglo ordenado
        System.out.println("\nTiempos ordenados (de menor a mayor):");
        for (int i = 0; i < n; i++) {
            System.out.println("Corredor " + (i + 1) + ": " + tiempos[i] + " segundos");
        }

        // Mostrar podio
        if (n >= 3) {
            System.out.println("\n--- PODIO ---");
            System.out.println("Oro: " + tiempos[0] + " segundos");
            System.out.println("Plata: " + tiempos[1] + " segundos");
            System.out.println("Bronce: " + tiempos[2] + " segundos");
        } else {
            System.out.println("No hay suficientes corredores para formar un podio.");
        }

        sc.close();
    }
}

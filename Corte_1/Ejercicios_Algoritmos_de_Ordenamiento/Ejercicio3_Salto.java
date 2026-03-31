package Corte_1.Ejercicios_Algoritmos_de_Ordenamiento;
// 3. El Salto de Shell (Optimización de Datos)
// Algoritmo obligatorio: Ordenamiento Shell (Shell Sort)

// Contexto: Una empresa de logística maneja paquetes con diferentes pesos y necesita ordenarlos de forma más eficiente que el método de burbuja o inserción simple.
// Detalle del ejercicio: Solicita al usuario el peso de N paquetes (se recomienda probar con al menos 10 para notar el efecto).
// Lógica de Shell: Implementa el algoritmo usando el salto (gap) inicial de 
// N
// /
// 2
// . El estudiante debe explicar en comentarios por qué este método es generalmente más rápido que la inserción simple al trabajar con elementos que están muy lejos de su posición final.
// Resultado esperado: Mostrar el arreglo original y el arreglo final ordenado después de aplicar todas las fases de reducción de saltos.

import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio3_Salto {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de paquetes: ");
        int n = sc.nextInt();

        double[] pesos = new double[n];

        // Ingreso de pesos
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el peso del paquete " + (i + 1) + ": ");
            pesos[i] = sc.nextDouble();
        }

        // Mostrar arreglo original
        System.out.println("\nPesos originales:");
        System.out.println(Arrays.toString(pesos));

        // Algoritmo Shell Sort
        // El salto inicial (gap) empieza en n/2
        for (int gap = n / 2; gap > 0; gap /= 2) {

            // Este ciclo recorre los elementos separados por el gap
            for (int i = gap; i < n; i++) {

                double temp = pesos[i];
                int j = i;

                /*
                Shell Sort es más rápido que Insertion Sort simple porque
                permite comparar elementos que están lejos entre sí.
                Esto ayuda a que muchos valores se acerquen a su posición
                correcta antes de que el gap llegue a 1.
                Cuando finalmente se hace una inserción normal,
                el arreglo ya está casi ordenado, por lo que el
                proceso termina mucho más rápido.
                */

                while (j >= gap && pesos[j - gap] > temp) {
                    pesos[j] = pesos[j - gap];
                    j -= gap;
                }

                pesos[j] = temp;
            }
        }

        // Mostrar arreglo ordenado
        System.out.println("\nPesos ordenados:");
        System.out.println(Arrays.toString(pesos));

        sc.close();
    }
}




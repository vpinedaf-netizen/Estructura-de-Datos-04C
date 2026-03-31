// 5. El Inspector de Eficiencia (Duelo de Métodos)
// Algoritmos obligatorios: Selección vs Inserción

// Contexto: Un analista de sistemas quiere saber cuál algoritmo es más "pesado" en términos de operaciones para un caso específico.
// Detalle del ejercicio: El usuario debe ingresar 6 números enteros desordenados. El programa aplicará AMBOS métodos al mismo conjunto de datos (puedes usar una copia del arreglo original).
// Lógica de Conteo:
// En Selección: Cuenta cada vez que ocurre un swap (intercambio físico de posiciones).
// En Inserción: Cuenta cada vez que un elemento se "mueve" hacia la izquierda dentro del bucle interno.
// Resultado esperado: El programa debe imprimir cuántos intercambios hizo Selección y cuántos movimientos hizo Inserción. El estudiante debe concluir cuál fue más eficiente para esos datos ingresados por el teclado.

package Corte_1.Ejercicios_Algoritmos_de_Ordenamiento;
import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio5_Inspector {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[6];

        // Ingreso de números
        System.out.println("Ingrese 6 números enteros:");
        for (int i = 0; i < 6; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        // Copias del arreglo original
        int[] seleccion = numeros.clone();
        int[] insercion = numeros.clone();

        int swapsSeleccion = 0;
        int movimientosInsercion = 0;

        // -------- Selection Sort --------
        for (int i = 0; i < seleccion.length - 1; i++) {

            int min = i;

            for (int j = i + 1; j < seleccion.length; j++) {
                if (seleccion[j] < seleccion[min]) {
                    min = j;
                }
            }

            // Intercambio
            int temp = seleccion[i];
            seleccion[i] = seleccion[min];
            seleccion[min] = temp;

            swapsSeleccion++; // contar intercambio
        }

        // -------- Insertion Sort --------
        for (int i = 1; i < insercion.length; i++) {

            int clave = insercion[i];
            int j = i - 1;

            while (j >= 0 && insercion[j] > clave) {
                insercion[j + 1] = insercion[j];
                j--;
                movimientosInsercion++; // contar movimiento hacia la izquierda
            }

            insercion[j + 1] = clave;
        }

        // Mostrar resultados
        System.out.println("\nArreglo original: " + Arrays.toString(numeros));
        System.out.println("Ordenado con Selección: " + Arrays.toString(seleccion));
        System.out.println("Ordenado con Inserción: " + Arrays.toString(insercion));

        System.out.println("\nOperaciones realizadas:");
        System.out.println("Intercambios en Selección: " + swapsSeleccion);
        System.out.println("Movimientos en Inserción: " + movimientosInsercion);

        // Conclusión simple
        if (swapsSeleccion < movimientosInsercion) {
            System.out.println("Para estos datos, el método de Selección fue más eficiente.");
        } else if (movimientosInsercion < swapsSeleccion) {
            System.out.println("Para estos datos, el método de Inserción fue más eficiente.");
        } else {
            System.out.println("Ambos métodos tuvieron la misma cantidad de operaciones.");
        }

        sc.close();
    }
}
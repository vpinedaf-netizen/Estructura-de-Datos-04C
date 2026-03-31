package Corte_1.Ejercicios_Algoritmos_de_Ordenamiento; 
// 2. Organización de Biblioteca Dinámica
// Algoritmo obligatorio: Ordenamiento por Inserción (Insertion Sort)

// Contexto: Un bibliotecario recibe una caja de libros y los va colocando 
// uno a uno en el estante en su posición correcta.
// Detalle del ejercicio: El usuario debe ingresar la cantidad de libros y 
// luego el código ISBN (número entero) de cada uno.
// Lógica de Inserción: A medida que el usuario ingresa un número, o una vez 
// llenado el arreglo, el algoritmo debe simular el proceso de "insertar" el 
// elemento comparándolo con los que ya están a su izquierda.
// Visualización Paso a Paso: En cada ciclo del ordenamiento, el programa debe 
// imprimir cómo va quedando el arreglo (ej: [10, 25, 5, 30] -> [5, 10, 25, 30]). 
// Esto permite al estudiante ver cómo los elementos se desplazan para abrir espacio 
// al nuevo valor.

import java.util.Scanner;

public class Ejercicio2_Biblioteca{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Cantidad de libros: ");
        int n = sc.nextInt();

        int[] libros = new int[n];

        for (int i = 0; i < n; i++) {

            System.out.print("\nIngrese ISBN del libro " + (i + 1) + ": ");
            int nuevo = sc.nextInt();

            int j = i - 1;

            // mover elementos hacia la derecha
            while (j >= 0 && libros[j] > nuevo) {
                libros[j + 1] = libros[j];
                j--;

                
            }

            libros[j + 1] = nuevo;

            System.out.println("Insertado:");
            mostrar(libros, i + 1);
        }
        sc.close();
        
    }

    public static void mostrar(int[] arreglo, int limite) {
        System.out.print("[ ");
        for (int i = 0; i < limite; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println("]");
    }
}
    


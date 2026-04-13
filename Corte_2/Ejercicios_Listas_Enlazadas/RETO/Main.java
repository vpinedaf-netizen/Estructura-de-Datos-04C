package Corte_2.Ejercicios_Listas_Enlazadas.RETO;

//Reto 2: Contar los Nodos
//A diferencia de los arreglos, que tienen la propiedad .length, en las listas enlazadas simples por lo
//  general no sabemos la cantidad de elementos a menos que la contemos, o que llevemos una variable contadora.

//Tu misión: Implementa el método public int contarNodos() en tu clase ListaEnlazada. Este método debe 
// recorrer toda la lista, sumando 1 por cada nodo que visite, y retornar el total de elementos. Pruébalo en 
// tu método main insertando diferentes cantidades de elementos y mostrando el resultado por consola.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== MENÚ: Contar Nodos ===");
            System.out.println("1) Probar con 0 elementos");
            System.out.println("2) Probar con 3 elementos");
            System.out.println("3) Probar con 7 elementos");
            System.out.println("4) Probar con 12 elementos");
            System.out.println("5) Probar con N elementos (ingresar N)");
            System.out.println("0) Salir");
            System.out.print("Elige una opción: ");

            int opcion;
            try {
                opcion = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Entrada inválida. Intenta de nuevo.");
                continue;
            }

            if (opcion == 0) {
                System.out.println("Saliendo...");
                break;
            }

            int n;
            switch (opcion) {
                case 1 -> n = 0;
                case 2 -> n = 3;
                case 3 -> n = 7;
                case 4 -> n = 12;
                case 5 -> {
                    System.out.print("Ingresa N: ");
                    n = Integer.parseInt(sc.nextLine());
                }
                default -> {
                    System.out.println("Opción inválida. Intenta de nuevo.");
                    continue;
                }
            }

            ListaEnlazada lista = new ListaEnlazada();

            // Se inserta n nodos 
            for (int i = 1; i <= n; i++) {
                lista.agregar(i);
            }

            System.out.println("Cantidad de nodos en la lista: " + lista.contarNodos());
        }

        sc.close();
    }
}

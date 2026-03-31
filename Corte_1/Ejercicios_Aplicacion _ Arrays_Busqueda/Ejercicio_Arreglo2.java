//Buscador de Cédulas (Base de Datos Bancaria)
//Un banco tiene una lista de 1.000 clientes organizados de forma estricta y 
// ascendente por su número de cédula o ID.

//El Problema: Un cliente llega a la ventanilla y da su número. 
// El sistema debe encontrar sus datos de la manera más rápida posible (en pocos pasos).
//Algoritmo a usar: Búsqueda Binaria . Como los datos ya están ordenados, 
// este algoritmo permitirá encontrar al cliente dividiendo la lista a la mitad en cada paso.

import java.util.Scanner;

public class Ejercicio_Arreglo2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Arreglo ORDENADO de números de cédula 
        int[] cedulas = {10012345, 10023456, 10034567, 10045678, 10056789, 10067890, 10078901, 10089012};

        // Solicitar la cédula a buscar
        System.out.print("Ingrese el número de cédula del cliente: ");
        int cedulaBuscada = entrada.nextInt();

        // Variables para búsqueda binaria
        int inicio = 0;
        int fin = cedulas.length - 1;
        int posicion = -1;

        // Búsqueda binaria
        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;

            if (cedulas[medio] == cedulaBuscada) {
                posicion = medio;
                break;
            } else if (cedulaBuscada < cedulas[medio]) {
                fin = medio - 1; // Buscar en la mitad izquierda
            } else {
                inicio = medio + 1; // Buscar en la mitad derecha
            }
        }

        // Resultado
        if (posicion != -1) {
            System.out.println("Cliente encontrado en la posición: " + posicion);
        } else {
            System.out.println("Cédula no encontrada en la base de datos.");
        }

        // Explicación del algoritmo
        System.out.println("\nExplicación: Se usó búsqueda binaria porque los datos están ordenados. "
                + "Este algoritmo divide la lista a la mitad en cada paso, "
                + "reduciendo el número de comparaciones necesarias para encontrar el elemento.");

                   entrada.close();
    }
}
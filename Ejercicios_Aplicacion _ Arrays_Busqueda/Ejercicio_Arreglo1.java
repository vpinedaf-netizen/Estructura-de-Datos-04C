//El Cajero del Supermercado (Inventario)
//Un cajero escanea un producto con el código de barras 770123.
//  El sistema tiene un arreglo desordenado con los códigos de los productos 
// disponibles en el estante actual.

//El Problema: Debes recorrer la lista para verificar si el producto existe y
//  en qué posición de la estantería se encuentra.
//Algoritmo a usar: Búsqueda Lineal . Es el ideal porque los productos en el estante no 
// tienen un orden numérico específico.


import java.util.Scanner;

public class Ejercicio_Arreglo1 { 
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] codigos = {770555, 770888, 770123, 770999, 770321, 770777};

         // Código escaneado por el cajero
        System.out.print("Ingrese el código escaneado del producto: ");
        int codigoBuscado = entrada.nextInt();

        // Variable para almacenar la posición si se encuentra el producto
        int posicion = -1;

         // Búsqueda lineal
        for (int i = 0; i < codigos.length; i++) {
            if (codigos[i] == codigoBuscado) {
                posicion = i;
                break; 
            }
        }

        if (posicion != -1) {
            System.out.println("Producto encontrado en la posición: " + posicion);
        } else {
            System.out.println(" Producto no encontrado en la estantería.");
        }
        // Explicación del algoritmo
        System.out.println("\nExplicación: Se usó búsqueda lineal porque el arreglo no está ordenado. "
                + "El algoritmo recorre cada posición una por una hasta encontrar el código buscado.");

                entrada.close();
    }
    

}

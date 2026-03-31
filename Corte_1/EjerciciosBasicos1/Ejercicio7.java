package Corte_1.EjerciciosBasicos1;
//Ejercicio 7 — Inventario compartido
//Un almacén tiene un arreglo con el stock de 5 productos. El sistema de ventas y el sistema de informes apuntan al mismo arreglo .

//Crea el arreglo stockAlmacencon valores iniciales.
//Asigna stockReportes = stockAlmacen.
//Simule una venta reduciendo el stock de un producto desde stockReportes.
//Muestra que stockAlmacen también cambió y explica en comentarios por qué.

public class Ejercicio7 {
    public static void main(String[] args) {
        int[] stockAlmacen = {1,18,0,6,2};
        int[] stockReportes = stockAlmacen;

        stockReportes[4] -= 5;
        System.out.println("Stock desde almacen:");
        for (int stock : stockAlmacen) {
            System.out.print(stock + " ");
        }

        System.out.println("\nStock desde reportes:");
        for (int stock : stockReportes) {
            System.out.print(stock + " ");
            
        }
    }
//*Ambas variables apuntan al mismo espacio en memoria. Por eso, al modificar 
// stockReportes, también cambia stockAlmacen. */
    
}

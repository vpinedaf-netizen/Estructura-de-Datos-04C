package Corte_1.EjerciciosBasicos1;
//Ejercicio 10 — Copiando configuración
//Una aplicación tiene un objeto int[] configuracion = {1920, 1080, 60}(resolución y FPS).

//Crea una copia real del arreglo (no una referencia) usando un nuevo arreglo y 
// copiando elemento por elemento.
//Modifica la copia y demuestra que el original no cambia .
//Comenta la diferencia con la asignación directa.

public class Ejercicio10 {
    public static void main(String[] args) {
        int[] Configuracion = {1920, 1080, 60};
        int[] copiaConfiguracion = new int[Configuracion.length];

        for(int i = 0; i < Configuracion.length; i++){
            copiaConfiguracion[i] = Configuracion[i];

        }

        copiaConfiguracion[2] = 144;
        System.out.println("configuracion:");
        for (int ajustes : Configuracion) {
            System.out.print(ajustes + " ");
        }

        System.out.println("\ncopiaConfiguracion:");
        for (int copia : copiaConfiguracion) {
            System.out.print(copia + " ");
            
        }
    }

    
}
//Aquí sí hicimos una copia real. Creamos un nuevo arreglo con "new" y copiamos cada elemento. Por eso, 
// al modificar copiaConfiguracion, el arreglo original configuracion NO cambia.


package Corte_1.EjerciciosBasicos1;
//**Ejercicio 6 — Turno en un banco */
//Un cajero de banco trabaja con el número del turno actual. Se crea una variable turnoActualy se asigna a turnoEnPantalla.

//Demuestra con código que cambiar turnoEnPantalla no afecta a turnoActual(comportamiento por valor).
//Explique en un comentario por qué ocurre esto.

public class Ejercicio6{
    public static void main(String[] args) {
        int turnoActual = 18;
        int turnoEnPantalla =  turnoActual;

        turnoEnPantalla = 45;

        System.out.println("=== Turno en un banco ===");
        System.out.println("Turno Actual: " + turnoActual);
        System.out.println("Turno en pantalla: " + turnoEnPantalla);
        
        //**Porque int es un tipo primitivo y en Java los tipos primitivos se copian por valor.
        //Java crea una copia independiente del valor (15) */

    }    
} 
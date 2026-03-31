package Corte_1.EjerciciosBasicos1;
//*Ejercicio 8 — Historial de mensajes
//Un chat guarda el último mensaje enviado. Se usan dos variables String:

//ultimoMensaje = "Hola"
//copiaTexto = ultimoMensaje
//Luego copiaTextose cambia a"¿Cómo estás?"
//Muestra ambas variables y explica en un comentario por qué ultimoMensaje no cambió 
// (inmutabilidad de String).

public class Ejercicio8 {
    public static void main(String[] args) {
        String ultimoMensaje = "Hola";
        String copiaTexto = ultimoMensaje;

       copiaTexto = "¿Cómo estás?";

        System.out.println("=== Historial de mensajes ===");
        System.out.println("ultimoMensaje: " + ultimoMensaje);
        System.out.println("copiaTexto: " + copiaTexto);
    }
}
//*Los String son inmutables en Java.
//Al cambiar copiaTexto, se 
//crea un nuevo objeto en memoria, y el original (ultimoMensaje) no se modifica. */
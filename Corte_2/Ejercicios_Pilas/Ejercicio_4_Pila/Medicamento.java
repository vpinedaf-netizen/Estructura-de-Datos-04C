package Corte_2.Ejercicios_Pilas.Ejercicio_4_Pila;

public class Medicamento 
{
    String nombre;
    String lote;
    int diasParaVencer;
    Medicamento siguiente;

    public Medicamento(String nombre, String lote, int diasParaVencer) 
    {
        this.nombre = nombre;
        this.lote = lote;
        this.diasParaVencer = diasParaVencer;
        this.siguiente = null;
    }
}

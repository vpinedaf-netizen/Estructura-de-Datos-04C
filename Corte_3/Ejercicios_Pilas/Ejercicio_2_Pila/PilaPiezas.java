package Corte_3.Ejercicios_Pilas.Ejercicio_2_Pila;

public class PilaPiezas 
{
    private Pieza cima;

    // Push
    public void apilar(Pieza pieza) 
    {
        pieza.siguiente = cima;
        cima = pieza;
    }

    // Pop
    public Pieza desapilar() 
    {
        if (cima == null) 
        {
            return null;
        }

        Pieza aux = cima;
        cima = cima.siguiente;

        return aux;
    }

    // Mostrar pila
    public void mostrar() 
    {
        if (cima == null) 
        {
            System.out.println("La pila está vacía");
            return;
        }

        Pieza aux = cima;

        while (aux != null) 
        {
            System.out.println("----------------------");
            System.out.println("Nombre: " + aux.nombrePieza);
            System.out.println("Serie: " + aux.numeroSerie);
            System.out.println("Defectuosa: " + aux.esDefectuosa);

            aux = aux.siguiente;
        }
    }

    // Limpiar hasta encontrar defecto
    public void limpiarHastaDefecto() 
    {
        if (cima == null) 
        {
            System.out.println("La pila está vacía");
            return;
        }

        while (cima != null) 
        {
            if (cima.esDefectuosa) 
            {
                System.out.println("\nSe encontró la pieza defectuosa:");
                System.out.println(cima.nombrePieza);
                break;
            }

            Pieza eliminada = desapilar();

            System.out.println("Pieza buena descartada: "
                    + eliminada.nombrePieza);
        }

        if (cima == null) 
        {
            System.out.println("No se encontró ninguna pieza defectuosa");
        }
    }
}
package Corte_2.Ejercicios_Pilas.Ejercicio_3_Pila;

public class PilaCamiones 
{
    private Camion cima;

    // Push
    public void apilar(Camion camion) 
    {
        camion.siguiente = cima;
        cima = camion;
    }

    // Pop
    public Camion desapilar() 
    {
        if (cima == null) 
        {
            return null;
        }

        Camion aux = cima;
        cima = cima.siguiente;

        return aux;
    }

    // Mostrar pila
    public void mostrar() 
    {
        if (cima == null) 
        {
            System.out.println("No hay camiones en el callejón");
            return;
        }

        Camion aux = cima;

        while (aux != null) 
        {
            System.out.println("----------------------");
            System.out.println("Placa: " + aux.placa);
            System.out.println("Conductor: " + aux.conductor);
            System.out.println("Carga: " + aux.cargaToneladas + " toneladas");

            aux = aux.siguiente;
        }
    }

    // Calcular carga total
    public double calcularCargaTotal() 
    {
        double total = 0;

        Camion aux = cima;

        while (aux != null) 
        {
            total += aux.cargaToneladas;

            aux = aux.siguiente;
        }

        return total;
    }
}

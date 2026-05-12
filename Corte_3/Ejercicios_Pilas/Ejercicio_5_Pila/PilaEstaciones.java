package Corte_3.Ejercicios_Pilas.Ejercicio_5_Pila;

public class PilaEstaciones 
{
    private Estacion cima;

    // Push
    public void apilar(Estacion estacion) 
    {
        estacion.siguiente = cima;
        cima = estacion;
    }

    // Pop
    public Estacion desapilar() 
    {
        if (cima == null) 
        {
            return null;
        }

        Estacion aux = cima;
        cima = cima.siguiente;

        return aux;
    }

    // Mostrar estaciones
    public void mostrar() 
    {
        if (cima == null) 
        {
            System.out.println("No hay estaciones registradas");
            return;
        }

        Estacion aux = cima;

        while (aux != null) 
        {
            System.out.println("----------------------");
            System.out.println("Punto: " + aux.nombrePunto);
            System.out.println("Profundidad: " + aux.profundidad + " m");
            System.out.println("Oxígeno: " + aux.nivelOxigeno + "%");

            aux = aux.siguiente;
        }
    }

    // Retroceder a la superficie
    public void retrocederASuperficie() 
    {
        if (cima == null) 
        {
            System.out.println("No hay estaciones en la ruta");
            return;
        }

        System.out.println("\nINICIANDO RETORNO A LA SUPERFICIE");

        while (cima != null) 
        {
            Estacion actual = desapilar();

            System.out.println("\nPasando por estación: "
                    + actual.nombrePunto);

            System.out.println("Profundidad: "
                    + actual.profundidad + " m");

            System.out.println("Nivel de oxígeno: "
                    + actual.nivelOxigeno + "%");

            if (actual.nivelOxigeno < 18) 
            {
                System.out.println("ALERTA: Uso de Tanque de Emergencia Requerido");
            }
        }

        System.out.println("\nEl equipo ha salido de la cueva");
    }
}

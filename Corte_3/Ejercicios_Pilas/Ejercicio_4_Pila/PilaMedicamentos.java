package Corte_3.Ejercicios_Pilas.Ejercicio_4_Pila;

public class PilaMedicamentos 
{
    private Medicamento cima;

    // Push
    public void apilar(Medicamento medicamento) 
    {
        medicamento.siguiente = cima;
        cima = medicamento;
    }

    // Pop
    public Medicamento desapilar() 
    {
        if (cima == null) 
        {
            return null;
        }

        Medicamento aux = cima;
        cima = cima.siguiente;

        return aux;
    }

    // Mostrar medicamentos
    public void mostrar() 
    {
        if (cima == null) 
        {
            System.out.println("No hay medicamentos");
            return;
        }

        Medicamento aux = cima;

        while (aux != null) 
        {
            System.out.println("----------------------");
            System.out.println("Nombre: " + aux.nombre);
            System.out.println("Lote: " + aux.lote);
            System.out.println("Días para vencer: " + aux.diasParaVencer);

            aux = aux.siguiente;
        }
    }

    // Validar despacho
    public void validarDespacho() 
    {
        if (cima == null) 
        {
            System.out.println("La pila está vacía");
            return;
        }

        while (cima != null && cima.diasParaVencer < 10) 
        {
            System.out.println("Medicamento retirado por vencimiento próximo:");
            System.out.println(cima.nombre + " - Lote: " + cima.lote);

            desapilar();
        }

        if (cima == null) 
        {
            System.out.println("No quedan medicamentos seguros");
        } 
        else 
        {
            System.out.println("\nMedicamento seguro para despacho:");
            System.out.println("Nombre: " + cima.nombre);
            System.out.println("Lote: " + cima.lote);
            System.out.println("Días para vencer: " + cima.diasParaVencer);
        }
    }
}

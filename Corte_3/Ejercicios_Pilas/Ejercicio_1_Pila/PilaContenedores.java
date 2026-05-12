package Corte_3.Ejercicios_Pilas.Ejercicio_1_Pila;

public class PilaContenedores 
{
    private Contenedor cima;

    public PilaContenedores() 
    {
        cima = null;
    }

    // Apilar
    public void apilar(Contenedor contenedor) 
    {
        contenedor.siguiente = cima;
        cima = contenedor;
    }

    // Mostrar pila
    public void mostrar() 
    {
        if (cima == null) 
        {
            System.out.println("La pila está vacía");
            return;
        }

        Contenedor aux = cima;

        while (aux != null) 
        {
            System.out.println("-------------------------");
            System.out.println("Código: " + aux.idCodigo);
            System.out.println("Empresa: " + aux.empresa);
            System.out.println("Peso: " + aux.peso);
            System.out.println("Tipo de carga: " + aux.tipoCarga);

            aux = aux.siguiente;
        }
    }

    // Contar por empresa
    public int contarPorEmpresa(String nombreEmpresa) 
    {
        int contador = 0;

        Contenedor aux = cima;

        while (aux != null) 
        {
            if (aux.empresa.equalsIgnoreCase(nombreEmpresa)) 
            {
                contador++;
            }

            aux = aux.siguiente;
        }

        return contador;
    }
}
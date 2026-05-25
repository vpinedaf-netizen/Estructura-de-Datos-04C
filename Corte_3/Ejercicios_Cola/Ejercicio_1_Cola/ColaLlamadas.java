package Corte_3.Ejercicios_Cola.Ejercicio_1_Cola;

public class ColaLlamadas {

    private Nodo frente;
    private Nodo fin;

    public ColaLlamadas() {
        frente = null;
        fin = null;
    }

    // Agregar llamada
    public void agregarLlamada(Llamada llamada) {

        Nodo nuevo = new Nodo(llamada);

        if (fin == null) {
            frente = nuevo;
            fin = nuevo;
        } else {
            fin.siguiente = nuevo;
            fin = nuevo;
        }

        System.out.println("\nLlamada agregada correctamente.");
    }

    // Atender llamada
    public Llamada atenderLlamada() {

        if (frente == null) {
            return null;
        }

        Llamada llamadaAtendida = frente.llamada;

        frente = frente.siguiente;

        if (frente == null) {
            fin = null;
        }

        return llamadaAtendida;
    }

    // Mostrar llamadas
    public void mostrarLlamadas() {

        if (frente == null) {
            System.out.println("\nNo hay llamadas en espera.");
            return;
        }

        Nodo actual = frente;

        System.out.println("\n===== LLAMADAS EN ESPERA =====");

        while (actual != null) {

            System.out.println(actual.llamada);
            System.out.println("---------------------------");

            actual = actual.siguiente;
        }
    }

    // Contar llamadas por motivo
    public int contarPorMotivo(String motivo) {

        int contador = 0;

        Nodo actual = frente;

        while (actual != null) {

            if (actual.llamada.getMotivoConsulta()
                    .equalsIgnoreCase(motivo)) {

                contador++;
            }

            actual = actual.siguiente;
        }

        return contador;
    }
}

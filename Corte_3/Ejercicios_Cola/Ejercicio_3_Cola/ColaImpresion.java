package Corte_3.Ejercicios_Cola.Ejercicio_3_Cola;

public class ColaImpresion {

    private Nodo frente;
    private Nodo fin;

    public ColaImpresion() {
        frente = null;
        fin = null;
    }

    // Agregar documento a la cola
    public void agregarDocumento(Documento documento) {

        Nodo nuevo = new Nodo(documento);

        if (fin == null) {
            frente = nuevo;
            fin = nuevo;
        } else {
            fin.siguiente = nuevo;
            fin = nuevo;
        }

        System.out.println("\nDocumento agregado a la cola.");
    }

    // Imprimir documento
    public Documento imprimirDocumento() {

        if (frente == null) {
            return null;
        }

        Documento documentoImpreso = frente.documento;
        frente = frente.siguiente;

        if (frente == null) {
            fin = null;
        }

        return documentoImpreso;
    }

    // Mostrar documentos
    public void mostrarCola() {

        if (frente == null) {
            System.out.println("\nLa cola de impresión está vacía.");
            return;
        }

        Nodo actual = frente;

        System.out.println("\n===== COLA DE IMPRESIÓN =====");

        while (actual != null) {

            System.out.println(actual.documento);
            System.out.println("---------------------------");

            actual = actual.siguiente;
        }
    }

    // Calcular páginas totales sin alterar la cola
    public int calcularPaginasTotales() {

        int totalPaginas = 0;

        Nodo actual = frente;

        while (actual != null) {

            totalPaginas += actual.documento.getNumeroPaginas();

            actual = actual.siguiente;
        }

        return totalPaginas;
    }
}
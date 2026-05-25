package Corte_3.Ejercicios_Cola.Ejercicio_5_Cola;

public class ColaPedidos {

    private Nodo frente;
    private Nodo fin;

    public ColaPedidos() {
        frente = null;
        fin = null;
    }

    // Agregar pedido
    public void agregarPedido(Pedido pedido) {

        Nodo nuevo = new Nodo(pedido);

        if (fin == null) {
            frente = nuevo;
            fin = nuevo;
        } else {
            fin.siguiente = nuevo;
            fin = nuevo;
        }

        System.out.println("\nPedido agregado correctamente.");
    }

    // Extraer pedido
    public Pedido atenderPedido() {

        if (frente == null) {
            return null;
        }

        Pedido pedidoAtendido = frente.pedido;

        frente = frente.siguiente;

        if (frente == null) {
            fin = null;
        }

        return pedidoAtendido;
    }

    // Mostrar pedidos
    public void mostrarPedidos() {

        if (frente == null) {
            System.out.println("\nNo hay pedidos en la cola.");
            return;
        }

        Nodo actual = frente;

        System.out.println("\n===== LISTA DE PEDIDOS =====");

        while (actual != null) {

            System.out.println(actual.pedido);
            System.out.println("---------------------------");

            actual = actual.siguiente;
        }
    }

    // Procesar pedidos
    public void procesarPedidos() {

        int totalDespachados = 0;
        int totalCancelados = 0;

        if (frente == null) {
            System.out.println("\nNo hay pedidos para procesar.");
            return;
        }

        System.out.println("\n===== PROCESAMIENTO DE PEDIDOS =====");

        while (frente != null) {

            Pedido pedido = atenderPedido();

            if (pedido.isCancelado()) {

                System.out.println("\nPedido cancelado descartado:");
                System.out.println(pedido);

                totalCancelados++;

            } else {

                System.out.println("\nPedido despachado:");
                System.out.println(pedido);

                totalDespachados++;
            }

            System.out.println("---------------------------");
        }

        System.out.println("\nTotal despachados: " + totalDespachados);
        System.out.println("Total cancelados: " + totalCancelados);
    }
}
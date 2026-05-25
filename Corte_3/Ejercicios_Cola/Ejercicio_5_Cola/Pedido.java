package Corte_3.Ejercicios_Cola.Ejercicio_5_Cola;

public class Pedido {

    private String numeroPedido;
    private String cliente;
    private double totalPagar;
    private boolean cancelado;

    public Pedido(String numeroPedido, String cliente, double totalPagar, boolean cancelado) {
        this.numeroPedido = numeroPedido;
        this.cliente = cliente;
        this.totalPagar = totalPagar;
        this.cancelado = cancelado;
    }

    public String getNumeroPedido() {
        return numeroPedido;
    }

    public String getCliente() {
        return cliente;
    }

    public double getTotalPagar() {
        return totalPagar;
    }

    public boolean isCancelado() {
        return cancelado;
    }

    @Override
    public String toString() {

        String estado;

        if (cancelado) {
            estado = "Cancelado";
        } else {
            estado = "Vigente";
        }

        return "\nNúmero de pedido: " + numeroPedido +
               "\nCliente: " + cliente +
               "\nTotal a pagar: $" + totalPagar +
               "\nEstado: " + estado;
    }
}

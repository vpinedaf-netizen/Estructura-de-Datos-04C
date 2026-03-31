package Corte_2.Ejercicios_Listas_Enlazadas.Ejercicio_2;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        inventario.agregarProducto("Leche", 10, 2);
        inventario.agregarProducto("Yogurt", 5, 6);
        inventario.agregarProducto("Queso", 8, 1);
        inventario.agregarProducto("Mantequilla", 4, 4);

        System.out.println("Inventario completo:");
        inventario.mostrarInventario();

        inventario.productosProximosAVencer();
    }
}
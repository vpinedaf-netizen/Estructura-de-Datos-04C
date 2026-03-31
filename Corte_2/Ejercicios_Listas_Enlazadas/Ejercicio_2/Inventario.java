package Corte_2.Ejercicios_Listas_Enlazadas.Ejercicio_2;

class Inventario {
    Producto cabeza;

    // Insertar producto según prioridad
    public void agregarProducto(String nombre, int cantidad, int diasParaVencer) {
        Producto nuevo = new Producto(nombre, cantidad, diasParaVencer);

        if (cabeza == null) {
            cabeza = nuevo;
        } else if (diasParaVencer < 3) {
            // Insertar al inicio
            nuevo.siguiente = cabeza;
            cabeza = nuevo;
        } else {
            // Insertar al final
            Producto actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    // Mostrar todos los productos
    public void mostrarInventario() {
        Producto actual = cabeza;
        while (actual != null) {
            System.out.println("Nombre: " + actual.nombre +
                               ", Cantidad: " + actual.cantidad +
                               ", Días para vencer: " + actual.diasParaVencer);
            actual = actual.siguiente;
        }
    }

    // Reto: Mostrar productos con menos de 5 días
    public void productosProximosAVencer() {
        Producto actual = cabeza;
        System.out.println("\nProductos con menos de 5 días para vencer:");

        while (actual != null) {
            if (actual.diasParaVencer < 5) {
                System.out.println("Nombre: " + actual.nombre +
                                   ", Cantidad: " + actual.cantidad +
                                   ", Días: " + actual.diasParaVencer);
            }
            actual = actual.siguiente;
        }
    }
}

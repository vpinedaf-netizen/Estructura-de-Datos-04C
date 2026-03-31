package Corte_2.Ejercicios_Listas_Enlazadas.Ejercicio_2;

class Inventario {
    Producto cabeza;
    Producto cola;

    // Agregar producto según prioridad
    public void agregarProducto(String nombre, int cantidad, int diasParaVencer) {
        Producto nuevo = new Producto(nombre, cantidad, diasParaVencer);

        // Si la lista está vacía
        if (cabeza == null) {
            cabeza = cola = nuevo;
            return;
        }

        // PRIORIDAD: menos de 3 días → al inicio
        if (diasParaVencer < 3) {
            nuevo.siguiente = cabeza;
            cabeza = nuevo;
        } else {
            // Normal → al final
            cola.siguiente = nuevo;
            cola = nuevo;
        }
    }

    // Mostrar todos los productos
    public void mostrarProductos() {
        if (cabeza == null) {
            System.out.println("No hay productos.");
            return;
        }

        Producto actual = cabeza;
        while (actual != null) {
            System.out.println("Nombre: " + actual.nombre +
                    " | Cantidad: " + actual.cantidad +
                    " | Días para vencer: " + actual.diasParaVencer);
            actual = actual.siguiente;
        }
    }

    // Mostrar productos con menos de 5 días para vencer
    public void productosPorVencer() {
        if (cabeza == null) {
            System.out.println("No hay productos.");
            return;
        }

        Producto actual = cabeza;
        boolean hay = false;

        while (actual != null) {
            if (actual.diasParaVencer < 5) {
                System.out.println("⚠️ Nombre: " + actual.nombre +
                        " | Cantidad: " + actual.cantidad +
                        " | Días: " + actual.diasParaVencer);
                hay = true;
            }
            actual = actual.siguiente;
        }

        if (!hay) {
            System.out.println("No hay productos próximos a vencer.");
        }
    }
}
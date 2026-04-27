package Corte_2.Ejercicios_Listas_Circulares_Dobles.Ejercicio_3_Listas_Circulares_Dobles;

class EditorCapas {
    Capa cabeza;
    Capa capaActiva;

    // Agregar capa
    public void agregarCapa(String nombre, boolean visible, String tipo) {
        Capa nueva = new Capa(nombre, visible, tipo);

        if (cabeza == null) {
            cabeza = nueva;
            cabeza.siguiente = cabeza;
            cabeza.anterior = cabeza;
            capaActiva = cabeza;
        } else {
            Capa ultima = cabeza.anterior;

            ultima.siguiente = nueva;
            nueva.anterior = ultima;

            nueva.siguiente = cabeza;
            cabeza.anterior = nueva;
        }
    }

    // Subir capa (siguiente)
    public void subirCapa() {
        if (capaActiva != null) {
            capaActiva = capaActiva.siguiente;
        }
    }

    // Bajar capa (anterior)
    public void bajarCapa() {
        if (capaActiva != null) {
            capaActiva = capaActiva.anterior;
        }
    }

    // Cambiar visibilidad
    public void toggleVisibilidad() {
        if (capaActiva != null) {
            capaActiva.visible = !capaActiva.visible;
        }
    }

    // Eliminar capa activa
    public void eliminarActiva() {
        if (capaActiva == null) return;

        // Solo una capa
        if (capaActiva.siguiente == capaActiva) {
            cabeza = null;
            capaActiva = null;
            return;
        }

        Capa ant = capaActiva.anterior;
        Capa sig = capaActiva.siguiente;

        ant.siguiente = sig;
        sig.anterior = ant;

        if (capaActiva == cabeza) {
            cabeza = sig;
        }

        capaActiva = sig; // foco pasa a la siguiente
    }

    // Mostrar capas
    public void mostrarCapas() {
        if (cabeza == null) {
            System.out.println("No hay capas.");
            return;
        }

        Capa actual = cabeza;

        do {
            String activa = (actual == capaActiva) ? "[ACTIVA]" : "[     ]";
            String vis = actual.visible ? "Visible" : "Oculta";

            System.out.println(activa + " " + actual.nombre +
                    " | Tipo: " + actual.tipo +
                    " | " + vis);

            actual = actual.siguiente;
        } while (actual != cabeza);
    }
}
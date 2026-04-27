package Corte_2.Ejercicios_Listas_Circulares_Dobles.Ejercicio_2_Listas_Circulares_Dobles;

class Historial {
    Comando cabeza;
    Comando cursor;

    // Agregar comando (al final)
    public void agregar(String texto, boolean exitoso, String dir) {
        Comando nuevo = new Comando(texto, exitoso, dir);

        if (cabeza == null) {
            cabeza = nuevo;
            cabeza.siguiente = cabeza;
            cabeza.anterior = cabeza;
            cursor = cabeza;
        } else {
            Comando ultimo = cabeza.anterior;

            ultimo.siguiente = nuevo;
            nuevo.anterior = ultimo;

            nuevo.siguiente = cabeza;
            cabeza.anterior = nuevo;
        }
    }

    // Flecha arriba
    public void arriba() {
        if (cursor != null) {
            cursor = cursor.anterior;
        }
    }

    // Flecha abajo
    public void abajo() {
        if (cursor != null) {
            cursor = cursor.siguiente;
        }
    }

    // Mostrar comando actual
    public void mostrarCursor() {
        if (cursor == null) {
            System.out.println("Historial vacío");
            return;
        }

        System.out.println(">> " + cursor.texto +
                " | Dir: " + cursor.directorio +
                " | Estado: " + (cursor.exitoso ? "OK" : "ERROR"));
    }

    // Eliminar comando actual
    public void eliminarActual() {
        if (cursor == null) return;

        // Si solo hay uno
        if (cursor.siguiente == cursor) {
            cabeza = null;
            cursor = null;
            return;
        }

        Comando anterior = cursor.anterior;
        Comando siguiente = cursor.siguiente;

        anterior.siguiente = siguiente;
        siguiente.anterior = anterior;

        // Si era la cabeza
        if (cursor == cabeza) {
            cabeza = siguiente;
        }

        // Mover cursor al siguiente
        cursor = siguiente;
    }

    // Mostrar todo el historial
    public void mostrarHistorial() {
        if (cabeza == null) {
            System.out.println("Historial vacío");
            return;
        }

        Comando actual = cabeza;
        do {
            if (actual == cursor) {
                System.out.println(" [CURSOR] " + actual.texto);
            } else {
                System.out.println("   " + actual.texto);
            }
            actual = actual.siguiente;
        } while (actual != cabeza);
    }
}
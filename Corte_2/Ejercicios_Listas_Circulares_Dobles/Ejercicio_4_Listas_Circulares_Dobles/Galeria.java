package Corte_2.Ejercicios_Listas_Circulares_Dobles.Ejercicio_4_Listas_Circulares_Dobles;

public class Galeria {
    private Foto cabeza;
    private Foto actual;

    // Agregar foto
    public void agregarFoto(String titulo, String fecha) {
        Foto nueva = new Foto(titulo, fecha);

        if (cabeza == null) {
            cabeza = nueva;
            actual = nueva;
        } else {
            Foto temp = cabeza;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nueva;
            nueva.anterior = temp;
        }
    }

    // Ir a la siguiente foto
    public void siguiente() {
        if (actual != null && actual.siguiente != null) {
            actual = actual.siguiente;
        } else {
            System.out.println("No hay siguiente foto.");
        }
    }

    // Ir a la anterior foto
    public void anterior() {
        if (actual != null && actual.anterior != null) {
            actual = actual.anterior;
        } else {
            System.out.println("No hay foto anterior.");
        }
    }

    // Marcar o desmarcar favorita
    public void toggleFavorita() {
        if (actual != null) {
            actual.esFavorita = !actual.esFavorita;
        }
    }

    // Eliminar foto actual en O(1)
    public void eliminarActual() {
        if (actual == null) return;

        if (actual.anterior != null) {
            actual.anterior.siguiente = actual.siguiente;
        } else {
            cabeza = actual.siguiente;
        }

        if (actual.siguiente != null) {
            actual.siguiente.anterior = actual.anterior;
        }

        if (actual.siguiente != null) {
            actual = actual.siguiente;
        } else {
            actual = actual.anterior;
        }
    }

    // Mostrar galería
    public void mostrarGaleria() {
        Foto temp = cabeza;

        while (temp != null) {
            String marca = "";

            if (temp == actual) marca += "[▶] ";
            if (temp.esFavorita) marca += "[★] ";

            System.out.println(marca + temp.titulo + " - " + temp.fecha);
            temp = temp.siguiente;
        }
        System.out.println("----------------------");
    }
}

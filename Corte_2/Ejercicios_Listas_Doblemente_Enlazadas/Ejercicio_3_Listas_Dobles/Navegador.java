package Corte_2.Ejercicios_Listas_Doblemente_Enlazadas.Ejercicio_3_Listas_Dobles;

public class Navegador {
    private Pestana inicio;
    private Pestana fin;
    private Pestana actual;

    public Navegador() {
        inicio = null;
        fin = null;
        actual = null;
    }

    // Abrir pestaña (agregar al final)
    public void abrirPestana(String titulo, String url, String hora) {
        Pestana nueva = new Pestana(titulo, url, hora);

        if (inicio == null) {
            inicio = fin = actual = nueva;
        } else {
            fin.siguiente = nueva;
            nueva.anterior = fin;
            fin = nueva;
            actual = nueva;
        }
    }

    // Mostrar pestaña actual
    public void mostrarActual() {
        if (actual != null) {
            actual.mostrar();
        } else {
            System.out.println("No hay pestañas abiertas.");
        }
    }

    // Ir a la siguiente pestaña
    public void siguiente() {
        if (actual != null && actual.siguiente != null) {
            actual = actual.siguiente;
            mostrarActual();
        } else {
            System.out.println("No hay más pestañas a la derecha.");
        }
    }

    // Ir a la pestaña anterior
    public void anterior() {
        if (actual != null && actual.anterior != null) {
            actual = actual.anterior;
            mostrarActual();
        } else {
            System.out.println("No hay más pestañas a la izquierda.");
        }
    }

    // MÉTODO DEL RETO
    public void cerrarPestanaActual(String url) {
        if (inicio == null) {
            System.out.println("No hay pestañas.");
            return;
        }

        Pestana temp = inicio;

        while (temp != null) {
            if (temp.url.equals(url)) {

                // Caso 1: única pestaña
                if (inicio == fin) {
                    inicio = fin = actual = null;
                }

                // Caso 2: eliminar inicio
                else if (temp == inicio) {
                    inicio = inicio.siguiente;
                    inicio.anterior = null;
                    actual = inicio;
                }

                // Caso 3: eliminar final
                else if (temp == fin) {
                    fin = fin.anterior;
                    fin.siguiente = null;
                    actual = fin;
                }

                // Caso 4: eliminar en medio
                else {
                    temp.anterior.siguiente = temp.siguiente;
                    temp.siguiente.anterior = temp.anterior;
                    actual = temp.anterior;
                }

                System.out.println("Pestaña cerrada correctamente.");
                return;
            }
            temp = temp.siguiente;
        }

        System.out.println("No se encontró la URL.");
    }
}
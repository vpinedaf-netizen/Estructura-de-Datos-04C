package Corte_3.Ejercicios_Arboles.Ejercicio_2_Arboles;

public class CatalogoBST {

    private Libro raiz;

    public void insertar(long isbn, String titulo, String autor, int anioPublicacion) {
        raiz = insertarRec(raiz, isbn, titulo, autor, anioPublicacion);
    }

    private Libro insertarRec(Libro nodo, long isbn, String titulo,
                              String autor, int anioPublicacion) {

        if (nodo == null) {
            return new Libro(isbn, titulo, autor, anioPublicacion);
        }

        if (isbn < nodo.isbn) {
            nodo.izquierda = insertarRec(nodo.izquierda, isbn, titulo, autor, anioPublicacion);
        } else if (isbn > nodo.isbn) {
            nodo.derecha = insertarRec(nodo.derecha, isbn, titulo, autor, anioPublicacion);
        }

        return nodo;
    }

    public boolean existeISBN(long isbn) {
        return buscarRec(raiz, isbn);
    }

    private boolean buscarRec(Libro nodo, long isbn) {

        if (nodo == null) {
            return false;
        }

        if (nodo.isbn == isbn) {
            return true;
        }

        if (isbn < nodo.isbn) {
            return buscarRec(nodo.izquierda, isbn);
        } else {
            return buscarRec(nodo.derecha, isbn);
        }
    }

    public void imprimirCatalogo() {
        if (raiz == null) {
            System.out.println("No hay libros registrados.");
        } else {
            System.out.println("\n=== CATALOGO DE LIBROS ===");
            inOrden(raiz);
        }
    }

    private void inOrden(Libro nodo) {

        if (nodo != null) {
            inOrden(nodo.izquierda);

            System.out.println(
                    nodo.isbn + " - " +
                    nodo.titulo + " - " +
                    nodo.autor
            );

            inOrden(nodo.derecha);
        }
    }
}

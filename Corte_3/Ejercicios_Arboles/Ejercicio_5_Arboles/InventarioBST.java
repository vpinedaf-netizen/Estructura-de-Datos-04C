package Corte_3.Ejercicios_Arboles.Ejercicio_5_Arboles;

public class InventarioBST {

    private Repuesto raiz;

    // Insertar repuesto
    public void insertar(int codigoRef,
                         String descripcion,
                         String marca,
                         int stock) {

        raiz = insertarRec(
                raiz,
                codigoRef,
                descripcion,
                marca,
                stock
        );
    }

    private Repuesto insertarRec(Repuesto nodo,
                                 int codigoRef,
                                 String descripcion,
                                 String marca,
                                 int stock) {

        if (nodo == null) {
            return new Repuesto(
                    codigoRef,
                    descripcion,
                    marca,
                    stock
            );
        }

        if (codigoRef < nodo.codigoRef) {
            nodo.izquierda = insertarRec(
                    nodo.izquierda,
                    codigoRef,
                    descripcion,
                    marca,
                    stock
            );
        } else if (codigoRef > nodo.codigoRef) {
            nodo.derecha = insertarRec(
                    nodo.derecha,
                    codigoRef,
                    descripcion,
                    marca,
                    stock
            );
        }

        return nodo;
    }

    // Backup en PreOrden
    public void backupPreOrden() {

        if (raiz == null) {
            System.out.println("Inventario vacío.");
            return;
        }

        System.out.println("\n=== BACKUP PREORDEN ===");
        preOrden(raiz);
    }

    private void preOrden(Repuesto nodo) {

        if (nodo != null) {

            System.out.println(
                "[" + nodo.codigoRef + "] "
                + nodo.descripcion + " - "
                + nodo.marca + " ("
                + nodo.stock + " uds)"
            );

            preOrden(nodo.izquierda);
            preOrden(nodo.derecha);
        }
    }

    // Contar hojas
    public int contarHojas() {
        return contarHojasRec(raiz);
    }

    private int contarHojasRec(Repuesto nodo) {

        if (nodo == null) {
            return 0;
        }

        if (nodo.izquierda == null &&
            nodo.derecha == null) {
            return 1;
        }

        return contarHojasRec(nodo.izquierda)
                + contarHojasRec(nodo.derecha);
    }

    // Reporte de repuestos únicos
    public void reporteRepuestosUnicos() {

        int hojas = contarHojas();

        System.out.println("\n=== REPORTE ===");
        System.out.println(
            "Hay " + hojas +
            " repuestos sin variantes relacionadas."
        );
    }
}
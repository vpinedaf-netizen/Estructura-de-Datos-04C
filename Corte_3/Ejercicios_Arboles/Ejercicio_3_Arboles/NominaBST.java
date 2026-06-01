package Corte_3.Ejercicios_Arboles.Ejercicio_3_Arboles;

public class NominaBST {

    private Empleado raiz;

    // Insertar empleado
    public void insertar(long cedula, String nombre,
                         String cargo, double salario) {

        raiz = insertarRec(raiz, cedula, nombre, cargo, salario);
    }

    private Empleado insertarRec(Empleado nodo,
                                 long cedula,
                                 String nombre,
                                 String cargo,
                                 double salario) {

        if (nodo == null) {
            return new Empleado(cedula, nombre, cargo, salario);
        }

        if (cedula < nodo.cedula) {
            nodo.izquierda = insertarRec(
                    nodo.izquierda, cedula, nombre, cargo, salario);
        } else if (cedula > nodo.cedula) {
            nodo.derecha = insertarRec(
                    nodo.derecha, cedula, nombre, cargo, salario);
        }

        return nodo;
    }

    // Buscar empleado con menor cédula
    public void buscarMinimo() {

        if (raiz == null) {
            System.out.println("No hay empleados registrados.");
            return;
        }

        Empleado actual = raiz;

        while (actual.izquierda != null) {
            actual = actual.izquierda;
        }

        System.out.println("\n=== EMPLEADO CON MENOR CEDULA ===");
        System.out.println("Cedula: " + actual.cedula);
        System.out.println("Nombre: " + actual.nombreCompleto);
        System.out.println("Cargo: " + actual.cargo);
        System.out.println("Salario: $" + actual.salario);
    }

    // Buscar empleado con mayor cédula
    public void buscarMaximo() {

        if (raiz == null) {
            System.out.println("No hay empleados registrados.");
            return;
        }

        Empleado actual = raiz;

        while (actual.derecha != null) {
            actual = actual.derecha;
        }

        System.out.println("\n=== EMPLEADO CON MAYOR CEDULA ===");
        System.out.println("Cedula: " + actual.cedula);
        System.out.println("Nombre: " + actual.nombreCompleto);
        System.out.println("Cargo: " + actual.cargo);
        System.out.println("Salario: $" + actual.salario);
    }

    // Altura del árbol
    public int altura() {
        return alturaRec(raiz);
    }

    private int alturaRec(Empleado nodo) {

        if (nodo == null) {
            return -1;
        }

        int izquierda = alturaRec(nodo.izquierda);
        int derecha = alturaRec(nodo.derecha);

        return Math.max(izquierda, derecha) + 1;
    }

    // Contar hojas
    public int contarHojas() {
        return contarHojasRec(raiz);
    }

    private int contarHojasRec(Empleado nodo) {

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

    // Reporte de eficiencia
    public void reporteEficiencia() {

        System.out.println("\n=== REPORTE DE EFICIENCIA ===");
        System.out.println("Altura del árbol: " + altura());
        System.out.println("Cantidad de hojas: " + contarHojas());
    }
}

package Corte_3.Ejercicios_Cola.Ejercicio_4_Cola;

public class ColaPeaje {

    private Nodo frente;
    private Nodo fin;

    public ColaPeaje() {
        frente = null;
        fin = null;
    }

    // Agregar vehículo
    public void ingresarVehiculo(Vehiculo vehiculo) {

        Nodo nuevo = new Nodo(vehiculo);

        if (fin == null) {
            frente = nuevo;
            fin = nuevo;
        } else {
            fin.siguiente = nuevo;
            fin = nuevo;
        }

        System.out.println("\nVehículo agregado al carril.");
    }

    // Atender vehículo
    public Vehiculo atenderVehiculo() {

        if (frente == null) {
            return null;
        }

        Vehiculo vehiculoAtendido = frente.vehiculo;

        frente = frente.siguiente;

        if (frente == null) {
            fin = null;
        }

        return vehiculoAtendido;
    }

    // Mostrar vehículos
    public void mostrarCola() {

        if (frente == null) {
            System.out.println("\nNo hay vehículos en la cola.");
            return;
        }

        Nodo actual = frente;

        System.out.println("\n===== COLA DE VEHÍCULOS =====");

        while (actual != null) {

            System.out.println(actual.vehiculo);
            System.out.println("---------------------------");

            actual = actual.siguiente;
        }
    }

    // Cerrar turno
    public void cerrarTurno() {

        double totalRecaudado = 0;

        if (frente == null) {
            System.out.println("\nNo hay vehículos en la cola.");
            return;
        }

        System.out.println("\n===== CIERRE DE TURNO =====");

        while (frente != null) {

            Vehiculo vehiculo = atenderVehiculo();

            System.out.println("\nVehículo atendido:");
            System.out.println(vehiculo);

            if (!vehiculo.isEsExento()) {
                totalRecaudado += vehiculo.getTarifa();
            }

            System.out.println("---------------------------");
        }

        System.out.println("\nTotal recaudado: $" + totalRecaudado);
    }
}

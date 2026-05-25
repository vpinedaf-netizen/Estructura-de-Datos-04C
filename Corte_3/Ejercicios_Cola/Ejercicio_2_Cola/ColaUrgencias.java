package Corte_3.Ejercicios_Cola.Ejercicio_2_Cola;

public class ColaUrgencias {

    private Nodo frente;
    private Nodo fin;

    public ColaUrgencias() {
        frente = null;
        fin = null;
    }

    // Registrar paciente
    public void registrarPaciente(Paciente paciente) {

        Nodo nuevo = new Nodo(paciente);

        if (fin == null) {
            frente = nuevo;
            fin = nuevo;
        } else {
            fin.siguiente = nuevo;
            fin = nuevo;
        }

        System.out.println("\nPaciente registrado correctamente.");
    }

    // Atender un paciente
    public Paciente atenderPaciente() {

        if (frente == null) {
            return null;
        }

        Paciente pacienteAtendido = frente.paciente;
        frente = frente.siguiente;

        if (frente == null) {
            fin = null;
        }

        return pacienteAtendido;
    }

    // Mostrar pacientes en cola
    public void mostrarPacientes() {

        if (frente == null) {
            System.out.println("\nNo hay pacientes en espera.");
            return;
        }

        Nodo actual = frente;

        System.out.println("\n===== LISTA DE PACIENTES =====");

        while (actual != null) {
            System.out.println(actual.paciente);
            System.out.println("---------------------------");
            actual = actual.siguiente;
        }
    }

    // Atender todos los pacientes
    public void atenderTodos() {

        int totalPacientes = 0;

        if (frente == null) {
            System.out.println("\nNo hay pacientes para atender.");
            return;
        }

        System.out.println("\n===== ATENDIENDO PACIENTES =====");

        while (frente != null) {

            Paciente paciente = atenderPaciente();

            System.out.println("\nPaciente atendido:");
            System.out.println(paciente);
            System.out.println("---------------------------");

            totalPacientes++;
        }

        System.out.println("\nTotal de pacientes atendidos: " + totalPacientes);
    }
}

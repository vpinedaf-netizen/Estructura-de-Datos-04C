package Corte_2.Ejercicios_Listas_Doblemente_Enlazadas.Ejercicio_4_Listas_Dobles;

public class Consultorio {
    private Paciente inicio;
    private Paciente fin;

    public Consultorio() {
        inicio = null;
        fin = null;
    }

    // Agregar paciente con prioridad
    public void agregarPaciente(String nombre, int edad, int urgencia) {
        Paciente nuevo = new Paciente(nombre, edad, urgencia);

        // Lista vacía
        if (inicio == null) {
            inicio = fin = nuevo;
            return;
        }

        // Si es urgencia 5 - insertar después de la cabeza
        if (urgencia == 5) {
            nuevo.siguiente = inicio.siguiente;
            nuevo.anterior = inicio;

            if (inicio.siguiente != null) {
                inicio.siguiente.anterior = nuevo;
            } else {
                fin = nuevo;
            }

            inicio.siguiente = nuevo;
        } 
        // Normal - al final
        else {
            fin.siguiente = nuevo;
            nuevo.anterior = fin;
            fin = nuevo;
        }
    }

    // Mostrar lista
    public void mostrarPacientes() {
        Paciente temp = inicio;

        if (temp == null) {
            System.out.println("No hay pacientes.");
            return;
        }

        while (temp != null) {
            temp.mostrar();
            temp = temp.siguiente;
        }
    }

    // MÉTODO DEL RETO
    public void pacienteMayorEdad() {
        if (fin == null) {
            System.out.println("No hay pacientes.");
            return;
        }

        Paciente temp = fin;
        Paciente mayor = fin;

        // recorrer de cola a cabeza
        while (temp != null) {
            if (temp.edad > mayor.edad) {
                mayor = temp;
            }
            temp = temp.anterior;
        }

        System.out.println("Paciente de mayor edad:");
        mayor.mostrar();
    }
}

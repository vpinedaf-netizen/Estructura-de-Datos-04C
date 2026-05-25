package Corte_3.Ejercicios_Cola.Ejercicio_2_Cola;

// 2. Urgencias Hospitalarias (Triaje)
// En la sala de urgencias de un hospital, los pacientes que llegan son registrados y colocados en una fila de atención. 
// Dado el volumen de pacientes, el médico de guardia atiende en estricto orden de llegada. Al momento de llamar a un paciente, 
// el sistema debe mostrar su información completa.

// La Clase Paciente (Nodo): Debe contener cedula(String), nombreCompleto(String), edad(int) y sintomaPrincipal(String).
// El Problema: Al finalizar el turno, el hospital necesita un reporte del total de pacientes atendidos y la lista completa 
// en orden de atención.
// Reto: Implementa un método atenderTodos()que extraiga ( dequeue) a cada paciente uno a uno, imprima su información al 
// momento de ser atendido e imprima al final el total de pacientes procesados.


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ColaUrgencias cola = new ColaUrgencias();

        int opcion;

        do {

            System.out.println("\n===== MENÚ URGENCIAS HOSPITALARIAS =====");
            System.out.println("1. Registrar paciente");
            System.out.println("2. Mostrar pacientes");
            System.out.println("3. Atender un paciente");
            System.out.println("4. Atender todos los pacientes");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("\nIngrese la cédula: ");
                    String cedula = sc.nextLine();

                    System.out.print("Ingrese el nombre completo: ");
                    String nombre = sc.nextLine();

                    System.out.print("Ingrese la edad: ");
                    int edad = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Ingrese el síntoma principal: ");
                    String sintoma = sc.nextLine();

                    Paciente paciente = new Paciente(
                            cedula,
                            nombre,
                            edad,
                            sintoma
                    );

                    cola.registrarPaciente(paciente);

                    break;

                case 2:

                    cola.mostrarPacientes();

                    break;

                case 3:

                    Paciente atendido = cola.atenderPaciente();

                    if (atendido == null) {
                        System.out.println("\nNo hay pacientes en espera.");
                    } else {
                        System.out.println("\nPaciente atendido:");
                        System.out.println(atendido);
                    }

                    break;

                case 4:

                    cola.atenderTodos();

                    break;

                case 5:

                    System.out.println("\nSaliendo del sistema...");
                    break;

                default:

                    System.out.println("\nOpción inválida.");
            }

        } while (opcion != 5);

        sc.close();
    }
}

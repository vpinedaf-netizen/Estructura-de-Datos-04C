package Corte_3.Ejercicios_Arboles.Ejercicio_3_Arboles;

// 3. Sistema de Nómina (Recursos Humanos)
// Una empresa de logística administra a sus empleados en un BST organizado por número de cédula. El área de 
// RRHH consulta frecuentemente el empleado con el menor y el mayor número de cédula para procesar los extremos de 
// la nómina. También necesita conocer la altura del árbol para auditar si la estructura sigue siendo eficiente después
//  de muchas incorporaciones.

// La Clase Empleado (Nodo): Debe contener cedula (long, clave del BST), nombreCompleto (String), cargo (String) y 
// salario (double).
// El Problema: El sistema debe poder ubicar al empleado con la cédula más baja (el más antiguo en el registro) y al 
// de cédula más alta (el más reciente), y también reportar la altura actual del árbol para verificar que las búsquedas
//  siguen siendo eficientes.
// Reto: Implementa buscarMinimo() y buscarMaximo(), que recorran el BST siguiendo siempre el subárbol izquierdo o derecho 
// respectivamente hasta llegar a una hoja e impriman los datos del empleado encontrado. Implementa también reporteEficiencia() 
// que imprima la altura actual del árbol y el número total de hojas (contarHojas()).


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        NominaBST nomina = new NominaBST();

        int opcion;

        do {

            System.out.println("\n===== MENU NOMINA =====");
            System.out.println("1. Registrar empleado");
            System.out.println("2. Buscar empleado con menor cedula");
            System.out.println("3. Buscar empleado con mayor cedula");
            System.out.println("4. Reporte de eficiencia");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("Cedula: ");
                    long cedula = sc.nextLong();
                    sc.nextLine();

                    System.out.print("Nombre completo: ");
                    String nombre = sc.nextLine();

                    System.out.print("Cargo: ");
                    String cargo = sc.nextLine();

                    System.out.print("Salario: ");
                    double salario = sc.nextDouble();

                    nomina.insertar(
                            cedula,
                            nombre,
                            cargo,
                            salario
                    );

                    System.out.println("Empleado registrado.");
                    break;

                case 2:
                    nomina.buscarMinimo();
                    break;

                case 3:
                    nomina.buscarMaximo();
                    break;

                case 4:
                    nomina.reporteEficiencia();
                    break;

                case 5:
                    System.out.println("Fin del programa.");
                    break;

                default:
                    System.out.println("Opcion invalida.");
            }

        } while (opcion != 5);

        sc.close();
    }
}

package Corte_3.Ejercicios_Pilas.Ejercicio_4_Pila;

// 4. Farmacia Automatizada (Dispensador Tubo LIFO)
// En una farmacia de alta tecnología, los medicamentos de alta rotación se almacenan en tubos dispensadores verticales. El personal 
// introduce las cajas por la parte superior y las retira de la misma forma (el último lote en llegar es el primero en ser despachado).

// La Clase Medicamento (Nodo): Debe contener nombre(String), lote(String) y diasParaVencer(int).
// El Problema: Por norma de seguridad, no se puede despachar un medicamento si le quedan menos de 10 días para vencer.
// // Reto: Implementa un método validarDespacho()que revisa el medicamento en el tope . Si está a punto de vencer, debe ser retirado 
// automáticamente y el sistema debe revisar el siguiente. El proceso se repite hasta que el tope sea un medicamento seguro o 
// la pila quede vacía.

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        PilaMedicamentos pila = new PilaMedicamentos();

        int opcion;

        do 
        {
            System.out.println("\n===== FARMACIA AUTOMATIZADA =====");
            System.out.println("1. Agregar medicamento");
            System.out.println("2. Mostrar medicamentos");
            System.out.println("3. Validar despacho");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) 
            {
                case 1:

                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Lote: ");
                    String lote = sc.nextLine();

                    System.out.print("Días para vencer: ");
                    int dias = sc.nextInt();

                    Medicamento medicamento = new Medicamento(nombre, lote, dias);

                    pila.apilar(medicamento);

                    System.out.println("Medicamento agregado correctamente");
                    break;

                case 2:

                    pila.mostrar();
                    break;

                case 3:

                    pila.validarDespacho();
                    break;

                case 4:

                    System.out.println("Saliendo...");
                    break;

                default:

                    System.out.println("Opción inválida");
            }

        } while (opcion != 4);

        sc.close();
    }
}

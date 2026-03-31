//Control de Acceso (Gimnasio)
//Un gimnasio tiene una lista de códigos de acceso de los socios que pagaron la mensualidad. 
// La lista está ordenada de menor a mayor .

//El Problema: Cuando un socio digita su código, el sistema debe validar si el código 
// está en la lista de "pagos al día". Si no está, se le niega la entrada.
//Algoritmo a usar: Búsqueda Binaria . Es eficiente para buscar códigos numéricos en 
// una lista que ya está organizada.

import java.util.Scanner;

public class Ejercicio_Arreglo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lista ORDENADA de códigos de socios que pagaron
        int[] codigos = {1001, 1005, 1010, 1020, 1030, 1050, 1060, 1075};

        // Pedir código al usuario
        System.out.print("Ingrese su código de acceso: ");
        int codigoBuscado = sc.nextInt();

        // Variables para la búsqueda binaria
        int inicio = 0;
        int fin = codigos.length - 1;
        boolean encontrado = false;

        // Búsqueda binaria
        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;

            if (codigos[medio] == codigoBuscado) {
                encontrado = true;
                break;
            } else if (codigoBuscado < codigos[medio]) {
                fin = medio - 1;
            } else {
                inicio = medio + 1;
            }
        }

        // Mostrar resultado
        if (encontrado) {
            System.out.println("Acceso permitido. ¡Bienvenido al gimnasio!");
        } else {
            System.out.println("Acceso denegado. No se encuentra en la lista de pagos al día.");
        }

        sc.close();
    }
}

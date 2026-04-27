package Corte_2.Ejercicios_Listas_Circulares_Dobles.Ejercicio_2_Listas_Circulares_Dobles;

// 2. Historial de Comandos de Terminal
// Los terminales guardan un historial de comandos. Al presionar flecha arriba el usuario retrocede 
// al comando anterior; flecha abajo avanza al más reciente. El historial es circular: después del más 
// antiguo vuelve al más nuevo.

// La Clase Comando (Nodo): Debe contener texto (String), exitoso (boolean — si ejecutó sin errores) y 
// directorio (String — el path desde donde se ejecutó).
// El Problema: El historial mantiene un puntero cursor al comando que se está consultando. Navegar con "arriba" 
// mueve el cursor al anterior (anterior); "abajo" lo mueve al siguiente (siguiente). El usuario puede eliminar el 
// comando actual (para borrar contraseñas escritas por error), y el cursor pasa automáticamente al siguiente.
// Reto: Implementa los métodos arriba(), abajo(), mostrarCursor() y eliminarActual(). Simula: agrega 5 comandos, 
// navega 3 veces hacia arriba, elimina el comando actual, navega una vez hacia abajo y muestra el historial completo 
// con el cursor marcado.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Historial historial = new Historial();
        int opcion;

        do {
            System.out.println("\n=== HISTORIAL DE COMANDOS ===");
            System.out.println("1. Agregar comando");
            System.out.println("2. Flecha arriba (anterior)");
            System.out.println("3. Flecha abajo (siguiente)");
            System.out.println("4. Mostrar comando actual");
            System.out.println("5. Eliminar comando actual");
            System.out.println("6. Mostrar historial completo");
            System.out.println("7. Salir");
            System.out.print("Seleccione: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("Comando: ");
                    String texto = sc.nextLine();

                    System.out.print("¿Fue exitoso? (true/false): ");
                    boolean exitoso = sc.nextBoolean();
                    sc.nextLine();

                    System.out.print("Directorio: ");
                    String dir = sc.nextLine();

                    historial.agregar(texto, exitoso, dir);
                    break;

                case 2:
                    historial.arriba();
                    System.out.println("Movido al comando anterior");
                    historial.mostrarCursor();
                    break;

                case 3:
                    historial.abajo();
                    System.out.println("Movido al siguiente comando");
                    historial.mostrarCursor();
                    break;

                case 4:
                    historial.mostrarCursor();
                    break;

                case 5:
                    historial.eliminarActual();
                    System.out.println(" Comando eliminado");
                    historial.mostrarCursor();
                    break;

                case 6:
                    historial.mostrarHistorial();
                    break;

                case 7:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 7);

        sc.close();
    }
}
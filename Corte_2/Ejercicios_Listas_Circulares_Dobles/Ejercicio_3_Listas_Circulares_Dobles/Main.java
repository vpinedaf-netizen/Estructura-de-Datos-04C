package Corte_2.Ejercicios_Listas_Circulares_Dobles.Ejercicio_3_Listas_Circulares_Dobles;

// 3. Editor de Capas (Diseño Gráfico)
// Los editores gráficos organizan el diseño en capas. El usuario navega a la capa superior (siguiente) o 
// inferior (anterior) y puede ocultar o mostrar cada capa. La estructura es circular: después de la capa más alta 
// vuelve a la más baja.

// La Clase Capa (Nodo): Debe contener nombre (String), visible (boolean) y tipo (String — "fondo", "objeto", "texto").
// El Problema: El editor mantiene un puntero capaActiva a la capa seleccionada. El usuario puede moverse entre capas, 
// alternar la visibilidad de la activa y eliminarla (el foco pasa a la siguiente).
// Reto: Implementa los métodos subirCapa(), bajarCapa(), toggleVisibilidad(), eliminarActiva() y mostrarCapas(). mostrarCapas() 
// imprime todas las capas marcando la activa con [✓] e indicando si cada una es visible. Simula: crea 4 capas, activa la del 
// medio, sube una vez, oculta la activa, elimínala y muestra el estado final.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EditorCapas editor = new EditorCapas();
        int opcion;

        // Simulación inicial (lo que pide el ejercicio)
        editor.agregarCapa("Fondo", true, "fondo");
        editor.agregarCapa("Imagen", true, "objeto");
        editor.agregarCapa("Texto", true, "texto");
        editor.agregarCapa("Logo", true, "objeto");

        // Activar la del medio
        editor.subirCapa();
        editor.subirCapa();

        // Subir una vez
        editor.subirCapa();

        // Ocultar activa
        editor.toggleVisibilidad();

        // Eliminarla
        editor.eliminarActiva();

        System.out.println("Estado inicial tras simulación:");
        editor.mostrarCapas();

        //  Menú interactivo
        do {
            System.out.println("\n=== EDITOR DE CAPAS ===");
            System.out.println("1. Agregar capa");
            System.out.println("2. Subir capa");
            System.out.println("3. Bajar capa");
            System.out.println("4. Mostrar capas");
            System.out.println("5. Ocultar/Mostrar capa activa");
            System.out.println("6. Eliminar capa activa");
            System.out.println("7. Salir");
            System.out.print("Seleccione: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Tipo (fondo/objeto/texto): ");
                    String tipo = sc.nextLine();

                    editor.agregarCapa(nombre, true, tipo);
                    break;

                case 2:
                    editor.subirCapa();
                    break;

                case 3:
                    editor.bajarCapa();
                    break;

                case 4:
                    editor.mostrarCapas();
                    break;

                case 5:
                    editor.toggleVisibilidad();
                    break;

                case 6:
                    editor.eliminarActiva();
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
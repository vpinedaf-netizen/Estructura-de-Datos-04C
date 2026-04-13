package Corte_2.Ejercicios_Listas_Doblemente_Enlazadas.Ejercicio_3_Listas_Dobles;

//3. Navegación de Pestañas de Navegador
//Imagina un navegador donde puedes moverte entre pestañas abiertas.

//La Clase Pestana (Nodo): Debe contener tituloPagina (String), url (String) y horaApertura (String).
//El Problema: Las pestañas se abren una tras otra. A veces el usuario quiere cerrar la pestaña actual y el foco 
// debe pasar a la pestaña anterior.
//Reto: Implementar el método cerrarPestanaActual(String url) que busque la pestaña por URL, la elimine de la lista y 
// reconecte el nodo anterior con el siguiente correctamente (¡Cuidado con la Cabeza y la Cola!).

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Navegador navegador = new Navegador();

        int opcion;

        do {
            System.out.println("\n=== NAVEGADOR DE PESTAÑAS ===");
            System.out.println("1. Abrir pestaña");
            System.out.println("2. Mostrar pestaña actual");
            System.out.println("3. Siguiente pestaña");
            System.out.println("4. Pestaña anterior");
            System.out.println("5. Cerrar pestaña por URL");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();

                    System.out.print("URL: ");
                    String url = sc.nextLine();

                    System.out.print("Hora: ");
                    String hora = sc.nextLine();

                    navegador.abrirPestana(titulo, url, hora);
                    break;

                case 2:
                    navegador.mostrarActual();
                    break;

                case 3:
                    navegador.siguiente();
                    break;

                case 4:
                    navegador.anterior();
                    break;

                case 5:
                    System.out.print("Ingrese URL a cerrar: ");
                    String cerrarUrl = sc.nextLine();
                    navegador.cerrarPestanaActual(cerrarUrl);
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 0);

        sc.close();
    }
}

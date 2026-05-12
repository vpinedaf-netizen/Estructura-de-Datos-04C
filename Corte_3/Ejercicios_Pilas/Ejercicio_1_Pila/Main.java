package Corte_3.Ejercicios_Pilas.Ejercicio_1_Pila;


import java.util.Scanner;

public class Main
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        PilaContenedores pila = new PilaContenedores();

        int opcion;

        do 
        {
            System.out.println("\n===== PUERTO MARÍTIMO =====");
            System.out.println("1. Agregar contenedor");
            System.out.println("2. Mostrar contenedores");
            System.out.println("3. Contar contenedores por empresa");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) 
            {
                case 1:

                    System.out.print("Código: ");
                    String codigo = sc.nextLine();

                    System.out.print("Empresa: ");
                    String empresa = sc.nextLine();

                    System.out.print("Peso: ");
                    double peso = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Tipo de carga: ");
                    String tipo = sc.nextLine();

                    Contenedor contenedor = new Contenedor(codigo, empresa, peso, tipo);

                    pila.apilar(contenedor);

                    System.out.println("Contenedor agregado correctamente");
                    break;

                case 2:

                    pila.mostrar();
                    break;

                case 3:

                    System.out.print("Ingrese el nombre de la empresa: ");
                    String nombreEmpresa = sc.nextLine();

                    int cantidad = pila.contarPorEmpresa(nombreEmpresa);

                    System.out.println("Cantidad de contenedores: " + cantidad);
                    break;

                case 4:

                    System.out.println("Saliendo del sistema...");
                    break;

                default:

                    System.out.println("Opción inválida");
            }

        } while (opcion != 4);

        sc.close();
    }
}
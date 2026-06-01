package Corte_3.Ejercicios_Arboles.Ejercicio_2_Arboles;

// 2. Catálogo Digital (Biblioteca Universitaria)
// La biblioteca de la universidad organiza su colección de libros en un BST usando el ISBN como clave única. 
// Cada vez que ingresa un libro nuevo, se inserta automáticamente en el árbol. El sistema debe poder confirmar si un 
// ISBN ya existe antes de registrar un nuevo ejemplar y listar toda la colección ordenada por ISBN.

// La Clase Libro (Nodo): Debe contener isbn (long, clave del BST), titulo (String), autor (String) y anioPublicacion (int).
// El Problema: Al final del semestre, el bibliotecario necesita imprimir el inventario completo ordenado de menor a mayor 
// por ISBN para enviarlo a la sede central. También debe verificar si un ISBN específico ya existe en el catálogo antes de 
// registrar una donación.
// Reto: Implementa el método imprimirCatalogo() usando el recorrido InOrden para listar todos los libros en orden ascendente 
// de ISBN (imprime isbn - titulo - autor). Además, implementa existeISBN(long isbn) que retorne true si el libro ya está 
// registrado y false en caso contrario.


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CatalogoBST catalogo = new CatalogoBST();

        int opcion;

        do {
            System.out.println("\n===== MENU BIBLIOTECA =====");
            System.out.println("1. Registrar libro");
            System.out.println("2. Buscar ISBN");
            System.out.println("3. Imprimir catalogo");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("ISBN: ");
                    long isbn = sc.nextLong();
                    sc.nextLine();

                    if (catalogo.existeISBN(isbn)) {
                        System.out.println("Ese ISBN ya existe.");
                    } else {

                        System.out.print("Titulo: ");
                        String titulo = sc.nextLine();

                        System.out.print("Autor: ");
                        String autor = sc.nextLine();

                        System.out.print("Año de publicacion: ");
                        int anio = sc.nextInt();

                        catalogo.insertar(isbn, titulo, autor, anio);

                        System.out.println("Libro registrado correctamente.");
                    }
                    break;

                case 2:

                    System.out.print("Ingrese ISBN a buscar: ");
                    long isbnBuscar = sc.nextLong();

                    if (catalogo.existeISBN(isbnBuscar)) {
                        System.out.println("El ISBN existe en el catalogo.");
                    } else {
                        System.out.println("El ISBN NO existe.");
                    }

                    break;

                case 3:
                    catalogo.imprimirCatalogo();
                    break;

                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opcion invalida.");
            }

        } while (opcion != 4);

        sc.close();
    }
}
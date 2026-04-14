package Corte_2.Ejercicios_Listas_Circulares.Ejercicio_2_Listas_Circulares;

public class Pantalla {
    private Anuncio cabeza;

    public Pantalla() {
        cabeza = null;
    }

    // Agregar anuncio
    public void agregarAnuncio(String titulo, int duracion, String categoria) {
        Anuncio nuevo = new Anuncio(titulo, duracion, categoria);

        if (cabeza == null) {
            cabeza = nuevo;
            cabeza.siguiente = cabeza;
        } else {
            Anuncio temp = cabeza;

            while (temp.siguiente != cabeza) {
                temp = temp.siguiente;
            }

            temp.siguiente = nuevo;
            nuevo.siguiente = cabeza;
        }
    }

    // Mostrar anuncios
    public void mostrarAnuncios() {
        if (cabeza == null) {
            System.out.println("No hay anuncios.");
            return;
        }

        Anuncio temp = cabeza;

        do {
            temp.mostrar();
            temp = temp.siguiente;
        } while (temp != cabeza);
    }

    // MÉTODO DEL RETO
    public void reproducir(int ciclos) {
        if (cabeza == null) {
            System.out.println("No hay anuncios.");
            return;
        }

        Anuncio actual = cabeza;
        int tiempoTotal = 0;

        System.out.println("Iniciando reproducción...\n");

        for (int i = 0; i < ciclos; i++) {
            System.out.println("Ciclo " + (i + 1));

            Anuncio temp = cabeza;

            do {
                System.out.println("Mostrando anuncio: " + temp.titulo);

                temp.vecesRepetido++;
                tiempoTotal += temp.duracionSegundos;

                temp = temp.siguiente;
            } while (temp != cabeza);
        }

        // Buscar el más repetido
        Anuncio temp = cabeza;
        Anuncio masRepetido = cabeza;

        do {
            if (temp.vecesRepetido > masRepetido.vecesRepetido) {
                masRepetido = temp;
            }
            temp = temp.siguiente;
        } while (temp != cabeza);

        // Resultados
        System.out.println("\nAnuncio más repetido:");
        masRepetido.mostrar();

        System.out.println("Tiempo total en pantalla: " + tiempoTotal + " segundos");
    }
}

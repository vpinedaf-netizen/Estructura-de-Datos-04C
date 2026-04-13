package Corte_2.Ejercicios_Listas_Doblemente_Enlazadas.Ejercicio_3_Listas_Dobles;

public class Pestana {
    String tituloPagina;
    String url;
    String horaApertura;

    Pestana siguiente;
    Pestana anterior;

    public Pestana(String tituloPagina, String url, String horaApertura) {
        this.tituloPagina = tituloPagina;
        this.url = url;
        this.horaApertura = horaApertura;
        this.siguiente = null;
        this.anterior = null;
    }

    public void mostrar() {
        System.out.println("Título: " + tituloPagina);
        System.out.println("URL: " + url);
        System.out.println("Hora: " + horaApertura);
        System.out.println("--------------------------");
    }
}

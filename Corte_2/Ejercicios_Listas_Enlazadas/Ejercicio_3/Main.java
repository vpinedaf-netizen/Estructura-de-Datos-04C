package Corte_2.Ejercicios_Listas_Enlazadas.Ejercicio_3;

public class Main {
    public static void main(String[] args) {

        TorreControl torre = new TorreControl();

        torre.agregarVuelo("AV123", "Avianca", 50, 180);
        torre.agregarVuelo("LA456", "Latam", 8, 150);
        torre.agregarVuelo("IB789", "Iberia", 30, 200);

        System.out.println("Cola inicial:");
        torre.mostrarCola();

        System.out.println("\nEmergencia de AV123:");
        torre.reportarEmergencia("AV123");

        System.out.println("\nCola actualizada:");
        torre.mostrarCola();
    }
}

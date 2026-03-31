package Corte_1.EjerciciosBasicos1;
//**Ejercicio 3 — Sensor de temperatura */
//Un sensor industrial registra temperaturas. El sistema recibe:

//Temperatura actual en Celsius ( double)
//Nombre del sensor ( String)
//Número de lectura ( int)
//Si la temperatura supera el límite de 80°C, debe ser una booleanllamada variable .enAlarmatrue
//Imprime el estado del sensor con todos sus datos.

public class Ejercicio3 {
    public static void main(String[] args) {
        double temperaturaActual = 85.5;
        String nombreSensor = "Sensor-A";
        int numeroLectura = 125;
        boolean enAlarma = temperaturaActual > 80;

        System.out.println("=== Estado del Sensor ===");
        System.out.println("Nombre del sensor: " + nombreSensor);
        System.out.println("Número de lectura: " + numeroLectura);
        System.out.println("Temperatura actual: " + temperaturaActual + "°C");
        System.out.println("En alarma: " + enAlarma);
    }
}


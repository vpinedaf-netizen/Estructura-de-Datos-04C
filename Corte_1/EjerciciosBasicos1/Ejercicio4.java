package Corte_1.EjerciciosBasicos1;
//*Ejercicio 4 — Placa de un vehículo */
//El RUNT almacena datos básicos de vehículos. Modela la información de un carro con:

//Placa ( String)
//Año de fabricación ( int)
//Cilindraje en cc ( int)
//Precio de compra ( double)
//Inicial del color ( char)
//Si tiene SOAT vigente ( boolean)
//Muestra todos los datos en consola.

public class Ejercicio4 {
    public static void main(String[] args) {
        String placa = "ABC123";
        int añoFabricacion = 2020;
        int cilindraje = 1600;
        double precioCompra = 45000000.0;
        char inicialColor = 'R';
        boolean tieneSOATVigente = true;

        System.out.println("=== Placa del Vehículo ===");
        System.out.println("Placa: " + placa);
        System.out.println("Año de fabricación: " + añoFabricacion);
        System.out.println("Cilindraje: " + cilindraje + " cc");
        System.out.println("Precio de compra: " + precioCompra);
        System.out.println("Inicial del color: " + inicialColor);
        System.out.println("Tiene SOAT vigente: " + tieneSOATVigente);
    }
}


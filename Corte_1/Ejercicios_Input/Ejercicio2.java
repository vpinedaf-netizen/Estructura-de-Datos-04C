package Corte_1.Ejercicios_Input;
//**Ejercicio 2 — Conversor de temperatura
//Pide al usuario una temperatura en Celsius y conviértela a Fahrenheit y Kelvin.

//Fórmulas:

//F = (C × 9/5) + 32
//K = C + 273.15
//Dato de entrada: double temperatura en Celsius

//Salida esperada:

//25.0 °C = 77.0 °F = 298.15 K

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        System.out.println("Digite su temperatura en Celsius");
        double Celsius=sc.nextDouble();
        
        double  Fahrenheit= (Celsius * 9/5) + 32;
        double Kelvin = Celsius + 273.15;
        
        
        System.out.println("\n----Conversor de temperatura----");
        System.out.printf(Celsius + " °C = " + Fahrenheit + " °F = " + Kelvin + " k ");
       
        
        sc.close();
    }
}
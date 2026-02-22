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
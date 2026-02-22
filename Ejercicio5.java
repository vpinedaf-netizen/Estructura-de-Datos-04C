
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio5
 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
                
        System.out.println("Ingrese su nombre");
        String nombre = sc.nextLine();
        
        System.out.println("Digite su peso");
        double peso = sc.nextDouble();

        System.out.println("Digite su altura");
        double altura = sc.nextDouble();
        
        double IMC = peso / (altura * altura);
        String clasificacion = "";

        if (IMC < 18.5) {
            clasificacion = "Bajo peso";
        }
        if (IMC >= 18.5 && IMC < 25) {
            clasificacion = "Normal";
        }
        if (IMC >= 25 && IMC < 30) {
            clasificacion = "sobrepeso";
        }
        if (IMC >= 30) {
            clasificacion = "obesidad";
        }
        
        System.out.println("\n----Calculadora de IMC----");
        System.out.println("Nombre:  " + nombre);
        System.out.println("Peso:  " + peso);
        System.out.println("Altura:"+ altura);
         System.out.println("Clasificacion:  " + clasificacion);
        System.out.printf ("-------------------------");
        
        sc.close();
    }
}

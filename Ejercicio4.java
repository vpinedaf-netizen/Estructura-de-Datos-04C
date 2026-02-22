import java.util.Locale;
import java.util.Scanner;


public class Ejercicio4 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
                
        System.out.println("Nombre de Usuario");
        String nombre = sc.nextLine();
        
        System.out.println("Edad: ");
        int Edad = sc.nextInt();
        sc.nextLine();

        System.out.println("Ciudad: ");
        String Ciudad = sc.nextLine();

        System.out.println("Correo: ");
        String Correo = sc.nextLine();
    
        System.out.println("¿Acepta terminos y condiciones?");
        boolean Acepta = sc.nextBoolean();
        
        System.out.println("\n----Perfil de usuario----");
        System.out.println("Nombre (" + nombre.getClass().getSimpleName() + "): " + nombre);
        System.out.println("Edad (" + int.class.getSimpleName() + "): " + Edad);
        System.out.println("Ciudad (" + Ciudad.getClass().getSimpleName() + "): " + Ciudad);
        System.out.println("Correo (" + Correo.getClass().getSimpleName() + "): " + Correo);
        System.out.println("Acepta (" + boolean.class.getSimpleName() + "): " + Acepta);

        sc.close();
    }
}
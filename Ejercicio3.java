import java.util.Locale;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
                
        System.out.println("Nombre del estudiante: ");
        String nombre = sc.nextLine();
        
        System.out.println("Digite nota 1: ");
        double nota_1=sc.nextDouble();
        
         System.out.println("Digite nota 2: ");
        double nota_2=sc.nextDouble();

         System.out.println("Digite nota 3: ");
        double nota_3=sc.nextDouble();

         System.out.println("Digite nota 4: ");
        double nota_4=sc.nextDouble();

        double promedio = (nota_1 + nota_2 + nota_3 + nota_4) / 4 ;
        String Estado = promedio >= 3.0 ? "Aprobado" : "Reprobado"; // operador ternario         
        System.out.println("\n----Promedio de notas----");
        System.out.println("Nombre:  " + nombre);
        System.out.println("Estado:  " + Estado);
        
        System.out.println("Promedio: "+ promedio);
        
        
        sc.close();
    }
}

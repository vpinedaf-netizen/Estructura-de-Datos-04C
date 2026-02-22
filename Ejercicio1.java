import java.util.Locale;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
                
        System.out.println("Nombre del Producto");
        String nombre = sc.nextLine();
        
        System.out.println("Cantidad Comprada: ");
        int cantidad =sc.nextInt();
        
        System.out.println("Precio Unitario");
        double precioUnitario=sc.nextDouble();
        
        double subtotal= cantidad *precioUnitario;
        double iva =subtotal*0.19;
        double total = subtotal + iva;
        
        System.out.println("\n----RECIBO DE COMPRA----");
        System.out.println("Producto:  " + nombre);
        System.out.println("Cantidad:  " + cantidad);
        System.out.printf("Subtotal: $%.2f%n", subtotal);
        System.out.printf("Precio: $%.2f%n", precioUnitario);
        System.out.printf("IVA (19%%): $%.2f%n", iva);
        System.out.printf("Total a pagar: $%.2f%n", total);
        System.out.printf ("-------------------------");
        
        sc.close();
    }
}
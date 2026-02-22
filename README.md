# Estructura-de-Datos-04C

## Ejercicio 1

Recibo de compra: calcula subtotal, IVA (19%) y total a pagar.

```java
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
```

---

## Ejercicio 2

Conversor de temperatura: Celsius a Fahrenheit y Kelvin.

```java
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
```

---

## Ejercicio 3

Promedio de 4 notas y estado Aprobado/Reprobado (aprueba con ≥ 3.0).

```java
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
```

---

## Ejercicio 4

Perfil de usuario: nombre, edad, ciudad, correo y aceptación de términos.

```java
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
```

---

## Ejercicio 5

Calculadora de IMC con clasificación (bajo peso, normal, sobrepeso, obesidad).

```java

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
```
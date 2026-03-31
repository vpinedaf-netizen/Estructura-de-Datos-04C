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

---

## Ejercicio 6

Demostración por valor: pedir dos enteros a y b, asignar b = a, luego un nuevo valor para b; mostrar que a no cambió (paso por valor).

```java
/*
 * Ejercicio 6 — Demostración por valor
 * Tema 2 — Variables por referencia
 */

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("Ingrese el valor de a:");
        int a = sc.nextInt();

        System.out.println("Ingrese el valor de b:");
        int b = sc.nextInt();

        b = a;

        System.out.println("Ingrese un nuevo valor para b:");
        b = sc.nextInt();

        System.out.println("\na = " + a + " + no cambió, se pasó por VALOR");
        System.out.println("b = " + b + " + esta sí cambió");

        sc.close();
    }
}
```

---

## Ejercicio 7

Arreglo compartido (inventario): 4 precios, crear preciosAuditoria como referencia a precios, corregir un índice con preciosAuditoria y mostrar que ambos arreglos reflejan el cambio.

```java
/*
 * Ejercicio 7 — Arreglo compartido (inventario)
 * Tema 2 — Variables por referencia
 */

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        double[] precios = new double[4];
        System.out.println("Ingrese 4 precios:");
        for (int i = 0; i < 4; i++) {
            System.out.print("Precio " + (i + 1) + ": ");
            precios[i] = sc.nextDouble();
        }

        double[] preciosAuditoria = precios;

        System.out.println("\n--- Corrección ---");
        System.out.print("Índice a corregir (0-3): ");
        int indice = sc.nextInt();
        System.out.print("Nuevo precio: ");
        double nuevoPrecio = sc.nextDouble();
        preciosAuditoria[indice] = nuevoPrecio;

        System.out.println("\n--- Arreglo precios ---");
        for (int i = 0; i < precios.length; i++) {
            System.out.println("precios[" + i + "] = " + precios[i]);
        }
        System.out.println("\n--- Arreglo preciosAuditoria ---");
        for (int i = 0; i < preciosAuditoria.length; i++) {
            System.out.println("preciosAuditoria[" + i + "] = " + preciosAuditoria[i]);
        }
        System.out.println("\nAmbos arreglos comparten la misma referencia: el cambio se ve en los dos.");

        sc.close();
    }
}
```

---

## Ejercicio 8

Copia real vs referencia: 3 notas en notas[], copia elemento a elemento en notasRespaldo[], modificar notas[0] y mostrar que notasRespaldo no cambió.

```java
/*
 * Ejercicio 8 — Copia real vs referencia
 * Tema 2 — Variables por referencia
 */

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        double[] notas = new double[3];
        System.out.println("Ingrese 3 calificaciones:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }

        double[] notasRespaldo = new double[3];
        for (int i = 0; i < 3; i++) {
            notasRespaldo[i] = notas[i];
        }

        System.out.print("\nNuevo valor para notas[0]: ");
        notas[0] = sc.nextDouble();

        System.out.println("\n--- Arreglo notas ---");
        for (int i = 0; i < notas.length; i++) {
            String msg = (i == 0) ? " <- cambió" : "";
            System.out.println("notas[" + i + "] = " + notas[i] + msg);
        }
        System.out.println("\n--- Arreglo notasRespaldo ---");
        for (int i = 0; i < notasRespaldo.length; i++) {
            String msg = (i == 0) ? " <- no cambió, es una copia independiente" : "";
            System.out.println("notasRespaldo[" + i + "] = " + notasRespaldo[i] + msg);
        }

        sc.close();
    }
}
```

---

## Ejercicio 9

String inmutable: nombre y alias = nombre; pedir nuevo alias, mostrar que nombre no cambió y explicar inmutabilidad de String.

```java
/*
 * Ejercicio 9 — String inmutable
 * Tema 2 — Variables por referencia
 */

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nombre:");
        String nombre = sc.nextLine();

        String alias = nombre;

        System.out.println("Ingrese un nuevo alias:");
        String nuevoAlias = sc.nextLine();
        alias = nuevoAlias;

        System.out.println("\nnombre = " + nombre + " <- no cambió");
        System.out.println("alias  = " + alias + " <- se actualizó con el nuevo valor");
        System.out.println("\nEn Java, String es inmutable: al asignar un nuevo valor a 'alias',");
        System.out.println("solo cambia la referencia; el objeto original 'nombre' sigue igual.");

        sc.close();
    }
}
```

---

## Ejercicio 11

Lista de pasajeros (lineal): cantidad de pasajeros (máximo 8), nombres, lista de asientos y asientos disponibles. Error si excede 8.

```java
/*
 * Ejercicio 11 — Lista de pasajeros (lineal)
 * Tema 3 — Estructuras lineales y no lineales
 */

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MAX_ASIENTOS = 8;

        System.out.println("¿Cuántos pasajeros tiene el vuelo? (máximo " + MAX_ASIENTOS + ")");
        int cantidad = sc.nextInt();
        sc.nextLine();

        if (cantidad > MAX_ASIENTOS) {
            System.err.println("Error: el número de pasajeros no puede exceder de " + MAX_ASIENTOS + ".");
            sc.close();
            return;
        }

        String[] nombres = new String[cantidad];
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Nombre del pasajero " + (i + 1) + ": ");
            nombres[i] = sc.nextLine();
        }

        System.out.println("\n--- Lista de pasajeros ---");
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Asiento " + (i + 1) + ": " + nombres[i]);
        }

        int asientosDisponibles = MAX_ASIENTOS - cantidad;
        System.out.println("\nAsientos disponibles: " + asientosDisponibles + " de " + MAX_ASIENTOS);

        sc.close();
    }
}
```

---

## Ejercicio 12

Registro de temperaturas (lineal): 7 temperaturas máximas por día, promedio semanal, día más caluroso, más frío y días por encima del promedio.

```java
/*
 * Ejercicio 12 — Registro de temperaturas (lineal)
 * Tema 3 — Estructuras lineales y no lineales
 */

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        String[] dias = { "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo" };
        double[] temperaturas = new double[7];

        System.out.println("Ingrese la temperatura máxima de cada día:");
        for (int i = 0; i < 7; i++) {
            System.out.print(dias[i] + ": ");
            temperaturas[i] = sc.nextDouble();
        }

        double suma = 0;
        for (int i = 0; i < 7; i++) {
            suma += temperaturas[i];
        }
        double promedio = suma / 7;

        int indiceCaluroso = 0;
        int indiceFrio = 0;
        for (int i = 1; i < 7; i++) {
            if (temperaturas[i] > temperaturas[indiceCaluroso]) indiceCaluroso = i;
            if (temperaturas[i] < temperaturas[indiceFrio]) indiceFrio = i;
        }

        System.out.println("\n--- Resultados ---");
        System.out.println("Promedio semanal: " + promedio);
        System.out.println("Día más caluroso: " + dias[indiceCaluroso] + " (" + temperaturas[indiceCaluroso] + "°)");
        System.out.println("Día más frío: " + dias[indiceFrio] + " (" + temperaturas[indiceFrio] + "°)");
        System.out.print("Días por encima del promedio: ");
        boolean primero = true;
        for (int i = 0; i < 7; i++) {
            if (temperaturas[i] > promedio) {
                if (!primero) System.out.print(", ");
                System.out.print(dias[i]);
                primero = false;
            }
        }
        if (primero) System.out.print("ninguno");
        System.out.println();

        sc.close();
    }
}
```

---

## Ejercicio 13

Buscar en lista (lineal): 5 nombres de empleados, pedir nombre a buscar y mostrar si fue encontrado y en qué posición.

```java
/*
 * Ejercicio 13 — Buscar en lista (lineal)
 * Tema 3 — Estructuras lineales y no lineales
 */

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] empleados = new String[5];
        System.out.println("Ingrese los nombres de 5 empleados:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Empleado " + (i + 1) + ": ");
            empleados[i] = sc.nextLine();
        }

        System.out.print("\nNombre a buscar: ");
        String nombreBuscar = sc.nextLine();

        int posicion = -1;
        for (int i = 0; i < 5; i++) {
            if (empleados[i].equalsIgnoreCase(nombreBuscar)) {
                posicion = i;
                break;
            }
        }

        if (posicion >= 0) {
            System.out.println("\"" + nombreBuscar + "\" encontrado en la posición " + (posicion + 1) + ".");
        } else {
            System.out.println("\"" + nombreBuscar + "\" no encontrado en la lista.");
        }

        sc.close();
    }
}
```

---

## Ejercicio 14

Ventas por sucursal (lineal): nombre y ventas de 5 sucursales; mostrar mayor, menor, total y porcentaje de cada una.

```java
/*
 * Ejercicio 14 — Ventas por sucursal (lineal)
 * Tema 3 — Estructuras lineales y no lineales
 */

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        String[] sucursales = new String[5];
        double[] ventas = new double[5];

        System.out.println("Ingrese nombre y ventas de cada sucursal:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Sucursal " + (i + 1) + " - Nombre: ");
            sucursales[i] = sc.nextLine();
            System.out.print("Sucursal " + (i + 1) + " - Ventas: ");
            ventas[i] = sc.nextDouble();
            sc.nextLine();
        }

        double total = 0;
        for (int i = 0; i < 5; i++) {
            total += ventas[i];
        }

        int indiceMayor = 0;
        int indiceMenor = 0;
        for (int i = 1; i < 5; i++) {
            if (ventas[i] > ventas[indiceMayor]) indiceMayor = i;
            if (ventas[i] < ventas[indiceMenor]) indiceMenor = i;
        }

        System.out.println("\n--- Resultados ---");
        System.out.println("Sucursal con más ventas: " + sucursales[indiceMayor] + " (" + ventas[indiceMayor] + ")");
        System.out.println("Sucursal con menos ventas: " + sucursales[indiceMenor] + " (" + ventas[indiceMenor] + ")");
        System.out.println("Total de la cadena: " + total);
        System.out.println("\nPorcentaje por sucursal:");
        for (int i = 0; i < 5; i++) {
            double porcentaje = total > 0 ? (ventas[i] / total) * 100 : 0;
            System.out.println("  " + sucursales[i] + ": " + porcentaje + "%");
        }

        sc.close();
    }
}
```

---

## Ejercicio 15

Árbol de decisiones (no lineal): pedir un entero y clasificarlo en Par positivo, Impar positivo, Cero o Negativo usando un árbol con nodos (descripcion, izquierdo, derecho).

```java
/*
 * Ejercicio 15 — Árbol de decisiones (no lineal)
 * Tema 3 — Estructuras lineales y no lineales
 */

import java.util.Scanner;

class NodoDecision {
    public String descripcion;
    public NodoDecision izquierdo;
    public NodoDecision derecho;

    public NodoDecision(String descripcion) {
        this.descripcion = descripcion;
        this.izquierdo = null;
        this.derecho = null;
    }
}

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        NodoDecision root = new NodoDecision("¿Número > 0?");
        root.derecho = new NodoDecision("¿Par o Impar?");
        root.derecho.izquierdo = new NodoDecision("Par positivo");
        root.derecho.derecho = new NodoDecision("Impar positivo");
        root.izquierdo = new NodoDecision("¿Es cero?");
        root.izquierdo.derecho = new NodoDecision("Cero");
        root.izquierdo.izquierdo = new NodoDecision("Negativo");

        System.out.println("Ingrese un número entero:");
        int n = sc.nextInt();

        NodoDecision actual = root;
        while (actual != null) {
            if (actual.izquierdo == null && actual.derecho == null) {
                System.out.println("Clasificación: " + actual.descripcion);
                break;
            }
            if (actual.descripcion.equals("¿Número > 0?")) {
                actual = n > 0 ? actual.derecho : actual.izquierdo;
            } else if (actual.descripcion.equals("¿Par o Impar?")) {
                actual = (n % 2 == 0) ? actual.izquierdo : actual.derecho;
            } else if (actual.descripcion.equals("¿Es cero?")) {
                actual = (n == 0) ? actual.derecho : actual.izquierdo;
            }
        }

        sc.close();
    }
}
```
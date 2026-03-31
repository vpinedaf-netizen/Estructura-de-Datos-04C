# Ejercicios_Estructura

## Ejercicio 1 — Ficha de un estudiante
//**Un sistema universitario necesita registrar la información básica de un 
// estudiante: nombre completo, código (número entero), semestre actual, promedio acumulado y si está matriculado o no.

//Declara las variables con los tipos de datos apropiados.
//Asigna valores de ejemplo.
//Imprima un informe por consola con el siguiente formato:

// === Ficha del Estudiante ===
//Nombre: Ana Torres
//Código: 20241001
//Semestre: 3
//Promedio: 3.85
//Matriculado: true

public class Ejericio1 {
    public static void main(String[] args) {
        String nombreCompleto = "Ana Torres";
        int codigo = 20241001;
        int semestre = 3;
        double promedio = 3.85;
        boolean matriculado = true;

        System.out.println("=== Ficha del Estudiante ===");
        System.out.println("Nombre: " + nombreCompleto);
        System.out.println("Código: " + codigo);
        System.out.println("Semestre: " + semestre);
        System.out.println("Promedio: " + promedio);
        System.out.println("Matriculado: " + matriculado);
    }
}

## Ejercicio 2 — Calculadora de una tienda
 //Una tienda de barrio vende productos al por menor. El cajero necesita calcular:

//Precio unitario de un producto ( double)
//Cantidad comprada ( int)
//Descuento aplicado en porcentaje ( double)
//Total a pagar después del descuento
//Declara las variables, realiza el cálculo y muestra el resultado por consola.

public class Ejericio2 {
    public static void main(String[] args) {
        double precioUnitario = 15000.0;
        int cantidad = 5;
        double descuento = 10.0;

        double subtotal = precioUnitario * cantidad;
        double valorDescuento = subtotal * (descuento / 100);
        double totalPagar = subtotal - valorDescuento;

        System.out.println("=== Calculadora de Tienda ===");
        System.out.println("Precio unitario: " + precioUnitario);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Descuento: " + descuento + "%");
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Valor descuento: " + valorDescuento);
        System.out.println("Total a pagar: " + totalPagar);
    }
}

## Ejercicio 3 — Sensor de temperatura

//Un sensor industrial registra temperaturas. El sistema recibe:

//Temperatura actual en Celsius ( double)
//Nombre del sensor ( String)
//Número de lectura ( int)
//Si la temperatura supera el límite de 80°C, debe ser una booleanllamada variable .enAlarmatrue
//Imprime el estado del sensor con todos sus datos.

public class Ejericio3 {
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

## Ejercicio 4 — Placa de un vehículo
//El RUNT almacena datos básicos de vehículos. Modela la información de un carro con:

//Placa ( String)
//Año de fabricación ( int)
//Cilindraje en cc ( int)
//Precio de compra ( double)
//Inicial del color ( char)
//Si tiene SOAT vigente ( boolean)
//Muestra todos los datos en consola.

public class Ejericio4 {
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

## Ejercicio 5 — Conversor de unidades
//Una aplicación de cocina necesita convertir unidades:

//Declara una variable tazas( double) con la cantidad de tazas de un ingrediente.
//Convierte a mililitros (1 taza = 236,588 ml) y guarda el resultado en otra variable.
//Convierte también a litros.
//Muestra las tres medidas por consola.

public class Ejericio5 {
    public static void main(String[] args) {
        double tazas = 3.5;
        double mililitros = tazas * 236.588;
        double litros = mililitros / 1000;

        System.out.println("=== Conversor de Unidades ===");
        System.out.println("Tazas: " + tazas);
        System.out.println("Mililitros: " + mililitros);
        System.out.println("Litros: " + litros);
    }
}
## Ejercicio 6 — Turno en un banco 
//Un cajero de banco trabaja con el número del turno actual. Se crea una variable turnoActualy se asigna a turnoEnPantalla.

//Demuestra con código que cambiar turnoEnPantalla no afecta a turnoActual(comportamiento por valor).
//Explique en un comentario por qué ocurre esto.

public class Ejercicio6{
    public static void main(String[] args) {
        int turnoActual = 18;
        int turnoEnPantalla =  turnoActual;

        turnoEnPantalla = 45;

        System.out.println("=== Turno en un banco ===");
        System.out.println("Turno Actual: " + turnoActual);
        System.out.println("Turno en pantalla: " + turnoEnPantalla);
        
        //**Porque int es un tipo primitivo y en Java los tipos primitivos se copian por valor.
        //Java crea una copia independiente del valor (15) */

    }    
} 
## Ejercicio 7 — Inventario compartido
//Un almacén tiene un arreglo con el stock de 5 productos. El sistema de ventas y el sistema de informes apuntan al mismo arreglo .

public class Ejercico7 {
    public static void main(String[] args) {
        int[] stockAlmacen = {1,18,0,6,2};
        int[] stockReportes = stockAlmacen;

        stockReportes[4] -= 5;
        System.out.println("Stock desde almacen:");
        for (int stock : stockAlmacen) {
            System.out.print(stock + " ");
        }

        System.out.println("\nStock desde reportes:");
        for (int stock : stockReportes) {
            System.out.print(stock + " ");
            
        }
    }
//*Ambas variables apuntan al mismo espacio en memoria. Por eso, al modificar 
// stockReportes, también cambia stockAlmacen. */
    
}

## Ejercicio 8 — Historial de mensajes
//Un chat guarda el último mensaje enviado. Se usan dos variables String:

//ultimoMensaje = "Hola"
//copiaTexto = ultimoMensaje
//Luego copiaTextose cambia a"¿Cómo estás?"
//Muestra ambas variables y explica en un comentario por qué ultimoMensaje no cambió 
// (inmutabilidad de String).
public class Ejercicio8 {
    public static void main(String[] args) {
        String ultimoMensaje = "Hola";
        String copiaTexto = ultimoMensaje;

       copiaTexto = "¿Cómo estás?";

        System.out.println("=== Historial de mensajes ===");
        System.out.println("ultimoMensaje: " + ultimoMensaje);
        System.out.println("copiaTexto: " + copiaTexto);
    }
}
//*Los String son inmutables en Java.
//Al cambiar copiaTexto, se 
//crea un nuevo objeto en memoria, y el original (ultimoMensaje) no se modifica. */

## Ejercicio 9 — Notas de un curso */
//Un profesor tiene las notas de 4 estudiantes en un arreglo. 
// El coordinador recibe una referencia al mismo arreglo para revisarlas.

//El coordinador corrige la nota del estudiante 2 (índice 1) de 2.5a 3.0.
//Muestra que el arreglo del profesor también refleja el cambio .
//Agregue comentarios explicando el concepto de referencia en memoria.

public class Ejercicio9 {
    public static void main(String[] args) {
        double[] Notasprofesor = {1.5,2.5,3.0,4.5};
        double[] Notascoordinador = Notasprofesor;

        Notascoordinador[1] = 3.0;
        System.out.println("Notas profesor:");
        for (double Notas : Notasprofesor) {
            System.out.print(Notas + " ");
        }

        System.out.println("\nNotas de coordinador:");
        for (double Notas : Notascoordinador) {
            System.out.print(Notas+ " ");
            
        }
    }
    
}
 //*Ambas variables apuntan al mismo espacio en memoria. Por eso, al modificar 
// stockReportes, también cambia stockAlmacen. */

## Ejercicio 10 — Copiando configuración
//Una aplicación tiene un objeto int[] configuracion = {1920, 1080, 60}(resolución y FPS).

//Crea una copia real del arreglo (no una referencia) usando un nuevo arreglo y 
// copiando elemento por elemento.
//Modifica la copia y demuestra que el original no cambia .
//Comenta la diferencia con la asignación directa.

public class Ejercicio10 {
    public static void main(String[] args) {
        int[] Configuracion = {1920, 1080, 60};
        int[] copiaConfiguracion = new int[Configuracion.length];

        for(int i = 0; i < Configuracion.length; i++){
            copiaConfiguracion[i] = Configuracion[i];

        }

        copiaConfiguracion[2] = 144;
        System.out.println("configuracion:");
        for (int ajustes : Configuracion) {
            System.out.print(ajustes + " ");
        }

        System.out.println("\ncopiaConfiguracion:");
        for (int copia : copiaConfiguracion) {
            System.out.print(copia + " ");
            
        }
    }

    
}
//Aquí sí hicimos una copia real. Creamos un nuevo arreglo con "new" y copiamos cada elemento. Por eso, 
// al modificar copiaConfiguracion, el arreglo original configuracion NO cambia.



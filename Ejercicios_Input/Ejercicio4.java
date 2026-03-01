package Ejercicios_Input;
//Ejercicio 4 — Perfil de usuario
//Pide al usuario los datos de su perfil: nombre, edad, ciudad, correo y si acepta términos y condiciones. Muestra un resumen indicando el tipo de dato que se usó para cada campo.

//Datos de entrada: String, int, String, String, boolean

//Salida esperada:

//========= Perfil creado =========
//Nombre  (String)  : Ana Pérez
//Edad    (int)     : 22
//Ciudad  (String)  : Bogotá
//Correo  (String)  : ana@mail.com
//T&C     (boolean) : true

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
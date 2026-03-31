//una banco registra transacciones.tienes una lista de cuentas Vip ordenada ej:(10,25,40,80,150)
//-Entrada de datos :El usuario debe ingresar los montos y los numeros de cuenta de las ultimas 
//5 transcciones del cajero automatico.
//el Reto:
//busca linealmente cualquier tra|
package Corte_1.RETO_2;


import java.util.Scanner;
import java.util.Arrays;

public class reto2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lista ordenada de cuentas VIP
        int[] cuentasVIP = {10, 25, 40, 80, 150};

        // Arreglos para almacenar datos de las 5 transacciones
        double[] montos = new double[5];
        int[] cuentas = new int[5];

        System.out.println("=== Entrada de Transacciones ===");
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el número de cuenta #" + (i + 1) + ": ");
            cuentas[i] = sc.nextInt();
            System.out.print("Ingrese el monto de la transacción #" + (i + 1) + ": ");
            montos[i] = sc.nextDouble();
        }

        System.out.println("\n=== Análisis de Transacciones ===");

        // Búsqueda lineal: detectar montos mayores a $5000
        for (int i = 0; i < 5; i++) {
            if (montos[i] > 5000) {
                // Búsqueda binaria: verificar si la cuenta es VIP
                int resultado = Arrays.binarySearch(cuentasVIP, cuentas[i]);
                if (resultado < 0) { // No encontrada
                    System.out.println("Alerta de fraude: Cuenta " + cuentas[i] +
                                       " no autorizada para montos altos ($" + montos[i] + ").");
                } else {
                    System.out.println("Transacción aprobada. Cuenta VIP #" + cuentas[i] +
                                       " con monto $" + montos[i]);
                }
            }
        }

        sc.close();
    }
}
    
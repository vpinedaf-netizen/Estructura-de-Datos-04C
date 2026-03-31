//Sensor de Temperatura (Control de Calidad)
//Una máquina industrial registra la temperatura cada 10 minutos y guarda 
// los datos en un arreglo.

//El Problema: Al final del día, el supervisor quiere saber cuál fue la temperatura 
// más alta registrada para asegurarse de que la máquina no se recalentó.
//Algoritmo a usar: Búsqueda Lineal de Máximo . Debes recorrer todo el arreglo 
// comparando cada valor para encontrar el mayor de todos.

public class Ejercicio_Arreglo3 {
    public static void main(String[] args) {
        // Arreglo con las temperaturas registradas cada 10 minutos
        double[] temperaturas = {35.2, 36.5, 37.1, 39.0, 38.4, 37.8, 40.3, 39.5};

        // Inicializamos el máximo con el primer valor
        double maxTemp = temperaturas[0];

        // Recorremos el arreglo para buscar el valor máximo
        for (int i = 1; i < temperaturas.length; i++) {
            if (temperaturas[i] > maxTemp) {
                maxTemp = temperaturas[i];
            }
        }

        // Mostramos el resultado
        System.out.println("La temperatura más alta del día fue: " + maxTemp + " °C");
    }
}

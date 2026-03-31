package  Corte_1.EjerciciosBasicos1;
//*Ejercicio 9 — Notas de un curso */
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

package Corte_2.Ejercicios_Listas_Circulares_Dobles.Ejercicio_2_Listas_Circulares_Dobles;

 class Comando {
    String texto;
    boolean exitoso;
    String directorio;

    Comando siguiente;
    Comando anterior;

    public Comando(String texto, boolean exitoso, String directorio) {
        this.texto = texto;
        this.exitoso = exitoso;
        this.directorio = directorio;
    }
}   


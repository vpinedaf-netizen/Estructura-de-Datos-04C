package Corte_3.Ejercicios_Cola.Ejercicio_3_Cola;

public class Documento {

    private String nombreArchivo;
    private String usuario;
    private int numeroPaginas;
    private boolean esColor;

    public Documento(String nombreArchivo, String usuario, int numeroPaginas, boolean esColor) {
        this.nombreArchivo = nombreArchivo;
        this.usuario = usuario;
        this.numeroPaginas = numeroPaginas;
        this.esColor = esColor;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public String getUsuario() {
        return usuario;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public boolean isEsColor() {
        return esColor;
    }

    @Override
    public String toString() {

        String tipo;

        if (esColor) {
            tipo = "Sí";
        } else {
            tipo = "No";
        }

        return "\nArchivo: " + nombreArchivo +
               "\nUsuario: " + usuario +
               "\nNúmero de páginas: " + numeroPaginas +
               "\nImpresión a color: " + tipo;
    }
}

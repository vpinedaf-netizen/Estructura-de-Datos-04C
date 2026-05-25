package Corte_3.Ejercicios_Cola.Ejercicio_1_Cola;

public class Llamada {

    private String idLlamada;
    private String nombreCliente;
    private String motivoConsulta;
    private int duracionEstimadaMinutos;

    public Llamada(String idLlamada, String nombreCliente,
                   String motivoConsulta, int duracionEstimadaMinutos) {

        this.idLlamada = idLlamada;
        this.nombreCliente = nombreCliente;
        this.motivoConsulta = motivoConsulta;
        this.duracionEstimadaMinutos = duracionEstimadaMinutos;
    }

    public String getIdLlamada() {
        return idLlamada;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public int getDuracionEstimadaMinutos() {
        return duracionEstimadaMinutos;
    }

    @Override
    public String toString() {

        return "\nID Llamada: " + idLlamada +
               "\nCliente: " + nombreCliente +
               "\nMotivo: " + motivoConsulta +
               "\nDuración estimada: " + duracionEstimadaMinutos + " minutos";
    }
}

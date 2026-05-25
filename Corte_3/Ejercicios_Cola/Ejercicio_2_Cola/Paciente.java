package Corte_3.Ejercicios_Cola.Ejercicio_2_Cola;

public class Paciente {

    private String cedula;
    private String nombreCompleto;
    private int edad;
    private String sintomaPrincipal;

    public Paciente(String cedula, String nombreCompleto, int edad, String sintomaPrincipal) {
        this.cedula = cedula;
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.sintomaPrincipal = sintomaPrincipal;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public int getEdad() {
        return edad;
    }

    public String getSintomaPrincipal() {
        return sintomaPrincipal;
    }

    @Override
    public String toString() {
        return "\nCédula: " + cedula +
               "\nNombre: " + nombreCompleto +
               "\nEdad: " + edad +
               "\nSíntoma principal: " + sintomaPrincipal;
    }
}

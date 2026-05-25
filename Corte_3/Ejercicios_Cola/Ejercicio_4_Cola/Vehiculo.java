package Corte_3.Ejercicios_Cola.Ejercicio_4_Cola;

public class Vehiculo {

    private String placa;
    private String tipoVehiculo;
    private double tarifa;
    private boolean esExento;

    public Vehiculo(String placa, String tipoVehiculo, double tarifa, boolean esExento) {
        this.placa = placa;
        this.tipoVehiculo = tipoVehiculo;
        this.tarifa = tarifa;
        this.esExento = esExento;
    }

    public String getPlaca() {
        return placa;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public double getTarifa() {
        return tarifa;
    }

    public boolean isEsExento() {
        return esExento;
    }

    @Override
    public String toString() {

        String exento;

        if (esExento) {
            exento = "Sí";
        } else {
            exento = "No";
        }

        return "\nPlaca: " + placa +
               "\nTipo de vehículo: " + tipoVehiculo +
               "\nTarifa: $" + tarifa +
               "\n¿Es exento?: " + exento;
    }
}

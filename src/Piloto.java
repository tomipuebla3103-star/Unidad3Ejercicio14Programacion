public class Piloto {
    private String numeroLicencia;
    private String nombre;
    private double horasVueloAcumuladas;

    public Piloto(String numeroLicencia, String nombre) {
        this.numeroLicencia = numeroLicencia;
        this.nombre = nombre;
        this.horasVueloAcumuladas = 0;
    }

    public void registrarVuelo(double horas) {
        if (horas > 0) {
            horasVueloAcumuladas = horasVueloAcumuladas + horas;
            System.out.println("Vuelo registrado correctamente");
        } else {
            System.out.println("Cantidad de horas invalida");
        }
    }

    public double getHorasVueloAcumuladas() {
        return horasVueloAcumuladas;
    }

    public String getNombre() {
        return nombre;
    }
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Piloto piloto = new Piloto("LIC123", "Tomi");

    piloto.registrarVuelo(3.5);
    piloto.registrarVuelo(5);
    piloto.registrarVuelo(2.5);
    piloto.registrarVuelo(-2);
    piloto.registrarVuelo(0);

    System.out.println();
    System.out.println("Piloto: " + piloto.getNombre());
    System.out.println("Total de horas de vuelo: " + piloto.getHorasVueloAcumuladas());
}

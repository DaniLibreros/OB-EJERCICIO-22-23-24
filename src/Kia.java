public class Kia extends Coche {

    Kia (String marca, String tipoDeCarburador, String color, int numeroDePuertas){
        this.marca = marca;
        this.tipoDeCarburador = tipoDeCarburador;
        this.color = color;
        this.numeroDePuertas = numeroDePuertas;

    }

    @Override
    int getPrecioCoche() {
        return 5698;
    }

    @Override
    boolean hadKitRoad() {
        return false;
    }
}

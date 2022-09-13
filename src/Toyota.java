public class Toyota extends Coche {
    boolean radio;

    Toyota(String marca, String tipoDeCarburador, String color, int numeroDePuertas, boolean radio) {
        this.marca = marca;
        this.tipoDeCarburador = tipoDeCarburador;
        this.color = color;
        this.numeroDePuertas = numeroDePuertas;
        this.radio = radio;
    }

    @Override
    int getPrecioCoche() {
        return 23000;
    }

    @Override
    boolean hadKitRoad() {
        return true;
    }
}

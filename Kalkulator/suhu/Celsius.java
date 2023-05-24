package Kalkulator.suhu;

public class Celsius extends Suhu {
    public Celsius(double value) {
        super(value);
    }

    @Override
    public double toCelsius() {
        return getNilai();
    }

    @Override
    public double toFahrenheit() {
        return (getNilai() * 9 / 5) + 32;
    }

    @Override
    public double toKelvin() {
        return getNilai() + 273.15;
    }

    @Override
    public double toReamur() {

        return getNilai() * 4 / 5;
    }

}

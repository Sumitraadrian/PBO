package Kalkulator.suhu;

public class Reamur extends Suhu {
    public Reamur(double value) {
        super(value);
    }

    @Override
    public double toCelsius() {
        return getNilai() * 5 / 4;
    }

    @Override
    public double toFahrenheit() {
        return (getNilai() * 9 / 4) + 32;
    }

    @Override
    public double toKelvin() {
        return (getNilai() * 5 / 4) + 273.15;
    }

    @Override
    public double toReamur() {
        return getNilai();
    }
}
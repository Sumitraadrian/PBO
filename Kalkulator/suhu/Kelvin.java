package Kalkulator.suhu;

public class Kelvin extends Suhu {
    public Kelvin(double value) {
        super(value);
    }

    @Override
    public double toCelsius() {
        return getNilai() - 273.15;
    }

    @Override
    public double toFahrenheit() {
        return (getNilai() * 9 / 5) - 459.67;
    }

    @Override
    public double toKelvin() {
        return getNilai();
    }

    @Override
    public double toReamur() {
        return (getNilai() - 273.15) * 4 / 5;
    }
}
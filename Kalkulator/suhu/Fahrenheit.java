package Kalkulator.suhu;

public class Fahrenheit extends Suhu {
    public Fahrenheit(double value) {
        super(value);
    }

    @Override
    public double toCelsius() {
        return (getNilai() - 32) * 5 / 9;
    }

    @Override
    public double toFahrenheit() {
        return getNilai();
    }

    @Override
    public double toKelvin() {
        return (getNilai() + 459.67) * 5 / 9;
    }

    @Override
    public double toReamur() {
        return (getNilai() - 32) * 4 / 9;
    }
}
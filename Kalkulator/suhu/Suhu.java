package Kalkulator.suhu;

public abstract class Suhu {
    private double value;
    public abstract double toCelsius();
    public abstract double toFahrenheit();
    public abstract double toKelvin();
    public abstract double toReamur();

    public Suhu(double value) {
        this.value = value;
    }

    public double getNilai() {
        return value;
    }

    public void setNilai(double value) {
        this.value = value;
    }

}

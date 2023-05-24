package Kalkulator.waktu;

public class Hari extends Waktu {
    public Hari(int time) {
        super(time);
    }

    @Override
    public double toDetik() {
        return getTime() * 86400.0;
    }

    @Override
    public double toMenit() {
        return getTime() * 1440.0;
    }

    @Override
    public double toJam() {
        return getTime() * 24.0;
    }

    @Override
    public double toMinggu() {
        return getTime() / 7.0;
    }
}
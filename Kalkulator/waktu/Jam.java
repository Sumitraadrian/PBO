package Kalkulator.waktu;


public class Jam extends Waktu {
    public Jam(int time) {
        super(time);
    }

    @Override
    public double toDetik() {
        return getTime() * 3600.0;
    }

    @Override
    public double toMenit() {
        return getTime() * 60.0;
    }

    @Override
    public double toHari() {
        return getTime() / 24.0;
    }

    @Override
    public double toMinggu() {
        return getTime() / 168.0;
    }
}

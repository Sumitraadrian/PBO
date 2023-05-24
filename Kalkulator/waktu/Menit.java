package Kalkulator.waktu;

public class Menit extends Waktu {

    public Menit(double time) {
        super(time);
    }

    @Override
    public double toDetik() {
        return getTime() * 60.0;
    }

    @Override
    public double toJam() {
        return getTime() / 60.0;
    }

    @Override
    public double toHari() {
        return getTime() / 1440.0;
    }

    @Override
    public double toMinggu() {
        return getTime() / 10080.0;
    }
}

package Kalkulator.waktu;

public class Detik extends Waktu {
    public Detik(int time) {
        super(time);
    }

    @Override
    public double toMenit() {
        return getTime() / 60.0;
    }

    @Override
    public double toJam() {
        return getTime() / 3600.0;
    }

    @Override
    public double toHari() {
        return getTime() / 86400.0;
    }

    @Override
    public double toMinggu() {
        return getTime() / 604800.0;
    }
}

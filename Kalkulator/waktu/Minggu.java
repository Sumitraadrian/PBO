package Kalkulator.waktu;

public class Minggu extends Waktu {
    public Minggu(int time) {
        super(time);
    }

    @Override
    public double toDetik() {
        return getTime() * 604800.0;
    }

    @Override
    public double toMenit() {
        return getTime() * 10080.0;
    }

    
    @Override
    public double toJam() {
        return getTime() * 168.0;
    }

    @Override
    public double toHari() {
        return getTime() * 7.0;
    }
}

package src;

public class balok extends BangunRuang {
    float Panjang;
    float lebar;
    float tinggi;

    @Override
    double Volume() {
        double Volume = Panjang * lebar * tinggi;
        System.out.println("Volume Balok :" + Volume);
        return Volume;
    }
}

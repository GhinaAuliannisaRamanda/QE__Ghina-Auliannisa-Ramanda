package src;

public class kubus extends BangunRuang {
    static float sisi;

    @Override
    double Volume() {
        double Volume = sisi * sisi * sisi * sisi;
        System.out.println("Volume Kubus :" + Volume);
        return Volume;
    }
}



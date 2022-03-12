package src;

public class tabung extends BangunRuang {
    float r;
    float t;

    @Override
    double Volume() {
        double Volume = 3.14 * r *r * t;
        System.out.println("Volume Balok :" + Volume);
        return Volume;
    }
}

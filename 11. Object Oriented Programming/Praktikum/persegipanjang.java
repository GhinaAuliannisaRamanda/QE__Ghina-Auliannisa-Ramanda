package src;

public class persegipanjang extends BangunDatar {
    float panjang;
    float lebar;

    @Override
    double luas() {
        double luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang :" + luas);
        return luas;
    }

    @Override
    float keliling() {
        float keliling = 2 * panjang * 2* lebar;
        System.out.println("Luas Persegi Panjang :" + keliling);
        return keliling;
    }
}

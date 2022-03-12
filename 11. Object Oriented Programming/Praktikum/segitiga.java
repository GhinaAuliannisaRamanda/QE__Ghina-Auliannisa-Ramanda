package src;

public class segitiga extends BangunDatar {
    float alas;
    float tinggi;
    float sisi;

    @Override
    double luas() {
        double luas = 0.5 * (alas * tinggi);
        System.out.println("Luas Segitiga :" + luas);
        return luas;
    }
    @Override
    float keliling(){
        float keliling = alas + tinggi + sisi;
        System.out.println("Keliling Segitiga : " + keliling);
        return keliling;
    }
}

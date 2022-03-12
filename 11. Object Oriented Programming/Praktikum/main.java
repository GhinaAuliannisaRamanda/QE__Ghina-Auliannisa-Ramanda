package src;

public class main {
    public static void main(String[] args) {
        // objek bangun datar
        BangunDatar bangunDatar = new BangunDatar();

        // objek persegi dan nilai
        persegi persegi = new persegi();
        persegi.sisi = 4;

        // objek segitiga dan nilai
        segitiga msegitiga = new segitiga();
        msegitiga.alas = 3;
        msegitiga.tinggi = 4;
        msegitiga.alas = 6;

        // objek persegi panjang
        persegipanjang persegipanjang = new persegipanjang();
        persegipanjang.panjang = 7;
        persegipanjang.lebar = 8;

        bangunDatar.luas();
        bangunDatar.keliling();

        persegi.luas();
        persegi.keliling();

        msegitiga.luas();
        msegitiga.keliling();

        persegipanjang.luas();
        persegipanjang.keliling();

    }
}

package src;

public class mainbangunruang {
    public static void main(String[] args) {
        // objek bangun ruang
        BangunRuang bangunRuang = new BangunRuang();

        // objek kubus dan nilai
        kubus Kubus = new kubus();
        Kubus.sisi= 10;

        // objek balok dan nilai
        balok Balok = new balok();
        Balok.Panjang = 3;
        Balok.lebar = 6;
        Balok.tinggi = 10;

        // objek persegi tabung
        tabung Tabung = new tabung();
        Tabung.r = 7;
        Tabung.t = 10;

        bangunRuang.Volume();
        Kubus.Volume();
        Balok.Volume();
        Tabung.Volume();
    }
}

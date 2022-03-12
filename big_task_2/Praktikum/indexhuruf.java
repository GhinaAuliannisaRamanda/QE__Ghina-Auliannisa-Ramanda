import java.util.Scanner;

//dapat menggunakan multi dimensional array tidak perlu menggunakan oop
public class indexhuruf {
    public static void main(String[] args) {
        int HasilKolom = 0;
        int HasilBaris = 0;
        //tambah lagi
        char[][] tabelHuruf = {{'A', 'B', 'C', 'D', 'E'}, {'F', 'G', 'H', 'I', 'J'},{'L','M','N','O','P'},{'Q','R','S','T','U'},{'V','W','X','Y','Z'}};
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Huruf ");
        //biar ngebaca semua huruf kecil menjadi besar
        char Huruf = input.nextLine().toUpperCase().charAt(0);
        if (Huruf == 'K'){
            Huruf = 'C';
        }

        for (int Baris = 0; Baris < tabelHuruf.length; ++Baris) {
            for (int Kolom = 0; Kolom < tabelHuruf[Baris].length; ++Kolom){
                if (Huruf == tabelHuruf[Baris][Kolom] ){
                    HasilKolom = Kolom;
                    HasilBaris = Baris;
                }
            }
        }
        System.out.println((HasilKolom + 1) + " " + (HasilBaris + 1));
        input = new Scanner(System.in);
        System.out.print("Masukkan Huruf ");
        //biar ngebaca semua huruf kecil menjadi besar
        Huruf = input.nextLine().toUpperCase().charAt(0);
        if (Huruf == 'K'){
            Huruf = 'C';
        }

        for (int Baris = 0; Baris < tabelHuruf.length; ++Baris) {
            for (int Kolom = 0; Kolom < tabelHuruf[Baris].length; ++Kolom){
                if (Huruf == tabelHuruf[Baris][Kolom] ){
                    HasilKolom = Kolom;
                    HasilBaris = Baris;
                }
            }
        }
        System.out.println((HasilKolom + 1) + " " + (HasilBaris + 1));
        input = new Scanner(System.in);
        System.out.print("Masukkan Huruf ");
        //biar ngebaca semua huruf kecil menjadi besar
        Huruf = input.nextLine().toUpperCase().charAt(0);
        if (Huruf == 'K'){
            Huruf = 'C';
        }

        for (int Baris = 0; Baris < tabelHuruf.length; ++Baris) {
            for (int Kolom = 0; Kolom < tabelHuruf[Baris].length; ++Kolom){
                if (Huruf == tabelHuruf[Baris][Kolom] ){
                    HasilKolom = Kolom;
                    HasilBaris = Baris;
                }
            }
        }
        System.out.println((HasilKolom + 1) + " " + (HasilBaris + 1));
    }
}
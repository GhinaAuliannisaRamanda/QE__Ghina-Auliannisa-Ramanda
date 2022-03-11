import java.util.*;

class tabelPerkalian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\t cetak tabel perkalian \n");
        System.out.print("Masukkan angka: ");
        int n = input.nextInt();


        for (int i = 1; i <= n; i++) {

            for(int j = 1; j <=10; j++){

                System.out.print(" " + i * j + " ");
            }
            System.out.print("\n\n");
        }
    }
}
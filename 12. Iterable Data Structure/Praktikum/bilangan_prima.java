
import java.util.Scanner;
public class bilangan_prima {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int Angka, checker = 0;
        // main
        System.out.println("Program Bilangan Prima");
        System.out.print("Masukkan Angka : ");
        Angka = input.nextInt();

        System.out.println("-----------------------------");

        for (int i = 2; i <= Angka; i++) {
            if (Angka % i == 0) {
                checker++;
            }
        }
        if (checker == 1) {
            System.out.print(Angka + " Merupakan bilangan prima");
        } else {
            System.out.println(Angka + " Bukan bilangan prima");
        }
    }
}

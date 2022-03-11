import java.util.Scanner;
class drawXYZ
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Matrix: ");
        int n = in.nextInt();

        if (n < 1 || n > 10) {
                System.out.println("Masukkan Jumlah <10 !");
                return;
        }
        char ch1 = 'X', ch2 = 'Y', ch3= 'Z';
        char m[][] = new char[n][n];
        char x = ch2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || (i + j) == n - 1) {
                    m[i][j] = ch3;
                }
                else if (i == 0 || i == n - 1) {
                    m[i][j] = ch1;
                }
                else if (j == 0 || j == n - 1 || i % 2 == 0) {
                    m[i][j] = ch2;
                }
                else {
                    m[i][j] = ch1;
                }
            }
        }

        System.out.println("Hasil:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

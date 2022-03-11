import java.util.*;

class Exponentiation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nilai X : ");
        int x = input.nextInt();
        System.out.println("Nilai N: ");
        int n = input.nextInt();
        System.out.println(x + " pangkat " + n + " adalah " +
                (int) Math.pow(x, n));
    }
}

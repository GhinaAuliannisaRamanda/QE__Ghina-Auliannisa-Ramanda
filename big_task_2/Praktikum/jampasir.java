//import java.util.*;
//
//public class jampasir {
//    public static void main(String[] args) {
//        Scanner input=new Scanner(System.in);
//        System.out.print("Program Jam Pasir\n");
//        System.out.print("Masukkan Input : ");
//        int n = input.nextInt();
//        for (int i = 2; i <= n; i++){
//            for (int j = 1; j <= i; j++) {
//                System.out.print(' ');
//            }
//            for (int k = n; k >= i; k--){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for (int i = 1; i <= n; i++){
//            for (int j = n; j >= i; j--) {
//                System.out.print(' ');
//            }
//            for (int k = 1; k <= i; k++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//    }
//}

import java.util.*;

public class jampasir {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Program Jam Pasir\n");
        System.out.print("Masukkan Input : ");
        int n = input.nextInt();
        for (int i = 1; i <= n - 1; i++){
            for (int j = 1; j <= i; j++) {
                System.out.print(' ');
            }
            for (int k = n; k >= i; k--){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++){
            for (int j = n ; j >= i; j--) {
                System.out.print(' ');
            }
            for (int k = 1; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}

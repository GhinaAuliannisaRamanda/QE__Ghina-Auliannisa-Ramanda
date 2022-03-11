package com.company;
import java.util.Scanner;

public class faktorbilangan2 {
    public static void main (String[] args) {
        int bilangan;
        Scanner j = new Scanner(System. in );
        System.out.println("Masukkan angka");
        bilangan = j.nextInt();
        System.out.println("Faktornya yaitu :");
        for (int k = bilangan; k <= bilangan; k--)
        {
            if (bilangan % k == 0) {
                System.out.print(k + " ");
            }
        }
    }
}
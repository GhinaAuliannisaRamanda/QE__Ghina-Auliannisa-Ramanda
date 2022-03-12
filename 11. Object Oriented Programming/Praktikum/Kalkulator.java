package src;

import java.util.Scanner;

class Kalkulator {
  public static void main(String[] args) {

    char operator;
    Double angka1, angka2, hasil;

    // membuat project Scanner class
    Scanner input = new Scanner(System.in);

    System.out.println("angka pertama");
    angka1 = input.nextDouble();

    System.out.println("Pilih Operasi : +, -, *, or /");
    operator = input.next().charAt(0);

    System.out.println("angka kedua");
    angka2 = input.nextDouble();

    switch (operator) {

      // tambah
      case '+':
        hasil = angka1 + angka2;
        System.out.println("Penjumlahan");
        System.out.println(angka1 + " + " + angka2 + " = " + hasil);
        break;

      // kurang
      case '-':
        hasil = angka1 - angka2;
        System.out.println("Pengurangan");
        System.out.println(angka1 + " - " + angka2 + " = " + hasil);
        break;

      // kali
      case '*':
        hasil = angka1 * angka2;
        System.out.println("Perkalian");
        System.out.println(angka1 + " * " + angka2 + " = " + hasil);
        break;

      // bagi
      case '/':
        hasil = angka1 / angka2;
        System.out.println("Pembagian");
        System.out.println(angka1 + " / " + angka2 + " = " + hasil);
        break;

      default:
        System.out.println("Invalid operator!");
        break;
    }

    input.close();
  }
}

package com.ongkoskirim;

import java.util.Scanner;

class Ongkos {
	public static float p, l, t, k, b, hasil1, hasil2;

	public static float volber(float p, float l, float t) {
		hasil1 = (p * l * t); 

		if(hasil1<50){
			hasil1 = 1;
		}
		else if(hasil1>50){
			hasil1=hasil1/50;
			Math.ceil(hasil1);
		}
		hasil2 = hasil1 * 5000; 
		System.out.println("Dimensi Barang:   \n"+ hasil1); 
		System.out.println("Ongkos Kirim Rp. " +hasil2); 
		return 0;
	}

	public static void main(String[] args) {
		System.out.println("Menghitung Ongkos Kirim Dengan Dimensi \n");
		System.out.print("Masukan Panjang = ");
		p = sc.nextFloat(); //input panjang
		System.out.print("Masukan Lebar   = ");
		l = sc.nextFloat(); //input lebar
		System.out.print("Masukan Tinggi  = ");
		t = sc.nextFloat(); //input tinggi
		System.out.print("Masukan Berat  = ");
		b = sc.nextFloat(); //input tinggi

		volber(p, l, t); //pemanggilan parameter untuk menghitung
	}

	public final static Scanner sc = new Scanner(System.in);
}

public class OngkosKirim {
    public static void main(String[] args) {
    }
}

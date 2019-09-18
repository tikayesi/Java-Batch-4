package com.enigma.latihan3;

import java.util.Scanner;

public class LatihanFunctions {
	
	public static void main(String[] test) {
		// TODO Auto-generated method stub
		
		LatihanFunctions latihan = new LatihanFunctions();
		System.out.println(latihan.stringFunction());
		System.out.println(latihan.penjumlahan(12, 3));
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan bilangan : ");
//		int bil = input.nextInt();
//		int bil = 20;
		System.out.println("Apakah bilangan yang anda masukkan = 1 ? "+latihan);

	}
	
	public String stringFunction() {
		return "Ini function yang mengembalikan string";
	}
	
	int penjumlahan(int a, int b) {
		int hasil = a + b;
		return hasil;
	}
	
	boolean isOne() {
		int bil = 10;
		if(bil == 1) return true;
		else return false;
	}
	
}

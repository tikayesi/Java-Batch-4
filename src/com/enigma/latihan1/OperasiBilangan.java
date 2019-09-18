package com.enigma.latihan1;

import java.util.Arrays;
import java.util.Scanner;

public class OperasiBilangan {
	
	// BUat operasi untuk menjumlahkan 2 buah
	// variable dengan type data yang berbeda.
	
//	<tipe> <nama> = <value>
	
	public static void main(String[] args) {
	  //[tipeData] [namaVariabel] = [value];
//		short angkaShort = 100;
//		int angkaInt = 1000;
//		long angkaLong = 10000;
//		boolean angkaBol = false;
//		
//		char hurufChar = '1';
//		String kataString = "20";
		
//		long totalLong = angkaLong + angkaShort;
//		int totalInt = angkaShort + angkaInt;
//		
//		totalInt = angkaShort - totalInt;
//		System.out.println(totalInt);
//		totalLong = angkaInt - totalLong;
//		System.out.println(totalLong);
//		kataString = hurufChar + ( totalInt + totalShort );
//		System.out.println("KATA STRING 1"+kataString);
//		kataString = kataString + (totalInt + totalLong);
//		System.out.println("KATA STRING 2: "+kataString);
//		kataString = kataString + (totalInt - totalLong);
//		System.out.println("kata string 3: " + kataString);
//		boolean totalBol = (angkaInt + angkaShort == 1100) || angkaBol;
//		System.out.println("total boolean "+ totalBol);
//		boolean totalBole = kataString + angkaBol;
//		System.out.println("total boolean 2 "+ totalBol);
//		Scanner tgl = new Scanner(System.in);
//		int tanggal = tgl.nextInt() ;
//		if (tanggal >= 11 && tanggal <= 27) {
//			System.out.println("anda memulangkan tepat waktu");
//		} else {
//			System.out.println("anda telat, apakah anda hamil?");
//		}
		
//		Range Tanggal : 11-27
		int[] dataPinjam = { 11, 29, 23, 28, 20, 31 };
		Arrays.sort(dataPinjam);
		for(int i = 0; i < dataPinjam.length; i++) {
			if(dataPinjam[i] >= 11 && dataPinjam[i]<= 27) {
				System.out.println("buku dipulangkan tanggal " + dataPinjam[i] + " tepat waktu");
			}else {
				System.out.println("buku dipulangkan tanggal " + dataPinjam[i] + " telat");
			}
		}
		// TUGAS:
		// Berdasarkan data array berikut:
		// dataPinjam = [ 11, 29, 23, 28, 20, 31]
		// tentukan tgl berapa yang telat.
		// tgl berapa aja yang tepat waktu.
		
		
		
	}
}
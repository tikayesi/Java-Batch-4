package com.enigma.latihan1;

import java.util.Arrays;

public class TugasArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Data array
		int [] tglPengembalian = { 11, 29, 23, 28, 20, 31 };
		
		//Mengurutkan dari yang terkecil menggunakan sort
		Arrays.sort(tglPengembalian);
		
		// Membuat perulangan menggunakan for untuk mengecek satu persatu data array
		for ( int i = 0; i <= tglPengembalian.length; i++ ) {
			if ( tglPengembalian[i] >= 11 && tglPengembalian[i] <= 27 ) {
				System.out.println(tglPengembalian[i] + " Anda tepat waktu !");
			} else {
				System.out.println(tglPengembalian[i] + " Anda telat memulangkan !");
			}
		}
	}

}

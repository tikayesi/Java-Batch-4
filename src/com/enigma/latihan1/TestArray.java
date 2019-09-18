package com.enigma.latihan1;

import java.util.Arrays;

public class TestArray {
	public static void main(String[] args) {
		TestArray aplikasi = new TestArray();
		aplikasi.testVariable();
	}
	
	public void testVariable() {
		int angka1 = 1;
		int angka2 = 2;
		int angka3 = 3;
		int angka4 = 4;
		int angka5 = 5;
		int angka6 = 6;
		int angka7 = 7;
		int angka8 = 8;
		int angka9 = 9;
		int angka10 = 10;
		
		Integer[] arrInt = new Integer[10];

		int dataINput = 5;
		arrInt = new Integer[dataINput];
		
		
		arrInt[0] = angka1;
		arrInt[1] = angka2;
		arrInt[2] = angka3;
		arrInt[3] = angka4;
		arrInt[4] = angka5;
		arrInt[5] = angka6;
		arrInt[6] = angka7;
		arrInt[7] = angka8;
		arrInt[8] = angka9;
		arrInt[9] = angka10;
		
		System.out.println(Arrays.toString(arrInt));
		
		for (int i = 0; i < arrInt.length; i++) {
			System.out.print(i);
		}		

		System.out.println(Arrays.toString(arrInt));
	}
}

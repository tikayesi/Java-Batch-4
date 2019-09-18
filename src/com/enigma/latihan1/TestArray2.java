package com.enigma.latihan1;

import java.util.Arrays;

public class TestArray2 {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 2, 3, 4, 5, 6 };

		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));

		int[] arr3 = new int[5];

		/*
		 * arr3[0] = arr1[0] * arr2[4]; arr3[1] = arr1[1] * arr2[3]; arr3[2] = arr1[2] *
		 * arr2[2]; arr3[3] = arr1[3] * arr2[1]; arr3[4] = arr1[4] * arr2[0];
		 */

		for (int i = 0; i < arr3.length; i++) {
			arr3[i] = arr1[i] * arr2[arr2.length - 1 - i];
		}

//		System.out.println(Arrays.toString(arr3));

		// 1. Variable
		String kalimat = "Ini adalah string";
		boolean isBoolean = true;
		int nilai = 10001;
		double nilai2 = 19.0;

		// 2. Array
		String[] names = { "Dika", "Febri", "Dea", "Yuda", "Fiqri" };

		// 3. Array
		Integer[] angkaGanjil = new Integer[100];

		int counter = 0;
		int counterIndex = 0;
		while (counterIndex < angkaGanjil.length) {
			counter++;
			if (counter % 2 != 0) {
				angkaGanjil[counterIndex++] = counter;
			}

		}

		System.out.println(Arrays.toString(angkaGanjil));


	}
	
	

}

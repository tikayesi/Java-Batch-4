package com.enigma.latihan1;

import java.util.Arrays;

public class TestArray3 {

	public static void main(String[] args) {
		int[] arrGanjil = new int[5];
		int counterIndex = 0;
		
		int i = 0;
		
		while(counterIndex < arrGanjil.length) {
			
			if(i % 2 ==1) {
				arrGanjil[counterIndex++] = i;
			}
			
			i++;
		}
		
		System.out.println(Arrays.toString(arrGanjil));
	}

}

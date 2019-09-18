package com.enigma.latihan3;

import java.util.Arrays;

public class TugasRabu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestParam param = new TestParam();
		
		int counterTepat = 0;
		int counterTelat = 0;
		int [] tglKembali = {12, 15, 10, 29, 30, 21, 8};
		for(int i = 0; i < tglKembali.length; i++) {
			if(tglKembali[i] >= 11 && tglKembali[i] <=26) {
				counterTepat++;
				System.out.println("tanggal kembali tepat waktu: " + tglKembali[i]);
			} else {
				counterTelat++;
				System.out.println("tanggal kembali telat: " + tglKembali[i]);
			}
		}
		System.out.println("jumlah tanggal kembali tepat waktu:" + counterTepat);
		System.out.println("Jumlah tanggal kembali telat: " + counterTelat);
		System.out.println((tglKembali.length));
		
		TugasRabu tugasRabu = new TugasRabu();
		tugasRabu.bilangan(5);
		System.out.println("=" + tugasRabu.faktorial(5));
		tugasRabu.urutArray();
		int[] array = {1,1,1,9};
		tugasRabu.integerKecil(array);
	}
	
	int bilangan(int index) {
		int [] arr = {1,3,5,7,9,11,13,15,17};
		System.out.println(arr[index-1]);
		return arr[index];
	}
	
	int faktorial(int num) {
		  if(num == 0 || num == 1){
		      return 1;
		    }
		  System.out.print("x" + num);
		    return num * faktorial(num-1);
	}
	
	void urutArray(){
	int [] array = {1, 3, 4, 6, 7, 9};
	Arrays.sort(array);
//	for(int nilai: array) {
//		System.out.println(nilai);
//	}
	System.out.println(Arrays.toString(array));
	}
	
	public void integerKecil(int [] array) {
		Arrays.sort(array);
		int bill = 1;
		for (int i=0; i< array.length; i++) {
			if(array[i] == bill) {
				bill++;
				System.out.println("array " + array[i]);
				System.out.println("bill "+bill);
			}
		}
		System.out.println("Integer positif terkecil yang tidak ada : " + bill);
	
	}
	


}

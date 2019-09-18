package com.enigma.latihan1;

public class Variabel {
	
	int count;
	static int counter;
	
	static void increment() {
		counter = 5;
		System.out.println(counter);
	}
	
	public void sum() {
		count = 1;
	}
	
	public int min() {
		int angka = count;
		System.out.println(angka);
		return angka;
	}
}
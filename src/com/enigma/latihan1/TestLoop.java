package com.enigma.latihan1;

public class TestLoop {

	public static void main(String[] args) {
		for (int i = 10; i < 10; i++) {
			System.out.println(i);
		}
		
		int counter = 10;
		while(counter < 10) {
			System.out.println(counter);
			counter++;
		}
		
		int counter2 = 10;
		do {
			System.out.println(counter2);
		}while(counter2 < 10);
		
	}

}

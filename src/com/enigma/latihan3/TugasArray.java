package com.enigma.latihan3;

import java.util.Arrays;
import java.util.Scanner;

public class TugasArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("tentukan titik awal kordinat x, y: ");
		String kordinat = in.next();
		String [] posts = kordinat.split(",");
		Car bmw = new Car(Integer.parseInt(posts[0]), Integer.parseInt(posts[1]));
		
		
		System.out.println("input move: ");
		String movement = in.next();
		bmw.setCommand(movement);
		
		bmw.run();
		System.out.println(bmw.print());
	}

}

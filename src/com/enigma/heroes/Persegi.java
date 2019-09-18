package com.enigma.heroes;

public class Persegi extends Shape {
	
	double sisi = 4;

	@Override
	double keliling() {
		// TODO Auto-generated method stub
		return 4 * sisi;
	}

	@Override
	double luas() {
		// TODO Auto-generated method stub
		return sisi * sisi;
	}
	
	public void hasil() {
		System.out.println("ini luas persegi: " + this.luas());
	}

}

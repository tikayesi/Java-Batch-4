package com.enigma.latihan3;

public class BelajarMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BelajarMethod belajar = new BelajarMethod();
		belajar.keliling();
		int r = 3;
		double phi = 14;
		belajar.luas(phi, r);

	}
	
	double r = 12;
	double phi = 3.14;
	
	protected void keliling() {
		double keliling = 2 * phi * r;
		System.out.println("ini keliling: " + keliling);
	}
	
	public double luas(double phi, double r) {
		double luas = phi * (r * r);
		System.out.println("ini luas: " + luas);
		return luas;
	}

}

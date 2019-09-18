package com.enigma.latihan1;

public class TestFunction {

	public static void main(String[] args) {
		TestFunction app = new TestFunction();
		app.printNama();
		
		TestArray aplikasi = new TestArray();
		aplikasi.testVariable();
	}

	void printNama() {
		String nama = "roy";
		System.out.println(getNama());
	}
	
	String getNama() {
		return getNamaPanjang(1);
	}
	
	String getNamaPanjang(int index) {
		String[] names = {"roy kumo", "yudha"};
		
		System.out.println("index : "+index);
		return names[index];
	}
	
	int tambah(int a, int b) {
		return a + b;
	}
}

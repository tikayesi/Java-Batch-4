package com.enigma.latihan1;

public class Latihan {
	public void method0() {
		System.out.println("public method");
	}
	
	protected void method1() {
		System.out.println("protected method");
	}
	
	private void method2() {
		
		System.out.println("private method");
	}
	
	public void tampil() {
		this.method2();
	}
}

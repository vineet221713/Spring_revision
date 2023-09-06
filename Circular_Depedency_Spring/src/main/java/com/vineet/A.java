package com.vineet;

public class A {

	private B b1;
	
//	public A(B b1) {
//		this.b1=b1;
//	}
	
	
	//change it to setter Injection 
	
	public void setB1(B b1) {
		this.b1 = b1;
	}
	
	public void showA() {
		
		System.out.println("inside the show");
		System.out.println(b1);
	}


	
}

package com.vineet;

public class B {

	private A a1;
	
	public B(A a1) {
		this.a1=a1;
	}
	
	public void showB() {
		System.out.println("Inside the showB");
		System.out.println(a1);
	}
}

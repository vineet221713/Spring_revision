package com.vineet.tightCoupling;

public class B {
	
	A a1 = new  A();
	
	public void sayhelloB() {
		a1.sayhello();
		System.out.println("This is say hello by B");
	}

}

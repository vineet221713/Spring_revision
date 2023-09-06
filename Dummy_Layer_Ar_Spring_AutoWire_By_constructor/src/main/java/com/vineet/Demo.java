package com.vineet;

public class Demo {
	
	private A a1;
	private A a2;
	private B b1;


	public Demo() {
		super();
	}

	public Demo(A a1, A a2) {
		super();
		this.a1 = a1;
		this.a2 = a2;
	}

	public Demo(A a1, A a2, B b1) {
		super();
		this.a1 = a1;
		this.a2 = a2;
		this.b1 = b1;
	}
	public void showDetails() {
		System.out.println("inside showDetails....");
		System.out.println("b1 is :"+b1);
		System.out.println("a1 is :"+a1);
		System.out.println("a2 is :"+a2);
		}

}

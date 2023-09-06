package com.vineet.LoseCoupling;

public class Bike implements Vehicle {

	public void ride1() {
		
		System.out.println("Bike Started");
	}

	@Override
	public void go() {
		ride1();
		
	}
}

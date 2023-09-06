package com.vineet.LoseCoupling;

public class Car implements Vehicle {

	public void start() {
		
		System.out.println("Car stared");
	}
	

	@Override
	public void go() {
		start();
		
	}
}

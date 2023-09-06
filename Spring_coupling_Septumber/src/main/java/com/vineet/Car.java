package com.vineet;

public class Car implements Vehicle {
	
	public void start() {
		System.out.println("car started");
	}

	@Override
	public void go() {
		// TODO Auto-generated method stub
		start();
	}

}

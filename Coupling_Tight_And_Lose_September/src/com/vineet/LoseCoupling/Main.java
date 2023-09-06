package com.vineet.LoseCoupling;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
//		Travel tr = new Travel();
//		
//		tr.setV(new Bike());
	
		
		Travel tr = new Travel(new Car());
		tr.journey();

	}

}

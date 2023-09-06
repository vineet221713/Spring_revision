package com.vineet.LoseCoupling;

public class Travel {

	private Vehicle v ;

	//Setter Injection 
//	public void setV(Vehicle v) {
//		this.v = v;
//	}
	
	
	//Another Way is Constructor way 

	public Travel(Vehicle v) {
		this.v = v;
	}
	
	public void journey() {	
		v.go();
		System.out.println("jearney stared");
	}
		
	}

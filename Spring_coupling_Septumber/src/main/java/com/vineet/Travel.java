package com.vineet;

public class Travel {

	Vehicle v ;
	
	int numberofPerson;

	public void setV(Vehicle v) {
		this.v = v;
	}

	public void setNumberofPerson(int numberofPerson) {
		this.numberofPerson = numberofPerson;
	}
	
	
	public void journey() {
		
		v.go();
		System.out.println("jaurney started");
		
		
		System.out.println("Number of person are"+ numberofPerson);
	}
	
	
	
}

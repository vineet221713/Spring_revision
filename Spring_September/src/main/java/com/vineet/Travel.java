package com.vineet;

public class Travel {
	
	Vechicle v;
	int numberOFPerson;

	public void setV(Vechicle v) {
		this.v = v;
	}

	public void setNumberOFPerson(int numberOFPerson) {
		this.numberOFPerson = numberOFPerson;
	}
	
	
	public void journey() {
		v.go();
		System.out.println("journey started");
		System.out.println("number of person"+numberOFPerson);
	}

}

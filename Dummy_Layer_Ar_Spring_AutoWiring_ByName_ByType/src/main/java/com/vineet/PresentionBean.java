package com.vineet;

public class PresentionBean {
 
 public ServiceBean servicebean ;

public void setServicebean(ServiceBean servicebean) {
	this.servicebean = servicebean;
}
 
 public void presnt() {
	 
	 servicebean.calInterst();
	 System.out.println("Presentting cal culating Intrest");
 }
	
}

package com.vineet;

public class ServiceBean {

	public Daobean dao;

	public void setDao(Daobean dao) {
		this.dao = dao;
	}
	
	public void calInterst() {
		
		dao.findAccount();
		
		System.out.println("Intrest are calculated");
	}
	
}

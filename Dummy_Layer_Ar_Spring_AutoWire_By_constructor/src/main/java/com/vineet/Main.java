package com.vineet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ApplicationContext ctx = new  ClassPathXmlApplicationContext("applicationContext.xml");
	Demo d =ctx.getBean("d1", Demo.class);
	d.showDetails();
	}

}

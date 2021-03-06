package com.ryan.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/ryan/spring/test/beans/beans.xml");
		
		Person person = (Person)context.getBean("person");
		
		person.setTaxId(666);
		
		Address address = (Address)context.getBean("address");
		
		System.out.println(person);
		
		System.out.println(address);
		
		((ClassPathXmlApplicationContext)context).close();
	}

}

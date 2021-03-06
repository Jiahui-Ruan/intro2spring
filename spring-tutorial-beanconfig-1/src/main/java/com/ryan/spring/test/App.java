package com.ryan.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/ryan/spring/test/beans/beans.xml");
		
		Person person = (Person)context.getBean("person");
		
		person.setTaxId(666);
		
		System.out.println(person);
		
		Address address2 = (Address)context.getBean("address2");
		
		System.out.println(address2);
		
		((ClassPathXmlApplicationContext)context).close();
	}

}

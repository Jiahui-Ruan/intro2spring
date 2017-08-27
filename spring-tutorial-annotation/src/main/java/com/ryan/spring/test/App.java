package com.ryan.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/ryan/spring/test/beans/beans.xml");
		
		Logger logger = (Logger)context.getBean("logger");
		
		logger.writeConsole("hello there");
		logger.writeFile("hello again");
		
		((ClassPathXmlApplicationContext)context).close();
	}

}

package com.ryan.spring.test;
import org.springframework.stereotype.Component;

@Component
public class ConsoleWriter implements LogWritter{

	public void write(String text) {
		// TODO Auto-generated method stub
		System.out.println(text);
	}

}

package com.ryan.spring.test;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("filewriter")
public class FileWriter implements LogWritter{

	public void write(String text) {
		// TODO Auto-generated method stub
		System.out.println("Writing to file: " + text);
	}

}

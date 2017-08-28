package com.ryan.spring.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Robot {

	private int id = 0;
	private String speech = "hello";
	
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println(id + ": " + speech);
	}
	
	@Autowired
	public void setId(@Value("111") int id) {
		this.id = id;
	}

	@Autowired
	public void setSpeech(@Value("come back") String speech) {
		this.speech = speech;
	}

}

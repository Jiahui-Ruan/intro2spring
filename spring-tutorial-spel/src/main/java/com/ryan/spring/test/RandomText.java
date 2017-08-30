package com.ryan.spring.test;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomText {
	private static String[] texts = {
			"I will be back",
			"Get out",
			"I want you",
			null
	};
	
	public String getText() {
		Random random = new Random();
		
		return texts[random.nextInt(texts.length)];
	}
}

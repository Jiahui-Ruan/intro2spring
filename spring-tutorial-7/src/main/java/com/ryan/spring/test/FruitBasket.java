package com.ryan.spring.test;

import java.util.List;

public class FruitBasket {
	private String name;
	private List<String> fruit;
	
	public FruitBasket(String name, List<String> fruit) {
		this.name = name;
		this.fruit = fruit;
	}

	@Override
	public String toString() {
		return "FruitBasket [name=" + name + ", fruit=" + fruit + "]";
	}
	
}

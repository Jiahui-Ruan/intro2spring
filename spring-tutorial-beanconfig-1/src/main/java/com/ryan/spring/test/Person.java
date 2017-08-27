package com.ryan.spring.test;

public class Person {
	private int id;
	private String name;
	private int taxId;
	private Address address;
	
	public Person() {
		
	}
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public static Person getInstance(int id, String name) {
		System.out.println("creating person using factory method");
		return new Person(1234, "Bob");
	}
	
	public void onCreate() {
		System.out.println("person created:" + this);
	}
	
	public void onDestroy() {
		System.out.println("person destroy: " + this);
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", taxId=" + taxId + ", address=" + address + "]";
	}

	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void speak() {
		System.out.println("Hello I am a person");
	}
}

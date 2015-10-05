package com.brillio.training.entity;

public class Person {
	
	private int id;
	private String names;
	private String city;
	
	public Person() {
		
	}

	public Person(int id, String names, String city) {
		super();
		this.id = id;
		this.names = names;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNames() {
		return names;
	}

	public void setNames(String names) {
		this.names = names;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", names=" + names + ", city=" + city + "]";
	}
      
	
}

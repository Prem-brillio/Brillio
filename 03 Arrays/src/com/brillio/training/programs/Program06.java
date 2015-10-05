package com.brillio.training.programs;

import com.brillio.training.entity.Person;

public class Program06 {

	public static void main(String[] args) {
		
		Person p1 =new Person(7733, "Robert Smith", "Newyork");
		
		Person[] persons = {
				new Person(),
				new Person(7788, "john Scott", "Newyork"),
				new Person(7865, "Ramesh Kumar", "Chennai"),
				p1
		};
	}
}

package com.brillio.training.programs;

import com.brillio.training.entity.Person;

public class Program05 {
 
	public static void main(String[] args) {
		
		//persons is not a referrence to a person object but it is a reference to an array of person objects
		Person[] persons;
		
		persons = new Person[3];
		persons[0] = new Person(1, "Vinod", "Bangalore");
		persons[1] = new Person(2, "Scott", "Dalals");
		persons[2] = new Person(3, "James", "Chicago");
		
		for (Person p1 : persons) {
			System.out.println(p1);
		}
		
	
		
	}
}

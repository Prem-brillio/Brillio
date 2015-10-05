package com.brillio.training.programs;

public class Program03 {
  
	public static void main(String[] args) {
		
		String[] names = { "Scott", "Miler", "Allen", "Jones"};
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		
		//enhanced for loop (for-each loop)
		for(String name: names){
			System.out.println(name);
		}
		System.out.println("Nmae at index 1 is " + names[1]);
	}
}

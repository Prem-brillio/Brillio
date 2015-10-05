package com.brillio.training.programs;

public class Program08 {
 
	public static void main(String[] args) {
		
		
		System.out.println("There are  "+ args.length + "command line arguments");
		
		for (int i = 0; i < args.length; i++) {
			System.out.println("args["+ i + "] is " + args[i]);
		}
	}
}

package com.brillio.training.programs;

import java.util.Arrays;

public class Program01 {
	
	public static void increment(int[] ar, int by){
		
		for (int i = 0; i < ar.length; i++) {
			ar[i] += by;		
			}
	}
	
	public static void main(String[] args) {
		
	
	//n is a reference to an Array object
	int[] n;
	
	n = new int[3];
	
	n = new int[] { 48, 586, 383 };
	n[2] = 12;
	n[0] = 22;
	n[1] = 292;
	
	n[3] = 3939393; //throws an exception ArrayIndexOutOfBound
	int index = 2;
	System.out.println(n[index]);
	
	System.out.println(n);
	System.out.println(Arrays.toString(n));
	
	increment(n, 10);
	System.out.println(n);
	}
	

}

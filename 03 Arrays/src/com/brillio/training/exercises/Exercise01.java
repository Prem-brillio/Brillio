package com.brillio.training.exercises;

public class Exercise01 {
       
	//Write a function that takes two integer arrays as arguments and return an array consisting of odd
	//numbers from both arrays.
	public static void main(String[] args) {
		
		int []ar1 ={10,25,20,69};
		int []ar2 = {13,67,34,58,9};
		
		mergeArray(ar1,ar2);
		
	}

	public static void mergeArray(int[] ar1, int[] ar2) {
		
		 
		int arr3[]=new int[ar1.length + ar2.length];
		int j=0;
		
		for (int i = 0; i < ar1.length; i++) {
			
			if(ar1[i]%2!=0){
				
				arr3[j++]=ar1[i];
			}
		}
		 
		for (int i = 0; i < ar2.length; i++) {
			
			if(ar2[i]%2!=0){
				arr3[j++]=ar2[i];
			}
		}
		
		
		System.out.print("[ ");
		for (int i = 0; i <j; i++) {
			
			System.out.print(arr3[i]+", ");
		}
		System.out.print("  ]");
	}
	

	
}

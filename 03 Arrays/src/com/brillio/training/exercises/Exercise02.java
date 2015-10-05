package com.brillio.training.exercises;

public class Exercise02 {
	
	//Smallest at each Index
	
public static void main(String[] args) {
		
		int []ar1 ={9, 69, 40, 31, 18, 69};
		int []ar2 = {5, 75, 18, 18, 14, 82};
		
		smallestAtIndex(ar1,ar2);
		
	}

	public static void smallestAtIndex(int[] ar1, int[] ar2) {
		
		 
		int arr3[]=new int[ar1.length + ar2.length];
		int j=0;
		
		for (int i = 0; i < ar1.length; i++) {
			
			if(ar1[i]< ar2[i]){
				
				arr3[j++]=ar1[i];
			}
			else arr3[j++]=ar2[i];
		}
		 
		
		
		
		System.out.print("[ ");
		for (int i = 0; i <j; i++) {
			
			System.out.print(arr3[i]+", ");
		}
		System.out.print("  ]");
	}
	

}

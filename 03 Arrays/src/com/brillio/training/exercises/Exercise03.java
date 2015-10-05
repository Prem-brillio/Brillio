package com.brillio.training.exercises;

public class Exercise03 {
	
	
	//sum of even and odds
	
  public static void main(String[] args) {
		
		int []ar1 ={30, 18, 2, 83, 20, 71};
		
		
		sumEvenOdd(ar1);
		
	}

	public static void sumEvenOdd(int[] ar1) {
		
		 
		
		int sumEven = 0, sumOdd = 0;  
		
		for (int i = 0; i < ar1.length; i++) {
			
			if(ar1[i]%2 ==0){
				
				sumEven= sumEven+ar1[i];
			}
			else sumOdd = sumOdd+ar1[i];
		}
		 
		
		//System.out.println("Even sum is  "+ sumEven);
		//System.out.println("Odd sum is  "+ sumOdd);
		System.out.print("[ ");
		
			
			System.out.print(sumEven + ", "+ sumOdd);
		
		System.out.print("  ]");

		
	}

}

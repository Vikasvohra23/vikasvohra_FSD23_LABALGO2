package com.glearning.services;

public class PayMoneyTransactionServices {
		
	public static void checkTransactionTarget(int[] array, int target) {
		
		int transCount=0; //creating a temporary variable to count transaction
		boolean flag = false;
		for (int i=0; i< array.length;i++) {
			transCount = transCount + array[i];// counting the value of transaction by adding all the transactions
			
			if(transCount > target) {
				System.out.println("Target value is achived after " + (i+1) + " transactions");
				flag = true;
				break;
			}
			
		}
		if(!flag) {
			System.out.println("Target value is not achived after " + (array.length + 1) + " transactions");	
		}
	}

}

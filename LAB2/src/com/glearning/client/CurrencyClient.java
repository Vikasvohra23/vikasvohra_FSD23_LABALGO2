package com.glearning.client;

import java.util.Arrays;
import java.util.Scanner;

import com.glearning.services.CurrencyServices;

public class CurrencyClient {
	
	public static void main(String[] args) {
		CurrencyServices service = new CurrencyServices();
	        Scanner scanner = new Scanner(System.in);
	        
	        // Read the currency denominations
	        System.out.print("Enter the size of currency denominations: ");
	        int n = scanner.nextInt();
	        int[] denominations = new int[n];
	        System.out.print("Enter the currency denominations value: ");
	        for (int i = 0; i < n; i++) {
	            denominations[i] = scanner.nextInt();
	        }
	        
	        // Read the amount to pay
	        System.out.print("Enter the amount you want to pay: ");
	        int amount = scanner.nextInt();
	        
	        // Sort the denominations in descending order
	        Arrays.sort(denominations);
	        int[] sortedDenominations = new int[n];
	        for (int i = 0; i < n; i++) {
	            sortedDenominations[i] = denominations[n-1-i];
	        }
		service.denominationService(sortedDenominations, amount);
	}

}

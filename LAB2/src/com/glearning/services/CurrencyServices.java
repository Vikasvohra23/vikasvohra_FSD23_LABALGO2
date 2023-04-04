package com.glearning.services;

import java.util.ArrayList;
import java.util.List;

public class CurrencyServices {
	public void denominationService(int[] denominator, double amount) {
		
		boolean flag = true;
		List<String> result = new ArrayList<>();
		while(flag) {
			for(int i=0; i<denominator.length; i++) {
				int totalDenominator =0;
				while(amount>=denominator[i]) {
					amount=amount-denominator[i];
					totalDenominator++;					
				}
				if(totalDenominator != 0) {
				result.add(totalDenominator + ":" + denominator[i]);
				}
			}
			flag = false;
		}
		System.out.println(result);
		
	}

}

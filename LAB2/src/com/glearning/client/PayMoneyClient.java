package com.glearning.client;

import java.util.Scanner;

import com.glearning.services.PayMoneyTransactionServices;

public class PayMoneyClient{
    public static void main(String[] args) {
    	// taking inputs from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of transaction array");
        int n = sc.nextInt();
        int[] inputTransactions = new int[n];
        System.out.println("enter the values of array");
        for (int i = 0; i < n; i++) {
            inputTransactions[i] = sc.nextInt();
        }
        System.out.println("enter the total no of targets that needs to be achieved");
        int numTargets = sc.nextInt();
        while(numTargets>0) {
        	System.out.println("enter the value of target");
        	int target = sc.nextInt();
        	//passing the sum of transaction value & target value to
        	PayMoneyTransactionServices.checkTransactionTarget(inputTransactions, target);
        	numTargets --;
        	}
            
    }
}
        
     
            
			

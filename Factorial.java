package com.training.basic;

public class Factorial {

	public static void main(String[] args) {
		int i,fact=1;
		int Number=6;
		for(i=1;i<=Number;i++) {
			fact=fact*i;
			
		}
		System.out.println("factorial of "+Number+" is:"+ fact);

	}

}

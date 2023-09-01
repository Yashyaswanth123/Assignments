package com.training.basic;

public class PyramidStars2 {

	public static void main(String[] args) {
		int numberOfRows=5;
	    
	    for (int i= 0; i<= numberOfRows-1; i++)
	    {
	      for (int j=0; j<=i; j++)
	      {
	        System.out.print(" ");
	      }
	     
	      for (int k=0; k<=numberOfRows-1-i; k++)
	      {
	        System.out.print("*" + " ");
	      }
	     
	      System.out.println();

	}

}}

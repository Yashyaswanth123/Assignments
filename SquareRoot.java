package com.training.basic;

import java.util.Arrays;
import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		int[] arr=new int[5];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int[] arr2=new int[arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
			arr2[i]=(int)Math.sqrt(arr[i]);
		}
		System.out.println(Arrays.toString(arr2));
	}

}


	



package com.training.basic;
import java.util.Scanner;

public class OneDimensional {

	public static void main(String[] args) {
		int[] arr=new int[5];
		Scanner sc=new Scanner(System.in);
		int sum=0;
		for(int val:arr)
		{
			val=sc.nextInt();
			sum+=val;
		}
		System.out.println(sum);
		double avg=sum/arr.length;
		System.out.println(avg);
	}



}

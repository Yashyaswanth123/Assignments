package com.training.basic;
import java.util.Scanner;

public class SumAvgArray {
	static double averageCalculate(int a[], int n)
    {
        int sum = 0;
        for (int i = 0; i < n; i++)
        {
            sum += a[i];
        }
        System.out.println("The total sum of all the elements in the array is "+sum);
        return (double)sum / n;
    }
     
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        
        int n;
        System.out.println("Enter the total number of elements in the array ");
        n=sc.nextInt();
        
        int arr[] = new int[n]; 
        System.out.println("Enter the array elements ");
        for(int i=0;i<n;i++)   
        {
            arr[i]=sc.nextInt();
        }
     
        System.out.println("The average of all the elements in an array is "+averageCalculate(arr, n));
    }
}

 


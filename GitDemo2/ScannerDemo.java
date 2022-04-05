package com.basics;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int size;
		System.out.println("How many numbers would you like to enter?");
		size=sc.nextInt();
		
		int numbers[]=new int[size]; //initialization of array, which will store elements with same count as size
		//if size is 15, array will store 15 elements, where first element will be stored at 0th index ,
		//and last element will be stored at 14th index

		System.out.println("Enter "+size+" numbers ");
		for (int i=0;i<size;i++)
		{
			numbers[i]=sc.nextInt();
		}
		System.out.println("Elements you entered are  ");
		for(int i=0;i<size;i++)
		{
			if(numbers[i]%2==0)
			{
				System.out.println(i);
			}
			
		}
	}
}

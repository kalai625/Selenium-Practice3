package com.annular.twenty;

import java.util.Scanner;

public class A08_A14_LargestNumber 
{

	public static void main(String[] args)
	{
		int arr[] = {2,6,4,7,8,4,1,9,3}; 
         
	
		for (int i = 0; i < arr.length; i++)     //i 0 ,1,2,3   //3
		{
			for (int j = i+1 ; j < arr.length; j++)    //j 1 ,1 ,1
			{
				if (arr[i] > arr[j])     //t 13scn
				{  
				int temp = arr[i];   //3
				arr[i] = arr[j];  // 1
				arr[j] = temp;    //3 
				}
				

			}
			System.out.println(arr[i]  +"   " );
			
	}
		System.out.println("second largest number is =    "+arr[(arr.length-2)]);// 2nd Largest 
		
		System.out.println();
		//largest number in array 
		System.out.println("largest number in array  =    "+arr[(arr.length-1)]);
		
		
		
}


	
}
package com.annular.twenty;

public class A19_Avg
{
	public static void main(String[] args) 
	{
		//Calculate the average of given numbers in an array
		int arr[]= {1,2,3,4,5};
		int s = 0;
		
	//	int a= arr[0];
		
		//int a= 
		
		double sum = 0;
		for (int i=0; i < arr.length;i++)
		{
			sum += arr[i];
		}
		
		System.out.println(sum);
		
		 double avg = sum / (arr.length);
		 
	        System.out.println("Average  " + avg);
	}
	
}

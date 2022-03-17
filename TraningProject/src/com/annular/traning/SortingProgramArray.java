package com.annular.traning;

public class SortingProgramArray 
{

	public static void main(String[] args)
	{
		  
		int arr[] = {3,1,2};  
	
		for (int i = 0; i < arr.length; i++)     //i 0 ,1,2,3   //3
		{
			for (int j = i+1 ; j < arr.length; j++)    //j 1 ,1 ,1
			{
				if (arr[i] > arr[j])     //t 13
				{  
				int temp = arr[i];   //3
				arr[i] = arr[j];  // 1
				arr[j] = temp;    //3 
				}
			}
			
			
 			System.out.println(arr[i]);
			

		}	
		
	}

}

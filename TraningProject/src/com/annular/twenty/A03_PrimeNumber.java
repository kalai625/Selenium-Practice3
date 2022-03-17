package com.annular.twenty;

import java.util.Scanner;

public class A03_PrimeNumber
{

	public static void main(String[] args)
	{    
		
		
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter any number:");

		int num=scn.nextInt();
		int i=2;
	
		while(i<=num/2)
		{
			if(num%i==0)
			{
				break;
			}
		}
	    

		if(i>num/2)
		   System.out.println("It is Prime Number"); //2, 3, 5, 7, 11, 13, 17, 19
	
		else
		   System.out.println( "It is not a Prime Number");
	} 
	     
}
	
	



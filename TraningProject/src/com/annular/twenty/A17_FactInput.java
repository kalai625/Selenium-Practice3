package com.annular.twenty;

import java.util.Scanner;

public class A17_FactInput
{
	   
		public static void main(String[] args) 
		{
			int fact=1;  
			 // int n=5;

				Scanner scn= new Scanner(System.in);
				System.out.println("enter");
				int n=scn.nextInt();
				
				int val=n;
				
			  for(int i =1;i<=val;i++)
			     {    
				  
			      fact=fact*i; 
			     

			     }  
			  
			  System.out.println(fact);
		}

}

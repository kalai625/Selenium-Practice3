package com.annular.traning2;

import java.util.Scanner;

public class ScannerClass 
{
	 public static void main(String args[])
     {    	  

//		 Scanner scn=new Scanner(System.in); // scanner 
//		 System.out.println("enter the value");
//		 int value=scn.nextInt();
//		 System.out.println("value"+value);
		 
// **********************************************
//		 
//		 int arr[]=new int[5];
//		 Scanner scn1=new Scanner(System.in);
//		 System.out.println("enter the input");
		 int n = 0,i;
//		for( i =0; i<arr.length;i++)
//			{
//				arr[i]=scn1.nextInt();	
//			}
//		System.out.println("print output");
//	    for( i=0;i<arr.length;i++)
//	    {
//	    	System.out.println(arr[i]);
//	    }
 // **********************************************
	   
	    int a[]=new int[5]; 
	    int b=0;
		Scanner scn2=new Scanner(System.in);
		System.out.println("enter the input");
		for( i =0; i<a.length;i++)
		{
			a[i]=scn2.nextInt();
			
		}
		System.out.println("print output");
		for( i=0;i<a.length;i++) 
		{
			System.out.println(a[i]);
			}
		System.out.println("enter the search elements");
		
			scn2.nextInt();
			for( i=0;i<a.length;i++)
			{
				System.out.println(a[i]);
				b++;
				}
					
			
			if (b>0)
				System.out.println("number present");
			else
			System.out.println(" number not found");
				
				
				
		
		 
  }
	 
}

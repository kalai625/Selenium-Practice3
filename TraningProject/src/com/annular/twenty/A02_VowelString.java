package com.annular.twenty;

import java.util.Scanner;

public class A02_VowelString 
{

	public static void main(String[] args) 
	{
          String a[]=new String[1];	
          
        Scanner scn=new Scanner(System.in);		
		System.out.println("enter vowel ");
		
        for (int i = 0; i < a.length; i++)
        {  
        	a[i]=scn.next();
        	String obj =a[i];
        	
        	if(obj== "a" || obj== "e" )
        	{
        	  System.out.println(obj +"    =is an Vowel ");	
        	}
        	else if (obj== "i" ||obj== "o" ||obj== "u")
        	{
        		 System.out.println(obj +"    =is an Vowel ");		
			}
        	else
        	{
        		System.out.println(obj   +"   = is not an vowel");
        	}
        }  
	}
}

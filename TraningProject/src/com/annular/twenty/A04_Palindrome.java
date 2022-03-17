package com.annular.twenty;


public class A04_Palindrome
{
	public static void main(String[] args)
	{    
		int r,sum=0;  
		
		  int num=11; // change

		  
		  int num1=num; 
		  
		  while(num>0)
		  {    
		   r=num%10;  
		   sum=(sum*10)+r;    
		   num=num/10;    
		  }  
		  
		  if(num1==sum)   
		  {
			  System.out.println(num1  +"   is a palindrome number "); 
		  }
		  else
		  {
			  System.out.println(num1  +  "   is not a palindrome");  
		  }
		     
		   
		   
	} 
}

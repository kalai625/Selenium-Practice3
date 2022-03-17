
package com.annular.twenty;

public class A18_Fibbnoic
{

	public static void main(String[] args) 
	{
		int n1=1,n2=2,n3 = 0;
	       
	       
	       System.out.println(n1);
	       System.out.println(n2);
	     
	                  for(int i=0;i<=5;i++)   
	                    {    
	                       n3=n1+n2;   //3  //5     
	                       System.out.println("fib "+n3);
	          
	                       n1=n2;    //n1 2 //3
	                         n2=n3; //n2 3 //5
	           
	                       } 
	                  System.out.println("kalai");
	}
	
}
 

//12    3 5 8
package com.annular.traning;

public class LargestNumber
{

	public static void main(String[] args) 
	{
		int a=32 ,b =44 , c=12 ;
         //if else statement
		 if(a>b && a>c)
		 {
			 System.out.println(a);  // a is small than  b c 
		 }
			 
		 else if(b>c && b>a) 
		 {
			 System.out.println(b + "is large "); // b is large  so print this than a c 
			 //nested if condition 
			 if(a==32) 
			 {
				//Ternary operator
				 String result1 = (a>b && a>c) ? "large" : "small";
				 System.out.println(result1 +" "+ a);
				 
				 String result2 = (b>c && b>a) ? "large" : "small";
				 System.out.println(result2 +" "+ b);
				 
				 String result3 = (c>a && c>b) ? "large" : "small";
				 System.out.println(result3+" " + c);   
			 }
			 else
			 {
				System.out.println("a is not equal to 32"); 
			 }
		 }
		 else
		 {
		 System.out.println(c);  // ignore this one
		 }
		 
		 
		 
	}
}
//System.out.println("!(a < b) = " + !(a < b));
//System.out.println("!(a > b) = " + !(a > b));

//System.out.println(Math.max(1, 2)); //2
//System.out.println(Math.max(2, 3)); //3


package com.annular.twenty;

public class A01_ReverseString 
{

	public static void main(String[] args)
	{
		  String name = "k a l a i";
		 
		  
		  System.out.println (name);
		  
		  char[] ch = name.toCharArray();
		  
		  

	      for (int i=ch.length-1;i>=0;i--)
	      {
	    	    System.out.print(ch[i]+" ");
	    	  }
	    
	}

}
